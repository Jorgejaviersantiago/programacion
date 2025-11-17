public class ejercicio23 {
    
    public static void main(String[] args) {
       int numero ;
       int digito ;
       int volteado = 0;
       int posicion = 1;
       int longitud=0; 
      //string.valueOf
      
      
       try{
        System.out.println("Introduzca un numero entero: ");
        numero=Integer.parseInt(System.console().readLine());
     
        System.out.println("Introduzca un digito: ");
        digito=Integer.parseInt(System.console().readLine());
        
        System.out.printf("Contando de izquierda a derecha , el %d aparece dentro del %d en las siguientes posiciones: %d",digito,numero,posicion);
        // giramos el numero
        while (numero > 0) {
            volteado = (volteado*10) + (numero%10);
            numero/=10 ;
            longitud++;
        }
        // calculamos la longitud del número
        // longitud
        
        
        //calculamos posición
       for(;longitud > 0 ;longitud--){
        if(volteado%10 == digito){
            System.out.printf("%d", posicion);

        }
        volteado /= 10;
        posicion++;
     }


        

    }catch(Exception esception){
        System.out.print("¡Se ha producio un error!");
        
    
    
    }
 }
}