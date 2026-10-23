

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.classfile.BufWriter;

public class Ej1 {
    public static void main(String[] args) {

        try {

            FileWriter archivo = new FileWriter("datos.txt");
            BufferedWriter  br = new BufferedWriter(archivo);
            br.write("Hola, este es un archivo de prueba.\n");
            br.write("Estamos aprendiendo a leer archivos en Java.\n");
            br.write("Cada línea representa un dato diferente.\n");
            br.write("Puedes añadir más líneas para probar el programa.\n");
            br.write("La lectura de archivos es fundamental en programación.\n");
            br.write("¡Sigue practicando y mejorando tus habilidades!\n");

            br.close();
            System.out.println("Archivo creado y datos escritos correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo.");
            e.printStackTrace();
        }
    }
}
        
        
   
          
     
        
    
