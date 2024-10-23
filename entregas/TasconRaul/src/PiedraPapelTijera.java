import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Juguemos a Piedra, Papel o Tijera!");
        System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para Tijera");

        int eleccionJugador = scanner.nextInt();
        String jugador = convertirEleccion(eleccionJugador);
        System.out.println("Tu elección: " + jugador);
        
        int eleccionComputadora = random.nextInt(3) + 1;  
        String computadora = convertirEleccion(eleccionComputadora);
        System.out.println("Elección de la ordenador: " + computadora);

        if (eleccionJugador == eleccionComputadora) {
            System.out.println("Empate!");
        } else if ((eleccionJugador == 1 && eleccionComputadora == 3) ||  
                   (eleccionJugador == 2 && eleccionComputadora == 1) ||  
                   (eleccionJugador == 3 && eleccionComputadora == 2)) {  
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste.");
        }

        scanner.close();
    }

   
    public static String convertirEleccion(int eleccion) {
        switch (eleccion) {
            case 1: return "Piedra";
            case 2: return "Papel";
            case 3: return "Tijera";
            default: return "Opción inválida";
        }
    }
}
