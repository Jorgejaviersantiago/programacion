package Clases;

public class Animal {
    
    private String nombre ;
    private String raza;
    private int edad;
    private String sexo;

    Animal(String nombre){
        this.nombre=nombre;
    }

    Animal(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    /**
         * 
         * @return
         */
    public String getNombre(){
        return this.nombre;
    }


    /**
     * 
     * @param sexo
     */
    public void setSexo(String sexo){
        this.sexo=sexo;
    }


     /**
     * 
     * @param edad
     */
      public void setEdad (int edad){
        this.edad=edad;
    }

     /**
     * 
     * @param comida
     */
     public void come(String comida){
        System.out.println("Me gusta comer " + comida + "!!!");
        System.out.println("ñam");
    }

 /**
     * 
     * @param gato
     */
 public void pelea(Animal gato){
    System.out.println("Voy a pelearme con " + gato +"!!");
}
    


}
       