public class CalculoNotaFinal {
    public static void main(String[] args) {
        double examenFinal, examenParcial, evaluacionContinua, notaProfesor;

        final double EXAMEN_FINAL_PONDERADO = 0.5;
        final double EXAMEN_PARCIAL_PONDERADO = 0.25;
        final double EVALUACION_CONTINUA_PONDERADO = 0.2;
        final double NOTA_PROFESOR_PONDERADO = 0.05;

        examenParcial = 7;
        examenFinal = 9;
        evaluacionContinua = 6;
        notaProfesor = 5;

        double notaFinal = examenFinal * EXAMEN_FINAL_PONDERADO + examenParcial * EXAMEN_PARCIAL_PONDERADO + 
                    evaluacionContinua * EVALUACION_CONTINUA_PONDERADO + notaProfesor * NOTA_PROFESOR_PONDERADO;
    }
    
}
