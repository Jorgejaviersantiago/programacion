
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        String nombre;
        int entradasNiños;//9.60
        double calculoNiños = 4.95;
        int entradasadultos;//4.95
        double calculoAdultos = 9.60;
        int audioguias;//3.50 descuento del 17%
        double calculoAudioguias = 3.50;
        double descuentos;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del cliente: ");
        nombre = sc.nextLine();
        System.out.print("Numero de entrdas de adultos: ");
        entradasadultos = sc.nextInt();
        System.out.print("Numero de entradas niños: ");
        entradasNiños = sc.nextInt();
        System.out.print("Numero de audioguias: ");
        audioguias = sc.nextInt();
        //calculos adultos 
        double precioAdultos;
        precioAdultos = calculoAdultos * entradasadultos;
        //calculos niños
        double precioNiños;
        precioNiños = calculoNiños * entradasNiños;
        //Calculo audioguias
        double precioAudioguias;
        precioAudioguias = calculoAudioguias * audioguias;
        //descuento
        descuentos = precioAudioguias * 0.17;
        //Calculo subtotal
        double subtotal;
        subtotal = precioAdultos + precioAudioguias + precioNiños;
        //calculo final
        double total;
        total = subtotal - descuentos;

        System.out.println("=====================================");
        System.out.println("           Cueva de Nerja");
        System.out.println("=====================================");
        System.out.println("Cliente: " + nombre);
        System.out.println();

        System.out.println("Producto                 cant.  importe");
        System.out.println("---------------------------------------");
        System.out.println();
        System.out.printf("Adultos %19d", entradasadultos);
        System.out.printf("      %.2f\n", precioAdultos);
        System.out.printf("Adultos %19d", entradasNiños);
        System.out.printf("            %.2f\n", precioNiños);
        System.out.printf("Adultos %19d", audioguias);
        System.out.printf("      %.2f\n", precioAudioguias);
        System.out.println("---------------------------------------");
        System.out.println();
        System.out.printf("Subtotal:                       %.2f\n", subtotal);
        System.out.printf("Descuento:                        %.2f\n", descuentos);
        System.out.printf("\033[47m \033[31m \033[1mTOTAL A PAGAR:           %.2f\n", total);
        System.out.print("\033[0m");
    }
}
