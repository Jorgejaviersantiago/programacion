public class ejercicio9 {
    


public static void main(String[] args) {
            int mes;
            int dia;
            System.out.println("Este programa te dirá cual es tu horóscopo. ");
            System.out.print("Escribe el número de mes en que nació(1-12): ");
            mes=Integer.parseInt(System.console().readLine());
            System.out.print("Ahora introducca el día en que nacio: ");
            dia=Integer.parseInt(System.console().readLine());


                        switch (mes) {
                       case 12:
                             if (dia<21) {
                                System.out.println("Sagitario");
                             }else{
                                System.out.println("Capricornio");
                             }

                      break;
                      case 1:
                         if(dia<21){
                            System.out.println("Capricornio");

                         }else{
                            System.out.println("Acuario");

                         }
                     break;
                     case 2:
                         if(dia<20){
                            System.out.println("Acuario");

                         }else{
                            System.out.println("Piscis");

                         }
                     break;
                     case 3:
                         if(dia<21){
                            System.out.println("Piscis");

                         } else{
                            System.out.println("Aries");
                         }
                      break;
                      case 4:
                         if (dia<21) {
                            System.out.println("Aries");
                         }else{
                            System.out.println("Tauros");
                         }
                      break;
                      case 5:
                         if (dia<20) {
                            System.out.println("Tauros");
                         }else
                         {
                            System.out.println("Géminis");
                         }
                      break;
                      case 6:
                         if (dia<22) {
                            System.out.println("Géminis");

                         }else{
                            System.out.println("cancer");
                         }
                      break;
                      case 7:
                         if (dia<22) {
                            System.out.println("cancer");
                         }else{
                            System.out.println("Leo");
                         }
                     break;
                     case 8:
                         if (dia<24) {
                                System.out.println("Leo");
                         }else{
                             System.out.println("Virgo");

                         }
                     break;
                    case 9: 
                         if (dia<23) {
                            System.out.println("Virgo");
                         }else{
                            System.out.println("Libra");

                         }
                    break; 
                    case 10:
                         if (dia<23) {
                            System.out.println("Libra");
                         }
                         else{
                            System.out.println("Escorpio");
                         }
                    break;
                    case 11:
                         if (dia<23) {
                            System.out.println("Escorpio");
                         }else{
                            System.out.println("Sagitario");
                         }
                    break;
                    default:
                        break;
                }








}
}
