import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int continuar;

        do {
            int EleccionJugador;
            int aleatorio;
            String resultado;

            aleatorio = (int) (Math.random() * 3) + 1;

            System.out.println("Bienvenido a Piedra, Papel o Tijera");
            System.out.println("Para jugar tienes que jugar de la siguiente manera: 1 = Piedra, 2 = Papel y 3 = Tijera");

            while (true) {
                if (input.hasNextInt()) {
                    EleccionJugador = input.nextInt();

                    if (EleccionJugador < 1 || EleccionJugador > 3) {
                        System.out.println("Error: Debes introducir un número entre 1 y 3.");
                    } else {
                        break;
                    }
                 } else {
                    System.out.println("Error: Debes introducir un número entero.");
                    input.next();
                }
            }

            String EleccionJugadorFinal = (EleccionJugador == 1) ? "Piedra" : (EleccionJugador == 2) ? "Papel" : "Tijera";
            String EleccionComputadora = (aleatorio == 1) ? "Piedra" : (aleatorio == 2) ? "Papel" : "Tijera";

            System.out.println("Tu elección: " + EleccionJugadorFinal);
            System.out.println("Elección de la computadora: " + EleccionComputadora);

            resultado = (EleccionJugador == aleatorio) ? "¡Empate!" : 
                        (EleccionJugador == 1 && aleatorio == 3) || (EleccionJugador == 2 && aleatorio == 1) || (EleccionJugador == 3 && aleatorio == 2) 
                        ? "¡GANASTE!" 
                        : "¡PERDISTE!";

            System.out.println(resultado);

            System.out.print("Quieres jugar otra vez? (1 = Si / 2 = No): ");
            continuar = input.nextInt();
        } while (continuar == 1);
        System.out.println("¡Gracias por jugar!");
        input.close();
    }
}
