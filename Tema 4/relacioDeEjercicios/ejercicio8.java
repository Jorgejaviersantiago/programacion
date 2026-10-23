



public class ejercicio8 {
    public static void main(String[] args) {
    

        int a;
        int b;
        int c;
        float discriminate;
        float raiz;

        System.out.print("Este programa resuelve ecuaciones de segundo grado");
        System.out.println("ax^2+bx+c=0");
        System.out.println("Introducce los valores:");
        System.out.print("a=");
        a=Integer.parseInt(System.console().readLine());
        System.out.print("b=");
        b=Integer.parseInt(System.console().readLine());
        System.out.print("c=");
        c=Integer.parseInt(System.console().readLine());

        
        if((a == 0) && (b== 0)  && (c == 0)){
            System.out.println("No tiene solución");
        } else if ((a == 0) && (b== 0)) {
            System.out.println("No tiene solución");
        }else{    
            
            discriminate = (float)Math.pow(b, 2)-4*a*c;
        
            if(discriminate<0){
                System.out.println("La ecuación tiene infinitas soluciones ");
            } else if (discriminate==0) {
                raiz=(float)Math.sqrt(discriminate);
                System.out.printf("x1 %.2f",-b/2*a);
            } else {
                raiz=(float)Math.sqrt(discriminate);
                System.out.printf("x1 %.2f",-b+(raiz/2*a));
                System.out.printf("x2 %.2f",-b-(raiz/2*a));
            }
        }
    
        


    }
}
