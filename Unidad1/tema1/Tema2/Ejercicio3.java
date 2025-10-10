package Tema2;

import java.util.Scanner;

public class Ejercicio3 {
    



    public static void main(String[] args) {
    
    

    float peseta2 = 166.386f ;
    float peseta ;
    
    Scanner escaner = new Scanner (System.in) ;

    System.out.println("Introduzca la cantidad que quiere convertir:");
    peseta = escaner.nextFloat();
    System.out.printf("%.2f", peseta / peseta2 );
     
}
}