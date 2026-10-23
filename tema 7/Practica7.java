import java.util.Scanner;

public class Practica7 {
    

public static final int  MAXIMO=100;

    public static void main(String[] args) {
        
        int[] numero= new int[MAXIMO];
        int valor;
        int digito;

         Scanner sc =new Scanner(System.in);
        for(int i=0;i<MAXIMO;i++){
          numero[i]=(int)(Math.random()*(20-0+1)+0);
       
            System.out.printf(" %d ",numero[i]);
        }
        System.out.println();
       
        System.out.print("Introduzca un numero de los que se ha mostrado:");
        valor=sc.nextInt();
        System.out.print("Introduzca un numero por el que quiera sustituirlo:");
        digito=sc.nextInt();

        for(int i=0;i<MAXIMO;i++){
           if (numero[i]==valor) {
            numero[i]=digito;
            System.out.printf(" \"%d\" ",numero[i]);
            }else{
                System.out.printf(" %d ",numero[i]);
            }
           
        }











    }
    /* 
    public static int numerosAle(int num) {
        num=(int)Math.random()*20;
        return num;
    }*/
}
