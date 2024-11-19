
import java.util.Scanner;


class CalculaNotaFinal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double evaluacionFinal;

        System.out.println("¿Cuál es tu nota en el examen final?");
        evaluacionFinal = scanner.nextDouble();

        // if (evFinal > 10) {
        //     System.out.println("Su nota del examen final no puede ser mayor a 10.");
        //     System.exit(0);
        // }

        // if (evFinal < 0) {
        //     System.out.println("Su nota del examen final no puede ser menor a 0.");
        //     System.exit(0);
        // }

        double evaluacionContinua;

        System.out.println("¿Cuál es tu nota en la evaluación continua?");
        evaluacionContinua = scanner.nextDouble();

        // if (evContinua > 10) {
        //     System.out.println("Su nota de la evaluación continua no puede ser mayor a 10.");
        //     System.exit(0);
        // }

        // if (evContinua < 0) {
        //     System.out.println("Su nota de la evaluación continua no puede ser menor a 0.");
        //     System.exit(0);
        // }

        double evaluacionParcial;

        System.out.println("¿Cuál es tu nota en el examen parcial?");
        evaluacionParcial = scanner.nextDouble();

        // if (evParcial > 10) {
        //     System.out.println("Su nota del examen parcial no puede ser mayor a 10.");
        //     System.exit(0);
        // }

        // if (evParcial < 0) {
        //     System.out.println("Su nota del examen parcial no puede ser menor a 0.");
        //     System.exit(0);
        // }

        double evaluacionProfesor;

        System.out.println("¿Cuál es la nota de su profesor sobre usted?");
        evaluacionProfesor = scanner.nextDouble();

        // if (evProfesor > 10) {
        //     System.out.println("La nota de su profesor no puede ser mayor a 10.");
        //     System.exit(0);
        // }

        // if (evProfesor < 0) {
        //     System.out.println("La nota de su profesor no puede ser menor a 0.");
        //     System.exit(0);
        // }

        final double PONDERACION_EVALUACION_FINAL = 0.50;
        final double PONDERACION_EVALUACION_CONTINUA = 0.20;
        final double PONDERACION_EVALUACION_PARCIAL = 0.25;
        final double PONDERACION_EVALUACION_PROFESOR = 0.05;

        double notaFinal;

        notaFinal
                = evaluacionFinal * PONDERACION_EVALUACION_FINAL
                + evaluacionContinua * PONDERACION_EVALUACION_CONTINUA
                + evaluacionParcial * PONDERACION_EVALUACION_PARCIAL
                + evaluacionProfesor * PONDERACION_EVALUACION_PROFESOR;

        System.out.println("Por la información dada, su nota resultante sería la consiguiente: " + notaFinal);

        scanner.close();
    }
}
