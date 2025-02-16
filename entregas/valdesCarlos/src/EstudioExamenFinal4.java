import java.util.Scanner;

public class EstudioExamenFinal4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean registrarOtraClase;

        do {
            registrarOtraClase = registrarClase(scanner);
        } while (registrarOtraClase);

        System.out.println("¡Gracias por usar el sistema de gestión de calificaciones!");
        scanner.close();
    }

    static boolean registrarClase(Scanner scanner) {
        System.out.print("Ingrese el número de estudiantes en la clase: ");
        int numEstudiantes = scanner.nextInt();
        scanner.nextLine(); 

        String[] nombres = new String[numEstudiantes];
        int[] calificaciones = new int[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.print("Ingrese la calificación de " + nombres[i] + " (0-100): ");
            calificaciones[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        calcularEstadisticas(nombres, calificaciones);

        System.out.print("¿Desea registrar otra clase? (s/n): ");
        char respuesta = scanner.next().toLowerCase().charAt(0);
        return respuesta == 's';
    }

    static void calcularEstadisticas(String[] nombres, int[] calificaciones) {
        int suma = 0;
        int calificacionMaxima = calificaciones[0];
        int calificacionMinima = calificaciones[0];
        String nombreMaximo = nombres[0];
        String nombreMinimo = nombres[0];

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];

            if (calificaciones[i] > calificacionMaxima) {
                calificacionMaxima = calificaciones[i];
                nombreMaximo = nombres[i];
            }

            if (calificaciones[i] < calificacionMinima) {
                calificacionMinima = calificaciones[i];
                nombreMinimo = nombres[i];
            }
        }

        double promedio = (double) suma / calificaciones.length;

        System.out.println("--- Estadísticas de la Clase ---");
        System.out.printf("Calificación promedio: %.2f\n", promedio);
        System.out.println("Calificación más alta: " + calificacionMaxima + " (Estudiante: " + nombreMaximo + ")");
        System.out.println("Calificación más baja: " + calificacionMinima + " (Estudiante: " + nombreMinimo + ")");
    }
}
