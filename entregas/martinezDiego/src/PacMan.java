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

        int posicionEnemigoX = 0;
        int posicionEnemigoY = 0;

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

            int[] nuevaPosicionJugador = moverJugador(mapa, posicionJugadorX, posicionJugadorY, movimiento);
            posicionJugadorX = nuevaPosicionJugador[0];
            posicionJugadorY = nuevaPosicionJugador[1];

            mapa[posicionEnemigoX][posicionEnemigoY] = 0;

            if (posicionEnemigoX < posicionJugadorX) {
                posicionEnemigoX++;
            } else if (posicionEnemigoX > posicionJugadorX) {
                posicionEnemigoX--;
            }

            if (posicionEnemigoY < posicionJugadorY) {
                posicionEnemigoY++;
            } else if (posicionEnemigoY > posicionJugadorY) {
                posicionEnemigoY--;
            }

            mapa[posicionEnemigoX][posicionEnemigoY] = 2;

            if (posicionJugadorX == posicionEnemigoX && posicionJugadorY == posicionEnemigoY) {
                System.out.println("¡El enemigo te atrapó! Fin del juego.");
                jugando = false;
            }

            imprimirMapa(mapa);
        }

        scanner.close();
    }

    static int[] moverJugador(int[][] mapa, int posicionX, int posicionY, int movimiento) {
        int nuevaX = posicionX;
        int nuevaY = posicionY;

        if (movimiento == 1 && posicionX > 0) {
            mapa[posicionX][posicionY] = 0;
            nuevaX = posicionX - 1;
            mapa[nuevaX][posicionY] = 1;
        }

        else if (movimiento == 2 && posicionY > 0) {
            mapa[posicionX][posicionY] = 0;
            nuevaY = posicionY - 1;
            mapa[posicionX][nuevaY] = 1;
        }

        else if (movimiento == 3 && posicionX < mapa.length - 1) {
            mapa[posicionX][posicionY] = 0;
            nuevaX = posicionX + 1;
            mapa[nuevaX][posicionY] = 1;
        }

        else if (movimiento == 4 && posicionY < mapa[0].length - 1) {
            mapa[posicionX][posicionY] = 0;
            nuevaY = posicionY + 1;
            mapa[posicionX][nuevaY] = 1;
        }

        else if (movimiento > 4) {
            System.out.println(" Entrada invalida, prueba de nuevo");
        } else {
            System.out.println(" Movimiento fuera de los límites, intenta de nuevo");
        }

        return new int[] { nuevaX, nuevaY };
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
