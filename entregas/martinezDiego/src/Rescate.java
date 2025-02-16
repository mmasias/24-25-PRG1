import java.util.Scanner;

public class Rescate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mapa = { 
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 }
        };
        System.out.println("Bienvenido a Rescate, este es el mapa");

        
        boolean soldadosRescatados = false;
        int turno = 0;
        int numeroSoldadosRescatados = 0;
        

        while (turno <= 12 || !soldadosRescatados) {

            int posicionSoldado1X = (int) ((Math.random() * 7));
            int posicionSoldado1Y = (int) ((Math.random() * 7));
            mapa[posicionSoldado1X][posicionSoldado1Y] = 2;

            int posicionSoldado2X = (int) ((Math.random() * 7));
            int posicionSoldado2Y = (int) ((Math.random() * 7));
            mapa[posicionSoldado2X][posicionSoldado2Y] = 2;

            int posicionSoldado3X = (int) ((Math.random() * 7));
            int posicionSoldado3Y = (int) ((Math.random() * 7));
            mapa[posicionSoldado3X][posicionSoldado3Y] = 2;

            int posicionSoldado4X = (int) ((Math.random() * 7));
            int posicionSoldado4Y = (int) ((Math.random() * 7));
            mapa[posicionSoldado4X][posicionSoldado4Y] = 2;

            turno++;
            System.out.println("Turno " + turno);
            System.out.println("introduce las coordenadas ");
            imprimirMapa(mapa);

            System.out.println("introduce la fila (de 0 a 7)");
            int x = scanner.nextInt();
            System.out.println("introduce la columna (de 0 a 7)");
            int y = scanner.nextInt();

            if (x == posicionSoldado1X && y == posicionSoldado1Y) {
                System.out.println("Has encontrado a un soldado");
                mapa[posicionSoldado1X][posicionSoldado1Y] = 3;
                numeroSoldadosRescatados++;
            } else
                System.out.println(" ahi no habia ningun soldado");
            mapa[x][y] = 1;

            if (x == posicionSoldado2X && y == posicionSoldado2Y) {
                System.out.println("Has encontrado a un soldado");
                mapa[posicionSoldado2X][posicionSoldado2Y] = 3;
                numeroSoldadosRescatados++;
            } else
                System.out.println(" ahi no habia ningun soldado");
            mapa[x][y] = 1;

            if (x == posicionSoldado3X && y == posicionSoldado3Y) {
                System.out.println("Has encontrado a un soldado");
                mapa[posicionSoldado3X][posicionSoldado3Y] = 3;
                numeroSoldadosRescatados++;
            } else
                System.out.println(" ahi no habia ningun soldado");
            mapa[x][y] = 1;

            if (x == posicionSoldado4X && y == posicionSoldado4Y) {
                System.out.println("Has encontrado a un soldado");
                mapa[posicionSoldado4X][posicionSoldado4Y] = 3;
                numeroSoldadosRescatados++;
            } else
                System.out.println(" ahi no habia ningun soldado");
            mapa[x][y] = 1;


            if(numeroSoldadosRescatados == 4){
                soldadosRescatados = true;
            }
        }

        scanner.close();

    } 
    

    static void imprimirMapa(int[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                String simbolo = convertirAString(mapa[i][j]);
                System.out.print(simbolo + " ");
            }
            System.out.println();

        }

    }

    static String convertirAString(int valor) {
        switch (valor) {
            case 0:
                return ".";
            case 1:
                return "~";
            case 2:
                return ".";
            case 3:
                return "R";

            default:
                return "?";
        }

    }
}
