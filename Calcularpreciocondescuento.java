/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularpreciocondescuento;
import java.util.Scanner;
/**
 *
 * @author macia
 */

public class Calcularpreciocondescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio original del producrto");
        double precioOriginal= scanner.nextDouble();
        
        double precioFinal = CalcularPrecioConDescuento(precioOriginal);
        
        System.out.println("El precio final despues del descuento es:$"+precioFinal);
        
        scanner.close();
                
        
    }
    public static double CalcularPrecioConDescuento(double precioOriginal){
        double precioFinal = precioOriginal; 
        
        if(precioOriginal>500){
            precioFinal = precioOriginal*0.75;
        }else if(precioOriginal>200){
            precioFinal = precioOriginal*0.8;
        }else if(precioOriginal>100){
            precioFinal = precioOriginal*0.9;
        }
        
        return precioFinal;
        
    }
}
