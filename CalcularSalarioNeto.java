import java.util.Scanner;

public class CalcularSalarioNeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el salario bruto mensual: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de impuestos: ");
        double porcentajeImpuestos = scanner.nextDouble();

        System.out.print("Ingrese las deducciones adicionales: ");
        double deduccionesAdicionales = scanner.nextDouble();

        double impuesto = salarioBruto * (porcentajeImpuestos / 100);

        double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;

        System.out.println("Salario Neto: " + salarioNeto);
    }
}
