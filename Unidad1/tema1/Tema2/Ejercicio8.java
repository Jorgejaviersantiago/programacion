package Tema2;

import java.util.Scanner;

public class Ejercicio8 {
    
public static void main(String[] args) {
   
    float salario = 12f;
    double horas ;
    
     Scanner escaner = new Scanner (System.in) ;
     System.out.printf("Introducca el numero de horas trabajadas:" );
     horas = escaner.nextFloat();
     System.out.printf("Su salrio semanal es :%.0f",horas*salario);




}



}
