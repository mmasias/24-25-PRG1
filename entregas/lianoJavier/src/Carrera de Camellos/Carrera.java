import java.util.Scanner;

class Carrera {
    public static final String COLOR_RESET = "\u001B[0m";
    public static final String COLOR_BLUE = "\u001B[34m";
    public static final String COLOR_GREEN = "\u001B[32m";
    public static final String COLOR_RED = "\u001B[31m";
    public static final String COLOR_ORANGE = "\u001B[38;5;214m";

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        final double[] PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO = { 0.6, 0.4, 0.3, 0.1 };
        final double PROBABILIDAD_DE_QUE_EL_CAMELLO_TROPIECE = 0.1;
        final int[] AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO = { 1, 2, 4, 6 };

        int posicionDelCamello = 0;
        int recorridoTotal = 60;
        int turno = 1;
        int fallosRealizados = 0;

        do {
            System.out.println("");
            System.out.println(COLOR_BLUE + "TURNO - [" + turno + "]" + COLOR_RESET);

            int seleccionJugador = seleccionarAgujero(inputUser);

            boolean jugadorAciertaEnElAgujero = aciertaEnElAgujero(seleccionJugador, PROBABILIDAD_DE_ACIERTAR_EN_EL_AGUJERO);

            int avanceDelCamello = moverCamello(jugadorAciertaEnElAgujero, seleccionJugador, AVANCE_DEL_CAMELLO_POR_ACERTAR_EN_EL_AGUJERO);

            boolean camelloTropezo = tropiezaCamello(PROBABILIDAD_DE_QUE_EL_CAMELLO_TROPIECE);
            if (camelloTropezo) {
                avanceDelCamello = 0;
            }
            
            posicionDelCamello += avanceDelCamello;
            
            fallosRealizados = gestionDeFallos(jugadorAciertaEnElAgujero, fallosRealizados);
            
            if (fallosRealizados >= 3) {
                fallosRealizados = 0;
                posicionDelCamello = 0;
            }
            
            
            mostrarEstadoDelJuego(avanceDelCamello, recorridoTotal, posicionDelCamello);

            turno = camelloTropezo ? turno + 2 : turno++;

        } while (posicionDelCamello < recorridoTotal && turno <= 50);

        inputUser.close();
    }

    public static int seleccionarAgujero(Scanner inputUser) {
        System.out.println(COLOR_GREEN + "Opciones: 1 | 2 | 3 | 4" + COLOR_RESET);
        System.out.println("Elige un agujero al que tirar: ");

        int seleccionJugador;
        do {
            seleccionJugador = inputUser.nextInt() - 1;
        } while (seleccionJugador < 0 || seleccionJugador > 3);

        return seleccionJugador;
    }

    public static boolean aciertaEnElAgujero(int seleccionJugador, double[] probabilidades) {
        return Math.random() <= probabilidades[seleccionJugador];
    }

    public static int moverCamello(boolean acierta, int seleccionJugador, int[] avances) {
        if (acierta) {
            return avances[seleccionJugador];
        }

        return 0;
    }

    public static boolean tropiezaCamello(double probabilidad) {
        return Math.random() <= probabilidad;
    }

    public static int gestionDeFallos(boolean acierta, int fallosRealizados) {
        if (acierta) {
            return 0;
        }
        return fallosRealizados + 1;
    }

    public static void mostrarEstadoDelJuego(int avanceDelCamello, int recorridoTotal, int posicionDelCamello) {
        System.out.println((avanceDelCamello == 0 ? COLOR_RED : COLOR_ORANGE) + "Has avanzado: " + avanceDelCamello
            + COLOR_RESET);
            
            int recorridoRestante = recorridoTotal - posicionDelCamello;
            if (recorridoRestante <= 0) {
                recorridoRestante = 0;
            }
            System.out.println((recorridoRestante == 0 ? COLOR_GREEN : COLOR_RED) + "Te quedan: " + recorridoRestante + COLOR_RESET);
    }
}
