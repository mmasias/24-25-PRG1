import java.util.Random;
import java.util.Scanner;

public class unExamen {
    public static int primerFactor = 0;
    public static String tipoOperacion = null; 
    public static int rangoMin;
    public static int rangoMax;
    public static String nivelDificultad = null; 

    public static final String[] nivelesDificultad = {"fácil", "normal", "avanzado"};
    public static final int[][] rangos = {
        {1, 6},  
        {1, 10},
        {4, 10},  
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Configuracion");
            System.out.println("2. Ejecucion del Test");
            System.out.println("3. Salir del sistema");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                configurar(scanner);
            } else if (opcion == 2) {
                ejecutarTest(scanner);
            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opcion no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close(); 
    }

    public static void configurar(Scanner scanner) {
        System.out.print("Seleccione un primer factor (2-10): ");
        primerFactor = scanner.nextInt();

        while (primerFactor < 2 || primerFactor > 10) {
            System.out.print("Por favor, ingrese un primer factor valido (2-10): ");
            primerFactor = scanner.nextInt();
        }

        System.out.print("Seleccione el tipo de operacion (suma/multiplicación): ");
        tipoOperacion = scanner.next().toLowerCase();

        while (!tipoOperacion.equals("suma") && !tipoOperacion.equals("multiplicacion")) {
            System.out.print("Por favor, ingrese un tipo de operacion válido (suma/multiplicacion): ");
            tipoOperacion = scanner.next().toLowerCase();
        }

        System.out.print("Seleccione el nivel de dificultad (facil/normal/avanzado): ");
        nivelDificultad = scanner.next().toLowerCase();

        int nivelIndex = -1;
        for (int i = 0; i < nivelesDificultad.length; i++) {
            if (nivelesDificultad[i].equals(nivelDificultad)) {
                nivelIndex = i;
            }
        }

        if (nivelIndex != -1) {
            rangoMin = rangos[nivelIndex][0];
            rangoMax = rangos[nivelIndex][1];
        } else {
            System.out.println("Dificultad no valida. Se establecera en normal.");
            rangoMin = rangos[1][0];
            rangoMax = rangos[1][1];
        }
        System.out.println("Configuracion completada.");
    }

    public static void ejecutarTest(Scanner scanner) {
        if (primerFactor == 0 || tipoOperacion == null || nivelDificultad == null) {
            System.out.println("Por favor, configure primero el sistema.");
            return;
        }

        Random random = new Random();
        int puntaje = 0;

        for (int i = 0; i < 5; i++) {
            int segundoFactor = random.nextInt(rangoMax - rangoMin + 1) + rangoMin;
            int respuestaCorrecta;
            if (tipoOperacion.equals("suma")) {
                respuestaCorrecta = primerFactor + segundoFactor;
                System.out.printf("Pregunta %d: ¿Cuánto es %d + %d? ", i + 1, primerFactor, segundoFactor);
            } else {
                respuestaCorrecta = primerFactor * segundoFactor;
                System.out.printf("Pregunta %d: ¿Cuánto es %d * %d? ", i + 1, primerFactor, segundoFactor);
            }

            int respuestaUsuario = scanner.nextInt();
            if (respuestaUsuario == respuestaCorrecta) {
                System.out.println("¡Correcto!");
                puntaje++;
            } else {
                System.out.printf("Incorrecto. La respuesta correcta es %d.\n", respuestaCorrecta);
            }
        }

        System.out.printf("Tu puntaje final es: %d de 5.\n", puntaje);
    }
}