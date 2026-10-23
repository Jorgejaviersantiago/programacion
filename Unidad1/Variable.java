public class Variable {

    
public static void main(String[] args) {
     
    double x ;
     double y ;
    int numero = 5;

    System.out.printf ( "el valor de la variablees %d\n", numero );
    System.out.println( "El valor de la variable es:" + numero);

       x = 5 ;
       y = 25.75 ;

    System.out.println( "El valor x es "+ x + " y el valor de y es " + y );
    System.out.printf( "El valor de x es %.2f y el valor de y es x.2f\n", x, y);

// Ejemplo 3

char letra1 = 'c' ;
char letra2 = 'a';
char letra3 = 's';
char letra4 = 'a';

System.out.println(letra1);
System.out.println(" La primera letra es"+ letra1);
System.out.printf( "La primera letra es:%c\n",letra1);

System.out.println( " Las letras forman la plabra" + letra1 + letra2 + letra3 + letra4);
System.out.println( " " +letra1 + letra2 );
System.out.printf("%c",letra1 + letra2);

// Ejemplo 4
numero++;// es equivalente a numero = numero + 1  
System.out.printf( "El valor de la variable es :%d\n",numero++);
System.out.printf( "El valor de la variable es :%d\n",--numero);

int resultado = numero ++ ;

System.out.println("resustado = " + resultado);
System.out.println("Numero = " + numero );


}








}