import java.util.Scanner;

class Carrera {

    public static void main(String[] args) {
        final String COLOR_RESET = "\u001B[0m";
        final String COLOR_BLUE = "\u001B[34m";
        final String COLOR_GREEN = "\u001B[32m";
        final String COLOR_RED = "\u001B[31m";
        final String COLOR_ORANGE = "\u001B[38;5;214m";
        final int RECORRIDO_TOTAL = 60;

        Scanner inputUser = new Scanner(System.in);

        final double[] PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO = { 0.6, 0.4, 0.3, 0.1 };
        final double PROBABILIDAD_DE_QUE_EL_CAMELLO_TROPIECE = 0.1;
        final int[] AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO = { 1, 2, 4, 6 };

        int posicionDelCamello = 0;
        int turno = 1;
        int fallosRealizados = 0;

        do {
            System.out.println("");
            System.out.println(COLOR_BLUE + "TURNO - [" + turno + "]" + COLOR_RESET);
            System.out.println(COLOR_GREEN + "Opciones: 1 | 2 | 3 | 4" + COLOR_RESET);
            System.out.println("Elige un agujero al que tirar: ");

            int seleccionJugador;
            do {
                seleccionJugador = inputUser.nextInt() - 1;
            } while (seleccionJugador < 0 || seleccionJugador > 3);

            boolean jugadorAciertaEnElAgujero = Math
                    .random() <= PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO[seleccionJugador];

            int avanceDelCamello = jugadorAciertaEnElAgujero
                    ? AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO[seleccionJugador]
                    : 0;

            boolean camelloTropezo = Math.random() <= PROBABILIDAD_DE_QUE_EL_CAMELLO_TROPIECE;
            if (camelloTropezo) {
                avanceDelCamello = 0;
            }

            posicionDelCamello += avanceDelCamello;
            fallosRealizados = jugadorAciertaEnElAgujero ? 0 : fallosRealizados++;

            if (fallosRealizados >= 3) {
                fallosRealizados = 0;
                posicionDelCamello = 0;
            }

            if (camelloTropezo) {
                System.out.println("El camello se tropezó.");
            }

            System.out.println((avanceDelCamello == 0 ? COLOR_RED : COLOR_ORANGE) + "Has avanzado: " + avanceDelCamello
                    + COLOR_RESET);

            int recorridoRestante = RECORRIDO_TOTAL - posicionDelCamello;
            if (recorridoRestante <= 0) {
                recorridoRestante = 0;
            }
            System.out.println(
                    (recorridoRestante == 0 ? COLOR_GREEN : COLOR_RED) + "Te quedan: " + recorridoRestante
                            + COLOR_RESET);

            turno += camelloTropezo ? 2 : 1;

        } while (posicionDelCamello < RECORRIDO_TOTAL && turno <= 50);

        inputUser.close();
    }
}
