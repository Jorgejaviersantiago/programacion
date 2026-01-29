import java.util.Scanner;

public class Practica10 {
    
    public static final int MAXIMO=10;
    public static final int MAXPER=4;

    
    
 
    public static void main(String[] args) {
       
    }
        public static int buscarMesa(int[]mesa, int numPer) {
           
            int i;
            boolean hayHueco=false;
            // Buscamos si no hay mesas vacias
            for(i=0;(i<MAXIMO)&&(!hayHueco);i++){
                hayHueco=(mesa[i]==0);
            }
            //si no hay mesas vacias
            if (!hayHueco) {
                for(i=0;(i<MAXIMO)&&(!hayHueco);i++){
                    hayHueco=(mesa[i] + numPer <= MAXPER);
                }
            }
            return hayHueco?i-1:-1;
        }



  



    
}
 


