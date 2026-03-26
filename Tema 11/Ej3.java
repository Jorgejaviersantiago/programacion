import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
       
        System.out.println("Escribe el archivo que quieras copiar");
            texto = sc.nextLine();  
            File f = new File(".");
             
          try{
                    FileReader archivo = new FileReader("datos.txt");
                    BufferedReader  br = new BufferedReader(archivo);
            
                    FileWriter copiar = new FileWriter("datos.txt");
                    BufferedWriter  sr = new BufferedWriter(copiar);
          
                    String linea = "";
                    while (linea != br.readLine()) {
                        sr.write(linea);
                    }
               }catch(FileNotFoundException fnfe)  {
                    System.out.println("No se encuentra el fichero");
                }catch (IOException e) {
                    System.out.println("Ocurrió un error al escribir el archivo.");
                }  
}
}

