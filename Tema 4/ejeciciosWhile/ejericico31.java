import java.util.InputMismatchException;
import java.util.Scanner;

public class ejericico31 {
    

    public static void main(String[] args) {

        long digito;
        long temporal;
        long primero=0;
        long segundo=0;
        long numerosPares=0;
        long numerosImpares=0;
        

        Scanner escaner=new Scanner(System.in);
      
        try{
          
            System.out.println("introduzca un número: ");
            temporal = escaner.nextInt();
           
            // giramos el primero numero
            while (temporal>0) {
                primero = (primero*10)+(temporal%10);
                temporal/=10;
            }
            
           
            System.out.println("Introduzca otro número: ");
            temporal = escaner.nextInt();
            
            // giramos el segundo numero
            while (temporal>0) {
                segundo = (segundo*10)+(temporal%10);
                temporal /= 10;
            }

            
        
            // Construimos los numeros
            
            while ((primero > 0) && (segundo>0)){
          
            digito=(int)(primero%10);
            primero/=10;
            
            if(digito%2==0){
                numerosPares = (numerosPares*10)+digito;
            }else{
                numerosImpares = (numerosImpares*10)+digito;
            }

            digito=(int)(segundo%10);
            segundo/=10;


            if(digito%2==0){
                numerosPares = (numerosPares*10)+digito;
            }else{
                numerosImpares = (numerosImpares*10)+digito;
            }
        }
        while (primero > 0){
            digito=(int)(primero%10);
            primero/=10;
            
            if(digito%2==0){
                numerosPares = (numerosPares*10)+digito;
            }else{
                numerosImpares = (numerosImpares*10)+digito;
            }

          
        }
        while (segundo > 0){
            digito=(int)(segundo%10);
            segundo/=10;
            
            if(digito%2==0){
                numerosPares = (numerosPares*10)+digito;
            }else{
                numerosImpares = (numerosImpares*10)+digito;
            }

          
        }
            System.out.printf("El numero formado por los digitos pares es: %d \n",numerosPares);
            System.out.printf("El numero formado por los digitos impares es: %d",numerosImpares);

        }catch(InputMismatchException ime){
            System.out.println("ERROR se ha pedidio un valor de tipo entero.");
        }catch(Exception exception){
            System.out.println("ERROR la aplicación ha fallado.");
        }finally{
            escaner.close();
        }

    }

}
