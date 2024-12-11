public class Matrices {
    public static void main(String[] args) {
        int[][] matriz1 = {
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

        int[][] matriz2 = {
            {0,1,1,},
            {0,1},

        };

        imprimir(matriz1);
        imprimir(matriz2);

    }

    static void imprimir(int[][] unaMatriz) {
        final String BORDE = "=";
        System.out.println(BORDE.repeat(unaMatriz[0].length));
        for (int fila = 0; fila < unaMatriz.length; fila++) {
            for (int columna = 0; columna < unaMatriz[fila].length; columna++) {
                System.out.print(parse(unaMatriz[fila][columna]));
            }
            System.out.println();
        }
        System.out.println(BORDE.repeat(unaMatriz[unaMatriz.length-1].length));

    }

    static String parse(int valor) {
        final String [] ELM = {
            "|",
            "!",
            "x",
            "?",
            "0",
            ".",
            ".",
            ".",
            "¬",
            "_"
        };
        return ELM[valor];
    }

}
