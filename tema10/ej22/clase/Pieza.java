package ej22.clase;

import java.util.HashMap;

public class Pieza {
    private String nombre;
    private int valor;
    private int cantidad;


    public Pieza(String nombre, int cantidad,int valor){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.valor=valor;
    }

    public int getValor() {
        return valor;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean puedoCaptura(){
       return this.cantidad >0;
    }

    public void capturar(){
        this.cantidad--;
    }

    @Override
    public String toString() {
        return String.format("Nombre:  %s      valor: %d",this.nombre,this.valor);
    }

  



   
}
