import java.util.Scanner;
public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
                { 0, 0, 9, 0, 0, 9, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 9, 9, 0, 0, 0, 0, 9, 9 },
                { 0, 0, 9, 0, 0, 9, 0, 0 },
                { 0, 0, 9, 0, 0, 9, 0, 0 },
                { 9, 9, 0, 0, 0, 0, 9, 9 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 9, 0, 0, 9, 0, 0 }
        };
        int[] posicion = {0,0};

        boolean isPlaying = true;
        do {
            imprime(matriz, posicion);
            getInput(posicion);
        } while (isPlaying);
    }

    static boolean getInput(int[] coordenada) {
        String movement = "" + new Scanner(System.in).nextLine().charAt(0);
        switch (movement) {
            case "a" -> coordenada[1] -= 1;
            case "d" -> coordenada[1] += 1;
            case "w" -> coordenada[0] -= 1; 
            case "s" -> coordenada[0] += 1; 
            case "q" -> {return false;}
            default -> System.out.println("Movimiento no válido. Usa 'w', 'a', 's', 'd' o 'q'.");}
        return true;
    }


    static void imprime(int[][] matriz, int[] coordenadaPersonaje) {
        System.out.println("===".repeat(matriz[0].length));
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {

                if (coordenadaPersonaje[0] == fila && coordenadaPersonaje[1] == columna) {
                    System.out.print(parse(10));
                } else {
                    System.out.print(parse(matriz[fila][columna]));
                }
            }
            System.out.println("");
        }
        System.out.println("===".repeat(matriz[0].length));
    }

    static String parse(int valor) {
        return switch (valor) {
            case 0 -> "   ";
            case 1 -> "[#]";
            case 2 -> " . ";
            case 3 -> "~ ~";
            case 4 -> "'''";
            case 5 -> ":::";
            case 6 -> ", '";
            case 7 -> "/^\\";
            case 8 -> "^Y^";
            case 9 -> ":|:";
            case 10 -> "_0_";
            default -> "???";
        };
    }
}