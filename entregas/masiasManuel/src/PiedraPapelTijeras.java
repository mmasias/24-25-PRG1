import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERA = 3;

        System.out.println("Juguemos a Piedra, Papel o Tijera!");
        System.out.println("Elige: " + PIEDRA + " para Piedra, " + PAPEL + " para Papel, " + TIJERA + " para Tijera");

        int jugador = scanner.nextInt();
        int ordenador = (int) (Math.random() * 3) + 1;

        String jugadorTexto;
        jugadorTexto = (jugador == PIEDRA) ? "Piedra" : (jugador == PAPEL) ? "Papel" : "Tijera";

        String ordenadorTexto;
        ordenadorTexto = (ordenador == PIEDRA) ? "Piedra" : (ordenador == PAPEL) ? "Papel" : "Tijera";

        System.out.println("Tu elección: " + jugadorTexto);
        System.out.println("Elección de la ordenador: " + ordenadorTexto);

        String resultado;
        resultado = (jugador == ordenador) ? "Empate!"
                : (jugador == PIEDRA && ordenador == TIJERA ||
                        jugador == PAPEL && ordenador == PIEDRA ||
                        jugador == TIJERA && ordenador == PAPEL) ? "¡Ganaste!" : "Perdiste.";

        System.out.println(resultado);

        scanner.close();
    }
}