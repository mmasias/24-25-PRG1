package entregas.celayaIker.Reto002;
import java.util.Scanner;

class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ELEGIR_PIEDRA = 1;
        final int ELEGIR_PAPEL = 2;
        final int ELEGIR_TIJERA = 3;

        int numeroOrdenador = (int) (Math.random()*(3-1) + 1);
        int numeroUsuario;

        System.out.println("Juguemos a Piedra, Papel o Tijera!");
        System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para Tijera");
        numeroUsuario = scanner.nextInt();

        String eleccionUsuario;
        String eleccionOrdenador;

        eleccionUsuario = numeroUsuario == 1 ? "Piedra"
            : numeroUsuario == 2 ? "Papel"
            : "Tijera";

        eleccionOrdenador = numeroOrdenador == 1 ? "Piedra"
            : numeroOrdenador == 2 ? "Papel"
            : "Tijera";

        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("Elección del ordenador: " + eleccionOrdenador);

        String resultado;
        resultado = numeroOrdenador == numeroUsuario ? "Empate!"
            : numeroUsuario == ELEGIR_PIEDRA && numeroOrdenador == ELEGIR_TIJERA ||
                numeroUsuario == ELEGIR_PAPEL && numeroOrdenador == ELEGIR_PIEDRA ||
                numeroUsuario == ELEGIR_TIJERA && numeroOrdenador == ELEGIR_PAPEL ? "¡Ganaste!" : "Perdiste.";

        System.out.println(resultado);
        scanner.close();
    }
}