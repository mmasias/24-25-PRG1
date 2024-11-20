import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = { "piedra", "papel", "tijera" };

        System.out.println("¡Bienvenido al juego de Piedra, Papel o Tijera!");
        System.out.println("Elige una opción: piedra, papel o tijera.");

        String jugadaUsuario = scanner.nextLine().toLowerCase();

        while (!jugadaUsuario.equals("piedra") && !jugadaUsuario.equals("papel") && !jugadaUsuario.equals("tijera")) {
            System.out.println("Opción no válida. Por favor elige: piedra, papel o tijera.");
            jugadaUsuario = scanner.nextLine().toLowerCase();
        }

        int jugadaComputadoraIndex = random.nextInt(3);
        String jugadaComputadora = opciones[jugadaComputadoraIndex];

        System.out.println("La computadora eligió: " + jugadaComputadora);

        if (jugadaUsuario.equals(jugadaComputadora)) {
            System.out.println("¡Es un empate!");
        } else if ((jugadaUsuario.equals("piedra") && jugadaComputadora.equals("tijera")) ||
                (jugadaUsuario.equals("papel") && jugadaComputadora.equals("piedra")) ||
                (jugadaUsuario.equals("tijera") && jugadaComputadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }

        scanner.close();
    }
}
