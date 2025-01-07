public class Herradura {
    public static void main(String[] args) {
        int puntosNaheh = 0;
        int puntosArmand = 0;
        boolean estanJugando = true;
        final int PUNTOS_MAXIMOS = 50;

        do {
            int juegoNaheh = juega();
            int juegoArmand = juega();
            if (juegoArmand == juegoNaheh) {
                puntosArmand = puntosArmand + 1;
                puntosNaheh = puntosNaheh + 1;
            } else {
                if (juegoArmand == 1) {
                    puntosArmand = puntosArmand + 5;
                } else if (juegoNaheh == 1) {
                    puntosNaheh = puntosNaheh + 5;
                } else if (juegoArmand > juegoNaheh) {
                    puntosArmand = puntosArmand + 3;
                } else {
                    puntosNaheh = puntosNaheh + 3;
                }
            }
        } while (estanJugando);
    }

    static int juega() {
        double valorDeJuego = Math.random();
        return valorDeJuego <= 0.1 ? 1 : valorDeJuego <= 0.22 ? 2 : 3;
    }
}
