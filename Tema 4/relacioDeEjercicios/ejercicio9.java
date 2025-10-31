public class ejercicio9 {
    


public static void main(String[] args) {
            int mes;
            int dia;
            System.out.println("Este programa te dirá cual es tu horóscopo. ");
            System.out.print("Escribe el número de mes en que nació(1-12): ");
            mes=Integer.parseInt(System.console().readLine());
            System.out.print("Ahora introduzca el día : ");
            dia=Integer.parseInt(System.console().readLine());

    if (mes==12 || mes==1) {
        if(dia>=22 || dia<=19){
            System.out.println("Capricornio");
        }
    }if(mes==1 || mes==2){
        if(dia>19 || dia<17){
            System.out.println("Acuario");

        }
    }if(mes==2 || mes== 3){
        if(dia>18 || dia<21){
            System.out.println("Piscis");
    }
    }if (mes==3 || mes==4) {
        if(dia>=22 || dia<=19){
            System.out.println("Aries");
        }
    }if(mes==4 || mes==5){
        if(dia>20 || dia<20){
            System.out.println("Tauro");

        }
    }if(mes==5|| mes== 6){
        if(dia>22 || dia<21){
            System.out.println("Gémini");
    }
    }if(mes==6 || mes==7){
        if(dia>20 || dia<22){
            System.out.println("Cancer");

        }
    }if(mes==7 || mes== 8){
        if(dia>18 || dia<21){
            System.out.println("Leo");
    }
    }if (mes==8 || mes==9) {
        if(dia>=22 || dia<=19){
            System.out.println("Virgo");
        }
    }if(mes==9 || mes==10){
        if(dia>20 || dia<20){
            System.out.println("Libra");

        }
    }if(mes==10 || mes== 11){
        if(dia>22 || dia<21){
            System.out.println("Escorpio");
    }
    }if(mes==11 || mes== 12){
        if(dia>22 || dia<21){
            System.out.println("Sagitario");
    }
    }







}
}
