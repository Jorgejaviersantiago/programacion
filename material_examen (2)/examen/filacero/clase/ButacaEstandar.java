package clase;

public class ButacaEstandar extends Butaca{

    private int vendido;

    public ButacaEstandar(int numero, int precio) {
        super(numero, precio);
      vendido ++;

    }

    public int totalButacasEstandar(){
        return vendido;
    }
}