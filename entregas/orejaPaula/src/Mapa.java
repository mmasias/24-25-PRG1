class Mapa {
    public static void main(String[] args) {
        int[][] matriz = {
            {0, 0, 0, 0, 7, 7, 7, 0, 0, 0, 0, 7, 7, 7, 0, 0, 0, 0},
            {0, 0, 0, 7, 0, 0, 0, 7, 0, 0, 0, 7, 0, 0, 0, 7, 0, 0},
            {0, 0, 7, 0, 0, 0, 0, 0, 7, 0, 7, 0, 0, 0, 0, 0, 7, 0},
            {0, 7, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 7},
            {7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7},
            {0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
            {0, 2, 0, 0, 0, 8, 0, 2, 0, 0, 0, 8, 0, 0, 0, 2, 0, 0},
            {0, 0, 1, 6, 0, 0, 1, 0, 0, 1, 6, 0, 0, 1, 0, 0, 1, 0},
            {0, 5, 0, 1, 0, 1, 0, 0, 0, 5, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 2, 0, 1, 0, 0, 0, 0, 2, 0, 1, 0, 0, 0, 0, 2, 0},
            {0, 2, 4, 0, 7, 0, 0, 1, 0, 2, 4, 0, 7, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        imprime(matriz);
    }

    static void imprime(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(parse(matriz[fila][columna]) + " ");
            }
            System.out.println();
        }
    }

    static String parse(int valor) {
        return switch (valor) {
            case 0 -> " ";
            case 1 -> "[#]";
            case 2 -> ":)";
            case 3 -> "---";
            case 4 -> ">-->";
            case 5 -> "*";
            case 6 -> "<3";
            case 7 -> "/^\\";
            case 8 -> "<^^>";
            case 9 -> "|-|";
            default -> "???";
        };
    }
}
