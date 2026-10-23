package ej05.Clase;

public class Coche extends Vehiculo{

      public void andar(int km){
        System.out.println("¿Cuantos kilometros quieres recorrer?: ");
        recorrer(km);
      }
     
      public void quemarRuedasCoche(){
        System.out.println("Quemar ruedas del coche ");
      }

}
