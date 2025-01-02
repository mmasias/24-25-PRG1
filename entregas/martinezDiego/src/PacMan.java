import java.util.Scanner;

public class PacMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mapa = { 
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        imprimirMapa(mapa);

    }

    static void imprimirMapa(int[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                String simbolo = convertirMapa(mapa[i][j]);
                System.out.print(simbolo + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    static String convertirMapa(int valor) {
        switch (valor) {
            case 0:
                return ".";

            case 1:
                return "P";

            default:
                return "?";
        }

    }
}
