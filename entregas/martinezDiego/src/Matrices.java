public class Matrices {
    public static void main(String[] args) {
        int[][] datos = {
            {12, 8, 4, 6, 2, 5, 9, 7, 2, 0},
            {1, 4, 7, 3, 2, 9, 4, 6, 5, 3},
            {6, 7, 1, 9, 4, 5, 2, 8, 3, 7},
            {9, 2, 3, 6, 1, 8, 3, 4, 6, 5},
            {7, 1, 8, 5, 4, 3, 5, 6, 9, 2},
            {3, 6, 2, 4, 7, 5, 3, 9, 3, 8},
            {1, 9, 6, 2, 6, 3, 7, 5, 4, 9},
            {2, 4, 7, 8, 9, 1, 5, 3, 2, 6},
            {5, 3, 4, 7, 6, 9, 1, 6, 2, 8},
            {9, 1, 8, 3, 1, 2, 6, 9, 4, 5},
        };

        mostrarMatriz(datos);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(traducirSimbolo(elemento) + " ");
            }
            System.out.println();
        }
        trazarSeparador(matriz[0].length);
    }

    public static String traducirSimbolo(int valor) {
        switch (valor) {
            case 0: return "   ";
            case 1: return "[#]";
            case 2: return " . ";
            case 3: return "~ ~";
            case 4: return "'''";
            case 5: return ":::";
            case 6: return ", '";
            case 7: return "/^\\";
            case 8: return "^Y^";
            case 9: return ":|:";
            default: return "???";
        }
    }

    public static void trazarSeparador(int longitud) {
        String separador = "";
        for (int i = 0; i < longitud * 4; i++) {
            separador += "-";
        }
        System.out.println(separador);
    }
}

