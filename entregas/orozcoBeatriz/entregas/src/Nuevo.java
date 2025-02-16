public class Nuevo {
    public static void main(String[] args) {
        int[][] mundo1 = {
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {3, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };

        int[] coeordenadasPersonaje = {5,5};

        imprimir(mundo1, coordenadasPersonaje);
    }

    static void imprimir(int[][] mundo, int[] personaje) {
        int maximaLongitud = getLongitudMaxima(mundo);
        final String BORDE = parsear(99);
        final String PERSONAJE = parsear(100);
        System.out.println(BORDE.repeat(maximaLongitud));
        for (int row = 0; row < mundo.length; row++) {
            for (int column = 0; column < mundo[row].length; column++) {
                System.out.println(parsear(mundo[row][column]));
            }
            System.out.println();
        }
        System.out.println(BORDE.repeat(maximaLongitud));
    }

    static String parsear(int unValor) {
        String valorParseado = "???";

        if (unValor == 0) valorParseado = "  ";
        if (unValor == 1) valorParseado = "[#]";
        if (unValor == 2) valorParseado = " . ";
        if (unValor == 3) valorParseado = "~ ~";
        if (unValor == 4) valorParseado = "'''";
        if (unValor == 5) valorParseado = ":::";
        if (unValor == 6) valorParseado = ", '";
        if (unValor == 7) valorParseado = "/^\\";
        if (unValor == 8) valorParseado = "^Y^";
        if (unValor == 9) valorParseado = ":|:";
        if (unValor == 99) valorParseado = "===";
        if (unValor == 100) valorParseado = "";

        return valorParseado;
    }

    static int getLongitudMaxima(int[][] matriz) {
        int longitud = 0;
        for (int row = 0; row < matriz.length; row++) {
            if (matriz[row].length > longitud) {
                longitud = matriz[row].length;
            }
        }
        return longitud;
    }
}