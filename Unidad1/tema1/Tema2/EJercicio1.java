package Tema2;


import java.util.Scanner;

public class EJercicio1 {
    

public static void main(String[] args) {
    
 



    // Ejercicio 1 Por integer.parsInt();
    
   

    int num1;
    int num2;
    System.out.println("Este programa multiplica dos números enteros.");
    System.out.println("Por favor,introduzca el primer numero:");
    num1 = Integer.parseInt(System.console().readLine());   
    System.out.println("Introduzca el segundo numero");
    num2 = Integer.parseInt(System.console().readLine());
    System.out.printf("%d * %d = %d \n",num1, num2, num1*num2); 

    // Por scaner
  
   
    Scanner escaner = new Scanner (System.in);
    System.out.println("Este programa multiplica dos números enteros.");
    System.out.println("Por favor,introduzca el primer numero:");
    num1=escaner.nextInt();
    System.out.println("Introduzca el segundo numero");
    num2=escaner.nextInt();
    System.out.printf("%d * %d = %d \n",num1, num2, num1*num2); 
}


}



