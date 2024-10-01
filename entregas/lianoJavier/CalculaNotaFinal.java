
import java.util.Scanner;

class CalculaNotaFinal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double evFinal, evContinua, evParcial, evProfesor;

        System.out.println("¿Cuál es tu nota en el examen final?");
        evFinal = scanner.nextDouble();

        if (evFinal > 10) {
            System.out.println("Su nota del examen final no puede ser mayor a 10.");
            System.exit(0);
        }

        if (evFinal < 0) {
            System.out.println("Su nota del examen final no puede ser menor a 0.");
            System.exit(0);
        }

        System.out.println("¿Cuál es tu nota en la evaluación continua?");
        evContinua = scanner.nextDouble();

        if (evContinua > 10) {
            System.out.println("Su nota de la evaluación continua no puede ser mayor a 10.");
            System.exit(0);
        }

        if (evContinua < 0) {
            System.out.println("Su nota de la evaluación continua no puede ser menor a 0.");
            System.exit(0);
        }

        System.out.println("¿Cuál es tu nota en el examen parcial?");
        evParcial = scanner.nextDouble();

        if (evParcial > 10) {
            System.out.println("Su nota del examen parcial no puede ser mayor a 10.");
            System.exit(0);
        }

        if (evParcial < 0) {
            System.out.println("Su nota del examen parcial no puede ser menor a 0.");
            System.exit(0);
        }

        System.out.println("¿Cuál es la nota de su profesor sobre usted?");
        evProfesor = scanner.nextDouble();

        if (evProfesor > 10) {
            System.out.println("La nota de su profesor no puede ser mayor a 10.");
            System.exit(0);
        }

        if (evProfesor < 0) {
            System.out.println("La nota de su profesor no puede ser menor a 0.");
            System.exit(0);
        }

        final double EV_FINAL_PONDERACION = 0.50;
        final double EV_CONTINUA_PONDERACION = 0.20;
        final double EV_PARCIAL_PONEDERACION = 0.25;
        final double EV_PROFESOR_PONDERACION = 0.05;

        double notaFinal;

        notaFinal
                = evFinal * EV_FINAL_PONDERACION
                + evContinua * EV_CONTINUA_PONDERACION
                + evParcial * EV_PARCIAL_PONEDERACION
                + evProfesor * EV_PROFESOR_PONDERACION;

        System.out.println("Por la información dada, su nota resultante sería la consiguiente: " + notaFinal);
    }
}
