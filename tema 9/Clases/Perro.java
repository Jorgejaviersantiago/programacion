package Clases;


public class Perro extends Animal{

    private boolean caza;
   
    /**
     * 
     * @param nombre
     */
    public Perro(String nombre){
        super(nombre);
        this.caza=false;
    }
    /**
     * 
     * @return
     */
    public boolean getCaza(){
        return this.caza;
    }

    /**
     * 
     * @return
     */
    public void setCaza(boolean caza){
         this.caza=caza;
    }


    /**
     * 
     */
    public void ladra(){
        System.out.println("Guau¡ Guau¡!");
    }
    /**
    * 
    */
    public void grune(){
        System.out.println("Grrrrr...");
    }


    /**
     * 
     */
    public void caza(){
        if(this.caza){
            System.out.println("Cobra la pieza");
        }
    }
    /**
     * 
     * @param comida
     */
    @Override
    public void come(String comida){
        System.out.println("Ñam¡¡¡");
    }

    /** 
     * 
    */
//    @Override
//     public String toString(){
//                 this.getNombre()+"\n"+
//                 this.getEdad()+"\n";
//     }
}