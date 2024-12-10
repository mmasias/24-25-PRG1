
public class MatricesClase {

    public static void main(String[] args) {

        int[][] matriz = {
            {2, 0, 0, 3, 0, 0, 4, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 5, 8, 0, 0},
            {0, 0, 0, 0, 1, 0, 5, 2, 0},
            {3, 0, 0, 5, 0, 0, 0, 1, 0},
            {0, 0, 1, 8, 3, 0, 2, 0, 0},
            {0, 2, 3, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 6, 8, 0, 1, 3, 0},
            {0, 3, 0, 0, 0, 0, 8, 5, 1},
            {1, 0, 0, 0, 0, 5, 0, 0, 3},
            
            };

        imprime(matriz);
    }

    static void imprime(int[][] matriz) {
        for (int columna = 0; columna <= matriz.length; columna++) {

            for (int fila = 0; fila <= matriz[columna].length; fila++) {

                System.out.print(parse(matriz[fila][columna]));

            }
            System.out.println();
        }
        System.out.println("===".repeat(matriz[0].length));
    }

    static String parse(int valor) {
        final String[] TILES = {
            "' ",
            "[#]",
            "·",
            "- -",
            "'''",
            ":::",
            ", '",
            "/^\\",
            "^Y^",
            ":|:"

        };
        return TILES[valor];

    }
}
