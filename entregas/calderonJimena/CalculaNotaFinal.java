import java.util.Scanner;

public class CalculaNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double examenFinal;
        double evaluacionContinua;
        double examenParcial;
        double evaluacionProfesor;

        System.out.println("Dime tu examen final");
        examenFinal = scanner.nextDouble();
        System.out.println("Dime tu evaluacion continua");
        evaluacionContinua = scanner.nextDouble();
        System.out.println("Dime tu examen parcial");
        examenParcial = scanner.nextDouble();
        System.out.println("Dime tu evaluacion del profesor");
        evaluacionProfesor = scanner.nextDouble();

        final double EXAMEN_FINAL_PONDERADO = 0.5;
        final double EVALUACION_CONTINUA_PONDERADO = 0.25;
        final double EXAMEN_PARCIAL_PONDERADO = 0.2;
        final double EVALUACION_PROFESOR_PONDERADO = 0.05;

        double notaFinal;

        notaFinal = examenFinal * EXAMEN_FINAL_PONDERADO +
                evaluacionContinua * EVALUACION_CONTINUA_PONDERADO +
                examenParcial * EXAMEN_PARCIAL_PONDERADO +
                evaluacionProfesor * EVALUACION_PROFESOR_PONDERADO;

        System.out.println("Nota final = " + notaFinal);
    }
}
