package Clases;

public class Caballo {
    
    private String nombre ;
    private String raza;
    private int edad;


    /**
     * 
     * @param nombre
     */
    public Caballo(String nombre){
            this.nombre=nombre;
    }


    /**
     * 
     * @param edad
     */
    public Caballo(int edad){
        this.edad=edad;
    }






    /**
     * 
     */
    public String toString(){
      return String.format("Hola me llamo %s\n", this.nombre);
    }

    /**
     * 
     * 
     */
    public void muje(){
        System.out.println("Hiiiiiiieeeee");
       
    }

    /**
     * 
     */
    public void andar(){
        System.out.println("Tocotoc Tocotoc  Tocotoc ");
       
    }

    /**
     * 
     */
    public void come(){
        System.out.println("ñam ñam ñam");
       
    }









}
