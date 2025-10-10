package Tema2;

import java.util.Scanner;

public class Ejercicio2 {
    
 public static void main(String[] args) {
    
    

    float euro;
    float peseta = 166.386f;
    
    Scanner escaner = new Scanner (System.in) ;

    System.out.println("Introduzca la cantidad que quiere convertir:");
    euro = escaner.nextFloat();
    System.out.printf("%.0f", euro * peseta );
     
 




}
}
