import java.util.Scanner;

public class ejercicio5 {
   


    public static void main(String[] args) {
            int dia;
            Scanner escaner = new Scanner(System.in);
           
           
          
          System.out.println("Introducce el día de la semana(1-->7):");
            dia = escaner.nextInt();
             /* 
            if(dia>=1 && 5==dia){
                System.out.println("Es un dia entre semana");

              }else if((dia==6) || (dia==7)) {
                System.out.println("Es fin de semana ");

              }else {
                System.out.println("No hay dia registrado ");}*/
        
        
              switch (dia){
                case 1:System.out.println("Es dia entre semana");
                break;
            
                case 2:System.out.println("Es dia entre semana");
                break;
               
                case 3:System.out.println("Es dia entre semana");;
                break;
               
                case 4:System.out.println("Es dia entre semana");;
                break;
                
                case 5:System.out.println("Es dia entre semana");;
                break;
                
                case 6,7:System.out.println("Es fin de semana");;
                break;
                
                default: 
                System.out.println("Opción no correcta");
            }
        
        
            }
}
