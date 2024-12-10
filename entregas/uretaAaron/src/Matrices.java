public class Matrices {

    public static void main(String[] args) {
        int [][] matriz = {
            {0, 0, 0, 0, 0, 0, 2, 0, 3, 3, 3, 1},
            {0, 0, 0, 2, 3, 1, 3, 2, 0, 1, 0, 1},
            {0, 1, 2, 3, 0, 1, 2, 0, 3, 1, 2, 0},
            {0, 0, 0, 0, 1, 3, 0, 0, 2, 1, 3, 2},
            {0, 0, 2, 1, 3, 4, 1, 2, 3, 1, 2, 1},
            {0, 3, 1, 4, 2, 2, 1, 3, 1, 4, 1, 3}
        };
        imprime(matriz);
    }

    static void imprime(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(parse2(matriz[fila][columna]) + " ");
            }
            System.out.println();
        }

    }

    static String parse2(int valor) {
        final String[] TILES = {
            " ",
            ":::",
            "###",
            "...",
            "$$$",
            "/////",
            "^^^"
        };
        return TILES[valor]; 
    }
}









      


