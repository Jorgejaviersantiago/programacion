public class Practica30 {
    

    public static void main(String[] args) {
       int filas =4;
       int columnas =5; 
       
       int x;
       int y;
    
       int bomX;
       int bomY;

       int tesoroX;
       int tesoroY;
       boolean jugar=true;

       
       char[][]tabla = new char[filas][columnas];
       
       for(int i=3;i>=0;i--){
            for(int j=0;j<5;j++){
            tabla [i][j]= ' ';
            }
       }
       
       
        
        
        tesoroX=(int)(Math.random()*(filas));
        tesoroY=(int)(Math.random()*(columnas));

        bomX=(int)(Math.random()*(filas));
        bomY=(int)(Math.random()*(columnas));
        
       
        mostar();

        while(jugar){
          
            System.out.println("¡Busca el tesoro!");

        for(int  i=3;i>=0;i--){
            System.out.printf("%d|",i);
                for(int j=0;j<5;j++){
                System.out.print(" "+tabla[i][j]);
                }
           
            System.out.println();
        }
        System.out.println("  ------------");
        for(int j=0;j<5;j++){
            System.out.printf("  %d",j);
        }
        System.out.println();
        
        System.out.print("cordenada(x): ");
        x=Integer.parseInt(System.console().readLine());
       
        System.out.print("cordenada(y): ");
        y=Integer.parseInt(System.console().readLine());
                
                if (bomX ==x && bomY==y){
                    tabla[x][y]='*';
                    jugar=false;
                }else if(tesoroX==x && tesoroY==y){
                    tabla[x][y]='€';
                    jugar=false;

                }else{
                    tabla[x][y]='X';
                }
                System.out.println("¡Busca el tesoro!");

                for(int  i=3;i>=0;i--){
                    System.out.printf("%d|",i);
                        for(int j=0;j<5;j++){
                        System.out.print(" "+tabla[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("  ------------");
                for(int j=0;j<5;j++){
                    System.out.printf("  %d",j);
                }
                System.out.println();
                if (bomX ==x && bomY==y){
                  System.out.print("Has perdido");
                }else if(tesoroX==x && tesoroY==y){
                  System.out.println("Enorabuena has encontrado el tesoro");

                }else{
                  System.out.println();
                }
        }
    
        
    
    
    }

    public static void mostar() {
        System.out.println("¡Busca el tesoro!");

        for(int i=3;i>=0;i--){
            System.out.printf("%d|",i);
            System.out.println();
        }
        System.out.println("  ------------");
        for(int j=0;j<5;j++){
            System.out.printf("  %d",j);
        }
        System.out.println();
    }

}
