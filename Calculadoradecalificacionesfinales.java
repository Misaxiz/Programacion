package com.mycompany.calculadoradecalificacionesfinales;

import java.util.Scanner;

public class Calculadoradecalificacionesfinales {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double parciales = solicitarCalificacion(scanner, "parciales");
            double proyecto = solicitarCalificacion(scanner, "proyecto");
            double examenFinal = solicitarCalificacion(scanner, "examen final");
            
            double calificacionFinal = (parciales * 0.4) + (proyecto * 0.3) + (examenFinal * 0.3);
            
            System.out.printf("La calificación final es: %.2f%n", calificacionFinal);
        }
    }

    private static double solicitarCalificacion(Scanner scanner, String tipoCalificacion) {
        double calificacion;
        while (true) {
            System.out.print("Ingrese la calificación de los " + tipoCalificacion + " 0 a 100: ");
            calificacion = scanner.nextDouble();
            if (calificacion >= 0 && calificacion <= 100) {
                break;
            } else {
                System.out.println("calificacion imposible debe ser de 0 a 100.");
            }
        }
        return calificacion;
    }
}