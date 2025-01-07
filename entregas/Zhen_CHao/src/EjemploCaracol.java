import java.util.Scanner;

class EjemploCaracol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final String POZO_CON_COCHE = "[__]     COCHE     [__]";
        final String POZO_PARED = "[]:. :. :. :. :.[] __";
        final String POZO_AGUA =  "[]~~~~~~~~~~~~~~[] __";
        final String CARACOL =    "[]  __@_/¨      [] __";
        final int PROFUNDIDAD_MAXIMA = 20;
        final int PROFUNDIDAD_MINIMA = 10;

        int caracolBaja;
        int caracolSube;
        int profundidadAgua = 5;
        int profundidadCaracol = (int) (Math.random() * (PROFUNDIDAD_MAXIMA - PROFUNDIDAD_MINIMA + 1) + PROFUNDIDAD_MINIMA);
        int dia = 0;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA = 0.15;

        do {
            System.out.println("Dia: [" + dia + "]");
            boolean aparcaCoche = Math.random()<=0.35;
            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia <=0.05 ? 5 : probabilidadLluvia <=0.1 ? 2 : 0;
            profundidadAgua = profundidadAgua + aporteAgua;

            caracolSube = (int) (Math.random() * (4 - 1 + 1) + 1);
            caracolBaja = (int) (Math.random() * (2 - 0 + 1) + 0);

            System.out.println("El caracol sube [" + caracolSube + "] metros - baja [" + caracolBaja + "] metros - posicion [" + profundidadCaracol + "]");
            profundidadCaracol = profundidadCaracol - caracolSube + caracolBaja + (aparcaCoche?2:0);

            System.out.println("[__]               [__]");

            for (int i = 0; i <= PROFUNDIDAD_MAXIMA; i++) {
                if (profundidadCaracol == i) {
                    System.out.println(CARACOL + i);
                } else if (i > PROFUNDIDAD_MAXIMA - profundidadAgua) {
                    System.out.println(POZO_AGUA + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }
            dia++;
            System.out.println("[][][][][][][][]");
            String inputUsuario = entrada.nextLine();
            int haSalido = profundidadCaracol<=0;

        } while (!haSalido && esteVivo);

        entrada.close();
    }
}

