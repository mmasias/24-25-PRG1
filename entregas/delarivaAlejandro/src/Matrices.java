public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
                { 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0 },
                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5 }
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
        final String[] TITLES = {
                "   ",
                "[#]",
                " ' ",
                "<->",
                "'''",
                ";:;",
                ", '",
                "/|//",
                ";|;"
        };
        return TITLES[valor];

    }
}
