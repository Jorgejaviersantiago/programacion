import java.util.Scanner;

public class Practica26 {
    
    public static void main(String[] args) {
        int num;
        int [][]tabla = new int[4][5];
        int []fila = new int[4];
        int []colum= new int[5];
        int copia =0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Por favor introduzaca los numeros (enteros) en el array: ");
       System.out.println();
      
       for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.printf("Fila %d columna %d :",i,j );
                tabla[i][j]=sc.nextInt();
            }
           
       } 
    
       for(int i=0; i < 4 ;i++){
            for(int j=0; j < 5;j++){
                System.out.printf( " %2d   ",tabla[i][j] );
            }
        copia += tabla[i][0]+tabla[i][1]+tabla[i][2]+tabla[i][3]+tabla[i][4];
        System.out.printf("|%3d",tabla[i][0]+tabla[i][1]+tabla[i][2]+tabla[i][3]+tabla[i][4]);
        System.out.println();
       }

       System.out.println("-----------------------------------");
        for(int j=0; j < 5;j++){
            System.out.printf("%3d   ",tabla[0][j]+tabla[1][j]+tabla[2][j]+tabla[3][j]);
        }
        System.out.printf("|%3d",copia);
    

 
      



    }
}
