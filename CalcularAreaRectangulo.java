/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculararearectangulo;

/**
 *
 * @author Dandyaxelgael
 */

import java.util.Scanner;

public class CalcularAreaRectangulo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la altura: ");
        double altura = scanner.nextDouble();
        
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
     
        double area = altura * base;

        System.out.println("El area del rectangulo es: " + area);
    }
}


    
    

