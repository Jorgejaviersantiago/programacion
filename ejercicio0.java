
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio0{

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        menu();

    }

    //pedir entrdas niños
    public static int comprobarNumeroNaturales(int mensaje) {

        try {
            while (mensaje < 0) {
                System.out.print("Numero Incorecto introduzca un numero mayor o igual que  0 imbecil.");
                mensaje = sc.nextInt();
            }

        } catch (InputMismatchException e) {
            System.out.println("Escriba numeros entros naturales Ejm: 1 , 2.");
        } finally {
            sc.next();
        }
        return mensaje;
    }

    public static String comprobarNombre(String nombre) {

        try {
            while (nombre == null) {
                System.out.print("Numero de entrdas de adultos: ");
                nombre = sc.nextLine();
            }

        } catch (NumberFormatException e) {
            System.out.println("Escriba su nombre sin numeros.");
        } finally {
            sc.next();
        }
        return nombre;
    }

    public static void pintarcueva() {
        System.out.println("=======================================");
        System.out.println("             Cueva de Nerja");
        System.out.println("=======================================");
        System.out.println();
    }

    private static void menu() {

        int entradasNiños = 0;
        int entradasAdultos = 0;
        int audioguias = 0;
        int opciones = 0;

        do {
            System.out.println("\nElija una de las siguientes opciones.");
            System.out.println("1.Registrar entrada.");
            System.out.println("2.resumen del dia.");
            System.out.println("3.salir.");
            opciones = sc.nextInt();
            
            switch (opciones) {

                case 1 -> {
                    System.out.print("\nNumero de entrdas de adultos: ");
                    entradasAdultos = sc.nextInt();
                    comprobarNumeroNaturales(entradasAdultos);
                    System.out.print("\nNumero de entradas niños: ");
                    entradasNiños = sc.nextInt();
                    comprobarNumeroNaturales(entradasNiños);
                    System.out.print("\nNumero de audioguias: ");
                    audioguias = sc.nextInt();
                    comprobarNumeroNaturales(audioguias);
                    //Creo el ticket 
                    Ticket ticket = new Ticket(entradasAdultos, entradasNiños, audioguias);
                    //Imprimo mo ticket
                    pintarcueva();
                    ticket.imprimirTicket();
                    //registro mi ticket
                    Caja.registrarTicket(ticket);
                }
                case 2 -> {
                    System.out.println("Resumen del dia.");
                    Caja.mostrarResumenDia();
                }
                case 3 -> System.out.println("Grcias por usar el programa.");
                default -> System.out.println("eliga una de las opciones indicadas.");
                
            }
        } while (opciones != 3);
    }

    private static int leerNaturales(){
        int naturales = 0;
        boolean esNAtural = false;

        do{
            try{
                naturales = sc.nextInt();
                if (naturales < 0) {
                    System.out.println("Introduzca un numero mayor que 0.");
                }else{
                    esNAtural = true;
                }

            }
            catch(InputMismatchException ex){
                System.out.println("A escrito letras en vez de numeros.");
            }

        }while(esNAtural);

        return naturales;
    }

}
