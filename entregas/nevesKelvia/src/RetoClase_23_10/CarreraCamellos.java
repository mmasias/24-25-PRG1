package RetoClase_23_10;

import java.util.Random;
import java.util.Scanner;

class CarreraCamellos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int posicionJugador = 0;
        int posicionOrdenador = 0;
        int turnosPerdidos = 0;
        int fallosConsecutivos = 0;
        int turno = 0;
        int maxTurnos = 50;
        boolean enCarrera = true;
        boolean jugadorPierdeTurno = false;

        final String CAMELLO = ";--;'";
        final String PISTA = " ";
        final int META = 60;

        while (enCarrera && turno < maxTurnos) {
            if (jugadorPierdeTurno) {
                System.out.println("Jugador pierde este turno por tropiezo.");
                turnosPerdidos--;
                if (turnosPerdidos == 0) {
                    jugadorPierdeTurno = false;
                }
            } else {
                turno++;
                System.out.println("Turno " + turno);
                System.out.println("Jugador en la posición " + posicionJugador + ", Ordenador en la posición " + posicionOrdenador);
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
                System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("[J]|" + PISTA.repeat(posicionJugador) + CAMELLO);
                System.out.println("[O]|" + PISTA.repeat(posicionOrdenador) + CAMELLO);
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

                System.out.println("Elija un agujero (1-4): ");
                int agujero = entrada.nextInt();
                boolean acierto = false;
                int avance = 0;
                boolean agujeroValido = true;

                if (agujero == 1) {
                    acierto = random.nextInt(100) < 60;
                    avance = 1;
                } else if (agujero == 2) {
                    acierto = random.nextInt(100) < 40;
                    avance = 2;
                } else if (agujero == 3) {
                    acierto = random.nextInt(100) < 30;
                    avance = 4;
                } else if (agujero == 4) {
                    acierto = random.nextInt(100) < 10;
                    avance = 6;
                } else {
                    System.out.println("Agujero inválido. Intente de nuevo.");
                    agujeroValido = false; 
                }

                if (agujeroValido) {
                    if (acierto) {
                        posicionJugador += avance;
                        System.out.println("Acertaste y avanzas " + avance + " casillas. Estás en la casilla " + posicionJugador);
                        fallosConsecutivos = 0;
                    } else {
                        System.out.println("Fallaste, no avanzas.");
                        fallosConsecutivos++;
                        if (fallosConsecutivos == 3) {
                            System.out.println("Fallaste 3 veces seguidas. Vuelves a la casilla 0.");
                            posicionJugador = 0;
                            fallosConsecutivos = 0;
                        }
                    }
                    if (random.nextInt(100) < 10) {
                        System.out.println("El camello tropezó! Pierdes los próximos 2 turnos.");
                        jugadorPierdeTurno = true;
                        turnosPerdidos = 2;
                    }

                    if (posicionJugador == 15 || posicionJugador == 30 || posicionJugador == 45) {
                        System.out.println("Caíste en una trampa, vuelves a la casilla 0.");
                        posicionJugador = 0;
                    }

                    if (posicionJugador >= META) {
                        System.out.println("¡El jugador ha llegado a la meta en el turno " + turno + "!");
                        enCarrera = false;
                        continue;
                    }
                }
            }

            int avanceOrdenador = random.nextInt(3) + 1;
            posicionOrdenador += avanceOrdenador;
            System.out.println("El ordenador avanza " + avanceOrdenador + " casillas. Está en la casilla " + posicionOrdenador);

            if (posicionOrdenador >= META) {
                System.out.println("¡El ordenador ha llegado a la meta en el turno " + turno + "!");
                enCarrera = false;
            }

            if (turno == maxTurnos) {
                System.out.println("El máximo de turnos ha sido alcanzado. Fin del juego.");
            }
        }

        if (posicionJugador >= META) {
            System.out.println("El jugador gana la carrera.");
        } else if (posicionOrdenador >= META) {
            System.out.println("El ordenador gana la carrera.");
        } else {
            System.out.println("Se ha alcanzado el máximo de turnos. Fin del juego.");
        }

        entrada.close();
    }
}
