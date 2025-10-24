public class ejercicio2ternario {
    
public static void main(String[] args ) {
    
    float nota;
    
    System.out.print("¿Que nota has sacado?:");
    nota=Float.parseFloat(System.console().readLine());
   
    if(nota>=0 && nota<=10){
    System.out.print(nota>=5 ?"¡Enorabuena has aprobado!": "¡Lo siento has  suspendido!");
    }else{
        System.out.print("Introducce la nota correcta RATA");

    }
}

}
