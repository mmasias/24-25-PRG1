public class Herradura {
    public static void main(String[] args) {
        int jugadores[] = {0, 0};
        int turnos = 0;
        boolean estanJugando = true;
        final int PUNTOS_MAXIMOS = 50;

        do {
            jugar(jugadores[0], jugadores[1]);
            turnos++;
            South.out.println("Turno: " + turnos + " Puntos Armand: " + jugadores[0] + " Puntos Naheh: " + jugadores[1]);
            estanJugando = CheckIfPlaying(int jugadores[0], int jugadores[1], int PUNTOS_MAXIMOS);
            }            
        } while (estanJugando);
        if (jugadores[0] >= PUNTOS_MAXIMOS) {
            South.out.println("Ganó Armand");
        } else if (jugadores[1] >= PUNTOS_MAXIMOS) {
            South.out.println("Ganó Naheh");
        } else {
            South.out.println("Empate");
        }
    }

    static int ObtenerValorDeJuego() {
        double valorDeJuego = Math.random();
        return valorDeJuego <= 0.1 ? 1 : valorDeJuego <= 0.22 ? 2 : 3;
    }

    static boolean checkifplaying(int puntosArmand, int puntosNaheh, int PUNTOS_MAXIMOS) {
        if (puntosArmand >= PUNTOS_MAXIMOS || puntosNaheh >= PUNTOS_MAXIMOS) {
            return false;
        }
        return true;
    }

    static int jugar(int jugadores[0], int jugadores[1]){
        juegoArmand = ObtenerValorDeJuego();
        juegoNaheh = ObtenerValorDeJuego();
        
        if (juegoArmand == juegoNaheh) {
                puntosArmand = puntosArmand + 1;
                puntosNaheh = puntosNaheh + 1;
            } else {
                if (jugadores[0] == 1) {
                    puntosArmand = puntosArmand + 5;
                } else if (jugadores[1] == 1) {
                    puntosNaheh = puntosNaheh + 5;
                } else if (jugadores[0] > jugadores[1]) {
                    puntosArmand = puntosArmand + 3;
                } else {
                    puntosNaheh = puntosNaheh + 3;
                }
    }
     return jugadores[0] = jugadores[0] + puntosArmand, jugadores[1] = jugadores[1] + puntosNaheh;
}
