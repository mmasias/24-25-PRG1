package entregas.tasconRaul.RetoClase_23_10;

import java.util.Random;
import java.util.Scanner;

class CamellosExtendido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int casillaJugador = 0;
        int turnosPerdidosJugador = 0;
        int fallosJugador = 0;
        int turnos = 0;
        
        int casillaOrdenador = 0;
        
        final int LIMITE_TURNOS = 50;
        final int META = 60;
        
        boolean jugando = true;

        while (jugando && turnos < LIMITE_TURNOS) {
            turnos++;
            
            if (turnosPerdidosJugador > 0) {
                System.out.println("Turno " + turnos + " - El jugador pierde turno por tropiezo.");
                turnosPerdidosJugador--;
            } else {
                imprimirPista(casillaJugador, casillaOrdenador);

                System.out.println("Turno " + turnos);
                System.out.print("Elija un agujero (1-4): ");
                int eleccion = scanner.nextInt();
                
                int probabilidad = random.nextInt(100);
                boolean acierto = false;
                int avance = 0;

                switch (eleccion) {
                    case 1:
                        acierto = probabilidad < 60;
                        avance = acierto ? 1 : 0;
                        break;
                    case 2:
                        acierto = probabilidad < 40;
                        avance = acierto ? 2 : 0;
                        break;
                    case 3:
                        acierto = probabilidad < 30;
                        avance = acierto ? 4 : 0;
                        break;
                    case 4:
                        acierto = probabilidad < 10;
                        avance = acierto ? 6 : 0;
                        break;
                    default:
                        System.out.println("Opción no válida, pierde el turno.");
                        acierto = false;
                        avance = 0;
                        break;
                }

                if (random.nextInt(100) < 10) {
                    System.out.println("¡El camello tropieza! Pierdes 2 turnos.");
                    turnosPerdidosJugador = 2;
                    avance = 0;
                } else if (acierto) {
                    casillaJugador += avance;
                    System.out.println("¡Acierto! Avanzas " + avance + " casillas.");
                    fallosJugador = 0;
                } else {
                    System.out.println("Fallaste, no avanzas.");
                    fallosJugador++;
                }

                if (fallosJugador >= 3) {
                    System.out.println("¡Has fallado 3 veces consecutivas! Vuelves a la casilla 0.");
                    casillaJugador = 0;
                    fallosJugador = 0;
                }
            }

            int avanceOrdenador = random.nextInt(3) + 1;
            casillaOrdenador += avanceOrdenador;
            System.out.println("El ordenador avanza " + avanceOrdenador + " casillas.");

            if (casillaJugador >= META) {
                System.out.println("¡El jugador gana en el turno " + turnos + "!");
                jugando = false;
            } else if (casillaOrdenador >= META) {
                System.out.println("¡El ordenador gana en el turno " + turnos + "!");
                jugando = false;
            } else if (turnos == LIMITE_TURNOS) {
                System.out.println("El juego ha terminado después de " + LIMITE_TURNOS + " turnos.");
                jugando = false;
            }
        }

        scanner.close();
    }

    public static void imprimirPista(int casillaJugador, int casillaOrdenador) {
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
        System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

        System.out.print("[J]|");
        for (int i = 0; i < casillaJugador; i++) {
            System.out.print("  ");
        }
        System.out.println(";--;'");
        
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

        System.out.print("[O]|");
        for (int i = 0; i < casillaOrdenador; i++) {
            System.out.print("  ");
        }
        System.out.println(";--;'");
        
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
    }
}
