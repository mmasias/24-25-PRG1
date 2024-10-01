
import java.util.Scanner;

public class CalculaNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double examenFinal, examenParcial, evalucaionContinua, notaProfesor;

        double examenFinalPonderado = 0.5;
        double examenParcialPonderado = 0.25;
        double evalucaionContinuaPonderado = 0.2;
        double notaProfesorPonderado = 0.05;

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

        examenParcial = 6;
        examenFinal = 6;
        evalucaionContinua = 3;
        notaProfesor = 5;

        double notaFinal;

        notaFinal = examenFinal * examenFinalPonderado + examenParcial * examenParcialPonderado
                + evalucaionContinua * evalucaionContinuaPonderado + notaProfesor * notaProfesorPonderado;

        System.out.println("Nota final =" + notaFinal);

    }
}
