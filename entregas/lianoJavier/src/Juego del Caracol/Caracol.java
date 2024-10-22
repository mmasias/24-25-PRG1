
import java.util.Scanner;

class Caracol {

    public static void main(String[] args) {

        Scanner saltarLinea = new Scanner(System.in);

        final String SUPERFICIE = "[__]            [__]";
        final String SUPERFICIE_COCHE = "[__]    O-=-O   [__]";
        final String PARED_VACIA = "  []:. :. :. :. []";
        final String PARED_CON_AGUA = "  []~~~~~~~~~~~~[]";
        final String PARED_CON_CARACOL = "  []    _@)/'   []";
        final String BASE = "  [][][][][][][][]";
        final String SEPARADOR_ALTURA = "_ __";
        final String DIVISION = "---------------------";

        final int PROFUNDIDAD_POZO = 20;

        final int PROFUNDIDAD_MAXIMA_CARACOL = 10;
        final int PROFUNDIDAD_MINIMA_CARACOL = 20;

        final int PROFUNDIDAD_MINIMA_SUBE_CARACOL = 1;

        final int PROFUNDIDAD_MAXIMA_BAJAR_CARACOL = 2;
        final int PROFUNDIDAD_MINIMA_BAJAR_CARACOL = 0;

        int posicionCaracol;
        posicionCaracol = (int) ((Math.random() * (PROFUNDIDAD_MAXIMA_CARACOL - PROFUNDIDAD_MINIMA_CARACOL + 1))
                + PROFUNDIDAD_MINIMA_CARACOL);

        final int DESCENSO_COCHE = 2;
        final int NIVEL_AGUA_LLUVIA_FUERTE = 5;
        final int NIVEL_AGUA_LLUVIA_MEDIA = 2;

        final double PROBABILIDAD_HAYA_COCHE = 0.35;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.1;

        int dia = 1;
        int nivelAgua = 0;

        do {
            System.out.println(DIVISION);
            System.out.println("DÍA: " + dia);

            boolean hayCoche = Math.random() <= PROBABILIDAD_HAYA_COCHE;

            if (dia != 1) {

                int maximoSubeCaracol = dia <= 10 ? 4 : dia <= 20 ? 3 : 2;

                int subeCaracol;
                subeCaracol = (int) ((Math.random()
                        * (maximoSubeCaracol - PROFUNDIDAD_MINIMA_SUBE_CARACOL + 1))
                        + maximoSubeCaracol);

                int bajaCaracol;
                bajaCaracol = (int) ((Math.random()
                        * (PROFUNDIDAD_MAXIMA_BAJAR_CARACOL - PROFUNDIDAD_MINIMA_BAJAR_CARACOL + 1))
                        + PROFUNDIDAD_MINIMA_BAJAR_CARACOL);

                posicionCaracol = posicionCaracol
                        - subeCaracol
                        + bajaCaracol
                        + (hayCoche ? DESCENSO_COCHE : 0);

                boolean llueveFuerte = Math.random() <= PROBABILIDAD_LLUVIA_FUERTE;
                boolean llueveMedia = Math.random() <= PROBABILIDAD_LLUVIA_MEDIA;
                nivelAgua += (llueveFuerte ? NIVEL_AGUA_LLUVIA_FUERTE : 0)
                        + (llueveMedia ? NIVEL_AGUA_LLUVIA_MEDIA : 0);

                if (posicionCaracol > (PROFUNDIDAD_POZO - nivelAgua)) {
                    posicionCaracol = (PROFUNDIDAD_POZO - nivelAgua) - 1;
                } 
                
                if (posicionCaracol < 0) {
                    posicionCaracol = 0;
                }

                System.out.println("posición del caracol [" + posicionCaracol + "] Caracol sube [" + subeCaracol
                        + "] Caracol baja [" + bajaCaracol + "] Nivel agua [" + nivelAgua + "]");
            } else {
                System.out.println("posición del caracol [" + posicionCaracol + "]");
            }

            if (hayCoche) {
                System.out.println(SUPERFICIE_COCHE);
            } else {
                System.out.println(SUPERFICIE);
            }

            for (int nivel = 1; nivel <= PROFUNDIDAD_POZO; nivel++) {
                if (nivel >= (PROFUNDIDAD_POZO - nivelAgua + 1)) {
                    System.out.println(PARED_CON_AGUA + SEPARADOR_ALTURA + nivel);
                } else if (nivel == posicionCaracol) {
                    System.out.println(PARED_CON_CARACOL + SEPARADOR_ALTURA + nivel);
                } else {
                    System.out.println(PARED_VACIA + SEPARADOR_ALTURA + nivel);
                }
            }

            System.out.println(BASE);

            dia++;

            if (dia <= 50 && posicionCaracol > 0) {
                saltarLinea.nextLine();
            }
        } while (dia <= 50 && posicionCaracol > 0);

        final String CaracolInanicion = "El caracol murió de inanición.";
        final String CaracolAhogo = "El caracol se ahogó.";
        final String CaracolSalio = "¡El caracol sobrevivió!";

        boolean isCaracolInanicion = dia >= 50;
        boolean isCaracolAhogo = posicionCaracol >= PROFUNDIDAD_POZO - nivelAgua;
        System.out.println(isCaracolAhogo ? CaracolAhogo : isCaracolInanicion ? CaracolInanicion : CaracolSalio);

        saltarLinea.close();

    }
}
