
import java.util.Scanner;

class pptls {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroDeVictorias = 0;
        int numeroDePerdidas = 0;
        int numeroDeEmpates = 0;
        int jugada = 1;

        do {
            System.out.println("Elige entre: ");
            System.out.println("Piedra [0] | Papel [1] | Tijera [2] | LAGARTO - [3] | SPOCK - [4]");
            int jugadaDelUsuario = entrada.nextInt();

            final int VALOR_MINIMO = 0;
            final int VALOR_MAXIMO = 4;
            int jugadaDelRobot = (int) (Math.random() * (VALOR_MAXIMO - VALOR_MINIMO + 1) + VALOR_MINIMO);

            boolean victoria;
            final int PIEDRA = 0;
            final int PAPEL = 1;
            final int TIJERA = 2;
            final int LAGARTO = 3;
            final int SPOCK = 4;
            victoria = (jugadaDelUsuario == PAPEL && jugadaDelRobot == PIEDRA)
                    || (jugadaDelUsuario == PAPEL && jugadaDelRobot == SPOCK)
                    || (jugadaDelUsuario == PIEDRA && jugadaDelRobot == TIJERA)
                    || (jugadaDelUsuario == PIEDRA && jugadaDelRobot == LAGARTO)
                    || (jugadaDelUsuario == TIJERA && jugadaDelRobot == PAPEL)
                    || (jugadaDelUsuario == TIJERA && jugadaDelRobot == LAGARTO)
                    || (jugadaDelUsuario == LAGARTO && jugadaDelRobot == PAPEL)
                    || (jugadaDelUsuario == LAGARTO && jugadaDelRobot == SPOCK)
                    || (jugadaDelUsuario == SPOCK && jugadaDelRobot == PIEDRA)
                    || (jugadaDelUsuario == SPOCK && jugadaDelRobot == TIJERA);

            boolean empate;
            empate = jugadaDelRobot == jugadaDelUsuario;

            if (victoria) {
                numeroDeVictorias++;
            } else if (empate) {
                numeroDeEmpates++;
            } else {
                numeroDePerdidas++;
            }

            jugada++;

            String textoJugadaUsuario = jugadaDelUsuario == PAPEL ? "Papel"
                    : jugadaDelUsuario == PIEDRA ? "Piedra"
                            : jugadaDelUsuario == TIJERA ? "Tijera"
                                    : jugadaDelUsuario == LAGARTO ? "Lagarto"
                                            : "Spock";

            String textoJugadaRobot = jugadaDelUsuario == PAPEL ? "Papel"
                    : jugadaDelUsuario == PIEDRA ? "Piedra"
                            : jugadaDelUsuario == TIJERA ? "Tijera"
                                    : jugadaDelUsuario == LAGARTO ? "Lagarto"
                                            : "Spock";

            System.out.println("JUGADA: " + jugada);
            System.out.println("Elección del Jugador: " + textoJugadaUsuario);
            System.out.println("Elección del Robot: " + textoJugadaRobot);

            if (victoria) {
                System.out.println("Has ganado!");
            }

            if (empate) {
                System.out.println("Habeis empatado!");
            }

            if (!(victoria || empate)) {
                System.out.println("Has perdido!");
            }

            System.out.println("Victorias - [" + numeroDeVictorias + "] "
                    + "Derrotas - [" + numeroDePerdidas + "] "
                    + "Empates - [" + numeroDeEmpates + "]");
            System.out.println("");

        } while (numeroDeVictorias < 2 || jugada < 3);

        entrada.close();
    }
}
