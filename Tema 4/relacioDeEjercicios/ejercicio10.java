public class ejercicio10 {
    
public static void main(String[] args) {
    
         int hora;
         int minutos;
         int segundos;
         int SegundosAstaMediaNoche;
         System.out.print("Introduce la hora:");
         hora=Integer.parseInt(System.console().readLine());
         System.out.print("Introducca los minutos:");
         minutos=Integer.parseInt(System.console().readLine());

         segundos=(hora*3600)+(minutos*60);
         SegundosAstaMediaNoche=(24*3600)-segundos;

         System.out.printf("Desde las %2d:%2d hasta la media noche quedan:%d segundos",hora,minutos,SegundosAstaMediaNoche);








    }
}
