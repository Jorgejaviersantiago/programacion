import java.util.Scanner;

public class ejercicio7 {
    


public static void main(String[] args) {
    
    int num1;
    float media;//media=numeros almacenados/contador
    int contador=0;
    int resultado=0; 
    Scanner escaner = new Scanner(System.in);

    System.out.println("Este programa calcula la media de los numeros introduccidos");
    System.out.println("El programara para cuando escriba un numero negativo");
    System.out.println("Vaya introducciendo numeros:");
    num1=escaner.nextInt();
        while (num1>=0) {
            resultado+=num1;
            contador++;
            num1=escaner.nextInt();
        
            
        }   
    media = (float) (resultado/contador);
    System.out.printf("la media es %f", media);

 }
}
