import java.util.Scanner;

class Caracol {
    public static void main(String[] args) {
        System.out.println("El caracol");

        Scanner entrada = new Scanner(System.in);
        String inputUsuario;

        final String POZO_CON_CARRO = "[__]  O-=-O   [__]";
        final String POZO_TOPE = "[__]          [__]";
        final String POZO_PARED = "[]:. :. :. :. :.[] _ __";
        final String POZO_CARACOL = "[]    _@)_/     [] _ __";
        final String POZO_AGUA = "[]~~~~~~~~~~~~~~[] _ __";
        final String POZO_BASE = "[][][][][][][][][]";

        final int PROFUNDIDAD = 20;
        final int MAXIMA = 20;
        final int MINIMA = 10;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.15;

        int dia = 0;
        int caracolSube;
        int caracolBaja;
        int profundidadAgua = 0;
        int profundidadCaracol = (int) ((Math.random() * (MAXIMA - MINIMA + 1)) + MINIMA);
        boolean haSalido = profundidadCaracol <= 0;
        boolean esteVivo = true;

        System.out.println("Al inicio el caracol cae a [" + profundidadCaracol + "] metros");

        while (!haSalido && esteVivo) {
            dia++;
            double probabilidadLluvia = Math.random();
            int aporteAgua = (probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE) ? 5 :
            (probabilidadLluvia <= PROBABILIDAD_LLUVIA_MEDIA) ? 2 : 0;
            profundidadAgua += aporteAgua;

            caracolSube = (int) (Math.random() * 4 + 1); 
            caracolBaja = (int) (Math.random() * 3);     

            boolean aparcaCoche = Math.random() <= 0.35; 

            profundidadCaracol = profundidadCaracol - caracolSube + caracolBaja + (aparcaCoche ? 2 : 0);

            System.out.println("Día [" + dia + "] - Subió [" + caracolSube + "] - Bajó [" + caracolBaja + "] - Posición [" + profundidadCaracol + "]");
            System.out.println(aparcaCoche ? POZO_CON_CARRO : POZO_TOPE);

            for (int i = 0; i <= PROFUNDIDAD; i++) {
                if (i == profundidadCaracol) {
                    System.out.println(POZO_CARACOL + " " + i);
                } else if (i > PROFUNDIDAD - profundidadAgua) {
                    System.out.println(POZO_AGUA + " " + i);
                } else {
                    System.out.println(POZO_PARED + " " + i);
                }
            }

            System.out.println(POZO_BASE);
            inputUsuario = entrada.nextLine();

            haSalido = profundidadCaracol <= 0;
        }

        entrada.close();
    }
}