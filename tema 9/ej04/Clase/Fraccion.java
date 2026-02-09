package Clase;

public class Fraccion {
    
    private int numerador;
    private int denominador;




   public Fraccion(int numerador ,int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }



 
    /**
     * 
     * @param frac
     * @return
     */
    public Fraccion multiplicar(Fraccion frac){
        return new Fraccion(this.numerador * frac.numerador,this.denominador * frac.denominador);
    }

    
    /**
     * 
     * @param frac
     * @return
     */
    public Fraccion division(Fraccion frac){
        return new Fraccion(this.numerador * frac.denominador,this.denominador * frac.numerador);
    }


    /**
     * 
     */
    public void invertir(){
        int aux = this.numerador;
        this.numerador = this.denominador;
        this.denominador=aux;
    }



    /**
     * 
     */
    @Override
    public String toString(){
     return (this.denominador==1)?""+ this.numerador:this.numerador+"/"+this.denominador;
    }
}
