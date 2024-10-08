import java.util.Scanner;
class CalculaNotaFinal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double examenFinal, evaluacionContinua, examenParcial, notaProfesor;

        System.out.println("Dime la nota de tu examen final." );
        examenFinal = scanner.nextDouble();

        System.out.println("Dime la nota de tu evaluacion Continua." );
        evaluacionContinua = scanner.nextDouble();

        System.out.println("Dime la nota de tu examen parcial." );
        examenParcial = scanner.nextDouble();

        System.out.println("Dime tu nota del profesor." );
        notaProfesor = scanner.nextDouble();

        final double EXAMEN_FINAL_PONDERADOR;
        final double EXAMEN_PACIAL_PONDERADO;
        final double EVALUACION_CONTINUA_PONNDERADO;
        final double NOTA_PROFESOR_PONDERADO;
        
        double notaFinal;

        EXAMEN_FINAL_PONDERADOR =  0.5;
        EVALUACION_CONTINUA_PONNDERADO = 0.2;
        EXAMEN_PACIAL_PONDERADO = 0.25;
        NOTA_PROFESOR_PONDERADO = 0.05;

        notaFinal = examenFinal * EXAMEN_FINAL_PONDERADOR + examenParcial * EXAMEN_PACIAL_PONDERADO + evaluacionContinua * EVALUACION_CONTINUA_PONNDERADO + notaProfesor*NOTA_PROFESOR_PONDERADO;
        
        System.out.println("Nota final= " + notaFinal);
    }

}