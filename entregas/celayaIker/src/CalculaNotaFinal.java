public class CalculaNotaFinal {
    public static void main(String[] args) {
    
        double examenFinal, examenParcial, evaluacionContinua, evaluacionProfesor;

        examenParcial = 7;
        examenFinal = 8;
        evaluacionContinua = 8;
        evaluacionProfesor = 10;

        final double EXAMEN_FINAL_PONDERADO = 0.5;
        final double EXAMEN_PARCIAL_PONDERADO = 0.25;
        final double EVALUACION_CONTINUA_PONDERADO = 0.2;
        final double EVALUACION_PROFESOR_PONDERADO = 0.05;

        double notaFinal;

        notaFinal = examenFinal * EXAMEN_FINAL_PONDERADO + 
                    examenParcial * EXAMEN_PARCIAL_PONDERADO + 
                    evaluacionContinua * EVALUACION_CONTINUA_PONDERADO + 
                    evaluacionProfesor * EVALUACION_PROFESOR_PONDERADO;

        System.out.println("La nota final es: " + notaFinal);
    }
}