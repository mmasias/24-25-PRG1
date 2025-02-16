import java.util.Scanner;

public class Mundo {

    public static void main(String[] args) {
        

        int[][] mapa = {
                { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2 },
                { 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 2, 2, 2, 2, 2, 2 },
                { 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        };

        int jugadorX = 5;
        int jugadorY = 5;
        boolean jugando = true;

        mapa[jugadorX][jugadorY] = 5;

        while (jugando) {
            imprimirMapa(mapa);
            int[] nuevaPosicion = moverJugador(mapa, jugadorX, jugadorY);
            jugadorX = nuevaPosicion[0];
            jugadorY = nuevaPosicion[1];

        }

    }

    static int[] moverJugador(int[][] mapa, int jugadorX, int jugadorY) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a donde quieres ir:   ||1-arriba||2-abajo||3-derecha||4-izquierda|| ");

        int direccion = scanner.nextInt();
        int nuevoX = jugadorX;
        int nuevoY = jugadorY;

        switch (direccion) {
            case 1:
                nuevoX = jugadorX - 1;
                break;
            case 2:
                nuevoX = jugadorX + 1;
                break;
            case 3:
                nuevoY = jugadorY + 1;
                break;
            case 4:
                nuevoY = jugadorY - 1;
                break;
            default:
                System.out.println("direccion invalida");
                return new int[] { jugadorX, jugadorY };

        }

        if (nuevoX < 0 || nuevoX >= mapa.length || nuevoY < 0 || nuevoY >= mapa[0].length) {
            System.out.println("fuera de mapa");
            return new int[] { jugadorX, jugadorY };
        }
        mapa[jugadorX][jugadorY] = 0;
        mapa[nuevoX][nuevoY] = 5;

        return new int[] { nuevoX, nuevoY };
       

    }

    static void imprimirMapa(int[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                imprimirColor(mapa[i][j]);
            }
            System.out.println(" ");
        }
    }

    static void imprimirColor(int valor) {

        String azul = "\u001B[34m";
        String verde = "\u001B[32m";
        String rojo = "\u001B[31m";
        String reset = "\u001B[0m";

        String simbolo = convertirMapa(valor);
        String color;
        switch (valor) {
            case 0:
                color = verde;
                break;
            case 1:
                color = verde;
                break;

            case 2:
                color = azul;
                break;
            case 3:
                color = azul;
                break;
            case 4:
                color = rojo;
                break;
            default:
                color = reset;
                break;
        }

        System.out.print(color + simbolo + reset + " ");

    }

    static String convertirMapa(int valor) {
        switch (valor) {
            case 0:
                return ".";
            case 1:
                return "#";
            case 2:
                return "~";
            case 3:
                return "*";
            case 4:
                return "+";
            case 5:
                return "&";
            default:
                return "";
        }
    }

}
