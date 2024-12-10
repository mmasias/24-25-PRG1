class Matrices {
    public static void main(String[] args) {
        int [][] dibujo = {
            {0,0,0,0,1,0,0,0,0},
            {0,0,0,2,0,2,0,0,0},
            {0,0,3,0,0,0,3,0,0},
            {0,4,0,0,0,0,0,4,0},
            {5,0,0,0,0,0,0,0,5},
            {0,4,0,0,0,0,0,4,0},
            {0,0,3,0,0,0,3,0,0},
            {0,0,0,2,0,2,0,0,0},
            {0,0,0,0,1,0,0,0,0},
            
        };

        imprime(dibujo);
    }

    static void imprime(int[][] matriz){
        for (int fila = 0; fila < matriz.length; fila ++){
            for (int columna = 0; columna < matriz[fila].length; columna++){
                System.out.print( parse(matriz[fila][columna]));
            }
        System.out.println();
        }
    }

    static String parse(int valor){
        final String[] TILES = {
            "-",
            "&",
            "/",
            "$",
            "!",
            "¡",
        };
        return(TILES[valor]);
    }

}