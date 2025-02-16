class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
            { 0, 0, 9, 9, 0, 9, 9, 0, 0 },
            { 0, 9, 0, 9, 0, 9, 0, 9, 0 },
            { 9, 0, 9, 0, 9, 0, 9, 0, 9 },
            { 9, 0, 0, 9, 9, 9, 0, 0, 9 },
            { 0, 9, 9, 0, 9, 0, 9, 9, 0 },
            { 0, 0, 9, 0, 0, 9, 0, 0, 0 },
            { 0, 0, 0, 9, 9, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 9, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        imprime(matriz);
    }

    static void imprime(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila ++) {
            for (int columna = 0; columna < matriz[fila].length; columna++){
                System.out.print(parce(matriz[fila][columna]));
            }
        System.out.println();
        }
    }
    static String parce(int valor){
        final String[] TITLES = {
        "  ",
        " &",
        "{}",
        "[]",
        "|!|",
        "**",
        "^^",
        "-_-",
        "^[]^",
        " * "
        };

        return (TITLES[valor]);
    }
}
