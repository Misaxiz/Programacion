import java.util.Scanner;

public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar el número inicial de la secuencia: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Ingresar la diferencia entre los números: ");
        int diferencia = scanner.nextInt();

        System.out.print("Ingrese el número máximo de la secuencia: ");
        int numeroMaximo = scanner.nextInt();

        int numeroActual = primerNumero;

        System.out.println("La secuencia aritmética es:");
        do {
            System.out.print(numeroActual + " ");
            numeroActual += diferencia;
        } while (numeroActual <= numeroMaximo);
    }
}
