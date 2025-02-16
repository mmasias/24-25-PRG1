package src;

class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
                {5, 2, 3, 1, 0, 4, 7, 8, 6 },
                {0, 7, 4, 8, 3, 6, 2, 5, 1 },
                {3, 8, 6, 7, 1, 2, 0, 4, 5 },
                {2, 6, 0, 4, 5, 3, 1, 7, 8 },
                {8, 1, 7, 3, 6, 5, 4, 2, 0 },
                {1, 4, 2, 0, 7, 8, 3, 6, 5 },
                {4, 5, 8, 6, 2, 1, 7, 0, 3 },
                {7, 3, 1, 5, 8, 0, 6, 2, 4 },
                {6, 0, 5, 2, 4, 7, 8, 1, 3 },
                };

                imprime(matriz);
            }

    static void imprime(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila ++) {
            for (int columna = 0; columna < matriz[fila].length; columna++){
                System.out.print( parse(matriz[fila][columna]));
            }
        System.out.println();
        }
    }     
    static String parse(int valor){
        final String[] TILES = {
        "&",
        "<^>",
        "{}",
        "[]",
        "|!|",
        "¿?",
        "()",
        "/·/",
        "-$-",
     };
    
    return(TILES[valor]);
}
}
