public class ejercicio9 {
    
    public static void main(String[] args) {
        
        int numero;
        int temporal;
        int ant=0;  // el valor de actual y anterior son inicialmete        
        int act=1;  // los indicados por definición de la serie de fibonacci

        System.out.println("\033[1m PRIMEROS TERMINOS SERIE DE FIBONACCI\033[0m");
        System.out.print("Introduzca un numero:");
        numero=Integer.parseInt(System.console().readLine());

        while (numero >= 1) {
        
            System.out.print(ant + " ");
    
            ant=act;
            temporal = ant  + act;
            ant=act;
            act=temporal;
         
            numero--;
        }
    }
}
