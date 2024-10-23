
import java.util.Scanner;

class ppt {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroDeVictorias = 0;
        int numeroDePerdidas = 0;
        int jugada = 1;

        do {
            System.out.println("Elige entre: ");
            System.out.println("Piedra [0] | Papel [1] | Tijera [2]");
            int jugadaDelUsuario = entrada.nextInt();

            final int VALOR_MINIMO = 0;
            final int VALOR_MAXIMO = 2;
            int jugadaDelRobot = (int) (Math.random() * (VALOR_MAXIMO - VALOR_MINIMO + 1) + VALOR_MINIMO);

            boolean victoria;
            final int PIEDRA = 0;
            final int PAPEL = 1;
            final int TIJERA = 2;
            victoria = !(jugadaDelRobot == jugadaDelUsuario)
                    || (jugadaDelUsuario == PAPEL && jugadaDelRobot == PIEDRA)
                    || (jugadaDelUsuario == PIEDRA && jugadaDelRobot == TIJERA)
                    || (jugadaDelUsuario == TIJERA && jugadaDelRobot == PAPEL);

            if (victoria) {
                numeroDeVictorias++;
            } else {
                numeroDePerdidas++;
            }

            jugada++;

            String textoJugadaUsuario = jugadaDelUsuario == PAPEL ? "Papel"
                    : jugadaDelUsuario == PIEDRA ? "Piedra"
                            : "Tijera";

            String textoJugadaRobot = jugadaDelRobot == PAPEL ? "Papel"
                    : jugadaDelRobot == PIEDRA ? "Piedra"
                            : "Tijera";

            System.out.println("JUGADA: " + jugada);
            System.out.println("Elección del Jugador: " + textoJugadaUsuario);
            System.out.println("Elección del Robot: " + textoJugadaRobot);
            System.out.println(
                    "Victorias - [" + numeroDeVictorias + "] Derrotas - [" + numeroDePerdidas + "]");
            System.out.println("");

        } while (numeroDeVictorias < 2 || jugada < 3);

        entrada.close();
    }
}
