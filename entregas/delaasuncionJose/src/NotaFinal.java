import java.util.Scanner;

class NotaFinal {
    public static void main(String[] args) {

        // Declaracion de variables
        
        Scanner scanner = new Scanner(System.in);
        double notaFinal;

            //Notas obtenidas

        System.out.println("Dime la nota de tu Examen final");
        double evaluacionFinal = scanner.nextDouble();
        System.out.println("Dime la nota de tu evaluacion continua");
        double evaluacionContinua = scanner.nextDouble();
        System.out.println("Dime la nota de tu Examen parcial");
        double evaluacionParcial = scanner.nextDouble();
        System.out.println("Dime la nota de la evaluacion del profesor");
        double evaluacionProfesor = scanner.nextDouble();

        // Declaracion de constantes

            // Ponderaciones

        final double PONDERACION_FINAL = 0.5;
        final double PONDERACION_CONTINUA = 0.2;
        final double PONDERACION_PARCIAL = 0.25;
        final double PONDERACION_PROFESOR = 0.05;

        // Calculo

        notaFinal = evaluacionContinua * PONDERACION_CONTINUA +
                    evaluacionFinal * PONDERACION_FINAL +
                    evaluacionParcial * PONDERACION_PARCIAL +
                    evaluacionProfesor * PONDERACION_PROFESOR;

        // Console output

        System.out.println("Tu nota final es " + notaFinal );
    }
}
