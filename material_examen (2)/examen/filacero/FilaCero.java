/**
 * Aplicación de consola para probar la funcionalidad completa de la clase Teatro.
 * NO DEBES TOCAR EL CÓDIGO DE ESTA CLASE.
 * @since: 02/03/2026
*/
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import clase.Teatro;


public class FilaCero {

    private static Scanner sc;

        /**
     * @param String[]
     */
    public static void main(String[] args) {

        boolean salir;
        int opcion;
        Teatro teatro;

        // Inicialización: teclado y teatro
        sc = new Scanner(System.in);
        teatro = new Teatro();
        salir = false;

        try {
            while (!salir) {
                try {
                    mostrarMenu();
                    opcion = leerEntero("Elige una opción: ");
                    salir = ejecutarOpcion(teatro, opcion);
                } catch (InputMismatchException e) {
                    System.out.println("Debe introducir un número entero. Inténtelo de nuevo.");
                    sc.next();
                } catch (NoSuchElementException e) {
                    System.out.println("\nEntrada cerrada. Saliendo...");
                    salir = true;
                }
            }
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        System.out.println("Saliendo...");
    }

    /**
     * Muestra el menú principal del teatro por consola.
     * @return
     */
    private static void mostrarMenu() {
        // Opciones disponibles para el usuario
        System.out.println("\n=== MENU TEATRO ===");
        System.out.println("1. Mostrar mapa de ocupación");
        System.out.println("2. Comprar butaca");
        System.out.println("3. Liberar butaca");
        System.out.println("4. Mostrar estadísticas");
        System.out.println("5. Mostrar recaudación total");
        System.out.println("6. Mostrar recaudación por tipo de butaca");
        System.out.println("0. Salir");
    }

    /**
     * Ejecuta la opción elegida sobre el teatro.
     *
     * @param Teatro
     * @param int
     * @return boolean
     */
    private static boolean ejecutarOpcion(Teatro teatro, int opcion) {

        boolean salir;

        salir = false;
        // Despacho según la opción; solo la opción 0 hace salir = true
        switch (opcion) {
            case 1:
                accionMostrarMapa(teatro);
                break;
            case 2:
                accionComprarButaca(teatro);
                break;
            case 3:
                accionLiberarButaca(teatro);
                break;
            case 4:
                teatro.estadisticas() ;
                break;
            case 5:
                teatro.mostrarRecaudacionTotal() ;
                break;
            case 6:
                accionRecaudacionPorTipo(teatro);
                break;
            case 0:
                salir = true;
                break;
            default:
                System.out.println("Opción no válida.");
        }
        return salir;
    }

    /**
     * Muestra el mapa de ocupación del patio.
     * @param Teatro
     * @return
     */
    private static void accionMostrarMapa(Teatro teatro) {
        // Delegar en el teatro la impresión del mapa (N/P por butaca, colores)
        teatro.mostrarMapaOcupacion();
    }

    /**
     * Pide fila y columna, convierte a índice y compra la butaca si es posible.
     * @param Teatro
     * @return
     */
    private static void accionComprarButaca(Teatro teatro) {

        int fila;
        int columna;
        int indice;
        boolean ok;

        // Pedir posición (fila y columna empiezan en 0, como en el mapa)
        fila = leerEntero("Introduce la fila (0-" + (teatro.getNumFilas() - 1) + "): ");
        columna = leerEntero("Introduce la columna (0-" + (teatro.getButacasPorFila() - 1) + "): ");

        // Convertimos la fila y columna a índice
        indice = fila * teatro.getButacasPorFila() + columna;

        // compramos la butaca
        ok = teatro.comprarButaca(indice);

        if (ok) {
            System.out.println("Butaca comprada correctamente.");
        } else {
            System.out.println("No se pudo comprar la butaca (ya ocupada o fila/columna incorrectas).");
        }
    }

    /**
     * Pide fila y columna, convierte a índice y libera la butaca si es posible.
     * @param Teatro
     * @return
     */
    private static void accionLiberarButaca(Teatro teatro) {
        int fila;
        int columna;
        int indice;
        boolean ok;

        // Pedir posición (fila y columna empiezan en 0, como en el mapa)
        fila = leerEntero("Introduce la fila (0-" + (teatro.getNumFilas() - 1) + "): ");
        columna = leerEntero("Introduce la columna (0-" + (teatro.getButacasPorFila() - 1) + "): ");

        // Convertimos la fila y columna a índice
        indice = fila * teatro.getButacasPorFila() + columna;

        // liberamos la butaca
        ok = teatro.liberarButaca(indice);

        if (ok) {
            System.out.println("Butaca liberada correctamente.");
        } else {
            System.out.println("No se pudo liberar la butaca (ya libre o fila/columna incorrectas).");
        }
    }

    /**
     * Pide el tipo de butaca (Normal/Premium) y muestra su recaudación.
     * @param Teatro
     * @return
     */
    private static void accionRecaudacionPorTipo(Teatro teatro) {
        String tipo;

        // Leer tipo (Normal o Premium) y delegar la impresión en el teatro
        System.out.print("Introduce tipo de butaca (Normal/Premium): ");
        tipo = sc.next().trim();

        // mostramos la recaudación por tipo de butaca
        teatro.mostrarRecaudacionTipo(tipo);
    }

    /**
     * Muestra un mensaje, lee un entero por teclado y lo devuelve.
     * @param String
     * @return int
     */
    private static int leerEntero(String mensaje) {

        // Mostrar mensaje, leer entero del teclado y devolverlo
        System.out.print(mensaje);
        return sc.nextInt();
    }
}
