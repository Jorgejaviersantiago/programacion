// Nivel 1 — Clases y objetos básicos
// Ejercicio 1 Crea una clase Persona con atributos nombre, edad y ciudad. Crea 3 personas distintas e imprime sus datos.

// Ejercicio 2 Crea una clase Calculadora con métodos sumar, restar, multiplicar y dividir. Úsala desde el main.

// Ejercicio 3 Crea una clase Rectangulo con atributos base y altura. Añade métodos para calcular el área y el perímetro.

import clases.Persona;

public class ej01 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Paco", 20, "Fuengirola");
        Persona p2 = new Persona("Antoñito", 30, "Granada");
        Persona p3 = new Persona("Manolo", 15, "Torre del mar ");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
         
    }
}