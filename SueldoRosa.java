public class SueldoRosa {
    public static void main(String[] args) {
        float  valorDia, totalPagar;

        //Salario Basico Año 2024
        float salario_2024 = 1300000;

        //Valor Dia
        valorDia = ((salario_2024 / 30) / 8) * 4;

        //Número de Dias trabajados al mes
        float diasTrabajados = 9;

        //Total a pagar por dias trabajados a Doña Rosa
        totalPagar = valorDia * diasTrabajados;

        //Estos son los descuentos por pagos a salud y Pensión
        float desSaludpension = (salario_2024 * 8) / 100;
        //Scanner scanner = new (System.in);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("***  Manera de Calcular Sueldo Doña Rosa  ***");
        System.out.println(" ");
        System.out.println("Salario Actual 2024: " + salario_2024);
        System.out.println("Valor dia Doña Rosa:  " + valorDia);
        System.out.println("Descuento Salud y Pendión:  " + desSaludpension);
        System.out.println("Neto a Pagar:  " + totalPagar);
    }
}
