public class Matrices{
    public static void main(String[] args){
        int [][] matriz = {
            {1, 2, 1, 1, 3, 4, 3, 3, 5, 0},
            {1, 2, 1, 1, 3, 4, 3, 3, 5, 0},
            {1, 2, 2, 2, 3, 4, 4, 4, 5, 0},
            {1, 2, 2, 2, 3, 4, 4, 4, 5, 0},
            {1, 2, 1, 1, 3, 4, 3, 3, 5, 0},
            {1, 2, 1, 1, 3, 4, 3, 3, 5, 0},
            {1, 2, 2, 2, 3, 4, 4, 4, 5, 0},
            {1, 2, 2, 2, 3, 4, 4, 4, 5, 0},
            {1, 2, 1, 1, 3, 4, 3, 3, 5, 0},
            {1, 2, 1, 1, 3, 4, 3, 3, 5, 0}
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
        final String[] TILES = {
            "  ",   
            "[X]",  
            "..",   
            "~ ",   
            "^^",   
            "**",   
            "o ",
            "/\\",  
            "^^^",  
            "|_|",  
        };
        return TILES[valor];
    }
}
