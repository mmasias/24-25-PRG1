package RetoClase_16_10;

import java.util.Scanner;

class Caracol2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String inputUsuario;

        final String POZO_SUPERIOR = "[__]              [__]";
        final String POZO_CON_COCHE = "[__]    O-=-O     [__]";
        final String POZO_PARED = "  []:. :. :. :. :.[] _ __ ";
        final String POZO_INFERIOR = "  [][][][][][][][][]";
        final String POZO_AGUA = "  []~~~~~~~~~~~~~~[] _ __ ";
        final String CARACOL = "  []    _@)_/’    [] _ __ ";

        final int PROFUNDIDAD = 20;
        final int MAXIMA = 20;
        final int MINIMA = 10;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.15;

        int dia = 0;
        int caracolSube = 0;
        int caracolBaja = 0;

        int profundidadAgua = 0;
        int profundidadCaracol = (int) ((Math.random() * (MAXIMA - MINIMA + 1)) + MINIMA);
        boolean haSalido = profundidadCaracol <= 0;
        boolean esteVivo = true;

        System.out.println("Al inicio el caracol cae a [" + profundidadCaracol + "] metros");

        do {
            dia++;

            double probabilidadLluvia = Math.random();
            int aporteAgua = 0;
            if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) {
                aporteAgua = 5;
                System.out.println("Lluvia fuerte, el nivel del agua aumenta 5 metros");
            } else if (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE + PROBABILIDAD_LLUVIA_MEDIA) {
                aporteAgua = 2;
                System.out.println("Lluvia media, el nivel del agua aumenta 2 metros");
            }

            profundidadAgua = profundidadAgua + aporteAgua;
            if (profundidadAgua > PROFUNDIDAD) {
                profundidadAgua = PROFUNDIDAD;
            }
            
            if (dia > 50) {
                esteVivo = false;
            } else if (dia > 20) {
                caracolSube = (int) (Math.random() * (2 - 1 + 1) + 1);
            } else if (dia > 10) {
                caracolSube = (int) (Math.random() * (3 - 1 + 1) + 1);
            } else {
                caracolSube = (int) (Math.random() * (4 - 1 + 1) + 1);
            }

            caracolBaja = (int) (Math.random() * (2 - 0 + 1) + 0);

            boolean aparcaCoche = Math.random() <= 0.35;

            profundidadCaracol = profundidadCaracol - caracolSube + caracolBaja + (aparcaCoche ? 2 : 0);

            if (profundidadCaracol > PROFUNDIDAD) {
                profundidadCaracol = PROFUNDIDAD;
            }

            if (profundidadCaracol < 0) {
                profundidadCaracol = 0;
                haSalido = true;
            }

            if (profundidadCaracol >= PROFUNDIDAD - profundidadAgua) {
                esteVivo = false;
            }

            System.out.println("Día [" + dia + "] - Sube: [" + caracolSube + "] - Baja: [" + caracolBaja
                    + "] - Posición: [" + profundidadCaracol + "]");

            System.out.println(aparcaCoche ? POZO_CON_COCHE : POZO_SUPERIOR);

            for (int i = 0; i <= PROFUNDIDAD; i++) {
                if (i == profundidadCaracol) {
                    System.out.println(CARACOL + i);
                } else if (i > PROFUNDIDAD - profundidadAgua) {
                    System.out.println(POZO_AGUA + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }

            System.out.println(POZO_INFERIOR);

            inputUsuario = entrada.nextLine();

        } while (!haSalido && esteVivo);

        if (haSalido) {
            System.out.println("¡El caracol ha logrado salir del pozo el día " + dia + "!");
        } else if (!esteVivo && dia <= 50) {
            System.out.println("El caracol murió ahogado el día " + dia + " a una profundidad de " + profundidadCaracol
                    + " por estar debajo del agua.");
        } else if (!esteVivo) {
            System.out.println("El caracol murió el día " + dia + " por inanición.");
        }
    }
}
