package Reto_002;

import java.util.Random;
import java.util.Scanner;

public class PPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Vamos a jugar Piedra, Papel o Tijera!");
        System.out.println("Elige una opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");

        int usuario = scanner.nextInt();
        int ordenador = random.nextInt(3) + 1;

        String opcionUsuario = (usuario == 1) ? "Piedra" : (usuario == 2) ? "Papel" : "Tijera";
        String opcionOrdenador = (ordenador == 1) ? "Piedra" : (ordenador == 2) ? "Papel" : "Tijera";

        System.out.println("Usted eligió: " + opcionUsuario);
        System.out.println("El ordenador eligió: " + opcionOrdenador);

        String resultado = (usuario == ordenador) ? "¡Es un empate!" :
                         (usuario == 1 && ordenador == 3) ||
                         (usuario == 2 && ordenador == 1) ||
                         (usuario == 1 && ordenador == 2) ? "¡Ganaste!" : "¡Perdiste!";

        System.out.println(resultado);

        scanner.close();
    }
}
