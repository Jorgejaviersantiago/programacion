import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        
        int num;
        int sumando=0;
        int num2; 
        int num3;
        Scanner escaner =  new Scanner(System.in);
      try{
            System.out.print("Introduzca un numero: ");
            num=escaner.nextInt();
        
            System.out.println(" n | n2 | n3 ");
            System.out.println("-------------");
            do { 
            
                num2 = (int)Math.pow(num, 2);
                num3 = (int)Math.pow(num, 3);
                sumando ++;
                System.out.printf("%d| %d |%d\n",num,num2,num3);
                num++;
            } while (sumando <=4) ;
        }catch(InputMismatchException ime){
            System.out.println("ERROR se ha pedidio un valor de tipo entero.");
        }
       
         






    }
}
