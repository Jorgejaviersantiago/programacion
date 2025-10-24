import java.util.Scanner;

public class ejercicio4 {





public static void main(String[] args) {
    int opción;
 Scanner escaner=new Scanner (System.in);

System.out.println("Encuesta de satisfacción ");
System.out.println("1 Insatisfecho");
System.out.println("2 Satisfescho");
System.out.println("3Muy Satisfecho");

System.out.print("\nIntroduce tu opción(1-3):");
opción=escaner.nextInt();
/* 
if(opción==1){
    System.out.println("Lamentamos mucho que no estes satisfecho");
}else if(opción==2){
    System.out.println("Gracias por su opinión");
}else if(opción==3){
    System.out.println("Excelento nos alegramos mucho");
}else{
    System.out.println("Opción inexistente ");
}
*/

switch (opción){
    case 1:System.out.println("Lamentamos mucho que no estes satisfecho");
    break;

    case 2:System.out.println("Gracias por su opinión");
    break;

    case 3:System.out.println("Excelento nos alegramos mucho");
    break;

    default: System.out.println("Opción no correcta");
}


}

 }