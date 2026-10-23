public class Practica9 {
    
    
    final static int MAXIMO=20;

    
    public static void main(String[] args) {
       
        int[] numeros = new int[MAXIMO];
        int[] mod = new int[20];
        int pos=0;
        
        System.out.println("Array original:");
        for(int i=0;i<MAXIMO;i++){
            numeros[i]=(int)(Math.random()*(100+0+1)+0); 
            System.out.printf(" %d ",numeros[i]);

        }
        System.out.println();
        System.out.println("Array con los pares al principio:");
        
        for(int i=0;i<MAXIMO;i++){
            if (numeros[i] % 2==0) {
               mod[pos] = numeros[i];
                pos++;
            }
        }
        for(int i=0;i<MAXIMO;i++){
                if(numeros[i] % 2!=0){
                    mod[pos]=numeros[i];
                    pos++;
                }
                
        }
        for(int i = 0;i<MAXIMO;i++){
            numeros[i]=mod[i];
            
            System.out.printf(" %d ",numeros[i]);
        }
          

    }
}