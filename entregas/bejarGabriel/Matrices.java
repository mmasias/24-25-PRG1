public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
            {0,0,0,1,1,1,0,0,0,1,1,1,0,0,0,1,1,1,0},
            {0,0,2,2,0,0,2,2,0,0,2,2,0,0,2,2,0,0,2},
            {4,5,5,5,4,4,5,5,5,6,6,4,6,4,6,4,6,6,5},
            {0,2,7,7,8,5,6,2,4,2,4,9,5,2,4,2,3,4,6},
            {8,5,2,3,1,5,6,1,3,1,6,3,7,9,6,2,1,5,3},
            {4,2,3,5,9,3,3,6,5,1,3,5,4,2,1,5,8,5,7},
            {4,5,3,1,5,1,8,2,4,6,9,4,5,2,4,8,2,1,2},
            {2,1,8,1,3,5,2,0,1,2,0,1,5,8,3,1,8,2,1},
            {3,3,1,5,1,4,2,4,8,2,1,5,6,3,1,5,4,8,2},
            {1,5,3,1,5,1,6,2,1,0,5,1,1,5,3,4,8,2,0},


        };
        imprime(matriz);
    }
    static void imprime( int[][] matriz){
        System.out.println("===".repeat(matriz[0].length));
        for (int[] matriz1 : matriz) {
            for (int columna = 0; columna < matriz1.length; columna++) {
                System.out.println(parse(matriz1[columna]));
            }
            System.out.println();
        }
        System.out.println("===".repeat(matriz[0].length));
    }
    static String parse(int valor){
        final String[] TILES = {
            "   ",
            "[#]",
            " · ",
            "~ ~",
            "'''",
            ":::",
            ", '",
            "/^/",
            "^Y^",
            ":|:",
        };
        return TILES[valor];
    }
}
