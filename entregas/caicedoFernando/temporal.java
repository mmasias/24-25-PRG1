import java.util.Scanner;

class Temporal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final String POZO_SUPERIOR = "[][][][]          [][][][]";
        final String POZO_PARED = "  [][]: .: .: .: .: .[][] _ __";
        final String POZO_INFERIOR = "[][][][][][][][][][][][][]";
        final String POZO_AGUA = "   [][]~~~~~~~~~~ [][]";
        final String CARACOL = "[][]     @/'          [][]  _ __";

        final int PROFUNDIDAD = 20;
        final int MAXIMA = 20;
        final int MINIMA = 10;

        int profundidadAgua = 5;
        int profundidadCaracol = (int) (Math.random() * (MAXIMA - MINIMA + 1)) + MINIMA;
        System.out.println("Al inicio, el caracol cae a (" + profundidadCaracol + " i metros)");

        int dia = 0;

        
        while (profundidadCaracol < PROFUNDIDAD) {
            dia++;
            int caracolSube = (int) (Math.random() * (4 - 1 + 1)) + 1; 
            int caracolBaja = (int) (Math.random() * (2 - 0 + 1)); 
            profundidadCaracol = profundidadCaracol - caracolSube + caracolBaja;


            if (profundidadCaracol < profundidadAgua) {
                profundidadCaracol = profundidadAgua;
            }

            System.out.println("Día [" + dia + "] - Subió [" + caracolSube + "] / Bajó [" + caracolBaja + "] - Posición [" + profundidadCaracol + " i metros]");
            System.out.println(POZO_SUPERIOR);

            for (int i = 0; i < PROFUNDIDAD; i++) {
                if (i == profundidadCaracol) {
                    System.out.println(CARACOL + " " + i);
                } else {
                    System.out.println(POZO_PARED);
                }
            }

            System.out.println(POZO_INFERIOR);
        }

        System.out.println("¡El caracol ha salido del pozo después de " + dia + " días!");
    }
}
