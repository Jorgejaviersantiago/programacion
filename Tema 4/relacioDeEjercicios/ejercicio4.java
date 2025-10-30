package relacioDeEjercicios;

public class ejercicio4 {
 
    

    public static void main(String[] args) {
      
        float a;
        float b;
        float result;
       
        System.out.print("introduzca el valor de a:");
        a=Float.parseFloat(System.console().readLine());
        System.out.print("introduzca el valor de b:");
        b=Float.parseFloat(System.console().readLine());
        result= (-1*b)/a;
        
      if(a>0){
        System.out.printf("x = %.2f",result);
      
        }else{  System.out.printf("Break error");



        }
    }
    
    }


