public class ejercicio3 {
    
    public static void main(String[] args) {
    final int MAXIMO =100 ;
    final int MINIMO=1;
   
   
        float num;
    System.out.print("Introducce un valor comprendido entre 1 y 100:");    
    num=Float.parseFloat(System.console().readLine());

    if(num>=MINIMO && num<=MAXIMO){
        System.out.print("¡Enorabuena!¡El valor introducido es correcto!");
    }else{
        System.out.print("Tu numero es incorrecto");
    }
}
}