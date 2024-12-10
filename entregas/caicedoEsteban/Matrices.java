public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 1, 0, 3, 4, 3, 4, 4, 1, 1, 1, 0},
            {1, 2, 3, 1, 2, 0, 1, 2, 1, 0, 0, 2},
            {3, 0, 4, 3, 3, 3, 0, 2, 0, 1, 1, 2},
            {1, 0, 0, 2, 1, 0, 2, 1, 4, 4, 1, 4},
            {2, 2, 4, 4, 2, 2, 2, 0, 4, 4, 0, 1},
            {4, 2, 1, 0, 3, 4, 2, 3, 1, 0, 0, 3},
            {4, 3, 1, 4, 0, 4, 3, 0, 4, 1, 1, 2},
            {4, 2, 3, 2, 4, 1, 2, 2, 4, 4, 3, 1},
            {3, 2, 0, 2, 2, 3, 2, 3, 0, 3, 4, 3},
            {1, 4, 3, 1, 3, 4, 1, 0, 2, 3, 2, 0},
            {0, 0, 4, 0, 0, 3, 3, 1, 1, 1, 0, 2},
            {2, 0, 0, 3, 3, 0, 4, 1, 3, 3, 0, 3}
        };

        impresion(matriz);
    }

    static void impresion(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(parse(matriz[fila][columna]) + " ");
            }
            System.out.println();
        }
        System.out.println("====".repeat(matriz[0].length));
    }

    static String parse(int valor) {
        final String[] TILES = {
            "[ ]",  "[#]",  "[`]",  "[~]",  "[^]",  "[$]",  "[%]",  "[*]",  "[-]",
        };
        return TILES[valor];
    }
}
