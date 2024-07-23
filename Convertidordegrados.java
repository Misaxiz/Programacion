/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertidordegrados;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class Convertidordegrados {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa un temperatura en grados celsius: ");
            double celsius = scanner.nextDouble();
            
            System.out.println("escoje una opción de conversión:");
            System.out.println("1. Convertir a farenheit");
            System.out.println("2. Convertir a kelvin");
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.printf("La temperatura en farenheit es: %.2f°F%n", fahrenheit);
                }
                case 2 -> {
                    double kelvin = celsius + 273.15;
                    System.out.printf("La temperatura en celvin es: %.2fK%n", kelvin);
                }
                default -> System.out.println("opcion invalida");
            }
        }
    }
}
