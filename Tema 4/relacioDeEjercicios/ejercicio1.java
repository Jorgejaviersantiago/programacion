package relacioDeEjercicios;

import java.util.Scanner;

public class ejercicio1 {
    

public static void main(String[] args) {
    
String dia;
Scanner escaner =new Scanner(System.in);
System.out.println("introduce un día de la semana y te dire que asinatura toca a primera hora :");
dia = escaner.nextLine();

switch (dia){
    case "Lunes":System.out.println("Programación");
    break;

    case "Martes":System.out.println("sistemas");
    break;
   
    case"Miercoles" :System.out.println("Base de datos");;
    break;
   
    case "Jueves":System.out.println("sistemas");;
    break;
    
    case "Viernes":System.out.println("Programación");;
    break;
    


}



}
}
