/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad4punto10;

import java.util.Scanner;

/**
 *
 * @author Dandycool
 */
public class Actividad4punto10 {

    public static void main(String[] args) {
       try ( 
                Scanner scanner = new Scanner(System.in)) {
          
            System.out.print("pon un numero entero positivo: ");
            int numero = scanner.nextInt();
           
            if (numero <= 0) {
                System.out.println("ese no es positivo burro");
            } else {
                System.out.println("numeros impares desde 1 hasta " + numero + ":");
                
               
                int i = 1;
                
                
                do {
                    
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                    i++;
                } while (i <= numero);
            }
            
        }
    }
};
    

