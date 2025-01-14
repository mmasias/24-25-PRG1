class EjercicioMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                { 5, 3, 4, 7, 8, 9, 6, 7, 8, 9 },
                { 4, 0, 0, 0, 0, 9, 8, 7, 6, 5 },
                { 3, 9, 8, 7, 0, 9, 6, 5, 4, 3 },
                { 2, 7, 6, 5, 0, 0, 0, 0, 9, 4 },
                { 1, 8, 9, 4, 7, 6, 5, 4, 0, 3 },
                { 9, 7, 6, 5, 8, 9, 6, 3, 0, 2 },
                { 8, 9, 4, 3, 9, 7, 5, 2, 0, 1 },
                { 7, 6, 3, 2, 1, 9, 8, 1, 0, 9 },
                { 6, 5, 4, 9, 7, 6, 3, 2, 0, 8 },
                { 5, 4, 3, 2, 9, 8, 7, 6, 0, 7 }
        };

        imprime(matriz);

    }

    static void imprime(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(parse(matriz[fila][columna]));
            }
            System.out.println();
        }
    }

    static String parse(int valor) {
        final String[] TILES = {
                "   ",
                "[@]",
                " . ",
                "~ ~",
                "` ´",
                ":::",
                ", '",
                "/^/",
                "^/^",
                ":/:"
        };

        if (valor >= 0 && valor < TILES.length) {
            return TILES[valor];
        } else {
            return "???";
        }
    }
}
