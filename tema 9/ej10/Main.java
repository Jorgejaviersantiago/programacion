import clase.CuentaCorriente;

public class Main {
    
    public static void main(String[] args) {
        CuentaCorriente cuental = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(1500);
        CuentaCorriente cuenta3 = new CuentaCorriente(6000);
        System.out.println(cuental);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        cuental.ingreso(2000);
        cuenta2.cargo(600);
        cuenta3.ingreso(75);
        cuental.cargo(55);
        cuenta2.transferencia(cuenta3, 100);
        System.out.println(cuental);
        System.out.println(cuenta2); 
        System.out.println(cuenta3);
    }
}
