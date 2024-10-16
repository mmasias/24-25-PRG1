import java.util.Scanner;

public class JuegoCaracol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String inputUsuario;

        final String POZO_SUPERIOR = "[__]               [__]";
        final String POZO_CON_COCHE = "[__]     COCHE     [__]";
        final String POZO_PARED = "  []:. :. :. :. :.[] _ __  ";
        final String POZO_INFERIOR = "  [][][][][][][][][]";
        final String POZO_AGUA = "  []~~~~~~~~~~~~~~~~~~~[] _ __";
        final String POZO_CARACOL = "  []     _@)_/'   [] _ __";

        final int PROFUNDIDAD = 20;
        final int MAXIMA = 20;
        final int MINIMA = 10;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.15;

        System.out.println(POZO_SUPERIOR);

        double profundidadAgua = 0;
        int profundidadCaracol = (int) (Math.random() * MAXIMA - MINIMA + 1) + MINIMA;
        System.out.println("Al inicio el caracol cae a [" + profundidadCaracol + "] metros");

        int dia = 0;
        int caracolSube = 0;
        int caracolBaja = 0;

        do {
            dia++;

            double probabilidadLluvia = Math.random();
            double aporteAgua = probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE ? 5 
            : 
                                probabilidadLluvia <= PROBABILIDAD_LLUVIA_MEDIA ? 
                                2 : 0;

            profundidadAgua += aporteAgua;

            caracolSube = (int) (Math.random() * (4 - 1 + 1)) + 1;
            caracolBaja = (int) (Math.random() * (2 - 0 + 1));

            boolean aparcaCoche = Math.random() <= 0.35;

            profundidadCaracol = profundidadCaracol 
                                -caracolSube 
                                +caracolBaja +(aparcaCoche ? 2 : 0);

            System.out.println("Dia[" + dia + "] - Subio[]" + caracolSube + "] - Bajo[" + caracolBaja + "] - Posicion[" + profundidadCaracol + "]");
            System.out.println(aparcaCoche ? POZO_CON_COCHE : POZO_SUPERIOR);

            for (int i = 0; i <= PROFUNDIDAD; i++) {
                if (profundidadCaracol == i) {
                    System.out.println(POZO_CARACOL + 1);
                } else if (i > PROFUNDIDAD - profundidadAgua) {
                    System.out.println(POZO_AGUA + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }
            System.out.println(POZO_INFERIOR);
            inputUsuario = entrada.nextLine();

            haSalido = profundidadCaracol<=0;

        } while (!haSalido);

    }
}
