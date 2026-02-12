package ej05.Clase;

public class Bicicleta extends Vehiculo {
    
    public void andar(int km){
        System.out.println("¿Cuantos kilometros quieres recorrer?: ");
        recorrer(km);
    }

    public void hacerElCaballito(){
        System.out.println("Estoy haciendo el caballito con la bici");
    }


    
}
