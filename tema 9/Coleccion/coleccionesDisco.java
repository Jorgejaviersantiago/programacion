package Coleccion;

import java.util.ArrayList;


// 1 Crea una clase DISCO con los siguientes atributos privados: codigo (string), titulo, artista, genero, duración (int).
// 2 La clase debe incluir:
// - Constructor con parametros
// - Constructor vacio
// - Getters y setters necesarios
// - Método tostring que muestre información del disco

// Crea una clase COLECCIONDISCOS que gestione la colección de discos utilizando un ArrayList.
// La clase debe incluir:
// - Constructor que inicialice la colección a vacío.
// - Metodo para anadir disco
// - Metodo para mostrar todos los discos

// Crea clase principal MAIN para probar la aplicación mostrando un menú con tres opciones: añadir disco, mostrar disco y salir.
class coleccionesDisco {

ArrayList<Disco>repertorio;


    public coleccionesDisco(){
        repertorio = new ArrayList<>();
    }


    public void añadirDiscos(Disco disco){
        repertorio.add(disco);
        System.out.println("Disco añadido con exito ");
    }

    public void mostrarDiscos(Disco disco){
        if(repertorio.isEmpty()){
            System.out.println("No hay discos ");
        }
        for(int i = 0; i < repertorio.size();i++){
            System.out.println(disco);
        }
    }



    
}