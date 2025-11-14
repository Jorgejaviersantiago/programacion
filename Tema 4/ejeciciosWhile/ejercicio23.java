public class ejercicio23 {
    
    public static void main(String[] args) {
       int numero ;
       int digito ;
       int volteado = 0;
       int posicion = 1;
        try{
        System.out.println("Introduzca un numero entero");
        numero=Integer.parseInt(System.console().readLine());
     
        System.out.println("Introduzca un numero entero");
        digito=Integer.parseInt(System.console().readLine());
        
        System.out.printf("Contando de izquierda a derecha , el %d aparece dentro del %d en las siguientes posiciones:%d",numero,digito,posicion);
        // giramos el numero
        while (numero > 0) {
            volteado = (volteado*10) + (numero%10);
            numero/=10 ;
        }
        //calculamos posición
       while(volteado > 0){
        if(volteado == digito){
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