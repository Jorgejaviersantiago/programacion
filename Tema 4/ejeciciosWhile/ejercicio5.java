public class ejercicio5 {
    public static void main(String[] args) {
        int num;
        int mult =0;
        int result;

        System.out.print("Introduce el numero y te mostrare su tabla de multiplicar ");
        num=Integer.parseInt(System.console().readLine());

        while (mult<=9) {
           mult++;
           result=mult*num;
           System.out.println(" "+mult+" x "+num+" = "+result);
        }
        






    }
}
