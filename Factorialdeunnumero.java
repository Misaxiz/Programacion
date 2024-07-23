/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialdeunnumero;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class Factorialdeunnumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero positivo ");
        int numero = scanner.nextInt();
        
        long factorial = CalcularFactorial(numero);
        
        System.out.println("El factorial de " + numero+ "es" + factorial);
        
        scanner.close();
    }
    public static long CalcularFactorial(int numero){
        if(numero<0){
            throw new IllegalArgumentException("El numero debe ser postivo");
        }
        
        long factorial = 1; 
        
        for(int i = 1; i<= numero; i++){
            factorial *= i;
        }
    
        return factorial;
    }
}
