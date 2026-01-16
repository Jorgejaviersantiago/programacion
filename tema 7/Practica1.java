import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica1{
public static  Scanner sc = new Scanner(System.in);
public static void main(String[] args) {

    int [] digitos= new int [10];
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor introduzca 10 numeros enteros");
    System.out.println("Pulse intro despues de introduccir cada numero");
        
    try {
            //Leemos el contenido del array           
        /*for(int i=0 ;i < 10 ; i++){
            digitos[i]=sc.nextInt();
        }*/
            leer(digitos);
           
        //Mostrar el contenido del array
            System.out.println("Los numeros introduccidos al reves, son los siguientes:");
            for(int s=9 ;s >0 ; s--){
               System.out.print(digitos[s]);
                
            
            }

        } catch (InputMismatchException ime) {
            System.out.println("**Error Introduzca valores de tipo entero");
        }finally{
            sc.close();
        }


    }

/**
 * 
 * @param datos
 */
public static void leer(int[]datos) {
    for(int i=0 ;i < 10 ; i++){
        datos[i]=sc.nextInt();
    } 
}



}