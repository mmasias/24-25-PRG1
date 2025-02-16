import java.util.Random;
import java.util.Scanner;

public class ExamenPersonalizado {
    private static int primerFactor;
    private static int nivelDificultad; 
    private static boolean configurado = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) { 
            System.out.println("Menú principal:");
            System.out.println("1. Configuración");
            System.out.println("2. Ejecución del Test");
            System.out.println("3. Salir del sistema");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                configurar(scanner);
            } else if (opcion == 2) {
                if (configurado) {
                    ejecutarTest(scanner);
                } else {
                    System.out.println("Primero debes realizar la configuración en la opción 1.");
                }
            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }

    private static void configurar(Scanner scanner) {
        System.out.print("Ingresa el primer factor (entre 2 y 10): ");
        primerFactor = scanner.nextInt();
        while (primerFactor < 2 || primerFactor > 10) {
            System.out.print("Valor no válido. Ingresa un número entre 2 y 10: ");
            primerFactor = scanner.nextInt();
        }

        System.out.println("Elige el nivel de dificultad:");
        System.out.println("1. Fácil (segundo factor entre 1 y 6)");
        System.out.println("2. Normal (segundo factor entre 1 y 10)");
        System.out.println("3. Avanzado (segundo factor entre 4 y 10)");
        System.out.print("Tu elección: ");
        nivelDificultad = scanner.nextInt();

        while (nivelDificultad < 1 || nivelDificultad > 3) {
            System.out.print("Opción no válida. Elige 1, 2 o 3: ");
            nivelDificultad = scanner.nextInt();
        }

        configurado = true;
        System.out.println("Configuración completada.");
    }

    private static void ejecutarTest(Scanner scanner) {
        Random random = new Random();
        int min = 1, max = 10;

        if (nivelDificultad == 1) {
            max = 6; 
        } else if (nivelDificultad == 3) {
            min = 4; 
        }

        double puntos = 0;

        for (int i = 1; i <= 5; i++) {
            int segundoFactor = random.nextInt(max - min + 1) + min;
            System.out.print("Pregunta " + i + ": ¿Cuánto es " + primerFactor + " x " + segundoFactor + "? ");
            int respuestaUsuario = scanner.nextInt();
            int respuestaCorrecta = primerFactor * segundoFactor;

            if (respuestaUsuario == respuestaCorrecta) {
                puntos += 2;
                System.out.println("¡Correcto! +2 puntos.");
            } else {
                puntos -= 0.5;
                System.out.println("Incorrecto. La respuesta correcta era " + respuestaCorrecta + ". -0.5 puntos.");
            }
        }

        System.out.println("Tu puntuación final es: " + puntos);
        if (puntos > 5) {
            System.out.println("¡Aprobado!");
        } else {
            System.out.println("No aprobado.");
        }
    }
}