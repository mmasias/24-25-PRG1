
import java.util.Scanner;

class PiedraPapelTijera {

    public static int Random(final int MAXIMO, final int MINIMO) {
        return (int) (Math.random() * MAXIMO - MINIMO + 1) - MINIMO;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int piedra;
        piedra = 1;

        final int papel;
        papel = 2;

        final int tijeras;
        tijeras = 3;

        System.out.println("=========================================");
        System.out.println("Bienvenido al juego PIEDRA PAPEL O TIJERA");
        System.out.println("=========================================");

        System.out.println("Para Jugar debe seleccionar una de las siguientes opciones");
        System.out.println("");
        System.out.println("      /| ________________");
        System.out.println("O|===|* >________________>");
        System.out.println("      \\|");

        int ronda = 1;

        final int rondaMaxima;
        rondaMaxima = 3;

        int puntos;
        puntos = 0;

        int puntosMaximos;
        puntosMaximos = 2;

        int puntosMinimos;
        puntosMinimos = -2;

        boolean finalizarJuego;

        do {
            int MAXIMO;
            MAXIMO = 3;

            int MINIMO;
            MINIMO = 1;

            System.out.println("¿Con qué arma desea blandir " + (ronda == 0 ? "esta" : "la siguiente") + " pelea?");
            System.out.println(piedra + ": piedra");
            System.out.println(papel + ": papel");
            System.out.println(tijeras + ": tijeras");
            System.out.println("");

            int jugadaDelUsuarioRaw;

            System.out.println("Por favor elija: ");

            do {
                jugadaDelUsuarioRaw = input.nextInt();
            } while (!(jugadaDelUsuarioRaw >= MINIMO && jugadaDelUsuarioRaw <= MAXIMO));

            String jugadaDelUsuario;

            jugadaDelUsuario = jugadaDelUsuarioRaw == papel ? "papel"
                    : jugadaDelUsuarioRaw == tijeras ? "tijeras"
                            : "piedra";

            System.out.println("");
            System.out.println("Has escogido " + jugadaDelUsuario + ".");

            // int jugadaDelRobotRaw = Random(MAXIMO, MINIMO);
            int jugadaDelRobotRaw = 1;

            String jugadaDelRobot;

            jugadaDelRobot
                    = jugadaDelRobotRaw == papel ? "papel"
                            : jugadaDelRobotRaw == tijeras ? "tijeras"
                                    : "piedra";

            System.out.println("");
            System.out.println("Robotin ha sacado " + jugadaDelRobot + ".");

            final int puntosEmpate = 0;
            final int puntosGano = 1;
            final int puntosPerdio = -1;

            boolean Empatan;
            Empatan = jugadaDelRobotRaw == jugadaDelUsuarioRaw;

            boolean GanaUsuario;
            GanaUsuario
                    = jugadaDelUsuarioRaw == piedra && jugadaDelRobotRaw == tijeras
                    || jugadaDelUsuarioRaw == papel && jugadaDelRobotRaw == piedra
                    || jugadaDelUsuarioRaw == tijeras && jugadaDelRobotRaw == papel;

            if (Empatan) {
                puntos += puntosEmpate;
            } else if (GanaUsuario) {
                puntos += puntosGano;
            } else {
                puntos += puntosPerdio;
            }

            String textoResultado;

            String textoEmpate = "¡EMPATE!";
            String textoGano = "\u001B[32m ¡Has ganado! \u001B[0m";
            String textoPerdio = "\u001B[31m ¡Has perdido! \u001B[0m";

            if (jugadaDelRobotRaw == jugadaDelUsuarioRaw) {
                textoResultado = textoEmpate;
            } else if (jugadaDelUsuarioRaw == piedra && jugadaDelRobotRaw == tijeras
                    || jugadaDelUsuarioRaw == papel && jugadaDelRobotRaw == piedra
                    || jugadaDelUsuarioRaw == tijeras && jugadaDelRobotRaw == papel) {
                textoResultado = textoGano;
            } else {
                textoResultado = textoPerdio;
            }

            System.out.println("");
            System.out.println(textoResultado);

            ronda++;

            finalizarJuego = !(ronda > rondaMaxima) && !(puntos <= puntosMinimos || puntos >= puntosMaximos);

        } while (finalizarJuego);

        input.close();
    }
}
