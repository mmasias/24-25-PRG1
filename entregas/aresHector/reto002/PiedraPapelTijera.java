import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       
        
        String[] opciones = {"Piedra", "Papel", "Tijera"};
       
        
        System.out.println("Elige una opción: ");
        System.out.println("0: Piedra");
        System.out.println("1: Papel");
        System.out.println("2: Tijera");
        int eleccionJugador = scanner.nextInt();
       
        
        if (eleccionJugador < 0 || eleccionJugador > 2) {
            System.out.println("Opción no válida");
            return;
        }
       
        
        int eleccionComputadora = random.nextInt(3);
        System.out.println("La computadora eligió: " + opciones[eleccionComputadora]);
       
        
        System.out.println("Tú elegiste: " + opciones[eleccionJugador]);
       
        
        if (eleccionJugador == eleccionComputadora) {
            System.out.println("Empate!");
        } else if ((eleccionJugador == 0 && eleccionComputadora == 2) || // Piedra gana a tijera
                   (eleccionJugador == 1 && eleccionComputadora == 0) || // Papel gana a piedra
                   (eleccionJugador == 2 && eleccionComputadora == 1)) { // Tijera gana a papel
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste :(");
        }
       
        scanner.close();
    }
}