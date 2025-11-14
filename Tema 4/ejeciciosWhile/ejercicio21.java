public class ejercicio21 {
    

    public static void main(String[] args) {
       
        final char CARACTER ;
       
        int altura;
        int totalEspacios;
        int totalCaracteres;
        char caracter;

        System.out.print("Introduzca la altura de la piramide: ");
        altura = Integer.parseInt(System.console().readLine());
        

      
        
        for(int fila=1; fila <= altura;  fila++){

            //dibujamos espacios
            for(int col=1; col <=  altura-fila; col++ ){
                System.out.print( " ");
        
            }
            //dibujamos la secuencia numerica de la izquierda
            for(int col=1; col <= fila; col++){
                System.out.print(col);
            }
            // dibujamos la secuencia numerica de la derecha 
            for(int col= fila-1; col > 0 ; col--){
                System.out.print(col);
            }
            // hacemos salto de linea
            System.out.println( "");
           
          


        }






    }
}
