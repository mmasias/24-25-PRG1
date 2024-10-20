import java.util.Scanner;

class Carrera {

    public static void main(String[] args) {
        final String COLOR_RESET = "\u001B[0m";
        final String COLOR_BLUE = "\u001B[34m";
        final String COLOR_GREEN = "\u001B[32m";
        final String COLOR_RED = "\u001B[31m";
        final String COLOR_ORANGE = "\u001B[38;5;214m";

        Scanner inputUser = new Scanner(System.in);

        final double[] PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO = { 0.6, 0.4, 0.3, 0.1 };
        final int[] AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO = { 1, 2, 4, 6 };

        int posicionDelCamello = 0;
        int recorridoTotal = 60;
        int turno = 1;
        
        do {
            System.out.println("");
            System.out.println(COLOR_BLUE + "TURNO - [" + turno + "]" + COLOR_RESET);
            System.out.println(COLOR_GREEN + "Opciones: 1 | 2 | 3 | 4" + COLOR_RESET);
            System.out.println("Elige un agujero al que tirar: ");
            
            int seleccionJugador;
            
            do {
                seleccionJugador = inputUser.nextInt() - 1;
            } while (seleccionJugador < 0 || seleccionJugador > 3);
            
            boolean aciertaEnElAgujero = Math.random() <= PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO[seleccionJugador];
            
            int casillasQueAvanzaElCamello = 0;
            if (aciertaEnElAgujero) {
                casillasQueAvanzaElCamello = AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO[seleccionJugador];
                posicionDelCamello += casillasQueAvanzaElCamello;
            }
            
            int fallosRealizados = 0;
            fallosRealizados += !aciertaEnElAgujero ? 1 : 0;

            if (aciertaEnElAgujero) {
                fallosRealizados = 0;
            }

            boolean demasiadosFallosSeguidos = fallosRealizados >= 3;

            if (demasiadosFallosSeguidos) {
                fallosRealizados = 0;
                posicionDelCamello = 0;
            }

            int recorridoRestante;
            recorridoRestante = (recorridoTotal - posicionDelCamello) >= 0 ? (recorridoTotal - posicionDelCamello) : 0;

            System.out.println((casillasQueAvanzaElCamello == 0 ? COLOR_RED : COLOR_ORANGE) + "Has avanzado: " + casillasQueAvanzaElCamello + COLOR_RESET);
            System.out.println((recorridoRestante == 0 ? COLOR_GREEN : COLOR_RED) + "Te quedan: " + recorridoRestante
                    + COLOR_RESET);

            turno++;

        } while (posicionDelCamello < recorridoTotal);

        inputUser.close();
    }
}
