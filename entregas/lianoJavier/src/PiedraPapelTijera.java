
import java.util.Scanner;

class PiedraPapelTijera {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jugadaDelRobotRaw;
        jugadaDelRobotRaw = (int)(Math.random() * 3) + 1;

        boolean robotSeleccionoPiedra;
        boolean robotSeleccionoPapel;
        boolean robotSeleccionoTijeras;

        robotSeleccionoPiedra = jugadaDelRobotRaw == 1;
        robotSeleccionoPapel = jugadaDelRobotRaw == 2;
        robotSeleccionoTijeras = jugadaDelRobotRaw == 3;

        System.out.println("=========================================");
        System.out.println("Bienvenido al juego PIEDRA PAPEL O TIJERA");
        System.out.println("=========================================");
        System.out.println("Para Jugar debe seleccionar una de las siguientes opciones");
        System.out.println("");
        System.out.println("      /| ________________");
        System.out.println("O|===|* >________________>");
        System.out.println("      \\|");
        System.out.println("¿Con qué arma desea blandir esta pelea?");
        System.out.println("1: piedra");
        System.out.println("2: papel");
        System.out.println("3: tijeras");
        System.out.println("");

        int jugadaDelUsuarioRaw;

        jugadaDelUsuarioRaw = input.nextInt();

        boolean jugadorSeleccionoPiedra;
        boolean jugadorSeleccionoPapel;
        boolean jugadorSeleccionoTijeras;

        jugadorSeleccionoPiedra = jugadaDelUsuarioRaw == 1;
        jugadorSeleccionoPapel = jugadaDelUsuarioRaw == 2;
        jugadorSeleccionoTijeras = jugadaDelUsuarioRaw == 3;

        String resultado;

        resultado
                = jugadaDelUsuarioRaw == jugadaDelRobotRaw ? "¡EMPATE!" 
                : jugadorSeleccionoPiedra &&  robotSeleccionoPapel ? "¡Has perdido!" 
                : jugadorSeleccionoPiedra && robotSeleccionoTijeras ? "¡Has ganado!" 
                : jugadorSeleccionoPapel && robotSeleccionoPiedra ? "¡Has ganado!" 
                : jugadorSeleccionoPapel && robotSeleccionoTijeras ? "¡Has perdido!" 
                : jugadorSeleccionoTijeras && robotSeleccionoPiedra ? "¡Has perdido!" 
                : jugadorSeleccionoTijeras &&  robotSeleccionoPapel ? "¡Has ganado!" 
                : "Error: no has ingresado un número valido.";


        String jugadaDelRobot;

        jugadaDelRobot 
            = robotSeleccionoPapel ? "Robotin ha sacado papel."
            : robotSeleccionoTijeras ? "Robotin ha sacado tijeras."
            : robotSeleccionoPiedra ? "Robotin ha sacado piedra." 
            : "Error";

        boolean usuarioSeleccionoPapel;
        boolean usuarioSeleccionoTijeras;
        boolean usuarioSeleccionoPiedra;

        usuarioSeleccionoPapel = jugadaDelUsuarioRaw == 1;
        usuarioSeleccionoTijeras = jugadaDelUsuarioRaw == 2;
        usuarioSeleccionoPiedra = jugadaDelUsuarioRaw == 3;

        String jugadaDelUsuario;

        jugadaDelUsuario 
            = usuarioSeleccionoPapel ? "El usuario ha sacado papel."
            : usuarioSeleccionoTijeras ? "El usuario ha sacado tijeras."
            : usuarioSeleccionoPiedra ? "El usuario ha sacado piedra." 
            : "Error";

        System.out.println(jugadaDelRobot);
        System.out.println(jugadaDelUsuario);
        System.out.println(resultado);

        input.close();
    }
}