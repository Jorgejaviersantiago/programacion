package Tema2;

import java.util.Scanner;

public class Ejercicio10 {
    
public static void main(String[] args) {
 

   float mb;
   double kb;
    
   //System.out.print("Introducca el número de mb: ");
    //mb = Float.parseFloat(System.console().readLine());
    //kb= mb*1060;
    //System.out.printf("&.1f son:",mb,kb);
    Scanner escaner = new Scanner (System.in) ;
   
    System.out.print("Introducca el número de mb: ");
    mb= escaner.nextFloat();
    kb = mb*1024;
    System.out.printf("%.1fmb son: %.1fkb",mb,kb);




}


}
