/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuantosdigitos;

import java.util.Scanner;

/**
 *
 * @author Dandycool
 */
public class Cuantosdigitos {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        
        System.out.print(" ingresa un numero entero: ");
        int numero = scanner.nextInt();

        
        int contador = contarDigitos(numero);

        
        System.out.println("el numero " + numero + " tiene " + contador + " digitos.");
    }

    
    public static int contarDigitos(int numero) {
        
        numero = Math.abs(numero);

        
        int contador = 0;
        do {
            numero /= 10;
            contador++;
        } while (numero != 0);

        return contador;
    }
}
    

