
import java.util.Scanner;

public class CalculaNotaFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double examenfinal;
        double examenparcial;
        double evalcontinua;
        double evalprofesor;

        final double EXAMEN_FINAL_PONDERADO = 0.5;
        final double EXAMEN_PARCIAL_PONDERADO = 0.25;
        final double EVALUACION_CONTINUA_PONDERADO = 0.2;
        final double EVALUACION_PROFESOR_PONDERADO = 0.05;

        System.out.println("Dime tu examen final:");
        examenfinal = scanner.nextDouble();
        System.out.println("Dime tu examen parcial:");
        examenparcial = scanner.nextDouble();
        System.out.println("Dime tu evaluación continua:");
        evalcontinua = scanner.nextDouble();
        System.out.println("Dime tu evaluación por parte del profesor");
        evalprofesor = scanner.nextDouble();

        double notafinal;

        notafinal = examenfinal * EXAMEN_FINAL_PONDERADO
                + examenparcial * EXAMEN_PARCIAL_PONDERADO
                + evalcontinua * EVALUACION_CONTINUA_PONDERADO
                + evalprofesor * EVALUACION_PROFESOR_PONDERADO;

        System.out.println("Nota final= " + notafinal);

    }

}
