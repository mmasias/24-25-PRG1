<<<<<<< HEAD
import java.util.Scanner;

class unCaracolazo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String inputUsuario;

        final String POZO_SUPERIOR = "##             ## _ __";
        final String COCHE = "      COCHE      ";
        final String POZO_PARED = "## :. :. :. :. :.## _ __  ";
        final String POZO_INFERIOR = "## ## ## ## ## ## _ __";
        final String POZO_AGUA = "##~~~~~~~~~~~~~~~## _ __ ";
        final String CARACOL = "_0_/°?";

        final int PROFUNDIDAD = 20;
        final int MAXIMA = 20;
        final int MINIMA = 10;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.15;

        int profundidadAgua = 5;
        int profundidadCaracol = (int) (Math.random() * MAXIMA - MINIMA + 1) + MINIMA;
        boolean haSalido = profundidadCaracol <= 0;
        boolean estaVivo = true;
        System.out.println("Al inicio el caracol cae a [" + profundidadCaracol + "] metros");

        int dia = 0;
        int caracolSube = 0;
        int caracolBaja = 0;

        do {
            dia++;

            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE ? 5
                    : probabilidadLluvia <= PROBABILIDAD_LLUVIA_MEDIA ? 2 : 0;
            profundidadAgua = profundidadAgua + aporteAgua;

            caracolSube = (int) (Math.random() * (4 - 1 + 1) + 1);
            caracolBaja = (int) (Math.random() * (2 - 0 + 1) + 0);

            boolean aparcaCoche = Math.random() <= 0.35;

            profundidadCaracol = profundidadCaracol - caracolSube + caracolBaja + (aparcaCoche ? 2 : 0);

            System.out.println("Dia[" + dia + "] - Subio[" + caracolSube + "] - Bajo[" + caracolBaja + "] - Posición["
                    + profundidadCaracol + "]");

            System.out.println(aparcaCoche ? COCHE : POZO_SUPERIOR);

            for (int i = 0; i < PROFUNDIDAD; i++) {
                if (i == profundidadCaracol) {
                    System.out.println(CARACOL + 1);
                } else if (i > PROFUNDIDAD - profundidadAgua) {
                    System.out.println(POZO_AGUA + 1);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }

            System.out.println(POZO_INFERIOR);

        } while (profundidadCaracol > 0);

        System.out.println(POZO_SUPERIOR);
        for (int i = 0; i < PROFUNDIDAD; i++) {
            if (i == profundidadCaracol) {
                System.out.println(CARACOL + 1);
            } else if (i > PROFUNDIDAD - profundidadAgua) {
                System.out.println(POZO_AGUA + 1);
            } else {
                System.out.println(POZO_PARED + i);
            }
        }
        inputUsuario = entrada.nextLine();
        entrada.close();
        haSalido = profundidadCaracol <= 0;
        while (!haSalido && estaVivo)
            ;
        {

        }

    }
=======
import java.util.Scanner;

class unCaracolazo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String inputUsuario;

        final String POZO_SUPERIOR = "##             ## _ __";
        final String COCHE = "      COCHE      ";
        final String POZO_PARED = "## :. :. :. :. :.## _ __  ";
        final String POZO_INFERIOR = "## ## ## ## ## ## _ __";
        final String POZO_AGUA = "##~~~~~~~~~~~~~~~## _ __ ";
        final String CARACOL = "_0_/°?";

        final int PROFUNDIDAD = 20;
        final int MAXIMA = 20;
        final int MINIMA = 10;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.15;

        int profundidadAgua = 5;
        int profundidadCaracol = (int) (Math.random() * MAXIMA - MINIMA + 1) + MINIMA;
        boolean haSalido = profundidadCaracol <= 0;
        boolean estaVivo = true;
        System.out.println("Al inicio el caracol cae a [" + profundidadCaracol + "] metros");

        int dia = 0;
        int caracolSube = 0;
        int caracolBaja = 0;

        do {
            dia++;

            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE ? 5
                    : probabilidadLluvia <= PROBABILIDAD_LLUVIA_MEDIA ? 2 : 0;
            profundidadAgua = profundidadAgua + aporteAgua;

            caracolSube = (int) (Math.random() * (4 - 1 + 1) + 1);
            caracolBaja = (int) (Math.random() * (2 - 0 + 1) + 0);

            boolean aparcaCoche = Math.random() <= 0.35;

            profundidadCaracol = profundidadCaracol - caracolSube + caracolBaja + (aparcaCoche ? 2 : 0);

            System.out.println("Dia[" + dia + "] - Subio[" + caracolSube + "] - Bajo[" + caracolBaja + "] - Posición["
                    + profundidadCaracol + "]");

            System.out.println(aparcaCoche ? COCHE : POZO_SUPERIOR);

            for (int i = 0; i < PROFUNDIDAD; i++) {
                if (i == profundidadCaracol) {
                    System.out.println(CARACOL + 1);
                } else if (i > PROFUNDIDAD - profundidadAgua) {
                    System.out.println(POZO_AGUA + 1);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }

            System.out.println(POZO_INFERIOR);

        } while (profundidadCaracol > 0);

        System.out.println(POZO_SUPERIOR);
        for (int i = 0; i < PROFUNDIDAD; i++) {
            if (i == profundidadCaracol) {
                System.out.println(CARACOL + 1);
            } else if (i > PROFUNDIDAD - profundidadAgua) {
                System.out.println(POZO_AGUA + 1);
            } else {
                System.out.println(POZO_PARED + i);
            }
        }
        inputUsuario = entrada.nextLine();
        entrada.close();
        haSalido = profundidadCaracol <= 0;
        while (!haSalido && estaVivo)
            ;
        {

        }

    }
>>>>>>> ef3af5b9f99eb16f2a5aa142174ccf672f999fe9
}