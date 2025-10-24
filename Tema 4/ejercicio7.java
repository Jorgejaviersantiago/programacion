import java.util.Scanner;

public class ejercicio7 {
    

    public static void main(String[] args) {
        
    int num0;
    float num1;
    float num2; 
    float num3;   
    Scanner escaner = new Scanner(System.in);


        System.out.println("Seleccione una opción:");
        System.out.println("1-Calcular el area de un cuadrado.");
        System.out.println("2-Calcular el area de un rectangulo.");
        System.out.println("3-Calcular el area de un Triangulo.");
         num0 = escaner.nextInt();


         switch (num0){
            case 1:System.out.println("Introducca lado:");
                     num1 = escaner.nextFloat();
                   System.out.println("Introducca lado:");
                     num2 = escaner.nextFloat();
                  System.out.printf("EL resultado es:%.2f",num1*num2);
             break;
            case 2:System.out.println("Introduccca base:");
                         num1 = escaner.nextFloat();
                    System.out.println("Introducca altura:");
                         num2 = escaner.nextFloat();
                    System.out.printf("EL resultado es:%.2f",num1*num2);

                   
            break;
            case 3:System.out.println("Introducca base");;
                         num1 = escaner.nextFloat();
                    System.out.println("Introducca altura:");
                         num2 = escaner.nextFloat();
                    System.out.printf("EL resultado es:%.2f",(num1*num2)/2);
            break;


      default:
       System.out.println("Opción no correcta");
    }
}
}
