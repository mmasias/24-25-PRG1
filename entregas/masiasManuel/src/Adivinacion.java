import java.util.Random;
import java.util.Scanner;

public class Adivinacion {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = random.nextInt(100) + 1;
        int intentosMaximos = 10;
        int intentosRealizados = 0;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("Piensa en un número entre 1 y 100. Tienes 10 oportunidades para adivinarlo.");

        while (intentosRealizados < intentosMaximos && !adivinado) {
            System.out.print("Introduce tu adivinanza (intento " + (intentosRealizados + 1) + " de " + intentosMaximos + "): ");
            int adivinanza = scanner.nextInt();
            intentosRealizados++;

            if (adivinanza == numeroSecreto) {
                adivinado = true;
                System.out.println("¡Felicidades! Has adivinado el número en el intento " + intentosRealizados + "!");
            } else if (adivinanza < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, no has adivinado el número. El número era: " + numeroSecreto);
        }

        scanner.close();
    }
}