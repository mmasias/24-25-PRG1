public class Matrices {
    public static void main(String[] args) {

        int[][] matriz = {
            {3, 1, 7, 9, 5, 2, 6, 8, 0, 4},
            {8, 4, 2, 6, 1, 7, 9, 3, 0, 5},
            {5, 9, 3, 0, 8, 4, 2, 6, 1, 7},
            {7, 6, 1, 5, 3, 0, 8, 4, 9, 2},
            {2, 8, 4, 1, 7, 6, 0, 9, 3, 5},
            {0, 3, 9, 4, 2, 8, 1, 7, 6, 5},
            {4, 5, 8, 7, 0, 9, 3, 1, 2, 6},
            {1, 7, 0, 2, 6, 5, 4, 8, 9, 3},
            {6, 2, 5, 8, 9, 1, 7, 0, 4, 3},
            {9, 0, 6, 3, 4, 5, 2, 1, 8, 7}
        };

        imprime(matriz);
    }
    static void imprime (int matriz[][]) {
        for (int fila  = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println(parse(matriz[fila][columna]));
            }
            System.out.println();
        }
        System.out.println("===", repeat(matriz[0].length));
    }

    static String parse(int valor) {
        return switch(valor) {
            case 0 -> " ";
            case 1 -> "[#]";
            case 2 -> " . ";
            case 3 -> "~ ~";
            case 4 -> "'''";
            case 5 -> ":::";
            case 6 -> ", '";
            case 7 -> "/^\\";
            case 8 -> "^Y^";
            case 9 -> ":|:";
            default -> "???";
        };
    }
}
