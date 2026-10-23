package Tema2;

import java.util.Scanner;

public class Ejercicio4 {
    

public static void main(String[] args) {




     float numb1;
     float numb2;
    Scanner escaner = new Scanner (System.in) ;
     System.out.println("Introduzca el primer numero:");
     numb1 = escaner.nextFloat();
     System.out.println("Introduzca el segundo numero:");
     numb2 = escaner.nextFloat();
     System.out.printf("x = %.2f \n",numb1);
     System.out.printf("y = %.2f \n",numb2);
     System.out.printf("x + y = %.1f \n",numb1 + numb2);
     System.out.printf("x - y = %.1f \n",numb1 - numb2);
     System.out.printf("x * y = %.1f \n",numb1 * numb2);
     System.out.printf("x / y = %.16f \n",numb1 / numb2);


}


}