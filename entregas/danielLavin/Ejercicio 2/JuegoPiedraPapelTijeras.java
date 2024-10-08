import java.util.Scanner;
import java.util.Random;

public class JuegoPiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Juguemos a Piedra, Papel o Tijera!");
        System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para Tijera");

        int usuarioEleccion = sc.nextInt();

        int ordenadorEleccion = random.nextInt(3) + 1;

        if (usuarioEleccion == 1) {
            System.out.println("Tu elección: Piedra");
        } else if (usuarioEleccion == 2) {
            System.out.println("Tu elección: Papel");
        } else if (usuarioEleccion == 3) {
            System.out.println("Tu elección: Tijera");
        }

        if (ordenadorEleccion == 1) {
            System.out.println("Elección de la ordenador: Piedra");
        } else if (ordenadorEleccion == 2) {
            System.out.println("Elección de la ordenador: Papel");
        } else if (ordenadorEleccion == 3) {
            System.out.println("Elección de la ordenador: Tijera");
        }
        if (usuarioEleccion == ordenadorEleccion) {
            System.out.println("Empate!");
        } else if ((usuarioEleccion == 1 && ordenadorEleccion == 3) ||
                   (usuarioEleccion == 2 && ordenadorEleccion == 1) ||
                   (usuarioEleccion == 3 && ordenadorEleccion == 2)) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste.");
        }
    }
}
