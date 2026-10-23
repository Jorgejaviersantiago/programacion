package Tema2;

import java.util.Scanner;

public class Ejercicio6 {
      


public static void main(String[] args) {
    
        float numb1;
        float numb2;
        Scanner escaner = new Scanner (System.in) ;
        System.out.println("Introduzca la base (cm) :");
        numb1 = escaner.nextFloat();
        System.out.println("Introduzca la alrura (cm):");
        numb2 = escaner.nextFloat();
        System.out.printf("El area de un triangulo es: %.1fcm\u00B2", numb1*numb2/2);

    }




}
