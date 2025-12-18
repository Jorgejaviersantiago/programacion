import java.util.Scanner;

public class MazmorraDelDestino {

    static int vida = 100;
    static int ataque = 15;
    static int defensa = 5;
    static int oro = 20;
    static int pociones = 1;
    static int turno = 1;
    static int elegir = 0;
    static String huir;

    public static void main(String[] args) {

        final int TURNOMAXIMO = 10;

        Scanner escaner = new Scanner(System.in);

        do {

            System.out.println("\n");
            System.out.println("Menu principal");
            System.out.println("1.Explorar mazmorra");
            System.out.println("2.Ver estado del jugador");
            System.out.println("3.Usar pocion");
            System.out.println("4.Tienda");
            System.out.println("5.Salir del juego (huir)");
            System.out.print("Elige:");
            elegir = escaner.nextInt();
            escaner.nextLine();

            switch (elegir) {
                case 1:

                    turno++;
                    break;

                case 2:
                    estadisticas();
                    System.out.println("Pulsa ENTER para continuar...");
                    escaner.nextLine();
                    borrarPantalla();

                    break;
                case 3:

                    
                    break;
                case 4:

                    
                    break;
                case 5:
                
                    break;
                default:
                    break;
            }

        } while (turno < 10 && vida > 0);

        if (vida == 0) {
            System.out.println("");
            System.out.print("Fin del juego");
        }

    }

    public static void estadisticas() {

        System.out.printf("\n");
        System.out.printf("\n Vida %d", vida);
        System.out.printf("\n Ataque %d", ataque);
        System.out.printf("\n Defensa %d", defensa);
        System.out.printf("\n Oro %d", oro);
        System.out.printf("\n Pociones %d", pociones);
        System.out.printf("\n Turno %d\n", turno);

    }

    public static void borrarPantalla() {
        System.out.print("\033[2J\033[H");

    }

}