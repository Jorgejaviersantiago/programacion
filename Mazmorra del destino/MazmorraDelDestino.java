import java.util.Scanner;

public class MazmorraDelDestino {

    static int vida = 100;
    static int ataque = 15;
    static int defensa = 5;
    static int oro = 20;
    static int pociones = 1;
    static int turno = 1;
    static int elegir = 0;
    static int evento;
    static int vidaEnemigo=40;
    static int dañoEnemigo=10;
    static int dañoFinalEnemigo;
    static int jugador;
    static int dañoJugador;
    static int defensaJugador;
    static int dañoFinal;
    static int reconpensa;
    static int oroEncontrado;
    static int oroEnemigo;
    static boolean salir=false;
    static boolean huir=false;
   
    

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
            System.out.println("5.Salir del juego");
            System.out.print("Elige:");
            elegir = escaner.nextInt();
            escaner.nextLine();

            switch (elegir) {
                        case 1:
                        evento=(int)(Math.random()*(3+1));
    

                        switch (evento) {
                        case 0:
                            System.out.println("Te has encontrado un enemigo que vas a hacer");
                         while (vidaEnemigo>0||huir==true) {
                            System.out.println("------------------------------");
                                    System.out.println("1.Atacar");
                                    System.out.println("2.Defenderse");
                                    System.out.println("3.Huir");
                                    elegir = escaner.nextInt();

                                switch (elegir) {
                                    case 1:
                                        dañoJugador=ataque+(int)Math.random()*(4+1);
                                        dañoFinalEnemigo=dañoEnemigo+(int)Math.random()*(4+1);
                                        System.out.printf("Atacas y causas %d de daño\n",dañoJugador);
                                        System.out.printf("El enemigo te ataca y causa %d de daño\n",dañoFinalEnemigo);
                                        dañoFinalEnemigo=dañoEnemigo+(int)Math.random()*(4+1);
                                        vida-=dañoFinalEnemigo;
                                        dañoJugador-=vidaEnemigo;
                                       System.out.printf(" vida del jugador %d \n",vida);
                                       System.out.printf("la  vida del enmigo es de  es de %d\n",vidaEnemigo);
                                        break;
                                    case 2:
                                        dañoFinal=dañoEnemigo-(defensa*2);
                                        System.out.printf("El enemigo te ataca y causas %d\n",dañoFinal);

                                        break;
                                    case 3:
                                        huir=true;
                                        break;
                                    default:
                                        break;
                                }
                              
                                 vida-=dañoFinalEnemigo;
                                 dañoJugador-=vidaEnemigo;
                                System.out.printf(" vida del jugador %d \n",vida);
                                System.out.printf("la  vida del enmigo es de  es de %d\n",vidaEnemigo);

                            }
                            if (vidaEnemigo<0) {
                                reconpensa=(int)Math.random();
                                switch (reconpensa) {
                                case 0:
                                System.out.println("Has gando una pocion ");    
                                pociones++;    
                                        break;
                                
                                case 1:
                                oroEnemigo=(int)Math.random()*(15-5+1)+5;
                                oro= oro+oroEnemigo;
                                    break;
                                default:
                                    break;
                                }
                            }
                                
                            break;
                        case 1:
                            pociones+=1;
                                    
                                
                                break;
                        case 2:
                            oroEncontrado=(int)Math.random()*(15-5+1)+5;
                            System.out.printf("Has encontrado %d oro",oroEncontrado);
                            oro=oro+oroEncontrado;

                                    
                                break;
                          case 3:
                            System.out.println("No ocurre nada ");
                                        
                                    
                                break;
                       
                         default:
                            break;
                    }
                   
                 turno++;
                 break;


                case 2:
                    estadisticas();
                    System.out.println("Pulsa ENTER para continuar...");
                    escaner.nextLine();
                    borrarPantalla();


                    break;
                case 3:
                 tomarPocion(vida);
                 borrarPantalla();
                 /* 
                    if (vida<100) {
                           vida+=30;
                           if (vida>100) {
                            vida=100;
                           }
                    }else{
                        System.out.println("Tu vida ya esta al maximo");
                        escaner.nextLine();
                        borrarPantalla();
                    }
                    */
                   
                    break;
               
                case 4:
                    tienda();
                     System.out.println("Pulsa ENTER para continuar...");    
                     elegir=escaner.nextInt();
                     escaner.nextLine();
                    borrarPantalla();
                 
                    if (elegir==1) {
                        if(oro<10){
                         System.out.println("Lo siento no tiuenes oro suficiente:");
                       
                        }else{
                            oro-=10;
                            pociones++;
                            borrarPantalla();
                        }
                     }else if(elegir==2){
                       if(oro<20){
                        System.out.println("Lo siento no tiuenes oro suficiente:");
                       }else{
                        ataque+=5;
                        oro-=20;
                        borrarPantalla();
                       }
                    }else if(elegir==3){
                         borrarPantalla();
                      }
                    break;
           
                case 5:
                    salir=true;
                    break;
                default:
                    break;
            }


        } while (turno < 10 && vida > 0 && salir==false);


        if (vida <= 0 ) {
            System.out.println("");
            System.out.print("Has muerto pringado.Fin del juego");
        }


        if (salir==true) {
            System.out.println("");
            System.out.print("¡Has salido del juego");
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






    public static void tienda() {
                System.out.println("1.Comprar poción(10 de oro)");
                System.out.println("2.Comprar poción (+5) por 20 de oro.");
                System.out.println("3.Salir");
               
    }
    
    public static int tomarPocion(int pociones ) {
        Scanner escaner = new Scanner(System.in);

        if (vida<100) {
            vida+=30;
            System.out.printf("Has ganado 30 de vida tu vida ahora es %d",vida);
            escaner.nextLine();
            if (vida>100) {
             vida=100;
            }
     }else{
         System.out.println("Tu vida ya esta al maximo");
         escaner.nextLine();
    }

    return vida;
}
}