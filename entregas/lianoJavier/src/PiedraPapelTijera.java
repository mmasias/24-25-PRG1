
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

                for (int ronda = 0; ronda < rondaMaxima; ronda++) {
                        do { 
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
                
                                String resultado;
                                
                                resultado = (jugadaDelRobotRaw == jugadaDelUsuarioRaw) ? "¡EMPATE!"
                                        : (jugadaDelUsuarioRaw == piedra && jugadaDelRobotRaw == tijeras
                                                || jugadaDelUsuarioRaw == papel && jugadaDelRobotRaw == piedra 
                                                || jugadaDelUsuarioRaw == tijeras && jugadaDelRobotRaw == papel) ? ("\u001B[32m ¡Has ganado! \u001B[0m")
                                        : ("\u001B[31m ¡Has perdido! \u001B[0m");
                
                                System.out.println("");
                                System.out.println(resultado);

                                if (resultado) {
                                        
                                }

                                String Ganador;

                                Ganador = ;
                        } while (!Ganador);
                }

                input.close();
        }
}