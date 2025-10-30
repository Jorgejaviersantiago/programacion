package relacioDeEjercicios;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        int hora;
        Scanner escaner = new Scanner(System.in);
        
            System.out.print("Introducce una hora del día(0-23): ");
            hora=escaner.nextInt();

            switch (hora){
                case 6,7,8,9,10,11,12:System.out.print("Buenos dias ");
                break;
            
                case 13,14,15,16,17,18,19,20:System.out.print("Buenas tardes");
                break;
               
                case 21,22,23,24 :System.out.print("Buenas noches ");
                break;
                
                default:System.out.print("La hora introduccida no es correcta");
               
    
    
    }
}
}
