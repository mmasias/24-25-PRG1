import java.util.Scanner;

public class Caracol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PROFUNDIDAD = 20;
        final String POZO_BASE = "####################";
        final String POZO_TOPE = "#                  #";
        final String POZO_PARED = ":. :. :. :. :. :. .:";
        final String POZO_AGUA = "--------------------";
        final String POZO_CARACOL = ":.   _@)_/?       .:";
        int PROFUNDIDAD_MAXIMA = 20;
        int PROFUNDIDAD_MINIMA = 10;
        int profundidadAgua = 5;
        int profundidadCaracol = (int) ((Math.random() * (PROFUNDIDAD_MAXIMA - PROFUNDIDAD_MINIMA + 1) + PROFUNDIDAD_MINIMA));
        int dia = 0;
        int caracolSube = 0;
        int caracolBaja = 0;
        System.out.println("Al inicio el caracol cae a " + profundidadCaracol + " metros");

        do {
            System.out.println("DIA " + dia);
            caracolSube = (int) (Math.random() * (4 - 1 + 1) + 1);
            caracolBaja = (int) (Math.random() * (2 - 0 + 1) + 0);
            boolean aparcaCoche = Math.random() <= 0.35;
            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia <= 0.05 ? 5
                    : probabilidadLluvia <= 0.1 ? 2 : 0;
            profundidadAgua = profundidadAgua + aporteAgua;
            profundidadCaracol = profundidadCaracol - caracolSube + caracolBaja + (aparcaCoche ? 2 : 0);

            System.out.println("El caracol subió " + caracolSube + " metros y bajó " + caracolBaja + " metros.");
            System.out.println(POZO_TOPE);
            for (int i = 0; i <= PROFUNDIDAD; i++) {

                if (profundidadCaracol == i) {
                    System.out.println(POZO_CARACOL + i);
                } else if (i > PROFUNDIDAD - profundidadAgua) {
                    System.out.println(POZO_AGUA + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }

            }
            System.out.println(POZO_BASE);
            dia++;
            String entrada = scanner.nextLine();

        } while (profundidadCaracol > 0 && profundidadCaracol < 20 && dia < 50);
        String resultado = dia >= 50 || profundidadCaracol > 20 ? "El caracol murió. Fin de la partida."
                : ("El caracol salió del pozo. Gracias por jugar.");

        System.out.println(resultado);

        scanner.close();

    }
}
