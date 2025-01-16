public class Herradura {
    public static void main(String[] args) {
        final double PROBABILIDAD_PRIMER_TRAMO = 0.1;
        final double PROBABILIDAD_SEGUNDO_TRAMO = 0.22;
        final double PROBABILIDAD_TERCER_TRAMO = 1;
        final int NUMERO_MAXIMO_PUNTOS = 50;
        final int PUNTOS_PRIMER_TRAMO = 5;
        final int PUNTOS_MAS_CERCANO = 3;
        final int PUNTOS_EMPATE = 1;

        int puntosNaneh = 0, puntosArmand = 0;
        double probabilidadNaneh, probabilidadArmand;

        do {
            probabilidadNaneh = Math.random();
            probabilidadArmand = Math.random();
            if ((probabilidadArmand <= PROBABILIDAD_PRIMER_TRAMO) && (probabilidadArmand <= PROBABILIDAD_PRIMER_TRAMO)) {
                puntosNaneh += PUNTOS_EMPATE;
                puntosArmand += PUNTOS_EMPATE;
            } else if (probabilidadArmand <= PROBABILIDAD_SEGUNDO_TRAMO) {
                puntos += PUNTOS_MAS_CERCANO;

        } while ((puntosArmand >= NUMERO_MAXIMO_PUNTOS) || (puntosNaneh >= NUMERO_MAXIMO_PUNTOS));
    }
}