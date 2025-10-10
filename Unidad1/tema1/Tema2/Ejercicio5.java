package Tema2;

import java.util.Scanner;

public class Ejercicio5 {
        
public static void main(String[] args) {


        float numb1;
        float numb2;
        Scanner escaner = new Scanner (System.in) ;
        System.out.println("Introduzca la base :");
        numb1 = escaner.nextFloat();
        System.out.println("Introduzca la alrura :");
        numb2 = escaner.nextFloat();
        System.out.printf("El area de un rectangulo es : %.1fcm", numb1 * numb2);

    }


    }
