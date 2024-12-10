package entregas.celayaIker.src;

class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3 },
                { 0, 0, 3, 0, 1, 2, 0, 0, 2, 0, 4 },
                { 1, 1, 3, 0, 1, 0, 1, 1, 1, 1, 3 },
                { 1, 2, 3, 0, 1, 0, 2, 2, 0, 2, 2 },
                { 1, 0, 1, 1, 1, 2, 1, 1, 2, 1, 1 },
                { 1, 0, 2, 0, 2, 2, 2, 0, 0, 1, 2 },
                { 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 0 },
                { 1, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0 },
                { 1, 0, 1, 1, 1, 2, 1, 3, 1, 3, 1 }
        };

        imprime(matriz);
    }

    static void imprime(int[][] matriz) {
        System.out.println("===".repeat(matriz[0].length));
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(parse(matriz[fila][columna]));
            }
            System.out.println();
        }
        System.out.println("===".repeat(matriz[0].length));
    }

    static String parse(int valor) {
        final String[] TILES = {
                "   ",
                "[#]",
                ":::",
                ", '",
                "._."
        };
        return TILES[valor];
    }
}
