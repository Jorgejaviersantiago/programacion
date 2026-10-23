public class Caja {
    
    private static int totalEntrasAudultos;
    private static int totalEntrasNiños;
    private static int totalAudiguias;
    private static double ingresoAcumulada;
    private static double aplicadosAcumulados;

    public static void registrarTicket( Ticket ticket){
        totalEntrasAudultos += ticket.getEntradasAdultos();
        totalEntrasNiños += ticket.getEntradasNinios();
        totalAudiguias += ticket.getAudioguia();
        ingresoAcumulada += ticket.calcularTotal();
        aplicadosAcumulados +=ticket.calcularDescuentoAudioguia();

    }

    public static  void mostrarResumenDia(){
        System.out.println("================================");
        System.out.printf("Total de entradas adultos:%1d\n",totalEntrasAudultos);
        System.out.printf("Total de entradas niños:%1d\n",totalEntrasNiños);
        System.out.printf("Total de entradas audioguias:%1d\n",totalAudiguias);
        System.out.printf("Total de entradas ingresos del dia:%1.2f\n",ingresoAcumulada);
        System.out.printf("Total de entradas descuentos del dia:%1.2f\n",aplicadosAcumulados);
        System.out.println("================================");

    }



}
