public class Practica11 {
    public static void main(String[] args) {
           int elemento;
           int fil;
           int col;
        
        
        int[][]numeros={{8,-12,33},{14,1,-24},{100,51,60}};
        System.out.println("Introduzca el elemento a visualizar (del 0 al 8): ");
        elemento=Integer.parseInt(System.console().readLine());
        fil = elemento/3;
        col = elemento%3;
        System.out.printf("EL elemento %d es el %d\n",elemento,numeros[fil][col]);



    }
}
