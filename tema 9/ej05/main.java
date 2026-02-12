package ej05;

import java.util.Scanner;

import ej05.Clase.Bicicleta;
import ej05.Clase.Coche;

    public class main {public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        Bicicleta bici = new Bicicleta();
        Coche coche  = new Coche() ;
        do {

            System.out.println("1. Andar con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Andar con el coche");
            System.out.println("4. Quemar rueda con el coche");
            System.out.println("5. Ver kiometraje de la bicileta");
            System.out.println("6. Ver kilometrage del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");
            num=Integer.parseInt(System.console().readLine());
            if (num<=8) {
            switch (num) {
                case 1:
                    System.out.print("¿Cuantos kilometros quieres recorrer?: ");
                                bici.andar(sc.nextInt());
                    break;

                case 2:
                     bici.hacerElCaballito();

                    break;
                case 3:
                    System.out.print("¿Cuantos kilometros quieres recorrer?: ");
                    coche.andar(sc.nextInt());
                        break;

                case 4:
                     coche.quemarRuedasCoche();
                        break;

                case 5:
                    System.out.println("Kilómetros bicicleta: " + bici.getKilometroTotales() );

                        break;
                case 6:
                    System.out.println("Kilómetros coche: " + coche.getKilometroRecorridos());

                        break;
                case 7:
                        
                        break;
                }
                System.out.println();
            }else{
                System.out.println("Eliga una de las opciones indicadas");
            }
        }while(num!=8);
      
    }

}
