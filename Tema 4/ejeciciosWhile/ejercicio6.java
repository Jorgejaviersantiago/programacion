public class ejercicio6 {
    public static void main(String[] args) {
        
        int num;
        int num2=0;
        
    
      
            System.out.print("Introducce un numero entero: ");
            num=Integer.parseInt(System.console().readLine());
             if(num==0){
              num2=1;
             }
           while(num>0) {
             num=num/10;
             num2++;
            
             }
            System.out.printf("El numero de digitos introducido es: %d",num2);



    }
}
