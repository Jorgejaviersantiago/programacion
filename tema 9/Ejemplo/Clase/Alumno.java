package Clase;



public class Alumno {
    public static int MAXIMO=5;
    private String nombre;
    private double[] notas;
    private int contador;



    public Alumno(String nombre){
        this.nombre= nombre;
        this.notas = new double[MAXIMO];
        this.contador=0;
    }

    /**
     * 
     * @param nota
     */
    public void setNotas(double nota) {
       if(this.contador<MAXIMO){
        this.notas[this.contador]=nota;
        this.contador++;
       }
    }

    /**
     * 
     * @return
     */
    public double media(){
        
        double media=0;
        for(double item:this.notas){
            media +=item;
        }
        
        return media/this.contador;
    }





}
