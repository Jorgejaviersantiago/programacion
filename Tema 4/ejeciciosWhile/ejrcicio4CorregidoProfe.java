public class ejrcicio4CorregidoProfe {
    
    public static void main(String[] args) {
        
        final int clave_fuerte=8888;
        int clave;
        int intentos=4;    
        boolean abierta = false;
        do{

        System.out.println("");
         clave=Integer.parseInt(System.console().readLine());   
            intentos--;
            abierta = (clave == clave_fuerte);
            
            if (!abierta) {
                System.out.println("Clave incorrecta");
                
            }
            }while((!abierta) && (intentos > 0));
            if (abierta) {
                System.out.println("Ha abierto la caja fuerte");
            }else{
                System.out.println("Lo siento, ha agotado las 4 oportunidades");

            }
   
   
   
   
    }
}
