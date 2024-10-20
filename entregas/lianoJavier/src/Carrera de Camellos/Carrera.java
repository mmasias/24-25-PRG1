import java.util.Scanner;

class Carrera {

    public static void main(String[] args) {
        final String COLOR_RESET = "\u001B[0m";
        final String COLOR_BLUE = "\u001B[34m";
        final String COLOR_GREEN = "\u001B[32m";
        final String COLOR_RED = "\u001B[31m";
        final String COLOR_ORANGE = "\u001B[38;5;214m";

        Scanner inputUser = new Scanner(System.in);

        final int AGUJERO_1 = 0;
        final int AGUJERO_2 = 1;
        final int AGUJERO_3 = 2;
        final int AGUJERO_4 = 3;

        final double[] PROBABILIDAD_ACIERTAR_EN_EL_AGUJERO = { 0.6, 0.4, 0.3, 1 };
        final int[] AVANCE_POR_ACERTAR_EN_EL_AGUJERO = { 1, 2, 4, 6 };

        int espacioRecorrido = 0;
        int recorridoTotal = 60;
        int turno = 1;

        do {
            System.out.println("");
            System.out.println(COLOR_BLUE + "TURNO - [" + turno + "]" + COLOR_RESET);
            System.out.println(COLOR_GREEN + "Opciones: 1 | 2 | 3 | 4" + COLOR_RESET);
            System.out.print("Elige un agujero al que tirar: ");

            int seleccionJugador;

            do {
                seleccionJugador = inputUser.nextInt() - 1;
            } while (seleccionJugador < 0 || seleccionJugador > 3);

            int avance = 0;

            switch (seleccionJugador) {
                case AGUJERO_1:
                    if (Math.random() <= PROBABILIDAD_ACIERTAR_EN_EL_AGUJERO[AGUJERO_1]) {
                        avance = AVANCE_POR_ACERTAR_EN_EL_AGUJERO[AGUJERO_1];
                    }
                    break;
                case AGUJERO_2:
                    if (Math.random() <= PROBABILIDAD_ACIERTAR_EN_EL_AGUJERO[AGUJERO_2]) {
                        avance = AVANCE_POR_ACERTAR_EN_EL_AGUJERO[AGUJERO_2];
                    }
                    break;
                case AGUJERO_3:
                    if (Math.random() <= PROBABILIDAD_ACIERTAR_EN_EL_AGUJERO[AGUJERO_3]) {
                        avance = AVANCE_POR_ACERTAR_EN_EL_AGUJERO[AGUJERO_3];
                    }
                    break;
                case AGUJERO_4:
                    if (Math.random() <= PROBABILIDAD_ACIERTAR_EN_EL_AGUJERO[AGUJERO_4]) {
                        avance = AVANCE_POR_ACERTAR_EN_EL_AGUJERO[AGUJERO_4];
                    }
                    break;
            }

            espacioRecorrido += avance;

            int recorridoRestante;
            recorridoRestante = (recorridoTotal - espacioRecorrido) >= 0 ? (recorridoTotal - espacioRecorrido) : 0;

            System.out.println((avance == 0 ? COLOR_RED : COLOR_ORANGE) + "Has avanzado: " + avance + COLOR_RESET);
            System.out.println((recorridoRestante == 0 ? COLOR_GREEN : COLOR_RED) + "Te quedan: " + recorridoRestante + COLOR_RESET);

            turno++;

        } while (espacioRecorrido < recorridoTotal);

        inputUser.close();
    }
}
