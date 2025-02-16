public class Aspiradora {
    public static void main(String[] args) {
        
        int[][] superficie = new int[10][25];

        int[] posicion = { 5, 5 };

        for (int i = 0; i < superficie.length; i++) { // Recorre las filas
            for (int j = 0; j < superficie[i].length; j++) { // Recorre las columnas
                superficie[i][j] = (int) (Math.random() * 4); // Genera un número entre 0 y 3
            }
        }

        printMap(superficie, posicion);
        
    }

    static String parse(int valor) {
        final String[] TILES = {
                "-", // Zona limpia
                "...", // Zona sucia
                "000", // Zona más sucia
                "***", // Zona sucísima
                "[####]", // Sofá
                "^", // Gato
        };
        return (TILES[valor]);

    }

    static void printMap(int[][] map, int[] posicion) {
        final int HERO = 0;
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                if (row == posicion[0] && column == posicion[1]) {
                    System.out.print(parseAspiradora(HERO));
                } else {
                    System.out.print(parse(map[row][column]));
                }
            }
            System.out.println();
        }
    }

    static String parseAspiradora(int value) {
        final String[] CHARACTERS = new String[] {
                "(ø)"
        };

        return value < CHARACTERS.length ? CHARACTERS[value] : "???";
    }


}


