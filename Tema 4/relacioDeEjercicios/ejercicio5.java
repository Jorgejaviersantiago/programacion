

import java.util.Scanner;

public class ejercicio5 {
    

    public static void main(String[] args) {
       
    float t;
    float alt;
    final float g = 9.81f;

    Scanner escaner = new Scanner(System.in);

        System.out.println("Calculo del tiempo de caida de un objeto");
        
        System.out.print("Introducca una altura (en metros) desde la que cae el objeto:");
            alt=escaner.nextFloat();
            t=(float)Math.sqrt((2*alt)/g);
        if(alt>0){
            System.out.printf("El objeyo tarda: %.2fsegundos",t);

        }else
        System.out.print("Altura no valida ");

    }
}
