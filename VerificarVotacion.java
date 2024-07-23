/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

public class VerificarVotacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduce tu edad: ");
        int edad = entrada.nextInt();
        
        String mensaje = (edad >= 18) ? "Eres elegible para votar." : "No eres elegible para votar.";
        System.out.println(mensaje);
    }
}


   

