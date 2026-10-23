
public class Ticket {
    
    //Constantes
    private final double PRECIOADULTOS = 9.60;
    private final double PRECIONIÑOS = 4.95;
    private final double PRECIOAUDIOGUIA = 3.50;
    private final double DESCUENTO = 0.17;

    //Atributo
    private int entradasAdultos;
    private int entradasNinios;
    private int audioguia;
    private double importeAdultos;
    private double importeNinios;
    private double importeAudioguias;

    //Constructor
    public Ticket(int entradasAdultos, int entradasNinios, int audioguia) {
        this.entradasAdultos = entradasAdultos;
        this.entradasNinios = entradasNinios;
        this.audioguia = audioguia;
        importeAdultos = entradasAdultos * PRECIOADULTOS;
        importeNinios = entradasNinios * PRECIONIÑOS;
        importeAudioguias = audioguia * PRECIOAUDIOGUIA;

    }
    //Metodos
    public double calcularSubtotal() {
        double subtutotal;

        subtutotal =  importeAdultos + importeNinios +  importeAudioguias;
        return subtutotal;
    }

    public double calcularDescuentoAudioguia() {
        double calculoDescuento;

        calculoDescuento = PRECIOAUDIOGUIA * DESCUENTO;
        return calculoDescuento;
    }

    public double calcularTotal() {
        double total;

        total = calcularSubtotal() - calcularDescuentoAudioguia();
        return total;
    }

    public void imprimirTicket() {

        System.out.println("Producto                 cant.  importe");
        System.out.println("---------------------------------------");
        System.out.println();
        System.out.printf("Adultos %22d", entradasAdultos);
        System.out.printf("%9.2f\n",  importeAdultos);
        System.out.printf("Niños %24d", entradasNinios);
        System.out.printf("%9.2f\n",  importeNinios);
        System.out.printf("Audioguias %19d", audioguia);
        System.out.printf("%9.2f\n",  importeAudioguias);
        System.out.println("---------------------------------------");
        System.out.println();
        System.out.printf("Subtotal:%30.2f\n", calcularSubtotal());
        System.out.printf("Descuento:%29.2f\n", calcularDescuentoAudioguia());
        System.out.printf("\033[47m\033[31m\033[1mTOTAL A PAGAR:%25.2f", calcularTotal());
        System.out.print("\033[0m");

    }

    public int getEntradasAdultos() {
        return entradasAdultos;
    }

    public int getEntradasNinios() {
        return entradasNinios;
    }

    public int getAudioguia() {
        return audioguia;
    }

}
