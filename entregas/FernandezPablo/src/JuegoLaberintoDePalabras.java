import java.util.Scanner;
import java.util.Random;

public class JuegoLaberintoDePalabras {
    public static void main(String args[]) {

        final int NUMERO_INTENTOS = 6;
        String[] palabras = { "gato", "mesa", "cielo", "nube", "piedra", "flor", "luz", "río" };
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean jugarDeNuevo = true;

        System.out.println("¡Bienvenido al Laberinto de Palabras!");

        while (jugarDeNuevo) {
            String palabraSecreta = palabras[random.nextInt(palabras.length)];
            int intentosRestantes = 6;
            boolean adivinada = false;

            System.out.println("He seleccionado una palabra secreta. Tienes 6 intentos para adivinarla.");

            while (intentosRestantes > 0 && !adivinada) {
                System.out.print("Introduce tu palabra: ");
                String intento = scanner.nextLine();

                if (intento.length() != palabraSecreta.length()) {
                    System.out.println("La palabra debe tener " + palabraSecreta.length() + " letras.");
                    continue;
                }

                if (intento.equals(palabraSecreta)) {
                    adivinada = true;
                    System.out.println("¡Felicidades! Adivinaste la palabra secreta: " + palabraSecreta);
                } else {
                    int letrasCorrectas = 0;
                    for (int i = 0; i < palabraSecreta.length(); i++) {
                        if (intento.charAt(i) == palabraSecreta.charAt(i)) {
                            letrasCorrectas++;
                        }
                    }
                    intentosRestantes--;
                    System.out.println("Resultado: " + letrasCorrectas + " letras en la posición correcta.");
                    System.out.println("Intentos restantes: " + intentosRestantes);
                }
            }

            if (!adivinada) {
                System.out.println("Lo siento, no adivinaste la palabra. La palabra secreta era: " + palabraSecreta);
            }

            System.out.print("¿Quieres jugar de nuevo? (Sí/No): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equals("sí")) {
                jugarDeNuevo = false;
            }
        }

        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
        scanner.close();

    }
}
