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
    System.err.printf("%.2f\n",notaf);

    if ( notaf<0 && notaf<10) {
        System.out.print("nota no valida, algun dato mal  puesto");}else{

      
      if (notaf>=0 && notaf<5) {
        System.out.printf("Insuficiente");
      }if(notaf>=5 && notaf<6){
        System.out.printf("Suficiente");
      }if (notaf>=6 && notaf<7) {
        System.out.printf("Bien");
      }if(notaf>=7 && notaf<9);{
        System.out.printf("Notable");
    }if(notaf>=9 && notaf<=10);{

    } 
}
    
        
        

    



}




}


