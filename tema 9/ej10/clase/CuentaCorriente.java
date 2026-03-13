package clase;

public class CuentaCorriente {
    private String numero="";
    private double saldo;


    public CuentaCorriente(int saldoinicial){
        this.generarNumero();
        this.saldo=saldoinicial;
    }
    
    public CuentaCorriente(){
        this.generarNumero();
        this.saldo=0;
    }


    private void generarNumero(){
     int temporal; 
     for(int i=0 ; i < 10;i++){
        temporal= (int)(Math.random()*10);
        numero+=temporal;
     }
     
    }

    @Overide
    public String toString(){
        return String.format("Numero de cta: %s saldo: %.1f",this.numero,this.saldo);
    }
  
    public double cargo(double num){
        saldo=saldo-num;
        return saldo;
    }

    public void ingreso(double num){
          saldo+=num;
    
    }

    public double transferencia(CuentaCorriente cuenta,double num){
      
        saldo=cuenta.saldo+num;;
        return saldo;
    }

}
