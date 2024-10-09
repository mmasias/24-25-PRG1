
import java.util.Scanner;

class PiedraPapelTijera {

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                int jugadaDelRobotRaw;

                int MAXIMO;
                int MINIMO;
                
                MAXIMO = 3;
                MINIMO = 1;

                jugadaDelRobotRaw = (int) (Math.random() * MAXIMO - MINIMO + 1) - MINIMO;

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

                String jugadaDelUsuario;

                jugadaDelUsuario = jugadaDelUsuarioRaw == 1 ? "papel"
                                : jugadaDelUsuarioRaw == 2 ? "tijeras"
                                : jugadaDelUsuarioRaw == 3 ? "piedra"
                                : "Error: Elige un número entre 1 y 3.";

                boolean jugadorSeleccionoPiedra;
                boolean jugadorSeleccionoPapel;
                boolean jugadorSeleccionoTijeras;

                jugadorSeleccionoPiedra = jugadaDelUsuarioRaw == 1;
                jugadorSeleccionoPapel = jugadaDelUsuarioRaw == 2;     
                jugadorSeleccionoTijeras = jugadaDelUsuarioRaw == 3;

                String resultado;

                resultado = (jugadaDelRobotRaw == jugadaDelUsuarioRaw) ? "¡EMPATE!"
                        : (jugadorSeleccionoPiedra && robotSeleccionoTijeras) || (jugadorSeleccionoPapel && robotSeleccionoPiedra) || (jugadorSeleccionoTijeras && robotSeleccionoPapel) ? "\u001B[32m ¡Has ganado!"
                        : "\u001B[31m ¡Has perdido!";

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