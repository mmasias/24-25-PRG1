package RetoVistoEnClase;

import java.util.Scanner;

public class CalculadoraNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double examenParcial, evaluacionContinua, notaProfesor, examenFinal, notaFinal;

        System.out.println("Dame la nota del examen parcial: ");
        examenParcial = scanner.nextDouble();
        if (examenParcial < 0 || examenParcial > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        }

        System.out.println("Dame la nota de la evaluación continua: ");
        evaluacionContinua = scanner.nextDouble();
        if (evaluacionContinua < 0 || evaluacionContinua > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        }

        System.out.println("Dame la nota del profesor: ");
        notaProfesor = scanner.nextDouble();
        if (notaProfesor < 0 || notaProfesor > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        }

        System.out.println("Dame la nota del examen final: ");
        examenFinal = scanner.nextDouble();
        if (examenFinal < 0 || examenFinal > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        }

        notaFinal = (examenParcial * 0.25) + (evaluacionContinua * 0.20) +
                (notaProfesor * 0.05) + (examenFinal * 0.50);

        System.out.printf("Tu nota final es: " + notaFinal);

        if (notaFinal < 5) {
            System.out.println("Lo siento, no has aprobado la asignatura.");
        } else if (notaFinal >= 5) {
            System.out.println("¡Felicidades, has aprobado la asignatura!");
        }

        scanner.close();
    }
}
