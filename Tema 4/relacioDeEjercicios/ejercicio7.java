package relacioDeEjercicios;


   import java.util.Scanner;

public class ejercicio7 {
    
public static void main(String[] args) {
    
    float nota1;
    float nota2;
    float nota3;
    float notaf;
    Scanner escaner = new Scanner(System.in);

    System.out.print("Introducca la primera nota: ");
    nota1=escaner.nextFloat();
    System.out.print("Introducca la segunda nota: ");
    nota2=escaner.nextFloat();
    System.out.print("Introducca la tercera nota: ");
    nota3=escaner.nextFloat();
    notaf=(nota1+nota2+nota3)/3;

}
}
