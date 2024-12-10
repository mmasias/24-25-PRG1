public class JuegoDeLaHerradura {
    public static void main(String[] args) {

        int puntosTotalesArmand = 0;
        int puntosTotalesNaneh = 0;
        final int PUNTOS_SI_EMPATAN = 1;
        final int PUNTOS_MAXIMOS_POSIBLES = 50;
        int ronda = 0;
        boolean estanJugando = true;
        boolean empataron;

        while (estanJugando) {
            ronda += 1;
            System.out.println("-----------------------------------");
            System.out.println("Ronda n." + ronda);

            double tiradaDeArmand = Math.random();
            double tiradaDeNaneh = Math.random();

            int puntosRondaArmand = procesarTiradaArmand(tiradaDeArmand);
            int puntosRondaNaneh = procesarTiradaNaneh(tiradaDeNaneh);

            empataron = procesarEmpate(puntosRondaArmand, puntosRondaNaneh);
            if (empataron) {
                puntosRondaArmand = PUNTOS_SI_EMPATAN;
                puntosRondaNaneh = PUNTOS_SI_EMPATAN;
                System.out.println("EMPATE!");
            } else if (!empataron) {
                System.out.println("NO EMPATARON!");
            }

            puntosTotalesArmand = puntosTotalesArmand + puntosRondaArmand;
            puntosTotalesNaneh = puntosTotalesNaneh + puntosRondaNaneh;
            imprimirPuntos(puntosRondaArmand, puntosTotalesArmand, puntosRondaNaneh, puntosTotalesNaneh);

            if (puntosTotalesArmand >= PUNTOS_MAXIMOS_POSIBLES || puntosTotalesNaneh >= PUNTOS_MAXIMOS_POSIBLES) {
                estanJugando = false;
                System.out.println();
                System.out.println("---------- FINAL ----------");
                System.out.println("Puntos Totales Armand " + puntosTotalesArmand);
                System.out.println("Puntos Totales Naneh " + puntosTotalesNaneh);
            }
        }
    }

    private static int procesarTiradaArmand(double tiradaDeArmand) {
        int puntosArmand = 0;
        final double INTERBALO_INFERIOR_ACERTAR = 0;
        final double INTERBALO_SUPERIOR_ACERTAR = 0.1;
        final double INTERBALO_INFERIOR_CERCA = 0.1;
        final double INTERBALO_SUPERIOR_CERCA = 0.22;
        final double INTERBALO_INFERIOR_LEJOS = 0.22;
        final double INTERBALO_SUPERIOR_LEJOS = 1;

        if (tiradaDeArmand <= INTERBALO_SUPERIOR_ACERTAR && tiradaDeArmand >= INTERBALO_INFERIOR_ACERTAR) {
            System.out.println("Armand ACERTO!");
            puntosArmand = 5;
        } else if (tiradaDeArmand <= INTERBALO_SUPERIOR_CERCA && tiradaDeArmand > INTERBALO_INFERIOR_CERCA) {
            System.out.println("Armand estuvo CERCA!");
            puntosArmand = 3;
        } else if (tiradaDeArmand <= INTERBALO_SUPERIOR_LEJOS && tiradaDeArmand > INTERBALO_INFERIOR_LEJOS) {
            System.out.println("Armand estuvo LEJOS!");
            puntosArmand = 1;
        }
        return (puntosArmand);
    }

    private static int procesarTiradaNaneh(double tiradaDeNaneh) {
        int puntosNaneh = 0;
        final double INTERBALO_INFERIOR_ACERTAR = 0;
        final double INTERBALO_SUPERIOR_ACERTAR = 0.1;
        final double INTERBALO_INFERIOR_CERCA = 0.1;
        final double INTERBALO_SUPERIOR_CERCA = 0.22;
        final double INTERBALO_INFERIOR_LEJOS = 0.22;
        final double INTERBALO_SUPERIOR_LEJOS = 1;

        if (tiradaDeNaneh <= INTERBALO_SUPERIOR_ACERTAR && tiradaDeNaneh >= INTERBALO_INFERIOR_ACERTAR) {
            System.out.println("Naneh ACERTO!");
            puntosNaneh = 5;
        } else if (tiradaDeNaneh <= INTERBALO_SUPERIOR_CERCA && tiradaDeNaneh > INTERBALO_INFERIOR_CERCA) {
            System.out.println("Naneh estuvo CERCA!");
            puntosNaneh = 3;
        } else if (tiradaDeNaneh <= INTERBALO_SUPERIOR_LEJOS && tiradaDeNaneh > INTERBALO_INFERIOR_LEJOS) {
            System.out.println("Naneh estuvo LEJOS!");
            puntosNaneh = 1;
        }
        return (puntosNaneh);
    }

    private static boolean procesarEmpate(int puntosRondaArmand, int puntosRondaNaneh) {
        boolean empataron = false;
        if (puntosRondaArmand == puntosRondaNaneh) {
            empataron = true;
        }
        return empataron;
    }

    private static void imprimirPuntos(int puntosRondaArmand, int puntosTotalesArmand, int puntosRondaNaneh,
            int puntosTotalesNaneh) {
        System.out.println();
        System.out.println("Armand, esta ronda hizo [" + puntosRondaArmand + "] puntos");
        System.out.println("Naneh, esta ronda hizo [" + puntosRondaNaneh + "] puntos");
        System.out.println("Armand, lleva un total de [" + puntosTotalesArmand + "] puntos");
        System.out.println("Armand, lleva un total de [" + puntosTotalesNaneh + "] puntos");

    }

}
