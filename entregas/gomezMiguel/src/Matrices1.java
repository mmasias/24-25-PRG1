public class Matrices1 {
    
    public static void main(String[] args) {
        
        int [][] matriz = {
            {5,6,4,3,8,9,0,2,5,7,8,9,2,7,5,4,3,1,9},
            {3,4,3,6,7,5,6,8,9,1,1,3,4,5,6,4,9,9,8},
            {2,3,5,7,2,3,1,3,6,8,9,4,3,6,8,9,5,3,5},
            {1,0,2,9,0,0,6,0,0,4,4,1,0,1,0,9,0,0,8},
            {0,1,0,0,1,0,0,0,1,0,9,0,1,0,1,0,0,1,1},
            {1,5,5,2,5,7,9,4,2,2,3,5,6,7,8,8,9,6,4},
            {2,3,5,7,2,5,4,4,8,6,4,6,6,0,0,0,0,0,0},
            {9,7,6,3,4,9,3,2,1,2,3,5,6,1,8,9,6,5,4},
            {4,5,5,6,7,6,8,8,4,5,2,3,2,2,3,3,4,6,0},
            {1,1,1,1,2,4,4,6,7,9,0,7,8,9,0,4,5,6,7},
            {0,8,6,4,3,1,2,3,4,5,6,4,2,1,5,2,2,3,3},
        };
        imprime(matriz);
    }
    static void imprime( int [][] matriz){
        System.out.println(" ===".repeat (matriz[0].length));
        for( int fila = 0;fila<matriz.length;fila++){
            for(int columna=0; columna<matriz[fila].length;columna++){
                System.out.println(parse(matriz[fila][columna]));

            }
            System.out.println();
        }
        System.out.println("===".repeat(matriz [0].length));
    }
    static String parse(int valor){
        final String[] TILES ={
             "   ", 
             "[#]",
             " . ",
             "~ ~",
             "'''",
             ":::",
             ", '",
             "/^/",
             "^Y^",
             ":|:",
          
        };
        return TILES[valor];
    }
}
