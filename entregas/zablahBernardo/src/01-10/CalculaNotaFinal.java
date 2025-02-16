import java.util.Scanner;

public class CalculaNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double examenFinal;
        double examenParcial;
        double evaluacionContinua;
        double evalucionProfesor;

        final double EXAMEN_FINAL_PONDERADO = 0.5;
        final double EXAMEN_PARCIAL_PONDERADO = 0.25;
        final double EVALUACION_CONTINUA_PONDERADO = 0.2;
        final double EVALUACION_PROFESOR_PONDERADO = 0.05;

        System.err.println("Dime tu nota del examen Final");
        examenFinal = scanner.nextDouble();
        System.err.println("Dime tu nota del examen Parcial");
        examenParcial = scanner.nextDouble();
        System.err.println("Dime tu nota de evaluacion continua");
        evaluacionContinua = scanner.nextDouble();
        System.err.println("Dime tu nota de la evaluacion del profesor");
        evalucionProfesor = scanner.nextDouble();

        double promedioNota;

        promedioNota = (examenFinal * EXAMEN_FINAL_PONDERADO
                + examenParcial * EXAMEN_PARCIAL_PONDERADO
                + evaluacionContinua * EVALUACION_CONTINUA_PONDERADO
                + evalucionProfesor * EVALUACION_PROFESOR_PONDERADO);

        System.out.println("Nota final = " + promedioNota);
        scanner.close();

    }
}
