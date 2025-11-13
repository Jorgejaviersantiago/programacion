public class ejercicio13 {
    public static void main(String[] args) {
            int i=2;
            int numero;
            boolean primo = false;

            System.out.print("Introduzca un numero:");
            numero=Integer.parseInt(System.console().readLine());

            while ((i <=  (numero/2)) && (!primo) ){
                if (numero%1==0) {
                    primo=false;
                }
                i++;
            }

            if (primo) {
                System.out.println("El numero no es primo.");
            }else{
                System.out.println("El numero es primo.");
            }




    }
}
