/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadordepositivos;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class Calculadordepositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        double suma = 0.0;
        double numero;
        
        System.out.println("ingrese un numero:");
        
        while (true) {
            numero = scanner.nextDouble();
            if (numero < 0) {
                break;
            }
            suma += numero;
            contador++;
        }
        
        if (contador == 0) {
            System.out.println("no se ingresaron numeros positivos.");
        } else {
            double media = suma / contador;
            System.out.printf("la media de los numeros ingresados es: %.2f%n", media);
        }
        
        scanner.close();
    }
}
