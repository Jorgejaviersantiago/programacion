import java.util.Scanner;

public class Practica10 {
    
    public static final int MAXIMO=10;
    public static final int MAXPER=4;

    
    
 
    public static void main(String[] args) {
            int numPer=0;
            int pos=0;
            int contador=0;


        int[]mesa = {1,2,3,4,5,6,7,8,9,10};
        int[]ocupacion = new int[MAXIMO]; 
    
       
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos son? (Introduzca -1 para salir del programa)");
        numPer=sc.nextInt();
      
        mostrar(mesa);
        System.out.println();
        System.out.println("----------------------------------------------------");
      
        rellenar(ocupacion);
        mostrarOcupacion(ocupacion);
        System.out.println();
        while (pos<MAXIMO) {
            
            if(ocupacion[contador] + numPer <=4 ) {
                System.out.printf("\n sientese en la mesa %d",ocupacion[contador]);
                ocupacion[contador]+=numPer;

                contador++;
                pos=0;
            }
            pos++;
        }
        System.out.println();
        System.out.println("Soliento en este momento no tenemos sitio");


        }
        //Funciones

        //Funcion mostrar
        public static void mostrar(int[]mesa) {
            System.out.print("º mesas   |");
            for(int i=0;i<10;i++){
             System.out.printf(" %d |",mesa[i]);
            
            }
        }
        //Funcion rellenar
        public static void rellenar(int[]mesa){
            for(int i=0;i<10;i++){
                mesa[i]=(int)(Math.random()*MAXPER);


            }
        }
           //Función mostrar la ocupación
        public static void mostrarOcupacion(int[]ocupacion) {
            System.out.print("ocupacion |");
            for(int i=0;i<10;i++){
             System.out.printf(" %d |",ocupacion[i]);
            }
        }



  
}
 


