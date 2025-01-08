import java.util.Scanner;

public class PacManChat {
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

        mapa[posicionJugadorX][posicionJugadorY] = 1; // Jugador
        mapa[posicionEnemigoX][posicionEnemigoY] = 2; // Enemigo

        boolean jugando = true;
        System.out.println(" Bienvenido a PacMan, este es el mapa, pulsa para empezar");
        imprimirMapa(mapa);
        scanner.nextLine();

        while (jugando) {
            System.out.println(
                    "Para moverte usa 1,2,3,4 || 1 - ARRIBA  || 2 - IZQUIERDA  || 3 - ABAJO  || 4 - DERECHA ||");

            int movimiento = scanner.nextInt();

            // Llamar al método moverJugador
            int[] nuevaPosicionJugador = moverJugador(mapa, posicionJugadorX, posicionJugadorY, movimiento);
            posicionJugadorX = nuevaPosicionJugador[0];
            posicionJugadorY = nuevaPosicionJugador[1];

            // Movimiento del enemigo
            mapa[posicionEnemigoX][posicionEnemigoY] = 0; // Limpia posición actual del enemigo

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

            mapa[posicionEnemigoX][posicionEnemigoY] = 2; // Actualiza la nueva posición del enemigo

            // Verificar colisión
            if (posicionJugadorX == posicionEnemigoX && posicionJugadorY == posicionEnemigoY) {
                System.out.println("¡El enemigo te atrapó! Fin del juego.");
                jugando = false;
            }

            // Imprimir mapa
            imprimirMapa(mapa);
        }

        scanner.close();
    }

    // Método para mover al jugador
    static int[] moverJugador(int[][] mapa, int posicionX, int posicionY, int movimiento) {
        int nuevaX = posicionX;
        int nuevaY = posicionY;

        // Movimiento hacia arriba
        if (movimiento == 1 && posicionX > 0) {
            mapa[posicionX][posicionY] = 0; // Limpia la posición actual
            nuevaX = posicionX - 1;
            mapa[nuevaX][posicionY] = 1; // Marca la nueva posición
        }
        // Movimiento hacia la izquierda
        else if (movimiento == 2 && posicionY > 0) {
            mapa[posicionX][posicionY] = 0;
            nuevaY = posicionY - 1;
            mapa[posicionX][nuevaY] = 1;
        }
        // Movimiento hacia abajo
        else if (movimiento == 3 && posicionX < mapa.length - 1) {
            mapa[posicionX][posicionY] = 0;
            nuevaX = posicionX + 1;
            mapa[nuevaX][posicionY] = 1;
        }
        // Movimiento hacia la derecha
        else if (movimiento == 4 && posicionY < mapa[0].length - 1) {
            mapa[posicionX][posicionY] = 0;
            nuevaY = posicionY + 1;
            mapa[posicionX][nuevaY] = 1;
        }
        // Movimiento inválido
        else if (movimiento > 4) {
            System.out.println(" Entrada invalida, prueba de nuevo");
        } else {
            System.out.println(" Movimiento fuera de los límites, intenta de nuevo");
        }

        // Retornar nueva posición
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
                return "P"; // Jugador
            case 2:
                return "E"; // Enemigo
            default:
                return "?";
        }
    }
}

