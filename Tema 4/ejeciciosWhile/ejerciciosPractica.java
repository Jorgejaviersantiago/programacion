package ejeciciosWhile;

import java.util.Scanner;

public class ejerciciosPractica {
    

    public static void main(String[] args) {
        
        int num;
        int totalNum = 0;
        int total  = 0;
       
        Scanner escaner=new Scanner(System.in);
         System.out.print("Introduzca número y pulse enter, introduce un número negativo.\n");
         System.out.print("?");
         num=escaner.nextInt();
        
         while(num>=0){
            System.out.print("?");
            num=escaner.nextInt();
            
            totalNum++;
            total= total + num; // total += totalNum
            
          }
       
          System.out.printf("Se han introducido\033[1m  %d \033[0mnúmeros en total y la suma de todos ellos es\033[1m %d \033[0m ",totalNum,total);
  
  
  
  
  
  
  
  
  
  
  
  
    }
}
