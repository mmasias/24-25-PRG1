public class MatricesPractica {
    public static void main(String[] args) {
        int[][] matriz ={
            {3,3,3,3,3,3,3,3,3,3,3,3,3},
            {0,8,8,0,2,2,2,0,8,8,3,3,3,3,3,3,3},
            {5,5,5,0,2,2,2,0,5,5,3,3,3,3,3,3,3},
            {5,1,1,1,2,2,2,1,1,1,5,8,8,3,3,3,3},
            {5,1,0,1,1,1,0,1,5,4,9,9,8,8,3,3,3},
            {5,1,0,0,0,0,0,1,5,4,9,9,8,3,3,3,3},
            {5,1,0,0,0,0,0,1,5,4,9,8,8,8,8,3,3},
            {5,1,1,1,1,1,1,1,5,4,9,9,9,9,8,8,3}, 
        };
        imprime(matriz);
    }
    static void imprime(int[][] matriz){
        for(int fila=0; fila<matriz.length; fila++){
            for(int columna=0; columna < matriz[fila].length; columna++){
                System.out.print(parse(matriz[fila][columna]));
            }
            System.out.println();
        }
        System.out.println();
    
    }
    static String parse(int valor){
        final String[] TILES ={
            "   ",
            "[#]",
            "·",
            " ~ ~",
            "'''",
            ":::",
            ", '",
            "/^",
            "^Y^",
            ":|:"
        };
        return TILES[valor];
    }
} 
