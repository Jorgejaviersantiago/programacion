import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio43b {



  public static void main(String[] args) {
   
  
  int altura;
  int anchura;

  Scanner escaner = new Scanner(System.in);
        try{
    System.out.print("Introducce la anchura del rectángulo (como mínimo 2): ");
        anchura=escaner.nextInt();
   
    System.out.print("Introducce la altura del rectángulo: ");
        altura=escaner.nextInt();

            if ((altura<2) ||(anchura<2)) {
                System.out.println("Lo siento los datos introduccidos no son aptos");
            }else{

                for(int i=0 ; i < anchura; i++){
                    for( int j=0 ; j < altura; j++){
                        if ((i==0)||(i==anchura-1 )||(j==0)||(j==altura-1)) {

                            System.out.print("* ");
                        }else{
                            System.out.print("  ");

                        }
                    }
                    System.out.println("");

                }
            }



























        }catch(InputMismatchException ime){
            System.out.print("ERROR se ha pedidio un valor de tipo entero.");
        }
    }
    
}
