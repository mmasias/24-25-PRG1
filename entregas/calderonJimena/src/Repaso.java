import java.util.Scanner;

class Repaso {
    public static void main(String[] args) {
        int[][] reglas = {
                { 0, -1, 1 },
                { 1, 0, -1 },
                { -1, 1, 0 }
        };

        String[] matrizResultado = { "Pierde", "Gana", "Empate" };

        String[] piezas = { "Piedra", "Papel", "Tijeras" };

        int miJugada = pedirPieza(piezas);
        System.out.println(piezas[miJugada]);

        int jugadaDelOrdenador = jugarOrdenador(piezas);
        System.out.println(piezas[jugadaDelOrdenador]);

        int resultado = reglas[miJugada][jugadaDelOrdenador];
        System.out.println(matrizResultado[resultado + 1]);

    }

    static int jugarOrdenador(String[] piezas) {
        System.out.println(piezas.length - 1);
        return (int) (Math.random() * piezas.length);
    }

    static int pedirPieza(String[] piezas) {
        for (int i = 0; i < piezas.length; i++) {
            System.out.println(i + ": " + piezas[i] + "| ");
        }
        return new Scanner(System.in).nextInt();
    }

}
