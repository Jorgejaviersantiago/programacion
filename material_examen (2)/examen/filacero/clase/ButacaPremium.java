
 package clase;

public class ButacaPremium extends Butaca {

    private String  acesoVip = "si";
    private int vendidoVip;

    public ButacaPremium(int numero, int precio) {
            super(numero, precio);
            vendidoVip ++;
    }

        public int totalButacasEstandar(){
            return vendidoVip;
        }
}