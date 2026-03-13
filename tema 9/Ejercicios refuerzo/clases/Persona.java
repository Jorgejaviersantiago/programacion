package clases;

public class Persona {

    // Ejercicio 1 Crea una clase Persona con atributos nombre, edad y ciudad. Crea 3 personas distintas e imprime sus datos.

    private String nombre;
    private int edad;
    private String ciudad;

     public Persona( String nombre,int edad,String ciudad){
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad= ciudad;
    }
    @Override
    public String toString() {
      
        return"Nombre:"+ nombre + "  " + "Edad:"+edad+"  " + "Ciudad:"+ciudad ;
    }

}
