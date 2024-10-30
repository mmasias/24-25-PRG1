
import java.util.Scanner;

class Carrera {

    public static void main(String[] args) {
        final String COLOR_RESET = "\u001B[0m";
        final String COLOR_BLUE = "\u001B[34m";
        final String COLOR_GREEN = "\u001B[32m";
        final String COLOR_RED = "\u001B[31m";
        final String COLOR_ORANGE = "\u001B[38;5;214m";
        final int RECORRIDO_TOTAL = 60;

        final String CAMELLO = ",---,^";
        final String PISTA = "__";

        Scanner inputUser = new Scanner(System.in);

        final double PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO_1 = 0.6,
                PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO_2 = 0.4,
                PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO_3 = 0.3,
                PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO_4 = 0.1;

        final double PROBABILIDAD_DE_QUE_EL_CAMELLO_TROPIECE = 0.1;

        final int AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO_1 = 1,
                AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO_2 = 2,
                AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO_3 = 4,
                AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO_4 = 6;

        int posicionDelCamelloUsuario = 0;
        int posicionDelCamelloRobot = 0;
        int turno = 1;
        do {
            int fallosRealizados = 0;
            System.out.println("");
            System.out.println(COLOR_BLUE + "TURNO - [" + turno + "]" + COLOR_RESET);
            System.out.println(COLOR_GREEN + "Opciones: 1 | 2 | 3 | 4" + COLOR_RESET);
            System.out.println("Elige un agujero al que tirar: ");

            int seleccionJugador;

            do {
                seleccionJugador = inputUser.nextInt();
            } while (seleccionJugador < 1 || seleccionJugador > 4);

            final int SELECCION_MAXIMA_ROBOT = 1;
            final int SELECCION_MINIMA_ROBOT = 4;

            int seleccionRobot = (int) (Math.random() * (SELECCION_MAXIMA_ROBOT - SELECCION_MINIMA_ROBOT) + SELECCION_MINIMA_ROBOT);

            boolean AciertaEnElAgujeroUsuario;
            int avanceDelCamelloUsuario;

            if (seleccionJugador == 1) {
                AciertaEnElAgujeroUsuario = Math.random() <= PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO_1;
                avanceDelCamelloUsuario = AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO_1;
            } else if (seleccionJugador == 2) {
                AciertaEnElAgujeroUsuario = Math.random() <= PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO_2;
                avanceDelCamelloUsuario = AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO_2;
            } else if (seleccionJugador == 3) {
                AciertaEnElAgujeroUsuario = Math.random() <= PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO_3;
                avanceDelCamelloUsuario = AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO_3;
            } else {
                AciertaEnElAgujeroUsuario = Math.random() <= PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO_4;
                avanceDelCamelloUsuario = AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO_4;
            }
            int avanceDelCamelloRobot;

            if (seleccionRobot == 1) {
                avanceDelCamelloRobot = AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO_1;
            } else if (seleccionRobot == 2) {
                avanceDelCamelloRobot = AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO_2;
            } else if (seleccionRobot == 3) {
                avanceDelCamelloRobot = AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO_3;
            } else {
                avanceDelCamelloRobot = AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO_4;
            }

            boolean camelloTropezo = Math.random() <= PROBABILIDAD_DE_QUE_EL_CAMELLO_TROPIECE;

            if (camelloTropezo) {
                avanceDelCamelloUsuario = 0;
            }

            posicionDelCamelloUsuario += avanceDelCamelloUsuario;
            posicionDelCamelloRobot += avanceDelCamelloRobot;

            if (!(AciertaEnElAgujeroUsuario)) {
                fallosRealizados++;
            }

            if (fallosRealizados >= 3) {
                fallosRealizados = 0;
                posicionDelCamelloUsuario = 0;
            }

            if (camelloTropezo) {
                System.out.println("El camello se tropezó.");
            }

            System.out.println((avanceDelCamelloUsuario == 0 ? COLOR_RED : COLOR_ORANGE) + "Has avanzado: " + avanceDelCamelloUsuario
                    + COLOR_RESET);

            int recorridoRestante = RECORRIDO_TOTAL - posicionDelCamelloUsuario;
            if (recorridoRestante <= 0) {
                recorridoRestante = 0;
            }
            System.out.println(
                    (recorridoRestante == 0 ? COLOR_GREEN : COLOR_RED) + "Te quedan: " + recorridoRestante
                    + COLOR_RESET);

            System.out.println(PISTA.repeat(posicionDelCamelloUsuario) + CAMELLO);
            System.out.println("---------------------------");
            System.out.println(PISTA.repeat(posicionDelCamelloRobot) + CAMELLO);

            turno += camelloTropezo ? 2 : 1;

        } while ((posicionDelCamelloUsuario < RECORRIDO_TOTAL && posicionDelCamelloRobot < RECORRIDO_TOTAL) && turno
                <= 50);

        inputUser.close();
    }
}
