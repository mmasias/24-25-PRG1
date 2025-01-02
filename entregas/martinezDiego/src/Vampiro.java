import java.util.Scanner;

public class Vampiro {

    public static void main(String[] args) {

        double vidaVampiro = 10;
        double vidaHeroe = 20;
        final double ARMA_1_HEROE = 7;
        final double PROBABILIDAD_ARMA_1_HEROE = 0.5;
        final double ARMA_2_HEROE = 15;
        final double PROBABILIDAD_ARMA_2_HEROE = 0.25;
        final double ARMA_3_HEROE = 30;
        final double PROBABILIDAD_ARMA_3_HEROE = 0.12;
        final double ARMA_1_VAMPIRO = 5;
        final double PROBABILIDAD_ARMA_1_VAMPIRO = 0.9;
        final double ARMA_2_VAMPIRO = 10;
        final double PROBABILIDAD_ARMA_2_VAMPIRO = 0.6;
        final double ARMA_3_VAMPIRO = 20;
        final double PROBABILIDAD_ARMA_3_VAMPIRO = 0.4;

        Scanner entrada = new Scanner(System.in);

        boolean heroeVivo = true;
        boolean vampiroVivo = true;

        
        int turno = 0;
        System.out.println(" Eres el heroe, los controles para las armas son 1,2,3");
        while (heroeVivo && vampiroVivo) {
            System.out.println("pulsa enter para avanzar el turno");
            entrada.nextLine();

            turno ++;
            System.out.println("------------------");
            System.out.println("------------------");
            System.out.println( " TURNO: " +  turno);
            System.out.println("------------------");
            System.out.println("------------------");

            System.out.println(" turno del heroe, elige arma");
            
            int eleccionJugador = entrada.nextInt();

            double aciertoHeroe = Math.random();
            while (eleccionJugador < 1 || eleccionJugador > 3) {
                System.out.println("Elección inválida. Por favor, elige 1, 2 o 3:");
                eleccionJugador = entrada.nextInt(); 
            }

            if (eleccionJugador == 1 && aciertoHeroe <= PROBABILIDAD_ARMA_1_HEROE) {
                System.out.println("has acertado con la arma 1");
                vidaVampiro = vidaVampiro - ARMA_1_HEROE;
                System.out.println("vida heroe " + vidaHeroe + " vida vampiro " + vidaVampiro);

            } else if (eleccionJugador == 2 && aciertoHeroe <= PROBABILIDAD_ARMA_2_HEROE) {
                System.out.println("has acertado con la arma 2");
                vidaVampiro = vidaVampiro - ARMA_2_HEROE;
                System.out.println("vida heroe " + vidaHeroe + " vida vampiro " + vidaVampiro);

            } else if (eleccionJugador == 3 && aciertoHeroe <= PROBABILIDAD_ARMA_3_HEROE) {
                System.out.println("has acertado con la arma 3");
                vidaVampiro = vidaVampiro - ARMA_3_HEROE;
                System.out.println("vida heroe " + vidaHeroe + " vida vampiro " + vidaVampiro);

            } else
                System.out.println("has fallado el ataque");

            System.out.println(" turno del vampiro");
            double aciertoVampiro = Math.random();
            if (aciertoVampiro <= PROBABILIDAD_ARMA_1_VAMPIRO) {
                System.out.println("el vampiro ha acertado con el arma 1");
                vidaHeroe = vidaHeroe - ARMA_1_VAMPIRO;
                System.out.println("vida heroe " + vidaHeroe + " vida vampiro " + vidaVampiro);

            } else if (aciertoVampiro <= PROBABILIDAD_ARMA_2_VAMPIRO) {
                System.out.println("el vampiro ha acertado con el arma 2");
                vidaHeroe = vidaHeroe - ARMA_2_VAMPIRO;
                System.out.println("vida heroe " + vidaHeroe + " vida vampiro " + vidaVampiro);

            } else if (aciertoVampiro <= PROBABILIDAD_ARMA_3_VAMPIRO) {
                System.out.println("el vampiro ha acertado con el arma 3");
                vidaHeroe = vidaHeroe - ARMA_3_VAMPIRO;
                System.out.println("vida heroe " + vidaHeroe + " vida vampiro " + vidaVampiro);

            } else
                System.out.println("el vampiro ha fallado el ataque");

            if (vidaHeroe <= 0) {
                heroeVivo = false;
                System.out.println("el vampiro ha ganado");
            }
            if (vidaVampiro <= 0) {
                vampiroVivo = false;
                System.out.println("el HEROE ha ganado");
            }

        }
        entrada.close();

    }

}