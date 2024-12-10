public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
                { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 },
                { 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
                { 0, 1, 2, 2, 2, 2, 2, 2, 1, 0 },
                { 0, 1, 2, 3, 3, 3, 3, 2, 1, 0 },
                { 0, 1, 2, 3, 4, 4, 3, 2, 1, 0 },
                { 0, 1, 2, 3, 4, 4, 3, 2, 1, 0 },
                { 0, 1, 2, 3, 3, 3, 3, 2, 1, 0 },
                { 0, 1, 2, 2, 2, 2, 2, 2, 1, 0 },
                { 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
                { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 }


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

    static String parse(int valor) {
        final String [] ELM = {
            "|| ",
            " ! ",
            " x ",
            " ? ",
            "_0_",
            " . ",
            " . ",
            " . ",
            " ¬ ",
            "___"
        };
        return ELM[valor];
    }

}
