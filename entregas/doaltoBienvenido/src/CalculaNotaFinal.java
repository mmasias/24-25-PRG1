import java.util.Scanner;


class CalculaNotaFinal
{
    public static void main(String[] args) 
    {
        Scanner objeto = new Scanner(System.in);

        System.out.println("*INICIO*");
        System.out.println("=============================");

        final double PONDERACION_EXAMEN_FINAL = 0.5;
        final double PONDERACION_EXAMEN_PARCIAL = 0.2;
        final double PONDERACION_EVALUACION_CONTINUA = 0.25;
        final double PONDERACION_EVALUACION_PROFESOR = 0.05;

        System.out.println("Que nota en Examen Final: ");
        double notaExamenFinal = objeto.nextDouble();
       
        System.out.println("Que nota en Examen Parcial: ");
        double notaExamenParcial = objeto.nextDouble();

        System.out.println("Que nota en Evaluacion Continua: ");
        double notaEvaluacionContinua = objeto.nextDouble();

        System.out.println("Que nota en Evaluacion del Profesor: ");
        double notaEvalucacionProfesor = objeto.nextDouble();

        double notaFinal =  notaExamenFinal * PONDERACION_EXAMEN_FINAL + 
                            notaExamenParcial * PONDERACION_EXAMEN_PARCIAL + 
                            notaEvaluacionContinua * PONDERACION_EVALUACION_CONTINUA + 
                            notaEvalucacionProfesor * PONDERACION_EVALUACION_PROFESOR;

        System.out.println();
        System.out.println("Mi nota final de la evaluación es: " + notaFinal);
    }
}