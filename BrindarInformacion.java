/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brindarinformacion;
/**
 *
 * @author eva-f
 */


import java.util.Scanner;

public class BrindarInformacion{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Ingrese el nombre de un personaje muy inmporantente de marvel ");
        String entrada = scanner.nextLine();

        switch (entrada.toLowerCase()) {
            case "spiderman" -> System.out.println("super super agil y fuerte y corazon noble");

            case "hulk" -> System.out.println("bestia que se enoja y se hace fuerte");

            case "thor" -> System.out.println("hijo de odin y dios del trueno");
            case "iroman" -> System.out.println("millonario con traje super fuerte");
            case "deadpool" -> System.out.println("mercenario gracioso inmoratl");
            default -> System.out.println("quien es ese " + entrada + ".");
        }
    }
}
           
    



    
    

