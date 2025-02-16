import java.util.Scanner;

public class MatricesMapa {

    public static void main(String[] args) {

        int[][] mapa = {
                { 4, 6, 7, 7, 7, 7, 7, 9, 0, 0 },
                { 9, 3, 3, 3, 3, 3, 3, 9, 0, 0 },
                { 9, 3, 3, 3, 3, 3, 3, 9, 0, 5 },
                { 9, 3, 3, 3, 3, 3, 3, 9, 0, 0 },
                { 9, 8, 8, 8, 8, 8, 6, 9, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 5, 0, 0, 0, 8, 0, 0 },
                { 0, 2, 0, 0, 0, 0, 0, 0, 5, 0 },
                { 5, 0, 0, 0, 0, 2, 0, 0, 0, 0 },
                { 0, 8, 0, 0, 0, 0, 0, 0, 5, 0 }
        };
        int[] posicion = { 0, 0 };
        boolean isPlaying = true;
        do {
            imprime(mapa, posicion);
            getInput(posicion);
        } while (isPlaying);

    }

    static void getInput(int[] coordenaba) {
        String movement = "" + new Scanner(System.in).nextLine().charAt(0);
        switch (movement) {
            case "a" -> coordenaba[0] = coordenaba[0] - 1;
            case "d" -> coordenaba[0] = coordenaba[0] + 1;
            case "s" -> coordenaba[1] = coordenaba[0] + 1;
            case "w" -> coordenaba[1] = coordenaba[0] - 1;
            default -> {
            }
        }
        
    }

    static void imprime(int[][] mapa, int[] coordenabaPersonaje) {
        final int PERSONAJE = 10;
        System.out.println("===".repeat(mapa[0].length));
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int columna = 0; columna < mapa[fila].length; columna++) {

                if (coordenabaPersonaje[0] == fila && coordenabaPersonaje[0] == columna) {
                    System.out.print(valores(PERSONAJE));
                } else {
                    System.out.print(valores(mapa[fila][columna]));
                }
            }
            System.out.println();
        }
        System.out.println("===".repeat(mapa[0].length));
    }

    static String valores(int valor) {
        final String[] block = { "___", "···", "   ", ":::", "///", "*|*", "{ }", "---", "~~~", "| |", ">|<" };
        return block[valor];
    }
}
