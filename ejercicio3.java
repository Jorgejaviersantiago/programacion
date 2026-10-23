
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducce un numero de segundos: ");
        segundos = sc.nextInt();

        horas = segundos / 3600;
        minutos = segundos / 60 - horas * 60;
        segundos = (segundos % 60) - horas / 60;

        System.out.print("" + segundos + "segndos son: ");
        System.out.print(" \033[43m" + horas + "horas\033[0m ,\033[41m ");
        System.out.print(+minutos + " minutos\033[0m ");
        System.out.print("  \033[42m" + segundos + ", segundos \033[0m");
    }
}
