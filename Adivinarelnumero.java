/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinarelnumero;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class Adivinarelnumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random ();
        
        int numeroAleatorio = random.nextInt(100) + 1;
        
        System.out.println("Bienvenido al juego de adivinar el numero");
        System.out.println("Se ha generado un numero alazar del 1 al 100");
        
        int intentos = 0;
        boolean adivinado = false;
        
        while (!adivinado){
            System.out.print("Ingrese su posición: ");
            int suposicion = scanner.nextInt();
            intentos++; 
            
            if (suposicion == numeroAleatorio){
                adivinado = true;
            }else if (suposicion < numeroAleatorio){
                System.out.println("Su suposición es demasiado baja. Intente de nuevo.");
            }else{
                System.out.println("Su suposición es demasiado alta. Intente de nuevo");
            }
        }
        System.out.println("Felicidades ha adivinado el nuemro" + numeroAleatorio + "en" + intentos + "intentos.");
        
        scanner.close();
    }
}
