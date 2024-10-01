import java.util.Scanner;

public class CalculoNotaFinal {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

        double examenFinal, examenParcial, evaluacionContinua, notaProfesor;

        final double EXAMEN_FINAL_PONDERADO = 0.5;
        final double EXAMEN_PARCIAL_PONDERADO = 0.25;
        final double EVALUACION_CONTINUA_PONDERADO = 0.2;
        final double NOTA_PROFESOR_PONDERADO = 0.05;
        
        System.out.println("Nota examen parcial: ");
        examenParcial = scanner.nextDouble();
        System.out.println("Nota examen final: ");
        examenFinal = scanner.nextDouble();
        System.out.println("Nota evaluacion continua: ");
        evaluacionContinua = scanner.nextDouble();
        System.out.println("Nota profesor: ");
        notaProfesor = scanner.nextDouble();

        double notaFinal = examenFinal * EXAMEN_FINAL_PONDERADO + examenParcial * EXAMEN_PARCIAL_PONDERADO + 
                    evaluacionContinua * EVALUACION_CONTINUA_PONDERADO + notaProfesor * NOTA_PROFESOR_PONDERADO;

        System.out.println("Nota final =  " + notaFinal);

        }
    }
    
}
