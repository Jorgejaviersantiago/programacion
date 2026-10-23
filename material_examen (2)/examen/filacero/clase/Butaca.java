package clase;



public class Butaca extends ButacaInterfaz{

    private int numero;
    private int precio;
    private boolean ocupada;

    public Butaca (int numero , int precio){
        this.numero = numero;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }
    
    public boolean ocupar(Butaca butaca){
         butaca.estaOcupada(ocupada);
         return ocupada = true;
    }

    public boolean liberar(Butaca butaca){
        butaca.estaOcupada(ocupada);
        return ocupada = false;
    }

    @Override
    public int getPrecio() {
        return super.getPrecio();
    }


 

}