
import java.util.Scanner;

class PiedraPapelTijera {

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                int jugadaDelRobotRaw;
                // jugadaDelRobotRaw = 1; // prueba1
                jugadaDelRobotRaw = (int) (Math.random() * 3) + 1;

                boolean robotSeleccionoPiedra;
                boolean robotSeleccionoPapel;
                boolean robotSeleccionoTijeras;

                robotSeleccionoPiedra = (jugadaDelRobotRaw == 1);
                robotSeleccionoPapel = (jugadaDelRobotRaw == 2);
                robotSeleccionoTijeras = (jugadaDelRobotRaw == 3);

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

                System.out.println("Por favor elija: ");
                jugadaDelUsuarioRaw = input.nextInt();

                boolean usuarioSeleccionoPapel;
                boolean usuarioSeleccionoTijeras;
                boolean usuarioSeleccionoPiedra;

                usuarioSeleccionoPiedra = jugadaDelUsuarioRaw == 1;
                usuarioSeleccionoPapel = jugadaDelUsuarioRaw == 2;
                usuarioSeleccionoTijeras = jugadaDelUsuarioRaw == 3;

                String jugadaDelUsuario;

                jugadaDelUsuario = usuarioSeleccionoPapel ? "papel"
                                : usuarioSeleccionoTijeras ? "tijeras"
                                : usuarioSeleccionoPiedra ? "piedra"
                                : "Error: Elige un número entre 1 y 3.";

                boolean jugadorSeleccionoPiedra;
                boolean jugadorSeleccionoPapel;
                boolean jugadorSeleccionoTijeras;

                jugadorSeleccionoPiedra = jugadaDelUsuarioRaw == 1;
                jugadorSeleccionoPapel = jugadaDelUsuarioRaw == 2;     
                jugadorSeleccionoTijeras = jugadaDelUsuarioRaw == 3;

                String resultado;

                resultado = (jugadaDelUsuarioRaw == jugadaDelRobotRaw) ? "¡EMPATE!"
                        : (jugadorSeleccionoPiedra && robotSeleccionoTijeras) || (jugadorSeleccionoPapel && robotSeleccionoPiedra) || (jugadorSeleccionoTijeras && robotSeleccionoPapel) ? "\u001B[32m ¡Has ganado!"
                        : (jugadorSeleccionoTijeras && robotSeleccionoPiedra) || (jugadorSeleccionoPiedra && robotSeleccionoPapel) || (jugadorSeleccionoPapel && robotSeleccionoTijeras) ? "\u001B[31m ¡Has perdido!"
                        : "Error: No has escojido una jugada valida";

                String jugadaDelRobot;

                jugadaDelRobot = robotSeleccionoPapel ? "papel"
                        : robotSeleccionoTijeras ? "tijeras"
                        : "piedra";

                System.out.println("");
                System.out.println("");
                System.out.println("Robotin ha sacado " + jugadaDelRobot + ".");
                System.out.println("");
                System.out.println("Has escogido " + jugadaDelUsuario + ".");
                System.out.println("");
                System.out.println(resultado);

                input.close();
        }
}