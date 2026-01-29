import java.util.Scanner;

public class Practica21 {
    


    public static void main(String[] args) {
        
        int tamaño;
        int de;
        int iz;
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el tamaño del array: ");
        tamaño=sc.nextInt();

        int[]array = new int [tamaño]; 
        int []resultado = new int[tamaño];
     
         for(int i=0;i<tamaño;i++){
            array[i]=(int)(Math.random()*200);
         }

         iz=0;
         de=tamaño-1;

         for(int i=0;i<tamaño;i++){
            if (i%2==0) {
                resultado[iz++]=array[i];
            }else{
                resultado[de--]=array[i];
            }
         }

          mostrar(array);
          System.out.println();
          mostrarMod(resultado);

     }




     public static void mostrar(int[]array) {
        System.out.print("Array modificado: ");
        System.out.println();
       
        System.out.print("indice ");
        for(int i=0;i<array.length;i++){
            System.out.printf("%4d",i);
         }
         System.out.print("\nvalor  ");
         for(int i=0;i<array.length;i++){
            System.out.printf("%4d",array[i]);
         }
     }
 



     
     public static void mostrarMod(int[]array) {
        
        System.out.println();
        System.out.print("indice ");
        for(int i=0;i<array.length;i++){
            System.out.printf("%4d",i);
         }
        
         System.out.print("\nvalor  ");
         for(int i=0;i<array.length;i++){
            System.out.printf("%4d",array[i]);
         }
     }
}



