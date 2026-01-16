public class Practica2 {

    public static void main(String[] args) {

        int[] array = new int [20];
        int[] array2 = new int [20];
        int[] array3 = new int [20];
        
        for(int i=0; i < 20 ; i++ ){
            array[i]=(int) (Math.random()*101);
            array2[i] = array[i] * array[i];
            array3[i]= array[i]*array[i]*array[i];
        }
          

        System.out.println("    n   |     n2     |  n3 ");
        System.out.println(" --------------------------------");
        
        for(int i=0;i<20;i++){
            System.out.printf(" %5d  |%10d  |%10d \n",array[i],array2[i],array3[i]);

        }
        

    }

    public static void cuadrado( int[]array2, int []array) {
        for(int i=0; i < 20 ; i++ ){
        array2[i]=(int)Math.pow(array[i],2);
            
        }
    }
    public static void cubo( int[]array3, int []array) {
        for(int i=0; i < 20 ; i++ ){
        array3[i]=(int)Math.pow(array[i],3);
            
        }
    }
    
}




