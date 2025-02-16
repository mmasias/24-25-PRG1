import java.util.Random;
import java.util.Scanner;

public class CarreraCamellos2 {

    private static final int META = 60;
    private static final int[] PROBABILIDADES = {60, 40, 30, 10};
    private static final int[] AVANCES = {1, 2, 4, 6};
    private static final int MIN_OPCION = 1;
    private static final int MAX_OPCION = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int posicion = 0;
        int turnos = 0;

        mostrarBienvenida();

        while (posicion < META) {
            mostrarEstado(posicion);
            int eleccion = obtenerEleccion(scanner);
            turnos++;

            if (realizarLanzamiento(random, PROBABILIDADES[eleccion - 1])) {
                posicion += AVANCES[eleccion - 1];
                System.out.println("\n¡Acertaste! Avanzas " + AVANCES[eleccion - 1] + " casilla(s).");
            } else {
                System.out.println("\nFallaste. No avanzas este turno.");
            }
        }

        mostrarResultado(turnos);
        scanner.close();
    }

    private static void mostrarBienvenida() {
        System.out.println("\n¡Bienvenido a la carrera de camellos!");
        System.out.println("El objetivo es alcanzar la casilla " + META + ".");
    }

    private static void mostrarEstado(int posicion) {
        System.out.println("\nEstás en la casilla: " + posicion);
        System.out.println("Elige un agujero para lanzar la pelota:");
        for (int i = 0; i < PROBABILIDADES.length; i++) {
            System.out.println((i + 1) + ". Agujero " + (i + 1) + " (" + PROBABILIDADES[i] + "% de acierto, avanzas " + AVANCES[i] + " casilla(s))");
        }
    }

    private static int obtenerEleccion(Scanner scanner) {
        int eleccion = 0;
        while (eleccion < MIN_OPCION || eleccion > MAX_OPCION) {
            System.out.print("Ingresa tu elección (" + MIN_OPCION + "-" + MAX_OPCION + "): ");
            if (scanner.hasNextInt()) {
                eleccion = scanner.nextInt();
                if (eleccion < MIN_OPCION || eleccion > MAX_OPCION) {
                    System.out.println("Opción inválida. Intenta nuevamente.");
                }
            } else {
                System.out.println("Entrada no válida. Intenta nuevamente.");
                scanner.next();
            }
        }
        return eleccion;
    }

    private static boolean realizarLanzamiento(Random random, int probabilidad) {
        int lanzamiento = random.nextInt(100) + 1;
        return lanzamiento <= probabilidad;
    }

    private static void mostrarResultado(int turnos) {
        System.out.println("\n¡Felicidades! Llegaste a la meta en " + turnos + " turno(s).");
    }
}

