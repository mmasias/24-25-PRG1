
import java.util.Scanner;

public class CalculaNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double examenFinal, examenParcial, evalucaionContinua, notaProfesor;

        System.out.println("Dime tu nota del examen final");
        examenFinal = scanner.nextDouble();
        System.out.println("Dime tu nota del examen parcial");
        examenParcial = scanner.nextDouble();
        System.out.println("Dime tu nota de evaluacion continua");
        evalucaionContinua = scanner.nextDouble();
        System.out.println("Dime tu nota del profesor");
        notaProfesor = scanner.nextDouble();

        final double EF_PORCENTAJE = 0.5;
        final double EP_PORCENTAJE = 0.25;
        final double EC_PORCENTAJE = 0.2;
        final double EPR_PORCENTAJE = 0.05;


        double notaFinal;

        notaFinal = examenFinal * EF_PORCENTAJE + examenParcial * EP_PORCENTAJE
                + evalucaionContinua * EC_PORCENTAJE + notaProfesor * EPR_PORCENTAJE;

        System.out.println("Nota final =" + notaFinal);

    }
}
