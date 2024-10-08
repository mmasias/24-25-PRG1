import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int EleccionJugador;
        int aleatorio;
        int Comparacion;
        int Final;

        aleatorio = (int) (Math.random() * (3 - 1));

        System.out.println("Bienvenido a Piedra, Papel o Tijera");
        System.out.println("Para jugar tienes que jugar de la siguiente manera: 1 = Piedra, 2 = Papel y 3 = Tijera");
        System.out.print("Por favor introduce tu opcion favorita (1, 2 o 3): ");
        EleccionJugador = input.nextInt();

        String EleccionJugadorFinal = (EleccionJugador == 1) ? "Piedra" : (EleccionJugador == 2) ? "Papel" : "Tijera";

        String EleccionComputadora = (aleatorio == 1) ? "Piedra" : (aleatorio == 2) ? "Papel" : "Tijera";

        System.out.println("Tu elección: " + EleccionJugadorFinal);
        System.out.println("Elección de la computadora: " + EleccionComputadora);

        Comparacion = (EleccionJugador == aleatorio) ? 1 : 2;

        Final = (Comparacion == 1) ? "GANASTE PAPU" : (Comparacion == 2) ? "PERDISTE CAUSA" : "Empate manito";

        input.close();
    }
}
