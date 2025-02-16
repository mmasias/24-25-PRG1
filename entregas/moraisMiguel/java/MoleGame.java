import java.util.Scanner;

class MoleGame {
        public static void main(String[] args) {

                int turnos = 0;
                int puntos = 0;
                int moleSpawn = 0;

                Scanner input = new Scanner(System.in);

                while (turnos < 30) {

                        System.out.println(moleSpawn);

                        int[][] matriz = {
                                        { 4, 4, 4 },
                                        { 4, moleSpawn, 4 },
                                        { 4, 4, 4 }
                        };

                        for (int fila = 0; fila < matriz.length; fila++) {

                                for (int columna = 0; columna < matriz[fila].length; columna++)
                                        System.out.print(parse(matriz[fila][columna]));

                                System.out.println("|");
                        }

                        System.out.println("puntos: " + puntos);

                        int whack = input.nextInt();

                        if (moleSpawn == 1 && whack == 1) {
                                puntos++;
                                moleSpawn = 3;
                        }

                        if (moleSpawn == 0 && whack == 1)
                                moleSpawn = 2;

                        if (whack == 0)
                                moleSpawn = (int) (Math.random() * (2));

                        turnos++;
                }

                input.close();
        }

        static String parse(int valor) {
                final String[] TILES = { "(  )", "(‘’)", "[[]]", "[**]", "###" };
                return TILES[valor];
        }
}