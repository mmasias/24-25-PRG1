import java.util.Scanner;

class MundoConSwitch {
    public static void main(String[] args) {
        int[][] miniMap = {
                { 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 },
                { 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 3, 3, 3, 3, 3, 3, 3, 3 },
                { 7, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 7, 3, 3, 3, 3 },
                { 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 2, 2, 3, 3 },
                { 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 7, 7, 2, 2, 3 },
                { 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 8, 7, 7, 2, 3 },
                { 5, 5, 5, 5, 5, 0, 2, 0, 5, 5, 5, 5, 5, 0, 0, 0, 2, 0, 0, 0, 0, 5, 7, 2, 2 },
                { 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 0, 0, 0, 2, 0, 0, 0, 0, 8, 7, 7, 2 },
                { 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 7, 7 },
                { 5, 0, 1, 1, 1, 0, 2, 0, 1, 1, 1, 0, 5, 8, 8, 8, 2, 8, 8, 8, 8, 5, 5, 7, 7 },
                { 5, 0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0, 5, 8, 6, 6, 2, 6, 6, 6, 5, 5, 5, 7, 7 },
                { 5, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 6, 6, 6, 2, 6, 5, 5, 5, 5, 5, 7, 7 },
                { 5, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 6, 6, 6, 2, 5, 5, 5, 8, 8, 8, 5, 7 },
                { 5, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 5, 6, 6, 5, 2, 5, 6, 6, 6, 8, 8, 5, 7 },
                { 5, 0, 1, 1, 9, 1, 1, 1, 9, 1, 1, 0, 5, 6, 5, 5, 2, 6, 6, 8, 8, 8, 8, 8, 7 },
                { 5, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 5, 5, 5, 6, 2, 6, 6, 6, 8, 1, 1, 1, 1 },
                { 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 4, 4, 6, 2, 2, 2, 2, 2, 9, 0, 0, 0 },
                { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 6, 6, 8, 8, 8, 8, 1, 0, 0, 0 },
                { 7, 7, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 6, 6, 8, 8, 8, 8, 1, 0, 5, 0 }
        };
        int[] posicion = { 5, 5 };
        boolean isPlaying = true;

        do {
            printMap(miniMap, posicion);
            isPlaying = getInput(posicion);
        } while (isPlaying);

    }

    static boolean getInput(int[] posicion) {
        
        String movement = "" + new Scanner(System.in).next().charAt(0);
        if (movement.equalsIgnoreCase("w")) posicion[0] = posicion[0] - 1;
        if (movement.equalsIgnoreCase("s")) posicion[0] = posicion[0] + 1;
        if (movement.equalsIgnoreCase("a")) posicion[1] = posicion[1] - 1;
        if (movement.equalsIgnoreCase("d")) posicion[1] = posicion[1] + 1;
        if (movement.equalsIgnoreCase("ñ")) return false;
        return true;
    }

    static void printMap(int[][] map, int[] posicion) {
        final int HERO = 0;
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                if (row == posicion[0] && column == posicion[1]) {
                    System.out.print(parseCharacter(HERO));
                } else {
                    System.out.print(parse(map[row][column]));
                }
            }
            System.out.println();
        }
    }

    static String parse(int value) {
        final String[] TILES = new String[] {
                "   ",
                "[#]",
                " · ",
                "~ ~",
                "'''",
                ":::",
                ", '",
                "/^\\",
                "^Y^",
                ":|:"
        };

        return value < TILES.length ? TILES[value] : "???";
    }

    static String parseCharacter(int value) {
        final String[] CHARACTERS = new String[] {
                "\\O/"
        };

        return value < CHARACTERS.length ? CHARACTERS[value] : "???";
    }

}