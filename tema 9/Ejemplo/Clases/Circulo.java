package Clases;

public class Circulo implements Figura {
    
    private double radio;


    /**
     * 
     * @param radio
     */
    public Circulo(double radio){
        this.radio=radio;
    }


    public double calcularArea(){
        return 2 *this.radio*this.radio*Math.PI;
    }


    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }





}
