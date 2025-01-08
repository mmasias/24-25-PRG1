
import java.util.Scanner;

public class PacMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mapa = {
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        int posicionJugadorX = 4;
        int posicionJugadorY = 4;

        int posicionEnemigoX = 1;
        int posicionEnemigoY = 1;

        mapa[posicionJugadorX][posicionJugadorY] = 1;
        mapa[posicionEnemigoX][posicionEnemigoY] = 2;

        boolean jugando = true;
        System.out.println(" Bienvenido a PacMan, este es el mapa, pulsa para empezar");
        imprimirMapa(mapa);
        scanner.nextLine();
        while (jugando) {

            System.out.println(
                    "Para moverte usa 1,2,3,4 || 1 - ARRIBA  || 2 - IZQUIERDA  || 3 - ABAJO  || 4 - DERECHA ||");

            int movimiento = scanner.nextInt();
            if (movimiento == 1 && posicionJugadorX > 0) {
                mapa[posicionJugadorX][posicionJugadorY] = 0;
                posicionJugadorX = posicionJugadorX - 1;
                mapa[posicionJugadorX][posicionJugadorY] = 1;
                System.out.println("-------");
                System.out.println("arriba");
                System.out.println("-------");
                imprimirMapa(mapa);
            } else if (movimiento == 2 && posicionJugadorY > 0) {
                mapa[posicionJugadorX][posicionJugadorY] = 0;
                posicionJugadorY = posicionJugadorY + 1;
                mapa[posicionJugadorX][posicionJugadorY] = 1;
                System.out.println("-------");
                System.out.println("izquierda");
                System.out.println("-------");
                imprimirMapa(mapa);
            } else if (movimiento == 3 && posicionJugadorX < mapa.length - 1) {
                mapa[posicionJugadorX][posicionJugadorY] = 0;
                posicionJugadorX = posicionJugadorX + 1;
                mapa[posicionJugadorX][posicionJugadorY] = 1;
                System.out.println("-------");
                System.out.println("abajo");
                System.out.println("-------");
                imprimirMapa(mapa);
            } else if (movimiento == 4 && posicionJugadorY < mapa[0].length - 1) {
                mapa[posicionJugadorX][posicionJugadorY] = 0;
                posicionJugadorY = posicionJugadorY - 1;
                mapa[posicionJugadorX][posicionJugadorY] = 1;
                System.out.println("-------");
                System.out.println("derecha");
                System.out.println("-------");
                imprimirMapa(mapa);
            } else {
                System.out.println(" Entrada invalida, prueba de nuevo");
                imprimirMapa(mapa);
            }
            

        }
        scanner.close();

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

            case 2:
                return "E";

            default:
                return "?";
        }

    }
}
