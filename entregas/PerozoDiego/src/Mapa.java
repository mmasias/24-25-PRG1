package src;

public class Mapa {
    public static void main(String[] args) {
        int [][] matriz = {
           //0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//0
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//1
            {0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0},//2
            {0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0},//3
            {0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0},//4
            {0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0},//5
            {0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0},//6
            {0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0},//7
            {0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0},//8
            {0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0},//9
            {0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0},//0
            {0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0},//1
            {0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0},//2
            {0,0,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0},//3
            {0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0},//4
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//5
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} //6
        };

        imprime(matriz);
    }

    static void imprime(int[][] matriz) {
        String separador = "===".repeat(matriz[0].length);
        System.out.println(separador);
        
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(parse(matriz[fila][columna]));
            }
            System.out.println();
        }
        
        System.out.println(separador);
    }

    static String parse(int valor) {
        return switch (valor) {
            case 0 -> "  ";
            case 1 -> "[#]";
            case 2 -> " · ";
            case 3 -> "~ ~";
            case 4 -> "''";
            case 5 -> "  ";
            case 6 -> ", '";
            case 7 -> "/^\\";
            case 8 -> "^Y^";
            case 9 -> ":|:";
            case 10 -> "_0_";
            default -> "???";
        };
    }
}