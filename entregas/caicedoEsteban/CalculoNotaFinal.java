package entregas.caicedoEsteban;

import java.util.Scanner;

class CalculoNotaFinal{
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double evaluacionCntinua, evaluacionProfe, evaluacionPrcial, examenFnal;

                System.out.print("Nota evaluacion Continua: ");
                evaluacionCntinua = scanner.nextDouble();

                System.out.print("Nota evaluacion Profesor: ");
                evaluacionProfe = scanner.nextDouble();

                System.out.print("Nota evaluacion Parcial: ");
                evaluacionPrcial = scanner.nextDouble();
                
                System.out.print("Nota examen final: ");
                examenFnal = scanner.nextDouble();


            

            final double EVALUACION_CONTINUA = 0.2;
            final double EVALUACION_PROFE = 0.05;
            final double EVALUACION_PRCIAL = 0.25;
            final double EXAMEN_FNAL = 0.5; 

   double calificacionFinal;
   calificacionFinal = evaluacionCntinua * EVALUACION_CONTINUA + evaluacionProfe * EVALUACION_PROFE + evaluacionPrcial * EVALUACION_PRCIAL + examenFnal * EXAMEN_FNAL;

   System.out.printf("Tu nota final es: %.2f%n", calificacionFinal);
        }

    }
}