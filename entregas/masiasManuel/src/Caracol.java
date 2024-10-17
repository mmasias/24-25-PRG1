import java.util.Scanner;

class Caracol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final String POZO_SUPERIOR = "[__]              [__]";
        final String POZO_CON_COCHE = "[__]    COCHE     [__]";
        final String POZO_PARED = "  []:. :. :. :. :.[] _ __ ";
        final String POZO_INFERIOR = "  [][][][][][][][][]";
        final String POZO_AGUA = "  []~~~~~~~~~~~~~~[] _ __ ";
        final String CARACOL = "  []    _@)_/’    [] _ __ ";

        final int PROFUNDIDAD = 20;
        final int MAXIMA = 20;
        final int MINIMA = 10;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final int CRECIDA_LLUVIA_FUERTE = 5;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.15;
        final int CRECIDA_LLUVIA_MEDIA = 2;

        final double PROBABILIDAD_APARCAMIENTO_COCHE = 0.35;
        final int CAIDA_POR_COCHE = 2;

        int dia = 0;
        int caracolSube = 0;
        int caracolBaja = 0;
        int velocidadMaximaSubidaCaracol = 4;
        final int VELOCIDAD_MINIMA_SUBIDA_CARACOL = 1;
        final int VELOCIDAD_MAXIMA_CAIDA_CARACOL = 2;
        final int VELOCIDAD_MINIMA_CAIDA_CARACOL = 0;

        int alturaAgua = 0;
        int profundidadCaracol = (int) ((Math.random() * (MAXIMA - MINIMA + 1)) + MINIMA);
        boolean haSalido = profundidadCaracol <= 0;
        boolean estaVivo = true;

        System.out.println("Al inicio el caracol cae a [" + profundidadCaracol + "] metros");

        do {
            dia++;

            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE ? CRECIDA_LLUVIA_FUERTE
                    : probabilidadLluvia <= PROBABILIDAD_LLUVIA_MEDIA ? CRECIDA_LLUVIA_MEDIA : 0;
            alturaAgua = alturaAgua + aporteAgua;

            velocidadMaximaSubidaCaracol = dia < 10 ? 4 : dia < 20 ? 3 : 2;
            estaVivo = dia <= 50;

            caracolSube = (int) (Math.random() * (velocidadMaximaSubidaCaracol - VELOCIDAD_MINIMA_SUBIDA_CARACOL + 1)
                    + VELOCIDAD_MINIMA_SUBIDA_CARACOL);
            caracolBaja = (int) (Math.random() * (VELOCIDAD_MAXIMA_CAIDA_CARACOL - VELOCIDAD_MINIMA_CAIDA_CARACOL + 1)
                    + VELOCIDAD_MINIMA_CAIDA_CARACOL);

            boolean aparcaCoche = Math.random() <= PROBABILIDAD_APARCAMIENTO_COCHE;

            profundidadCaracol = profundidadCaracol - caracolSube + caracolBaja + (aparcaCoche ? CAIDA_POR_COCHE : 0);

            profundidadCaracol = profundidadCaracol + alturaAgua > PROFUNDIDAD ? PROFUNDIDAD - alturaAgua
                    : profundidadCaracol;

            System.out.println("Dia[" + dia + "], " + (aporteAgua > 0 ? "Llueve" : "No llueve") + " - Subio["
                    + caracolSube + "] - Bajo[" + caracolBaja + "] - Posicion["
                    + profundidadCaracol + "] - Prof. agua:" + alturaAgua);
            System.out.println(aparcaCoche ? POZO_CON_COCHE : POZO_SUPERIOR);
            for (int i = 0; i <= PROFUNDIDAD; i++) {
                if (i == profundidadCaracol) {
                    System.out.println(CARACOL + i);
                } else if (i > PROFUNDIDAD - alturaAgua) {
                    System.out.println(POZO_AGUA + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }
            System.out.println(POZO_INFERIOR);

            haSalido = profundidadCaracol <= 0;
            String inputUsuario = entrada.nextLine();
        } while (!haSalido && estaVivo);

        System.out.println((!estaVivo ? "El caracol murió" : "El caracol salió el dia " + dia));
    }
}