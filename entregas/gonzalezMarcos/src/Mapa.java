public class Mapa{
    public static void main(String[] args){
        int [][] matriz = {
            {4, 4, 3, 0, 5, 2, 1, 2, 0, 1},
            {4, 4, 3, 1, 2, 4, 4, 5, 5, 0},
            {2, 3, 5, 3, 1, 0, 0, 5, 5, 0},
            {0, 3, 5, 5, 5, 0, 1, 2, 3, 4},
            {5, 0, 3, 0, 2, 3, 2, 5, 1, 5},
            {1, 1, 1, 2, 0, 2, 1, 4, 4, 0},
            {1, 4, 2, 5, 0, 4, 3, 3, 1, 5},
            {1, 3, 2, 4, 1, 0, 2, 0, 4, 2},
            {2, 1, 2, 4, 4, 1, 4, 5, 4, 1},
            {5, 3, 2, 1, 1, 0, 2, 1, 5, 5}
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