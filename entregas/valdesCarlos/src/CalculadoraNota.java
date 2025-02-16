import java.util.Scanner;

class CalculoNotaFinal {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);

        final double PORCENTAJE_EXAMEN_FINAL = 0.5;
        final double PORCENTAJE_EXAMEN_PARCIAL = 0.25;
        final double PORCENTAJE_EVALUACION_CONTINUA = 0.2;
        final double PORCENTAJE_NOTA_PROFESOR = 0.05;

        System.out.print("Examen parcial: ");
        double examenParcial = entradaUsuario.nextDouble();

        System.out.print("Evaluación continua: ");
        double evaluacionContinua = entradaUsuario.nextDouble();

        System.out.print("Examen final: ");
        double examenFinal = entradaUsuario.nextDouble();

        System.out.print("Nota profesor: ");
        double notaProfesor = entradaUsuario.nextDouble();

        double promedioFinal = examenParcial * PORCENTAJE_EXAMEN_PARCIAL
                + evaluacionContinua * PORCENTAJE_EVALUACION_CONTINUA + examenFinal * PORCENTAJE_EXAMEN_FINAL
                + notaProfesor * PORCENTAJE_NOTA_PROFESOR;
        System.out.println("Tu promedio final es: " + promedioFinal);
        entradaUsuario.close();
    }
}