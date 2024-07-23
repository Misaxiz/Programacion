/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author eva-f
 */
import java.util.Scanner;

public class Mavenproject2 {;

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Ingrese los numeros: ");
        int calificacion = scanner.nextInt();
        
        char letra;
        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        } else if (calificacion >= 80 && calificacion <= 89) {
            letra = 'B';
        } else if (calificacion >= 70 && calificacion <= 79) {
            letra = 'C';
        } else if (calificacion >= 60 && calificacion <= 69) {
            letra = 'D';
        } else if (calificacion < 60) {
            letra = 'F';
        } else {
            
            System.out.println("Numero fuera del limite solo se acepta del 1 al 100");
            return; 
        }

        
        System.out.println("La calificacion de letra correspondiente es: " + letra);
    }
}

    
    
