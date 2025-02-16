import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables de configuración
        int primerFactor = 0;
        int limiteInferiorSegundoFactor = 0;
        int limiteSuperiorSegundoFactor = 0;
        boolean configurado = false;
        
        boolean salir = false;
        
        // Menú principal
        while (!salir) {
            System.out.println("*** Menú Principal ***");
            System.out.println("1. Configuración");
            System.out.println("2. Ejecución del Test");
            System.out.println("3. Salir del sistema");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                // Configuración de los factores y dificultad
                System.out.print("Elija el primer factor (entre 2 y 10): ");
                primerFactor = scanner.nextInt();
                if (primerFactor < 2 || primerFactor > 10) {
                    System.out.println("Error: El primer factor debe estar entre 2 y 10.");
                } else {
                    System.out.println("Elija el nivel de dificultad:");
                    System.out.println("1. Fácil (segundo factor entre 1 y 6)");
                    System.out.println("2. Normal (segundo factor entre 1 y 10)");
                    System.out.println("3. Avanzado (segundo factor entre 4 y 10)");
                    System.out.print("Elija el nivel de dificultad (1, 2 o 3): ");
                    int dificultad = scanner.nextInt();

                    if (dificultad == 1) {
                        limiteInferiorSegundoFactor = 1;
                        limiteSuperiorSegundoFactor = 6;
                        configurado = true;
                        System.out.println("Configuración completada exitosamente (Nivel Fácil).");
                    } else if (dificultad == 2) {
                        limiteInferiorSegundoFactor = 1;
                        limiteSuperiorSegundoFactor = 10;
                        configurado = true;
                        System.out.println("Configuración completada exitosamente (Nivel Normal).");
                    } else if (dificultad == 3) {
                        limiteInferiorSegundoFactor = 4;
                        limiteSuperiorSegundoFactor = 10;
                        configurado = true;
                        System.out.println("Configuración completada exitosamente (Nivel Avanzado).");
                    } else {
                        System.out.println("Error: Nivel de dificultad no válido.");
                    }
                }

            } else if (opcion == 2) {
                // Ejecución del test, solo si está configurado
                if (!configurado) {
                    System.out.println("Error: El test no está configurado. Configure el test primero.");
                } else {
                    double puntuacion = 0.0;

                    for (int i = 1; i <= 5; i++) {
                        int segundoFactor = (int) (Math.random() * (limiteSuperiorSegundoFactor - limiteInferiorSegundoFactor + 1)) + limiteInferiorSegundoFactor;
                        int resultadoCorrecto = primerFactor * segundoFactor;

                        System.out.println("Pregunta " + i + ": ¿Cuánto es " + primerFactor + " * " + segundoFactor + "?");
                        System.out.print("Respuesta: ");
                        int respuestaUsuario = scanner.nextInt();

                        if (respuestaUsuario == resultadoCorrecto) {
                            puntuacion += 2;  // Suma 2 puntos por respuesta correcta
                            System.out.println("¡Correcto!");
                        } else {
                            puntuacion -= 0.5;  // Resta 0.5 puntos por respuesta incorrecta
                            System.out.println("Incorrecto. La respuesta correcta era " + resultadoCorrecto + ".");
                        }
                    }

                    // Evaluación final
                    System.out.println("\nPuntuación final: " + puntuacion + " puntos.");
                    if (puntuacion > 5) {
                        System.out.println("¡Felicidades, estás aprobado!");
                    } else {
                        System.out.println("Lo siento, no has aprobado.");
                    }
                }

            } else if (opcion == 3) {
                // Salir del sistema
                System.out.println("Saliendo del sistema. ¡Hasta luego!");
                salir = true;
                
            } else {
                System.out.println("Error: Opción no válida. Por favor elija una opción del menú.");
            }
        }

        scanner.close();
    }
}
