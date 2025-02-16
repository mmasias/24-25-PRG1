class Mapa {
    public static void main(String[] args) {
        int[][] matriz = {
                { 7, 1, 2, 0, 8, 3, 6, 4, 5 },
                { 6, 5, 7, 4, 3, 2, 0, 1, 8 },
                { 1, 3, 4, 5, 6, 7, 0, 8, 2 },
                { 1, 2, 8, 6, 7, 3, 4, 0, 5 },
                { 3, 5, 2, 6, 0, 1, 7, 8, 4 },
                { 7, 2, 5, 4, 0, 3, 8, 1, 6 },
                { 6, 2, 1, 3, 7, 5, 8, 0, 4 },
                { 5, 7, 8, 6, 3, 4, 2, 1, 0 },
                { 5, 7, 4, 8, 2, 3, 0, 6, 1 },
        };
        imprime(matriz);
    }

    static void imprime(int[][] matriz) {
        final int LINE = 100;  
        final int MAP_WIDTH = matriz[0].length;  

        
        System.out.println(parse(LINE).repeat(MAP_WIDTH));
        
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(parse(matriz[fila][columna]));
            }
            System.out.println();
        }

        System.out.println(parse(LINE).repeat(MAP_WIDTH));
    }

    static String parse(int value) {
        return switch (value) {
            case 0 -> "   ";
            case 1 -> "[#]";
            case 2 -> " · ";
            case 3 -> "~ ~";
            case 4 -> "'''";
            case 5 -> ":::";
            case 6 -> ", '";
            case 7 -> "/^\\";
            case 8 -> "^Y^";
            case 100 -> "---";
            default -> "???";
        };
    }
}
