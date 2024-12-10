import java.util.Scanner;

public class RetoCaracol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final String POZO_CON_COCHE = "[_]     COCHE     [_]";
        final String POZO_PARED = "[]:. :. :. :. :.[] __";
        final String POZO_AGUA =  "[]~~~~~~[] __";
        final String CARACOL =    "[]  _@/¨      [] __";
        final int PROFUNDIDAD_MAXIMA = 20;
        final int PROFUNDIDAD_MINIMA = 10;

        int caracolBaja;
        int caracolSube;
        int profundidadAgua = 3;
        int profundidadCaracol = (int) (Math.random() * (PROFUNDIDAD_MAXIMA - PROFUNDIDAD_MINIMA + 1) + PROFUNDIDAD_MINIMA);
        int dia = 0;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.15;

        boolean haSalido = false;
        boolean esteVivo = true;
        String inputUsuario;

        do {
            System.out.println("Dia: [" + dia + "]");
            boolean aparcaCoche = Math.random() <= 0.35;
            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia <= 0.05 ? 5 : probabilidadLluvia <= 0.1 ? 2 : 0;
            profundidadAgua = profundidadAgua + aporteAgua;

            caracolSube = (int) (Math.random() * (4 - 1 + 1) + 1);
            caracolBaja = (int) (Math.random() * (2 - 0 + 1) + 0);

            System.out.println("El caracol sube [" + caracolSube + "] metros - baja [" + caracolBaja + "] metros - posicion [" + profundidadCaracol + "]");
            profundidadCaracol = profundidadCaracol - caracolSube + caracolBaja + (aparcaCoche ? 2 : 0);

            System.out.println("[_]               [_]");

            for (int i = 0; i <= PROFUNDIDAD_MAXIMA; i++) {
                if (profundidadCaracol == i) {
                    System.out.println(CARACOL + i);
                } else if (i > PROFUNDIDAD_MAXIMA - profundidadAgua) {
                    System.out.println(POZO_AGUA + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }

            if (profundidadCaracol >= PROFUNDIDAD_MAXIMA - profundidadAgua) {
                System.out.println("El caracol ha tocado el agua y ha perdido");
                esteVivo = false;
            }

            dia++;
            System.out.println("[][][][][][][][][]");

            if (esteVivo) {
                inputUsuario = entrada.nextLine();
            }

            haSalido = profundidadCaracol <= 0;

        } while (!haSalido && esteVivo);
        if (haSalido) {
            System.out.println("El caracol ha salido del pozo");
        }

        entrada.close();
    }
}
