import java.util.Scanner;

class CalcularNota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double examenFinal, examenParcial, evaluacionContinua, evaluacionProfesor;

        System.out.println("nota del final");
        examenFinal = scanner.nextDouble();
        System.out.println("nota del parcial");
        examenParcial = scanner.nextDouble();
        System.out.println("nota de la evaluacion continua");
        evaluacionContinua = scanner.nextDouble();
        System.out.println("nota de la evaluacion del profesor");
        evaluacionProfesor = scanner.nextDouble();

        double EXAMEN_FINAL_PONDERADO = 0.5;
        double EXAMEN_PARCIAL_PONDERADO = 0.25;
        double EVALUACION_CONTINUA_PONDERADO = 0.2;
        double EVALUACION_PROFESOR_PONDERADO = 0.05;

        double notaFinal;

        notaFinal = examenFinal * EXAMEN_FINAL_PONDERADO +
                examenParcial * EXAMEN_PARCIAL_PONDERADO +
                evaluacionContinua * EVALUACION_CONTINUA_PONDERADO +
                evaluacionProfesor * EVALUACION_PROFESOR_PONDERADO;

        System.out.println("Nota final =" + notaFinal);
        
    }
} 




