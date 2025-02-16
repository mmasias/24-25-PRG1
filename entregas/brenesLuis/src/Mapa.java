public class Mapa {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 0, 4, 5, 2, 0, 4, 4},
            {1, 0, 1, 0, 5, 0, 4, 0, 4},
            {1, 0, 3, 4, 0, 3, 3, 0, 4},
            {1, 2, 0, 4, 5, 4, 0, 4, 4},
            {1, 2, 3, 0, 5, 0, 2, 3, 4},
            {1, 2, 3, 4, 0, 2, 2, 2, 4},
        };
        imprime(matriz);
    }

    static void imprime(int [][] matriz){
        for(int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz[fila].length; columna++){
                System.out.print(parse(matriz[fila][columna]));
            }
            System.out.println();
        }
    }

    static String parse(int valor){
        final String[] TILES = {
            "*",
            "/",
            "%%",
            "--",
            "$$",
            "(/)",
        };
        return(TILES[valor]);
    }
}
