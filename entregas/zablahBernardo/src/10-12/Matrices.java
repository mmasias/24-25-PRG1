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
        int x=0, y=0;
        
        imprime(dibujo, x, y);
    }

    static void imprime(int[][] matriz, int posX, int posY){
        final int PERSONAJE = 0;
        for (int fila = 0; fila < matriz.length; fila ++){
            for (int columna = 0; columna < matriz[fila].length; columna++){
                if (posY == fila && posX == columna) {
                    System.out.println(parse(PERSONAJE));
                } else {
                    System.out.print( parse(matriz[fila][columna]));
                }
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
            "p",
        };
        return(TILES[valor]);
    }


    
    static void imprime1(int[][] unaMatriz) {
        for (int fila = 0; fila < unaMatriz.length; fila++) {
            for (int columna = 0; columna < unaMatriz[fila].length; columna++) {
                System.out.print("|" + unaMatriz[fila][columna]);
            }
            System.out.println("|");
        }
        System.out.println("=".repeat(40));
    }
}