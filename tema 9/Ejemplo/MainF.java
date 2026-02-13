import Clases.Circulo;
import Clases.Rectangulo;

public class MainF {
 
    public static void main(String[] args) {
        Circulo circilo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(2, 2);
    
        System.out.println("El area del circlo"+circilo.calcularArea());
        System.out.println("El area de un rectangulo"+rectangulo.calcularArea());
        System.out.println("El perimetro del circulo "+circilo.calcularPerimetro());
    
    
    
    }



}
