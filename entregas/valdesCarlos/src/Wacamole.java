import java.util.Scanner;

public class Wacamole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int agujeros = 16; // Número total de agujeros
        int aciertos = 0;  // Contador de aciertos
        int turnos = 15;   // Número de turnos que tiene el jugador

        System.out.println("¡Bienvenido al juego Whac-A-Mole!");
        System.out.println("Tienes " + turnos + " turnos para acertar.\n");

        // Ciclo de turnos
        for (int turno = 1; turno <= turnos; turno++) {
            // Generar una posición aleatoria para el monigote
            int posicionMonigote = (int)(Math.random() * agujeros);

            // Mostrar el tablero inicial antes del golpe
            System.out.println("Turno " + turno + ":");
            for (int i = 0; i < agujeros; i++) {
                if (i == posicionMonigote) {
                    System.out.print("('') ");
                } else {
                    System.out.print("(  ) ");
                }
                if ((i + 1) % 4 == 0) { // Salto de línea para mostrar el tablero en 4x4
                    System.out.println();
                }
            }

            // Pedir al usuario que elija un agujero para golpear
            int posicionGolpe = -1;
            do {
                System.out.print("\nElige el número de agujero para golpear (0 a 15): ");
                posicionGolpe = scanner.nextInt();
            } while (posicionGolpe < 0 || posicionGolpe >= agujeros);  // Validación del rango de entrada

            // Verificar si el golpe fue exitoso
            if (posicionGolpe == posicionMonigote) {
                System.out.println("¡Acierto! Has golpeado al monigote.");
                aciertos++;
            } else {
                System.out.println("Fallaste. El monigote estaba en otro agujero.");
            }

            // Mostrar el tablero después del golpe
            for (int i = 0; i < agujeros; i++) {
                if (i == posicionGolpe && i == posicionMonigote) {
                    System.out.print("[**] ");  // Golpe acertado con monigote
                } else if (i == posicionGolpe) {
                    System.out.print("[[]] ");  // Agujero golpeado sin monigote
                } else if (i == posicionMonigote) {
                    System.out.print("('') ");  // Agujero con monigote
                } else {
                    System.out.print("(  ) ");  // Agujero vacío
                }

                if ((i + 1) % 4 == 0) { // Salto de línea para formato
                    System.out.println();
                }
            }
            System.out.println();
        }

        // Resultados finales
        System.out.println("\nEl juego ha terminado.");
        System.out.println("Aciertos totales: " + aciertos + " de " + turnos + " turnos.");
        scanner.close();
    }
}
