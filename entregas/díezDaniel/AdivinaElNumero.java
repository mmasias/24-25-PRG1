package entregas.díezDaniel;

import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroPensado = generarNumeroPensado();
        int INTENTOS_MAXIMOS = 10;
        int intentos = 0;
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

                if (numeroUsuario < numeroPensado) {
                    System.out.println("Pista: El número es mayor.");
                } else if (numeroUsuario > numeroPensado) {
                    System.out.println("Pista: El número es menor.");
                }

                int diferencia = Math.abs(numeroPensado - numeroUsuario);
                String pista = obtenerPista(diferencia);
                System.out.println("Pista de cercanía: " + pista);

                if (esCalienteDosVecesSeguidas(diferencia, ultimoDiferencia, intentos)) {
                    numeroPensado = hacerTrampa(numeroPensado);
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

    private static int generarNumeroPensado() {
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        return (int) (Math.random() * NUMERO_MAXIMO) + NUMERO_MINIMO;
    }

    private static int obtenerNumeroUsuario(Scanner scanner, int intentos) {
        System.out.print("\nIntento #" + (intentos + 1) + ": Ingresa tu número: ");
        return scanner.nextInt();
    }

    private static boolean comprobarAdivinanza(int numeroPensado, int numeroUsuario, int intentos) {
        if (numeroUsuario == numeroPensado) {
            System.out.println("¡Felicidades! Adivinaste el número en el intento #" + intentos);
            return true;
        }
        return false;
    }

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

    private static int hacerTrampa(int numeroPensado) {
        return (int) (Math.random() * 100) + 1;
    }
}

