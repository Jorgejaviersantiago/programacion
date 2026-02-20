package Coleccion;

import java.util.ArrayList;

import ej05.main;

public class ej01 {
    
// 2 Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y que luego calcule la suma, la media, el
// máximo y el mínimo de esos números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10 y 20 elementos ambos
// inclusive.
public static void main(String[] args) {
    int maximo = 0;
    int minimo = 100;
    int media;
    int suma=0;
    int tamano=(int)((Math.random()*11)+10);
    int numero;
    ArrayList<Integer>numeros = new ArrayList<>();



    // for(int i=0; i< tamaño;i++){
    //     numero = (int) (Math.random()*101);
    //     numeros.add(numero);
    // }
    rellenar(tamano, numeros);
    //hacemos los calculos 
    for(int num : numeros){
      suma+=num;
      if (num > maximo) {
        maximo = num;
      }
      if (num < minimo) {
        minimo = num;
      }
    }
    media = suma / numeros.size();
    //mostramos por pantalla
    System.out.printf("Suma : %d\n",suma);
    System.out.printf("Media : %.2f\n",media);
    System.out.printf("Maximo : %.2f\n",maximo);
    System.out.printf("Minimo : %.2f\n",minimo);
    System.out.println(numeros);

}
   

/**
 * 
 * @param tamaño
 * @param lista
 */
public static void rellenar(int tamano, ArrayList<Integer>lista){
  int numero;
  for(int i=0; i< tamano;i++){
    numero = (int) (Math.random()*101);
    lista.add(numero);
  }
}

}
