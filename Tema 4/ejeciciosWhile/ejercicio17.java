public class ejercicio17 {

    




public static void main(String[] args) {
        
    final char CARACTER ;
   
    int altura;
    int totalEspacios;
    int totalCaracteres;
    char caracter;

    System.out.print("Introduzca la altura de la piramide: ");
    altura = Integer.parseInt(System.console().readLine());
    

    System.out.print("Introduzca el caracter de la piramide: ");
    caracter = System.console().readLine().charAt(0);

    totalEspacios=altura-1;
    totalCaracteres=1;
    for(int fila=1; fila <= altura;  fila++){

        //dibujamos espacios
        for(int col=1; col <=  totalEspacios; col++ ){
            System.out.print( " ");
    
        }
        //dibujamos caracteres
        for(int col=1; col <= totalCaracteres; col++){
           if((fila==1) || (fila == altura ) || (col==1) || (col==2*fila -1)){
            System.out.print(caracter);
           }else{
            System.out.print(" ");
           }
        }

        // hacemos salto de linea
        System.out.println( "");
        totalEspacios--;
        totalCaracteres+=2;
    }  
 }
}