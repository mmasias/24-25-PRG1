import java.util.Scanner;

public class Caracol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputUsuario;

        final int PROFUNDIDAD = 20;
        final int PROFUNDIDAD_MIN = 10;
        final int MAX_SUBIDA = 4;
        final int MIN_SUBIDA = 1;
        final int MAX_BAJADA = 2;
        final int MIN_BAJADA = 0;
        final String POZO_BASE = "  ##################";
        final String POZO_TOPE = "####              ####";
        final String POZO_PARED = "  ##:. :. :. :. :.## _ __";
        final String POZO_AGUA = "  ##~~~~~~~~~~~~~~## _ __";
        final String POZO_CARACOL = "  ##    @)_/'     ## _ __";
        final String POZO_CON_COCHE = "  ##     O-=-O    ##";

        final double P_LLUVIA_FUERTE = 0.05;
        final double P_LLUVIA_DEBIL = 0.015;

        int profundidadAgua = 0;
        int profundidadCaracol = (int)(Math.random() * (PROFUNDIDAD - PROFUNDIDAD_MIN) + 1) + PROFUNDIDAD_MIN;;
        int subidaCaracol;
        int bajadaCaracol;
        int dia = 0;
        int aporteAgua;

        boolean esteVivo = true;
        boolean haSalido;

        System.out.println("El caracol se cae a  " + profundidadCaracol + " metros de profundidad");

        do {
            System.out.println("DIA: " + dia);
            dia++;

            double probabilidadLluvia = Math.random();

            if (probabilidadLluvia <= P_LLUVIA_FUERTE) {
                aporteAgua = 5;
            } else if (probabilidadLluvia <= P_LLUVIA_FUERTE + P_LLUVIA_DEBIL) {
                aporteAgua = 2;
            } else {
                aporteAgua = 0;
            }

            profundidadAgua += aporteAgua;

            bajadaCaracol = (int)(Math.random() * (MAX_BAJADA - MIN_BAJADA + 1)) + MIN_BAJADA;
            if (dia <= 10) {
                subidaCaracol = (int)(Math.random() * (MAX_SUBIDA -  MIN_SUBIDA + 1)) + MIN_SUBIDA;
            } else if (dia <= 20) {
                subidaCaracol = (int)(Math.random() * (3 -  MIN_SUBIDA + 1)) + MIN_SUBIDA;
            } else {
                subidaCaracol = (int)(Math.random() * (2 -  MIN_SUBIDA + 1)) + MIN_SUBIDA;
            }

            boolean aparcaCoche = Math.random() <= 0.35;

            profundidadCaracol = (profundidadCaracol - subidaCaracol + bajadaCaracol) + (aparcaCoche ? 2 : 0);

            if (profundidadCaracol <= PROFUNDIDAD - profundidadAgua) {

            }

            System.out.println("Subida diaria caracol: "  + subidaCaracol);
            System.out.println("Bajada diaria caracol: "  + bajadaCaracol);

            System.out.println(aparcaCoche ? POZO_CON_COCHE : POZO_TOPE);

            for (int i = 0; i <= PROFUNDIDAD; i++) {
                if (i == profundidadCaracol) {
                    System.out.println(POZO_CARACOL + i);
                }
                else if (i > PROFUNDIDAD - profundidadAgua) {
                    System.out.println(POZO_AGUA + i);
                } else {
                    System.out.println(POZO_PARED + i);
                }
            }
            System.out.println(POZO_BASE);

            inputUsuario = scanner.nextLine();
            
            haSalido = profundidadCaracol <= 0;

            if (profundidadCaracol > PROFUNDIDAD) {
                esteVivo = false;
                System.out.println("Causa de muerte: Ha alcanzado el mínimo");
            } else if (profundidadCaracol > PROFUNDIDAD - profundidadAgua) {
              esteVivo = false;
              System.out.println("Causa de muerte: Agua");
            } else if ((dia > 50) && (!haSalido)) {
                esteVivo = false;
                System.out.println("Causa de muerte: Hambre");
            }
        } while (!haSalido && esteVivo);

        if (!esteVivo) {
            System.out.println("El caracol ha muerto a -" + profundidadCaracol + " metros de profundidad.");
        } else {
            System.out.println("El caracol ha logrado salir del pozo después de " + dia + " días!");
        }

        scanner.close();
    }
}