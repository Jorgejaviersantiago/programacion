package ej05.Clase;

public class Vehiculo{
    
    private String andar;
    private int kilometrosTotales;
    private int kilometroRecorridos;



    Vehiculo(int kilometrosTotales,int kilometroRecorridos){
        this.kilometrosTotales=kilometrosTotales;
        this.kilometroRecorridos=kilometroRecorridos;
     
    }

   public void andar(Vehiculo vehiculo){
       System.out.println("Anda con el " + vehiculo);

    }
 




}