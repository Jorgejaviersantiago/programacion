import java.util.Scanner;

public class ejercicio10 {
    
public static void main(String[] args) {
    
        int numero=0;
        int contadorPos=0;
        int contadorNeg=0;
        
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introducce 10 numeros enteros: ");
           
        for (int i=0;i<10;i++) {
            numero=escaner.nextInt();
            if(numero>0){
                contadorPos++;
            }else{
                contadorNeg++;
            }
        }
        System.out.printf("Has introduccido %d positivos %d negativos",contadorPos,contadorNeg);   








    }

}
