import java.util.Random;
import java.util.Scanner;

public class Adivinanumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        int maxIntentos = 10; 
        
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He elegido un número entre 1 y 100. ¡Intenta adivinarlo!");
        System.out.println("Tienes un máximo de " + maxIntentos + " intentos.");

        for (int i = 1; i <= maxIntentos; i++) {
            System.out.print("Intento " + i + ": Introduce tu intento: ");
            intento = scanner.nextInt();

            if (intento < 1 || intento > 100) {
                System.out.println("Por favor, introduce un número entre 1 y 100.");
                i--;
                continue;
            }

            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número en el intento " + i + ".");
                break;
            }

          
            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }

            if (i == maxIntentos) {
                System.out.println("Lo siento, has agotado tus intentos. El número era: " + numeroSecreto);
            }
        }

        scanner.close();
    }
}

