public class ejercicio4 {
    public static void main(String[] args) {
        final int clave ;
        clave=2145;
        int intentos=0;
        int oportunidades=4;
    
        while (oportunidades<=4 && oportunidades>0 && intentos!=clave)
        {
         
            System.out.print("Introducce la clave de caja fuerte: ");
            intentos=Integer.parseInt(System.console().readLine());
            if (intentos!=clave) {
                oportunidades--;
                System.out.println("Clave erronea");
            
            }else{if(intentos==clave)
                    {
                    System.out.println(" \033[31m Se habrira la caja fuerte\033[0m");
                    }
                 } 
            if(oportunidades==0)
                {
                    System.out.print(" A agotado el numero de oportunidades\n ");
                    System.out.print("Se a emitido un aviso a la policia");
                }
        
        }
    }
}
