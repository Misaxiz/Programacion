/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;
import java.util.Scanner;

public class ConvertidorDeMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tasas de cambio ficticias para propósitos de demostración
        double tasaUSD = 0.055;  // Dólar
        double tasaEUR = 0.048;  // Euro
        double tasaTHB = 1.74;   // Bath
        double tasaJPY = 7.83;   // Yen
        double tasaKRW = 70.12;  // Won
        double tasaAUD = 0.081;  // Dólar Australiano
        double tasaPEN = 0.20;   // Sol
        double tasaCAD = 0.073;  // Dólar Canadiense
        double tasaVES = 16.28;  // Bolívar
        double tasaARS = 15.33;  // Peso Argentino

        System.out.print("Introduce la cantidad en pesos mexicanos (MXN): ");
        double cantidadMXN = scanner.nextDouble();

        System.out.println("Selecciona la moneda a la que deseas convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");

        int opcion = scanner.nextInt();
        double cantidadConvertida = 0;
        String moneda = "";

        switch (opcion) {
            case 1:
                cantidadConvertida = cantidadMXN * tasaUSD;
                moneda = "USD";
                break;
            case 2:
                cantidadConvertida = cantidadMXN * tasaEUR;
                moneda = "EUR";
                break;
            case 3:
                cantidadConvertida = cantidadMXN * tasaTHB;
                moneda = "THB";
                break;
            case 4:
                cantidadConvertida = cantidadMXN * tasaJPY;
                moneda = "JPY";
                break;
            case 5:
                cantidadConvertida = cantidadMXN * tasaKRW;
                moneda = "KRW";
                break;
            case 6:
                cantidadConvertida = cantidadMXN * tasaAUD;
                moneda = "AUD";
                break;
            case 7:
                cantidadConvertida = cantidadMXN * tasaPEN;
                moneda = "PEN";
                break;
            case 8:
                cantidadConvertida = cantidadMXN * tasaCAD;
                moneda = "CAD";
                break;
            case 9:
                cantidadConvertida = cantidadMXN * tasaVES;
                moneda = "VES";
                break;
            case 10:
                cantidadConvertida = cantidadMXN * tasaARS;
                moneda = "ARS";
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.printf("Cantidad convertida: %.2f %s%n", cantidadConvertida, moneda);
    }
}

/**
 *
 * @author compu
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
