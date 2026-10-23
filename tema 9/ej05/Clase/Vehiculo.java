package ej05.Clase;

public class Vehiculo{
    
    private int kilometrosTotales=0;
    private int kilometroRecorridos;
    private int vehiculosCreados=0;



    Vehiculo(){
            this.kilometroRecorridos=0;
     
    }

    public void recorrer(int klm){
        this.kilometroRecorridos += klm;
        kilometrosTotales += klm;
    }

   public int getKilometroTotales() {
    return kilometrosTotales;
   }

   public int getKilometroRecorridos() {
    return kilometroRecorridos;
}



 


    


}