import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PIEDRA = 1, PAPEL = 2, TIJERA = 3;
        final int MINIMO = 1, MAXIMO = 3;

        System.out.println("Juguemos a Piedra, Papel o Tijera!");

        int jugador;
        System.out.println("Elige: " + PIEDRA + " para Piedra, " + PAPEL + " para Papel, " + TIJERA + " para Tijera");
        jugador = scanner.nextInt();
        
        int ordenador;
        ordenador = (int) (Math.random() * MAXIMO - MINIMO + 1) + MINIMO;

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