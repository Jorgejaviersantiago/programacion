import java.util.Scanner;

public class Practica8 {
    
    public static final int MAXIMO=12;

    public static void main(String[] args) {
      
        
        String[]meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int[]temperatura=new int[12];
        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<12;i++){
            System.out.printf("Introduzca la temperatura de %s: ",meses[i]);
            temperatura[i]=sc.nextInt();
        
        
        
                }
                System.out.println();

        for(int i=0;i<MAXIMO;i++){
            System.out.printf("%10s |",meses[i]);
            
                for(int f = 1 ; f < temperatura[i];f++){
                    System.out.printf("*");
                }
        
            System.out.printf("%d",temperatura[i]);        
            System.out.println();
        }




    }
 }

