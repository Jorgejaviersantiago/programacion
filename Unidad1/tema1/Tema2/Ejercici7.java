package Tema2;

import java.util.Scanner;

public class Ejercici7 {
    


    public static void main(String[] args) {
    
        float base;
        double iva;
        Scanner escaner = new Scanner (System.in) ;
        System.out.printf("Introduzca la base imponible(precio sin iva):");
        base = escaner.nextFloat();
        iva = base * 0.21;
        System.out.println("Base imponible:"+base+"\n");
        System.out.println("iva (21%)" + base * 0.21 );
        System.out.printf("-------------------\n");
        System.out.printf("total:\t %.2f", base * iva);


}
}