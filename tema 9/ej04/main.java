import Clase.Fraccion;

public class main {
    
    public static void main(String[] args) {
        

        Fraccion f1 = new Fraccion(-7, 8);
        Fraccion f2 = new Fraccion(3, 5);
        System.out.println(f1);

       // System.out.println(f1.multiplicar(5));
        System.out.println(f1.multiplicar(f2));
        System.out.println(f1.division(f2));


        f1.invertir();
        System.out.println(f1);
    }
}
