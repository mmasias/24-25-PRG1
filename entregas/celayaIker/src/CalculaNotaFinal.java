import java.util.Scanner;
public class CalculaNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        double examenFinal, examenParcial, evaluacionContinua, evaluacionProfesor;

        System.out.println("Introduce la nota para el examen parcial: ");
        examenParcial = scanner.nextDouble();
        System.out.println("Introduce la nota para el examen final: ");
        examenFinal = scanner.nextDouble();
        System.out.println("Introduce la nota para la evaluacion continua: ");
        evaluacionContinua = scanner.nextDouble();
        System.out.println("Introduce la nota para la evaluacion del profesor: ");
        evaluacionProfesor = scanner.nextDouble();

        final double EXAMEN_FINAL_PONDERADO = 0.5;
        final double EXAMEN_PARCIAL_PONDERADO = 0.25;
        final double EVALUACION_CONTINUA_PONDERADO = 0.2;
        final double EVALUACION_PROFESOR_PONDERADO = 0.05;

        double notaFinal;

        notaFinal = examenFinal * EXAMEN_FINAL_PONDERADO + 
                    examenParcial * EXAMEN_PARCIAL_PONDERADO + 
                    evaluacionContinua * EVALUACION_CONTINUA_PONDERADO + 
                    evaluacionProfesor * EVALUACION_PROFESOR_PONDERADO;

        System.out.println("La nota final es: " + notaFinal);
        scanner.close();
    }
}