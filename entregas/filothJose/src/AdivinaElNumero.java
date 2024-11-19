import java.util.Scanner;

class AdivinaElNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroPensado = pensarNumero();
        final int INTENTOS_MAXIMOS = 10;
        int intentos = 0;
        boolean adivinado = false;
        int diferenciaAnterior = -1;

        System.out.println("¡Bienvenido al juego Adivina el número!");
        System.out.println("El número está entre 1 y 100. Tienes " + INTENTOS_MAXIMOS + " intentos para adivinarlo.");

        while (intentos < INTENTOS_MAXIMOS && !adivinado) {
            int intento = obtenerIntento(scanner, intentos, INTENTOS_MAXIMOS);
            intentos++;

            if (intento == numeroPensado) {
                adivinado = true;
                System.out.println("¡Felicidades! Has adivinado el número en el intento " + intentos + "!");
            } else {

                diferenciaAnterior = darPistas(numeroPensado, intento, diferenciaAnterior);
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, no has adivinado el número. El número era: " + numeroPensado);
        }

        scanner.close();
    }

    private static int pensarNumero() {
        final int NUMERO_MINIMO = 1;
        final int NUMERO_MAXIMO = 100;
        return (int) (Math.random() * NUMERO_MAXIMO) + NUMERO_MINIMO;
    }

    private static int obtenerIntento(Scanner scanner, int intentos, int maxIntentos) {
        System.out.print("Introduce tu intento (" + (intentos + 1) + "/" + maxIntentos + "): ");
        return scanner.nextInt();
    }

    private static int darPistas(int numeroPensado, int intento, int diferenciaAnterior) {
        int diferencia = calcularDiferencia(numeroPensado, intento);

        if (diferencia <= 5) {
            System.out.println("¡Caliente!");

            if (diferenciaAnterior <= 5) {
                hacerTrampa();
                numeroPensado = pensarNumero();
            }
        } else if (diferencia <= 10) {
            System.out.println("¡Tibio!");
        } else {
            System.out.println("¡Frío!");
        }

        if (intento < numeroPensado) {
            System.out.println("El número es mayor.");
        } else {
            System.out.println("El número es menor.");
        }

        return diferencia;
    }

    private static int calcularDiferencia(int numeroPensado, int intento) {
        return Math.abs(numeroPensado - intento);
    }

    private static void hacerTrampa() {
        System.out.println("¡Achú! El número pensado ha cambiado...");
    }
}
