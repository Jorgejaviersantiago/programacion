import java.util.Scanner;

public class Practica6 {
        int numero;
    public static final int MAXIMO=15 ;
    
        
       
    public static void main(String[] args) {
         int numero;


        int[]array=new int[15];

        leer(array);

        System.out.println();

        for(int i=0;i<15;i++){
            System.out.printf(" %2d |",i);
        }
       
        System.out.println();
        System.out.println(" -------------------------------------------------------------------------------");
        
        for(int i=0;i<15;i++){
            System.out.printf(" %2d |",(array[i]));
        }
       
        System.out.println();
        System.out.println();
        
        for(int i=0;i<15;i++){
            System.out.printf(" %2d |",i);
        }
        System.out.println();
        System.out.println(" -------------------------------------------------------------------------------");
        rotar(array);
       
    }
    
    /**
     * 
     * @param array
     */
    public static void leer(int[] numeros) {
        for(int i =0; i <15;i++){
            numeros[i]=Integer.parseInt(System.console().readLine());
           
          
        }
    }
    /**
     * 
     * @param array
     */
   public static void rotar(int[]rotado) {
    int temp= rotado[MAXIMO-1];
    
    for (int i = MAXIMO-2 ;i >=0 ; i--){
        rotado[i+1]=rotado[1];
    }
    rotado[0]=temp;
    
    }


}
