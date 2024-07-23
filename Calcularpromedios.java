/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularpromedios;

/**
 *
 * @author eva-f
 */

import java.util.Scanner;

public class Calcularpromedios {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();

        
        System.out.print("Ingrese el tercer numero: ");
        double num3 = scanner.nextDouble();

        
        double promedio = (num1 + num2 + num3) / 3;

        
        System.out.println("Tu promedio es: " + promedio);
    }
}


    
    
