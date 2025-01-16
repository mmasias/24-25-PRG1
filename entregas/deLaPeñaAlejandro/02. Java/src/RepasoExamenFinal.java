// Escalas y acordes mayores.
class RepasoExamenFinal {
    public static String[] construirEscalaMayor(String[] notas, int indiceBase) {
        int[] patron = {2, 2, 1, 2, 2, 2, 1}; // TTSTTTS en semitonos
        String[] escala = new String[8];
        int indiceActual = indiceBase;

        for (int i = 0; i < escala.length; i++) {
            escala[i] = notas[indiceActual];
            if (i < patron.length) {
                indiceActual = (indiceActual + patron[i]) % notas.length;
            }
        }

        return escala;
    }

    // Método para construir el acorde mayor a partir de una escala mayor
    public static String[] construirAcordeMayor(String[] escala) {
        return new String[]{escala[0], escala[2], escala[4]};
    }
}    

