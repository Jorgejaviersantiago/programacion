import java.util.Scanner;

public class Practica5 {
    
    public static final int MAXIMO = 4;

    public static void main(String[] args) {
        
        int min;    
        int max;
        int num;
        int[]numeros = new int[MAXIMO];

        Scanner sc = new Scanner(System.in);
        System.out.println("Valla Introduciedo numeros enteros y pulse intro: ");
        num=sc.nextInt();
    
        max=numeros[0];
        min=numeros[0];
        for(int i = 0;i<MAXIMO;i++){
            numeros[i]=sc.nextInt();

        }
    
    
    }
}
