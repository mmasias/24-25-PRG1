import java.util.Scanner;

class Temporal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String inputUsuario;

        final String POZO_SUPERIOR = "[]              [] _ __";
        final String POZO_CON_AUTO = "[]     Auto     [] _ __";
        final String POZO_PARED = "[]:. :. :. :. :.[] _ __";
        final String POZO_INFERIOR = "[][][][][][][][][][] _ __";
        final String POZO_AGUA = "~~~~~~~~~~~~ _ __";
        final String CARACOL = "[]    _@)_/'    [] _ __";

        final int PROFUNDIDAD = 20;
        final int MAXIMA = 20;
        final int MINIMA = 10;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.15;

        int dia = 0;
        int caracolSube = 0;
        int caracolBaja = 0;

        int profundidadAgua = 0;
        int profundidadCaracol = (int) (Math.random() * (MAXIMA - MINIMA + 1) + MINIMA);
        boolean haSalido = profundidadCaracol <= 0;
        boolean EstaVivo = dia <= 50;
        boolean bajoPorAuto = false;

        do {
            dia++;

            double probabilidadLluvia = Math.random();
            int aparteAgua = probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE ? 5:
                                probabilidadLluvia <= PROBABILIDAD_LLUVIA_MEDIA ? 2 : 0;
            profundidadAgua = profundidadAgua + aparteAgua;

            caracolSube = (int) (Math.random() * (4 - 1 + 1) + 1);
            caracolBaja = (int) (Math.random() * (2 - 1 + 1) + 1);
            boolean aparcarAuto = Math.random() <= 0.35;
            
            bajoPorAuto = aparcarAuto;

            profundidadCaracol = profundidadCaracol
                    - caracolSube
                    + caracolBaja
                    + (aparcarAuto ? 2 : 0);

            System.out.println("Dia[" + dia + "] - Subio[" + caracolSube + "] - Bajo[" + caracolBaja + "]"
            + (bajoPorAuto ? "[y 2 mas por el coche]" : "") + " - Posicion[" + profundidadCaracol + "]");
            System.out.println(aparcarAuto ? POZO_CON_AUTO : POZO_SUPERIOR);
            for (int i = 0; i < PROFUNDIDAD; i++) {
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
            haSalido = profundidadCaracol <= 0;

        } while (!haSalido && EstaVivo);
            if (haSalido) {
                System.out.println("Se acabo!");
            } else {
                System.out.println("Se murio :(");
            }
    }
}

