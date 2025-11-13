


public class ejercicio4 {
    public static void main(String[] args) {
        final int CLAVE=2145;
       
        int intentos ;
        int oportunidades=4;
    
        do {         
            System.out.print("Introducce la clave de caja fuerte: ");
            intentos=Integer.parseInt(System.console().readLine());
            oportunidades--;

            if (intentos!=CLAVE) {            
                System.out.println("Clave incorrecta");
            
            } else {
                if(intentos==CLAVE) {
                    System.out.println(" \033[31m Se habrira la caja fuerte\033[0m");
                }                
            }         
        } while ((oportunidades<=4) && (oportunidades>0) && (intentos!=CLAVE)) ;

        if((oportunidades==0) && (intentos!=CLAVE)) {
            System.out.print(" A agotado el numero de oportunidades\n ");
            System.out.print("Se a emitido un aviso a la policia");
        }
    }
}
