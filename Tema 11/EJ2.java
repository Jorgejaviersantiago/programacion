

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EJ2 {
        public static void main(String[] args) {
                try {
                    FileReader archivo = new FileReader("datos.txt");
                    BufferedReader  br = new BufferedReader(archivo);
                    String linea = " ";
                    do {

                        System.out.println(linea);
                        linea= br.readLine();

                    } while (linea != null);

                    br.close();
                } catch(FileNotFoundException fnfe)  {
                    System.out.println("No se encuentra el fichero");
                }   
                catch (IOException e) {
                    System.out.println("Ocurrió un error al escribir el archivo.");
                }  
         }
}