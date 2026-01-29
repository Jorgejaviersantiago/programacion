public class Practica32 {

        public static final int  FIL=3;
        public static final int COL =3;
        public static final char VACIO =' ';

        public static final char[] FICHAS={'X','O'};

    public static void main(String[] args) {
        
        String coords;
        
        int fil;
        int col;
        int turno=1;
        char[][] tablero=new char [FIL][COL];
       try{

            
            dibujarTablero(tablero);
            System.out.printf("TUENO DEL JUGADOR %d",turno);
            System.out.printf("Introduzca las cordenadas,por ejemplo b2: ");
            coords=System.console().readLine().toLowerCase();

            fil=  (int)coords.charAt(0)-97;
            col = (int) coords.charAt(1)-48;

            if (!esCoordenadaCorrecta(fil, col)) {
                System.out.println("Coordenada incorrecta");
            }else{
                tablero[fil][col]=FICHAS[turno];
            }
            
            
            
            turno=(turno+1)%2;

       }catch(StringIndexOutOfBoundsException siobe){
        System.out.println("Coordenada incorrecta");
       }
    }

    
    public static boolean esCoordenadaCorrecta(int fil,int col) {
         return (fil>=0) && (fil<FIL) && (col>=0) && (col<COL);
    }
    
    
   
    public static void dibujarLinea(){
        for(int col=0;col<COL;col++){
            System.out.printf("  ");
            System.out.println(" ");
        } 
    }
    
    public static void iniciarTablero(char[]tablero) {
        for(int i=0;i<FIL;i++){
            for(int j=0;j<COL;j++){

            }
        }
    }
    
    /**
     * 
     * @param tablero
     */
    public static void dibujarTablero(char[][]tablero) {
    
        //char[]letras={'a','b','c','d','e'};

        dibujarLinea();
        
        for(int fil=0;fil<FIL;fil++){

            System.out.printf(" %c ",fil+97);
            for(int col=0;col<COL;col++){
                System.out.printf("%c ",tablero[fil][col]);
            } 
            System.out.println();
       
            dibujarLinea();
        }
        System.out.println("   ");
        for(int col=0;col<COL;col++){
            System.out.printf(" %d ",col);
        }
        System.out.println();
    }
}