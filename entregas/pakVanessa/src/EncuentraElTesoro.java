import java.util.Scanner;

public class EncuentraElTesoro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tamanoTablero = 5;
        int tesoroX = (int) (Math.random() * tamanoTablero);
        int tesoroY = (int) (Math.random() * tamanoTablero);
        int intentosMaximos = 7;

        System.out.println("¡Bienvenido a Encuentra el Tesoro!");
        System.out.println("El tesoro está escondido en un tablero de " + tamanoTablero + "x" + tamanoTablero + ".");
        System.out.println("Debes adivinar las coordenadas. Tienes " + intentosMaximos + " intentos.\n");


        boolean encontrado = false;
        for (int intentos = 0; intentos < intentosMaximos; intentos++) {
            System.out.println("Intento " + (intentos + 1) + " de " + intentosMaximos);
            System.out.print("Ingresa la coordenada X (0-" + (tamanoTablero - 1) + "): ");
            int jugadorX = scanner.nextInt();
            System.out.print("Ingresa la coordenada Y (0-" + (tamanoTablero - 1) + "): ");
            int jugadorY = scanner.nextInt();

            if (jugadorX == tesoroX && jugadorY == tesoroY) {
                encontrado = true;
                System.out.println("\n¡Felicidades! Encontraste el tesoro en (" + tesoroX + ", " + tesoroY + ").");
                break;
            } else {
                System.out.println("No está en (" + jugadorX + ", " + jugadorY + "). Sigue buscando.");
                if (jugadorX < tesoroX) {
                    System.out.println("El tesoro está más al ESTE.");
                } else if (jugadorX > tesoroX) {
                    System.out.println("El tesoro está más al OESTE.");
                }
                if (jugadorY < tesoroY) {
                    System.out.println("El tesoro está más al SUR.");
                } else if (jugadorY > tesoroY) {
                    System.out.println("El tesoro está más al NORTE.");
                }
                System.out.println();
            }
        }

        if (!encontrado) {
            System.out.println("\nLo siento, te quedaste sin intentos. El tesoro estaba en (" + tesoroX + ", " + tesoroY + ").");
        }

        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }
}
