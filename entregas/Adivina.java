package entregas;

import java.util.Random;
import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroPensado = generarNumeroPensado (random);
        int INTENTOS_MAXIMOS = 10;
        int intentos = 0;
        final int MAXIMO = 100;
        final int MINIMO = 1;
        int intento;
        boolean adivinado = false;
        int ultimoDiferencia = -1;


        System.out.println("¡Bienvenido al juego 'Adivina el Número'!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");
        System.out.println("Tienes " + INTENTOS_MAXIMOS + " intentos para adivinarlo.");

        while (intentos < INTENTOS_MAXIMOS && !adivinado) {
            int numeroUsuario = obtenerNumeroUsuario(scanner, intentos);
            intentos++;

            adivinado = comprobarAdivinanza(numeroPensado, numeroUsuario, intentos);

            
            if (!adivinado) {
                int diferencia = Math.abs(numeroPensado - numeroUsuario);
                String pista = obtenerPista(diferencia);

               
                System.out.println("Pista: " + pista);

                
                if (esCalienteDosVecesSeguidas(diferencia, ultimoDiferencia, intentos)) {
                    numeroPensado = hacerTrampa(random, numeroPensado);
                    System.out.println("¡Achoo! Estoy haciendo trampa...");
                }

                ultimoDiferencia = diferencia; 
            }
        }

        
        if (!adivinado) {
            System.out.println("\n¡Lo siento! No lograste adivinar el número.");
            System.out.println("El número correcto era: " + numeroPensado);
        }

        scanner.close();
    }
     // Método para generar un número aleatorio entre 1 y 100
    private static int generarNumeroPensado(Random random) {
        return random.nextInt(100) + 1;
    }

    // Método para mostrar el mensaje de bienvenida
    private static void mostrarBienvenida(int maxIntentos) {
        System.out.println("¡Bienvenido al juego 'Adivina el Número'!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");
        System.out.println("Tienes " + maxIntentos + " intentos para adivinarlo.");
    }

    // Método para obtener el número ingresado por el usuario
    private static int obtenerNumeroUsuario(Scanner scanner, int intentos) {
        System.out.print("\nIntento #" + (intentos + 1) + ": Ingresa tu número: ");
        return scanner.nextInt();
    }

    // Método para comprobar si el número ingresado es el correcto
    private static boolean comprobarAdivinanza(int numeroPensado, int numeroUsuario, int intentos) {
        if (numeroUsuario == numeroPensado) {
            System.out.println("¡Felicidades! Adivinaste el número en el intento #" + intentos);
            return true;  // Si el número es correcto, devuelve true para indicar que el juego ha terminado.
        }
        return false;  // Si no adivinó, devuelve false para seguir jugando.
    }

    // Método para obtener la pista en función de la diferencia
    private static String obtenerPista(int diferencia) {
        if (diferencia <= 5) {
            return "¡Caliente!";
        } else if (diferencia <= 10) {
            return "Tibio...";
        } else {
            return "Frío...";
        }
    }

    
    private static boolean esCalienteDosVecesSeguidas(int diferencia, int ultimoDiferencia, int intentos) {
        return diferencia <= 5 && ultimoDiferencia <= 5 && intentos > 1;
    }

   
    private static int hacerTrampa(Random random, int numeroPensado) {
        numeroPensado = numeroPensado + random.nextInt(5) + 1;
        return Math.min(100, Math.max(1, numeroPensado));
    }
}
        
    

