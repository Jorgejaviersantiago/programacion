public class Ejemplos {

    public static void main( String[]args){

        String nombre;
        int Edad;
        String linea;
        float altura;
        System.out.print("Introduce un nombre");
        nombre = System.console().readLine() ;// Siempre devuelve una cadena 

        System.out.printf("Hola:%s\n",nombre);

        System.out.print("Introduce tu edad ");
        //linea = System.console().readLine() ;
       // Edad = Integer.parseInt(linea);
        Edad = Integer.parseInt(System.console().readLine());
        System.out.printf("Tienes %d años\n", Edad);


        System.out.printf("introduce tu altura");
        linea = System.console().readLine() ;
        
   
   
   
    }






}