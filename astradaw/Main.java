import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import clases.*; 

public class Main {

    public static void main(String[] args) {
        
        int opcion;
        boolean jugando;
        Nave naveDAW;
        String colorVictima;
        Jugador victima;
        String colorVoto;
        Jugador sospechoso;

        jugando = true;
        naveDAW = new Nave();

        // inicializamos la nave con la tripulación
        Utilidades.inicializar(naveDAW);

        // comienza el juego
        do {
            limpiarPantalla();
            
            System.out.println("=======================================");
            System.out.println("       SIMULADOR: Astra-DAW 404        ");
            System.out.println("=======================================");

            naveDAW.mostrarCamaras(); 

            System.out.println("=======================================");
            System.out.println("            MENÚ DE ACCIONES           ");
            System.out.println("=======================================");
            System.out.println("1. Simular un asesinato (Turno del Impostor)");
            System.out.println("2. Convocar Asamblea de Emergencia (Votación)");
            System.out.println("3. Ver Historial del Servidor");
            System.out.println("4. Terminar simulación");

            System.out.print("> ");

            opcion = Integer.parseInt(System.console().readLine());
            System.out.println();

            switch (opcion) {
                case 1: 
                    System.out.print("¿De qué color es la víctima?: ");
                    colorVictima = System.console().readLine();
                    
                    victima = naveDAW.buscarJugador(colorVictima);
                    
                    if (victima != null) {
                        naveDAW.asesinar(victima);
                        naveDAW.comprobarEstadoPartida(); 

                        System.out.println("> Acción procesada.");
                    } else {
                        System.out.println("> ERROR: No existe ese color o ya no está en la nave.");
                    }
                    pausar();
                    break;

                case 2: 
                    System.out.println("--- ASAMBLEA CONVOCADA ---");
                    System.out.println("Escribe el color votado (Escribe 'fin' para terminar la votación):");
                    
                    while (true) {
                        System.out.print("Voto para: ");
                        colorVoto = System.console().readLine();
                        
                        if (colorVoto.equalsIgnoreCase("fin")) {
                            break;
                        }
                        
                        sospechoso = naveDAW.buscarJugador(colorVoto);
                        if (sospechoso != null) {
                            naveDAW.registrarVoto(sospechoso);
                            System.out.println("  [Voto registrado]");
                        } else {
                            System.out.println("  [Voto nulo: Jugador no encontrado]");
                        }
                    }
                    
                    System.out.println("\n> Expulsando al más votado...");
                    naveDAW.expulsarMasVotado();
                    naveDAW.comprobarEstadoPartida();
                    pausar();
                    break;

                case 3: 
                    System.out.println("--- REGISTRO DE EVENTOS ---");
                    naveDAW.mostrarHistorial();
                    pausar();
                    break;

                case 4: 
                    jugando = false;
                    System.out.println("Cerrando servidor... ¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    pausar();
            }

        } while (jugando);
        
    }

   

    /**
     */
    private static void pausar() {
        System.out.println("\nPULSA ENTER PARA CONTINUAR...");
        System.console().readLine();
    }

    /**
     */
    private static void limpiarPantalla() {
       System.out.print("\033[H\033[2J");
    }
}