import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        
        int base;
        int exponente;
        int resultado=1;
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Calculo de una potencia ");
        System.out.print("Introduzca una base: ");
            base = escaner.nextInt();
        System.out.print("Introduzca una potencia: ");
            exponente = escaner.nextInt();

        for (int i=0;i<exponente;i++) {
          resultado=resultado*base;
        }
        System.out.printf("%d^%d:%d ",base ,exponente,resultado );




















    }
}
