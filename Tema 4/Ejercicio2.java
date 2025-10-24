public class Ejercicio2 {
    

public static void main(String[] args ) {
    
float nota;


System.out.print("¿Que nota has sacado?:");
nota=Float.parseFloat(System.console().readLine());

if(nota>=0 && nota<=10){
    if(nota>=5){
        System.out.print("!Enorabuena has aprobado¡");
       }else{
        System.out.print("!Lo siento  has suspendido¡");
       }

       }else {
        System.out.print("la nota debe ser mayor igual que 0 o mayor igual que 10");
       } 

}





}
