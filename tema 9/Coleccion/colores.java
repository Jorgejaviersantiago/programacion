package Coleccion;

import java.util.ArrayList;
import java.util.Scanner;

import ej05.main;

public class colores {
    public static void main(String[] args) {

        String color;
        boolean algo = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<String>colores = new ArrayList<String>();
        System.out.println("Introduzca colores: ");
        do {
            color=sc.nextLine();
        
            if(color.isEmpty()){
               algo = false;
            }
            colores.add(color);
        }while(algo);

       for(int i=0; i < colores.size();i++){
            System.out.print(" "+colores.get(i));
       }
    }
}
