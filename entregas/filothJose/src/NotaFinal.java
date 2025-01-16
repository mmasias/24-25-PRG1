import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double examenFinal, examenParcial, evaluacionContinua, evaluacionProfesor;
        
        System.out.println("Dime tu Nota del Examen Final:");
        examenFinal = scanner.nextDouble();

        System.out.println("Dime tu Nota del Examen Parcial:");
        examenParcial = scanner.nextDouble();

        System.out.println("Dime tu Nota de la Evalución Continua:");
        evaluacionContinua = scanner.nextDouble();

        System.out.println("Dime tu Nota de la Evaluación del Profesor:");
        evaluacionProfesor = scanner.nextDouble();
        
        final double EF_PORCENTAJE = 0.5;
        final double EP_PORCENTAJE = 0.25;
        final double EC_PORCENTAJE = 0.2;
        final double EPR_PORCENTAJE = 0.05;

        double notaFinal;

        notaFinal = (examenFinal * EF_PORCENTAJE) + (examenParcial * EP_PORCENTAJE) + 
                    (evaluacionContinua * EC_PORCENTAJE) + (evaluacionProfesor * EPR_PORCENTAJE);
        
        System.out.println("Nota Final =" + notaFinal);

        scanner.close();

}
}