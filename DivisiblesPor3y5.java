/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;
public class DivisiblesPor3y5 {
    public static void main(String[] args) {
        System.out.println("Números entre 1 y 100 que son divisibles tanto por 3 como por 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

/**
 *
 * @author compu
 */

