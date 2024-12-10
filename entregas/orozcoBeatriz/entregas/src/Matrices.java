public class Matrices {
    public static void main(String[] args) {

        int[][] matriz = {
            {12, 78, 34, 56, 23, 45, 89, 67, 21, 90},
            {11, 54, 67, 83, 28, 19, 42, 76, 85, 34},
            {63, 77, 15, 92, 48, 34, 57, 81, 29, 73},
            {94, 25, 39, 64, 12, 87, 31, 44, 68, 59},
            {72, 19, 86, 53, 41, 37, 50, 66, 88, 13},
            {35, 61, 22, 49, 77, 58, 36, 95, 32, 81},
            {14, 85, 62, 30, 69, 27, 71, 40, 46, 99},
            {23, 44, 75, 81, 92, 18, 53, 37, 20, 65},
            {57, 33, 49, 70, 61, 88, 14, 76, 24, 84},
            {90, 12, 78, 31, 15, 22, 65, 98, 43, 50},
        };

        imprime(matriz);
    }
    static void imprime (int matriz[][]) {
        for (int fila  = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println(parse(matriz[fila][columna]));
            }
            System.out.println();
        }
        System.out.println("===", repeat(matriz[0].length));
    }

    static String parse(int valor) {
        return switch(valor) {
            case 0 -> " ";
            case 1 -> "[#]";
            case 2 -> " . ";
            case 3 -> "~ ~";
            case 4 -> "'''";
            case 5 -> ":::";
            case 6 -> ", '";
            case 7 -> "/^\\";
            case 8 -> "^Y^";
            case 9 -> ":|:";
            default -> "???";
        };
    }
}
