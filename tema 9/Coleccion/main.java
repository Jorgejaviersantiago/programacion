package Coleccion;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        int select;
        String codigo;
         String titulo;
         String artista;
         String genero;
        int duracion;
        boolean algo = true;
        Disco disco = new Disco();
        coleccionesDisco repositorio = new coleccionesDisco();
        Scanner sc = new Scanner(System.in);
            do {
                System.out.println("1.Añadir disco");
                System.out.println("2.Mostrar disco");
                System.out.println("3.salir");
                select = sc.nextInt();

                switch (select) {
                    case 1:
                        System.out.print("Insertar codigo");
                        codigo=sc.next();
                        System.out.print("Insertar titulo");
                        titulo=sc.next();
                        System.out.print("Insertar artista");
                        artista=sc.next();
                        System.out.print("Insertar genero");
                        genero=sc.next();
                        System.out.print("Insertar duracio");
                        duracion=sc.nextInt();
                        repositorio.añadirDiscos(disco);
                        
                        break;
                
                    case 2:
                        

                        break;

                        
                    case 3:;
                        algo = false ;
                        break;
                }

           }while(algo= true);




    }
}


