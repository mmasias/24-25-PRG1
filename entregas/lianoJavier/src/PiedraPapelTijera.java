
import java.util.Scanner;

class PiedraPapelTijera {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jugadaDelRobotRaw;

        int piedra;
        int papel;
        int tijeras;

        piedra = 1;
        papel = 2;
        tijeras = 3;

        System.out.println("=========================================");
        System.out.println("Bienvenido al juego PIEDRA PAPEL O TIJERA");
        System.out.println("=========================================");

        System.out.println("Para Jugar debe seleccionar una de las siguientes opciones");
        System.out.println("");
        System.out.println("      /| ________________");
        System.out.println("O|===|* >________________>");
        System.out.println("      \\|");

        int MAXIMO;
        int MINIMO;

        MAXIMO = 3;
        MINIMO = 1;

        int rondaMaxima;
        rondaMaxima = 3;

        int puntos;
        puntos = 0;

        for (int ronda = 0; ronda < rondaMaxima; ronda++) {
            while (puntos > -2 || puntos < 2) {
                jugadaDelRobotRaw = (int) (Math.random() * MAXIMO - MINIMO + 1) - MINIMO;

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

                String jugadaDelRobot;

                jugadaDelRobot = jugadaDelRobotRaw == papel ? "papel"
                        : jugadaDelRobotRaw == tijeras ? "tijeras"
                                : "piedra";

                System.out.println("");
                System.out.println("Robotin ha sacado " + jugadaDelRobot + ".");

                int puntosResultado;

                int puntosGano = 1;
                int puntosPerdio = -1;

                if (jugadaDelRobotRaw == jugadaDelUsuarioRaw) {
                    puntosResultado = 0;
                } else if (jugadaDelUsuarioRaw == piedra && jugadaDelRobotRaw == tijeras
                        || jugadaDelUsuarioRaw == papel && jugadaDelRobotRaw == piedra
                        || jugadaDelUsuarioRaw == tijeras && jugadaDelRobotRaw == papel) {
                    puntosResultado = puntosGano;
                } else {
                    puntosResultado = puntosPerdio;
                }

                puntos += puntosResultado;

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

            }
        }

        input.close();
    }
}
