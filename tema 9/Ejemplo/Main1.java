import Clase.Alumno;

public class Main1 {
    
    public static void main(String[] args) {
        
        Alumno[]alumnado=new Alumno[30];
        alumnado[0]= new Alumno("Javier");
        alumnado[0].setNotas(3);
        alumnado[0].setNotas(8);

        System.out.println("Nota media[o]"+alumnado[0].media());
    }
}
