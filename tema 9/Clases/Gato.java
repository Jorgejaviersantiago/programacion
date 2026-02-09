package Clases;

/**
 * La clase gato extioende lkas caracteristicas y los 
 * comportamientos de la clase animal.Independientemente 
 */
public class Gato extends Animal{

    // Propiedades

    //Metodos comportamientos
   public Gato(String nombre){
        super(nombre);
    }

    public Gato (String nombre,int edad){
        super(nombre,edad);
    }
   
    /**
     * 
     */
    public void maulla(){
        System.out.println("miauuu");
    }

    /**
     * 
     */
    public void ronronea(){
        System.out.println("brrrrrrr");
    }


}