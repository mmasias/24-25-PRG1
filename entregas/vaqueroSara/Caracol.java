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
        int profundidadAgua = 0;
        int profundidadCaracol = (int) ((Math.random() * (PROFUNDIDAD_MAXIMA - PROFUNDIDAD_MINIMA + 1)
                + PROFUNDIDAD_MINIMA));
        int dia = 0;
        int caracolSube;
        int caracolBaja;
        System.out.println("Al inicio el caracol cae a " + profundidadCaracol + " metros");
        int SUBIDA_MAXIMA = 4;
        int SUBIDA_MINIMA = 1;
        int BAJADA_MAXIMA = 2;
        int BAJADA_MINIMA = 0;

        do {

            System.out.println("DIA " + dia);

            caracolSube = (int) (Math.random() * (SUBIDA_MAXIMA - SUBIDA_MINIMA + 1) + SUBIDA_MINIMA);
            caracolBaja = (int) (Math.random() * (BAJADA_MAXIMA - BAJADA_MINIMA + 1) + BAJADA_MINIMA);
            boolean aparcaCoche = Math.random() <= 0.35;
            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia <= 0.05 ? 5
                    : probabilidadLluvia <= 0.1 ? 2 : 0;
            profundidadAgua = profundidadAgua + aporteAgua;
            profundidadCaracol = profundidadCaracol - caracolSube + caracolBaja + (aparcaCoche == true ? 2 : 0)
                    + aporteAgua;


            System.out.println("El caracol subió " + caracolSube + " metros y bajó " + caracolBaja + " metros.");
            if (probabilidadLluvia <= 0.05) {
                System.out.println("Ha llovido mucho. El caracol desciende 5 metros.");

            } else if (probabilidadLluvia <= 0.1) {
                System.out.println("Ha llovido un poco. El caracol desciende 2 metros.");

            } else {
                System.out.println("");
            }


            if (aparcaCoche == true) {
                System.out.println("La vibración que ha provocado el coche en el suelo ha desplazado al caracol 2 metros hacia abajo.");
                System.out.println("COCHE");

            } else {
                System.out.println("");
            }
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


            if (dia > 10) {
                SUBIDA_MAXIMA = 3;
            } else if (dia > 20) {
                SUBIDA_MAXIMA = 2;
            } else {
                System.out.println("");
            }


            String entrada = scanner.nextLine(); 

        } while (profundidadCaracol > 0 && dia < 50 && profundidadCaracol < (PROFUNDIDAD - profundidadAgua));
        String resultado = dia >= 50 || profundidadCaracol >= (PROFUNDIDAD - profundidadAgua ) ? "El caracol ha muerto. Fin de la partida."
                : ("El caracol salió del pozo. Gracias por jugar.");

        System.out.println(resultado);

        scanner.close();
    
    } 
}
