public class Herradura {
    public static void main(String[] args) {
        int jugadores[] = {0, 0};
        int turnos = 0;
        boolean estanJugando = true;
        final int PUNTOS_MAXIMOS = 50;

        do {
            turnos++;
            jugar(jugadores);
            System.out.println("Turno: " + turnos + " Puntos Armand: " + jugadores[0] + " Puntos Naheh: " + jugadores[1]);
            estanJugando = CheckIfPlaying(int jugadores[0], int jugadores[1], int PUNTOS_MAXIMOS);
        } while (estanJugando);

        String resultado = "Empate";
        if (jugadores[0] >= PUNTOS_MAXIMOS) {
            resultado = "Ganó Armand";
        } else if (jugadores[1] >= PUNTOS_MAXIMOS) {
            resultado = "Ganó Naheh";
        }
        System.out.println(resultado);
        
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

    static int jugar(int[] jugadores){
        final int NANEH = 0;
        final int ARMAND = 1;
        final int ACIERTO = 5, GANO = 3, EMPATE = 1;
        juegoArmand = ObtenerValorDeJuego();
        juegoNaheh = ObtenerValorDeJuego();
        
        if (juegoArmand == juegoNaheh) {
                jugadores[ARMAND] = jugadores[ARMAND] + EMPATE;
                jugadores[NANEH] = jugadores[NANEH] + EMPATE;
            } else {
                if (juegoNaheh == 1) {
                    jugadores[NANEH] = jugadores[NANEH] + ACIERTO;
                } else if (juegoArmand == 1) {
                    jugadores[ARMAND] = jugadores[ARMAND] + ACIERTO;
                } else if (juegoNaheh > juegoArmand) {
                    jugadores[ARMAND] = jugadores[ARMAND] + GANO;
                } else {
                    jugadores[NANEH] = jugadores[NANEH] + GANO;
                }
    }
     
}
}