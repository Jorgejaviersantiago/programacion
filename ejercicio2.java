import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        
        int DistanciaTrayecto;
        double consumo;
        int ocupantes;
        double precioCom = 0;

        Scanner sc = new Scanner(System.in);


        System.out.print("Numero de Ocupantes del vehiculo: ");
        ocupantes = sc.nextInt();
        System.out.print("Kilometros recorridos: ");
        DistanciaTrayecto = sc.nextInt();
        System.out.print("Precio del combustible ");
        precioCom = sc.nextDouble();
        System.out.print("Consumo del combustible: ");
        consumo = sc.nextInt();

        double comCons = DistanciaTrayecto*consumo/100;
        double costViaje = precioCom *comCons;
        double ocupacion  = (double) costViaje/ocupantes;
        double ahorrado = (ocupacion*costViaje) -costViaje;
        System.out.println("-------------------------------------------");

        System.out.printf("Comsumo de combustible: %8.2f \n",comCons);
        System.out.printf("Coste del viaje: %12.2f \n",costViaje);
        System.out.printf("Coste por ocupante: %8.2f \n",ocupacion);
        System.out.printf("\033[41m Total ahorrado: %8.2f \033 \n[0m",ahorrado);

        
        
    }
}

  