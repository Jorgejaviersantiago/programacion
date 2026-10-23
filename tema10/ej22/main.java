package ej22;

import java.lang.reflect.Array;
import java.util.ArrayList;

import ej22.clase.Pieza;

public class main {
/*En ajedrez, el valor de las piezas se mide en peones. Una dama vale 9 peones, una
torre 5 peones, un alfil 3, un caballo 2 y un péon vale, lógicamente, 1 peón. Realiza
un programa que genere al azar las capturas que ha hecho un jugador durante una
partida. El numero de capturas sera un valor aleatorio entre 0 y 15. Hay que tener en
cuenta que cada jugador tiene la posibilidad de capturar algunas de las siguientes
piezas (no mas): 1 dama, 2 torres, 2 alfiles, 2 caballos y 8 peones. Al
final debe aparecer la puntuación total.*/

public static void main(String[] args) {
    int totalCapturas;
    int totalPeones = 0;
    Pieza item;
    ArrayList<Pieza> piezas = new ArrayList<>();

    piezas.add(new Pieza("Dama",1,9));
    piezas.add(new Pieza("Torre",2,5));
    piezas.add(new Pieza("Alfil",2,3));
    piezas.add(new Pieza("Caballo",2,2));
    piezas.add(new Pieza("Peon",8,1));

    totalCapturas=(int)(Math.random()*16);

    while (totalCapturas > 0) {
        item=piezas.get( (int) (Math.random() * piezas.size()) );
        if (item.puedoCaptura()) {
            item.capturar();
            totalPeones+=item.getValor();
            System.out.println(item); 
            totalCapturas --;
        }
    }



    System.out.printf("puntos totales %d peones\n ",totalPeones);
    
    
    
    



}




}
