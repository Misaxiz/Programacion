/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarletrasa;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class Contarletrasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        
        int contador = contarLetrasConFor(palabra);
        
        System.out.println("numero de a: " + contador);
        
        scanner.close();
    }

    private static int contarLetrasConFor(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
