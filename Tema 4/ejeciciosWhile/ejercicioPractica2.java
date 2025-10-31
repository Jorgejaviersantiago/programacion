import java.util.Scanner;

public class ejercicioPractica2 {
    //BlueWhile y el while cuando no se con seguridad cuantas veces se tiene que repetir el buble y el ford cuando yo se exactamente cuando se cierra y cuando empieza 

    public static void main(String[] args) {
        int num;
        int totalNum = 0;
        int total  = 0;
       
        Scanner escaner=new Scanner(System.in);
         System.out.print("Introduzca número y pulse enter, introduce un número negativo.\n");
   
        
         do{
            System.out.print("?");
            num=escaner.nextInt();
           if(num>=0){
                total= total + num; // total += totalNum
                totalNum++;
           } 
          } while(num>0);
       
          System.out.printf("Se han introducido\033[1m  %d \033[0mnúmeros en total y la suma de todos ellos es\033[1m %d \033[0m ",totalNum,total);
  
  
    }
}
