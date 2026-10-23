public class Practica33 {
    public static final int MAX=10;
    public static void main(String[] args) {
        
        int[][]tabla = new int[MAX][MAX];
        int j=0;
        int maximo=0;
        int minimo=300;
        int result=0;
        float media=0;

        mostrar(tabla);
         
        System.out.println();
        System.out.println("Diagonal desde la esquina inferior izquierda a la esquina superior ");
        System.out.print("Derecha:");
    









    }
    public static void mostrar(int[][]tabla) {
        
           
        int[][]array = new int[MAX][MAX];

        for(int i=0;i<MAX;i++){
            for(int j=0;j<MAX;j++){
                tabla[i][j]=(int)(Math.random()*(101)+200);
                System.out.printf(" %d ",tabla[i][j]); 
            }
          System.out.println();
        }
   
    }
}
