/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.generarsecuenciadecuadrados;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class GenerarSecuenciadeCuadrados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero positivo");
        int numero = scanner.nextInt();
        
        while (numero <= 0){
            System.out.print("Ingrese un numero entero positivo valido: ");
            numero = scanner.nextInt();
        }
        
        int contador = 1;
        
        System.out.println("Secuencia de cuadrados desde 1 hasta "+ numero + ":");
        do{
            int cuadrado = contador * contador; 
            System.out.println(contador + "^2 = " + cuadrado);
            contador++;
        }while (contador <= numero);
        
        scanner.close();
    }
}
