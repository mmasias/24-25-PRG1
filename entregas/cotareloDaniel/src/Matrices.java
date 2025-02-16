public class Matrices {
    public static void main(String[] args) {

        int[][] matriz = {
                { 0, 1, 3, 0, 0, 0, 0, 0, 1, 0, 2, 3, 1, 2, 3 },
                { 0, 1, 0, 0, 0, 0, 0, 2, 1, 0, 2, 3, 1, 2, 3 },
                { 0, 1, 3, 0, 0, 0, 0, 2, 1, 0, 2, 3, 1, 2, 3 },
                { 0, 1, 0, 0, 0, 1, 0, 1, 0, 2, 3, 1, 2, 3, 1 },
                { 0, 1, 2, 0, 0, 2, 0, 2, 1, 0, 2, 3, 1, 2, 3 },
                { 0, 1, 3, 0, 0, 2, 0, 0, 1, 0, 2, 3, 1, 2, 3 },
                { 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 2, 3, 1, 2, 3 },
                { 0, 1, 3, 0, 0, 0, 0, 0, 1, 0, 2, 3, 1, 2, 3 },
                { 0, 1, 3, 0, 0, 0, 0, 0, 1, 0, 2, 3, 1, 2, 3 },

        };

        imprimir(matriz);
    }

    static void imprimir(int[][] matriz) {

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(parse(matriz[fila][columna]));
            }
            System.out.println();
        }
    }

    static String parse(int i) {
        final String[] CARACTER = { "   ", "[#]", "---", "%%%" };
        return CARACTER[i];
    }

}
