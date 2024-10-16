
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

        final int PROFUNDIDAD_POZO = 20;

        final int PROFUNDIDAD_MAXIMA_CARACOL = 10;
        final int PROFUNDIDAD_MINIMA_CARACOL = 20;

        final int PROFUNDIDAD_MAXIMA_SUBE_CARACOL = 4;
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

            boolean isCoche = Math.random() <= PROBABILIDAD_HAYA_COCHE;

            boolean islluviaFuerte = Math.random() <= PROBABILIDAD_LLUVIA_FUERTE;
            boolean islluviaMedia = Math.random() <= PROBABILIDAD_LLUVIA_MEDIA;

            System.out.println("---------------------");
            System.out.println("DÍA: " + dia);

            if (dia != 1) {

                int calculoSubeCaracol;
                calculoSubeCaracol = (int) ((Math.random()
                        * (PROFUNDIDAD_MAXIMA_SUBE_CARACOL - PROFUNDIDAD_MINIMA_SUBE_CARACOL + 1))
                        + PROFUNDIDAD_MINIMA_SUBE_CARACOL);

                int subeCaracol;
                subeCaracol = dia == 10 && calculoSubeCaracol > 3 ? 3
                        : dia == 20 && calculoSubeCaracol > 2 ? 2
                                : calculoSubeCaracol;

                int bajaCaracol;
                bajaCaracol = (int) ((Math.random()
                        * (PROFUNDIDAD_MAXIMA_BAJAR_CARACOL - PROFUNDIDAD_MINIMA_BAJAR_CARACOL + 1))
                        + PROFUNDIDAD_MINIMA_BAJAR_CARACOL);

                posicionCaracol = posicionCaracol
                        - subeCaracol
                        + bajaCaracol
                        + (isCoche ? DESCENSO_COCHE : 0);

                nivelAgua += (islluviaFuerte ? NIVEL_AGUA_LLUVIA_FUERTE : 0)
                        + (islluviaMedia ? NIVEL_AGUA_LLUVIA_MEDIA : 0);

                posicionCaracol = posicionCaracol < 0 ? 0 : posicionCaracol;

                System.out.println("posición del caracol [" + posicionCaracol + "] Caracol sube [" + subeCaracol
                        + "] Caracol baja [" + bajaCaracol + "] Nivel agua [" + nivelAgua + "]");
            } else {
                System.out.println("posición del caracol [" + posicionCaracol + "]");
            }

            if (isCoche) {
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

            if (dia <= 50 && posicionCaracol > 0 && posicionCaracol <= PROFUNDIDAD_POZO - nivelAgua) {
                saltarLinea.nextLine();
            }
        } while (dia <= 50 && posicionCaracol > 0 && posicionCaracol <= PROFUNDIDAD_POZO - nivelAgua);

        boolean isCaracolInanicion = dia >= 50;
        final String CaracolInanicion = "El caracol murió de inanición.";

        boolean isCaracolAhogo = posicionCaracol >= PROFUNDIDAD_POZO - nivelAgua;
        final String CaracolAhogo = "El caracol se ahogó.";

        final String CaracolSalio = "¡El caracol sobrevivió!";

        String resultado;
        if (isCaracolAhogo) {
            resultado = CaracolAhogo;
        } else if (isCaracolInanicion) {
            resultado = CaracolInanicion;
        } else {
            resultado = CaracolSalio;
        }

        System.out.println(resultado);
        saltarLinea.close();

    }
}
