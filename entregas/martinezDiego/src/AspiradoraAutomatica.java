
public class AspiradoraAutomatica {
    public static void main(String[] args) {

        int[][] mapa = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 3, 3, 0 },
                { 0, 0, 2, 0, 2, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 0, 0, 0, 0, 0, 0, 3, 0 },
                { 0, 0, 0, 0, 3, 0, 2, 2, 2, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        boolean aspirando = true;

        int aspiradoraX = 3;
        int aspiradoraY = 4;

        System.out.println("El programa avanza de forma automatica");

        while (aspirando) {

            final int MAXIMO = 4;
            final int MINIMO = 1;

            mapa[aspiradoraX][aspiradoraY] = 0;

            int movimientoAspiradora = (int) (Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);

            int nuevaX = aspiradoraX;
            int nuevaY = aspiradoraY;

            if (movimientoAspiradora == 1) {
                nuevaX = aspiradoraX + 1;
            }
            if (movimientoAspiradora == 2) {
                nuevaX = aspiradoraX - 1;
            }
            if (movimientoAspiradora == 3) {
                nuevaY = aspiradoraY - 1;
            }
            if (movimientoAspiradora == 4) {
                nuevaY = aspiradoraY + 1;
            }

            if (nuevaX >= 0 && nuevaX < mapa.length && nuevaY >= 0 && nuevaY < mapa[0].length) {
                aspiradoraX = nuevaX;
                aspiradoraY = nuevaY;
            }

            if (mapa[aspiradoraX][aspiradoraY] == 2) {
                mapa[aspiradoraX][aspiradoraY] = 0;
            }

            mapa[aspiradoraX][aspiradoraY] = 1;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("--------------------");
            System.out.println("--------------------");

            imprimirMapa(mapa);

            System.out.println("--------------------");
            System.out.println("--------------------");

        }

        
    }

    static void imprimirMapa(int[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                String simbolo = convertirSimbolo(mapa[i][j]);
                System.out.print(simbolo + " ");
            }
            System.out.println();
        }
    }

    static String convertirSimbolo(int valor) {
        switch (valor) {
            case 0:
                return ".";
            case 1:
                return "(0)";
            case 2:
                return "+";
            case 3:
                return "+";
            default:
                return "?";
        }
    }
}
