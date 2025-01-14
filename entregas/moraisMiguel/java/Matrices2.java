import java.util.Scanner;

class Matrices2 {
        public static void main(String[] args) {

                int turnos = 0;
                int puntos = 0;
                int molespawn = 0;

                Scanner input = new Scanner(System.in);

                while (turnos < 11) {

                        System.out.println(molespawn);

                        int[][] matriz = {
                                        { 4, 4, 4 },
                                        { 4, molespawn, 4 },
                                        { 4, 4, 4 }
                        };

                        for (int fila = 0; fila < matriz.length; fila++) {

                                for (int columna = 0; columna < matriz[fila].length; columna++)
                                        System.out.print(parse(matriz[fila][columna]));

                                System.out.println("|");
                        }

                        System.out.println("puntos: " + puntos);

                        int whack = input.nextInt();

                        if (molespawn == 1 && whack == 1) {
                                puntos++;
                                molespawn = 3;
                        }

                        if (molespawn == 0 && whack == 1)
                                molespawn = 2;

                        if (whack == 0)
                                molespawn = (int) (Math.random() * (2));

                        turnos++;
                }

                input.close();
        }

        static String parse(int valor) {
                final String[] TILES = { "(  )", "(‘’)", "[[]]", "[**]", "###" };
                return TILES[valor];
        }
}
