import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;

public class Encriptador {

    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES";

    public static void encriptarArchivo(String clave, String archivoOriginal, String archivoEncriptado) throws Exception {
        Key secretKey = new SecretKeySpec(clave.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        try (InputStream inputStream = new FileInputStream(archivoOriginal);
             OutputStream outputStream = new FileOutputStream(archivoEncriptado)) {
            byte[] inputBytes = new byte[64];
            int bytesRead;
            while ((bytesRead = inputStream.read(inputBytes)) != -1) {
                byte[] outputBytes = cipher.update(inputBytes, 0, bytesRead);
                if (outputBytes != null) {
                    outputStream.write(outputBytes);
                }
            }
            byte[] outputBytes = cipher.doFinal();
            if (outputBytes != null) {
                outputStream.write(outputBytes);
            }
        }
    }

    public static void desencriptarArchivo(String clave, String archivoEncriptado, String archivoDesencriptado) throws Exception {
        Key secretKey = new SecretKeySpec(clave.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        try (InputStream inputStream = new FileInputStream(archivoEncriptado);
             OutputStream outputStream = new FileOutputStream(archivoDesencriptado)) {
            byte[] inputBytes = new byte[64];
            int bytesRead;
            while ((bytesRead = inputStream.read(inputBytes)) != -1) {
                byte[] outputBytes = cipher.update(inputBytes, 0, bytesRead);
                if (outputBytes != null) {
                    outputStream.write(outputBytes);
                }
            }
            byte[] outputBytes = cipher.doFinal();
            if (outputBytes != null) {
                outputStream.write(outputBytes);
            }
        }
    }

    public static void main(String[] args) {
        try {
            String clave = "clave_secreta";
            String archivoOriginal = "archivo.txt";
            String archivoEncriptado = "archivo_encriptado.txt";
            String archivoDesencriptado = "archivo_desencriptado.txt";

            encriptarArchivo(clave, archivoOriginal, archivoEncriptado);
            System.out.println("Archivo encriptado con éxito.");

            desencriptarArchivo(clave, archivoEncriptado, archivoDesencriptado);
            System.out.println("Archivo desencriptado con éxito.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}