/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class IMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su peso en kilogramos");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su altura en metros");
        double altura = scanner.nextDouble();
        
        double imc = calcularIMC(peso,altura);
        
        System.out.println("Su indice de masa corporal es: " + imc);
        
        scanner.close();
        
    }
    public static double calcularIMC(double peso, double altura){
        double imc = peso/(altura*altura);
        return imc;
    }
}
