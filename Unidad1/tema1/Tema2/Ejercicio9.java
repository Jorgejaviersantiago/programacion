package Tema2;

import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        int altura;
        float base;
        double radio;
        
        Scanner escaner = new Scanner (System.in) ;
        System.out.print("Introducca la altura (cm): ");
        altura = escaner.nextInt();
        System.out.print("Introducca la base(cm): ");
        base = escaner.nextFloat();
        radio = base*base;
        
        System.out.printf("El volumen del triangulo es: %.7f", Math.PI *radio* altura * 1/3
        );
       

    }

}
