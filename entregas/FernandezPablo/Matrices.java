class Matrices{
    public static void main (String[] args) {
        int[][] matriz = {
            {0, 3, 4, 6, 1, 2},
            {1, 6, 5, 3, 0, 6},
            {6, 3, 1, 0, 2, 5},
            {5, 6, 0, 1, 3, 4},
            {3, 2, 1, 0, 6, 5},
            {4, 2, 1, 3, 5, 6},
            {0, 1, 2, 3, 4, 5},
            {5, 5, 1, 2, 6, 2},
            {3, 1, 0, 4, 5, 6},
        };
        imprime(matriz);
     
        }

        static void imprime(int [][] matriz){
            for(int fila = 0; fila < matriz [fila].length; fila++){
                for(int columna = 0; columna < matriz[fila].length; columna++){
                    System.out.println(parse(matriz[fila][columna]));

                }
                System.out.println();

            }
        }
    static String parse (int valor){
        final String[] TILES = {
            "._.",
            "0_0",
            "+_+",
            "º-º",
            "T_T",
            "·-·",
            "3-3",
            ":P",
            "O-O",


        };
        return(TILES[valor]);
    }
}