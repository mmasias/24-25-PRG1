import java.util.Scanner:

class CalculadoraNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); 
        double examenFinal, examenParcial, evaluacionContinua, notaProfesor;

        examenParcial = 7;
        examenFinal = 8;
        evaluacionContinua = 7;
        notaProfesor = 5;

        final double EXAMEN_FINAL_PONDERADO = 0.5;
        final double EXAMEN_PARCIAL_PONDERADO = 0.25;
        final double EVALUACION_CONTINUA_PONDERADO = 0.2;
        final double NOTA_PROFESOR_PONDERADO = 0.05;

        double notaFinal;

        notaFinal = examenFinal * EXAMEN_FINAL_PONDERADO +
                    examenParcial * EXAMEN_PARCIAL_PONDERADO + 
                    evaluacionContinua * EVALUACION_CONTINUA_PONDERADO +
                    notaFinal * NOTA_PROFESOR_PONDERADO;

        System.out.println("Nota final = " + notaFinal);      
    }
}      