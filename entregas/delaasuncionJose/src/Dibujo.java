class Dibujo {
    public static void main(String[] args) {
        int[][] dibujo = {{0,2,1},
                        {1,2,0}};
        escribir(dibujo);
    }

    private static void escribir(int[][] dibujo) {
        for (int fila = 0; fila < dibujo.length; fila++) {
            for (int columna = 0; columna < dibujo[fila].length; columna++) {
                System.out.print(parse(dibujo[fila][columna]));
            }
            System.out.println();
        }
    }

    private static String parse(int i) {
        final String[] CARACTER = {"   ","[#]"," · ","~~~","/^\\"};
        return CARACTER[i];
    }
}