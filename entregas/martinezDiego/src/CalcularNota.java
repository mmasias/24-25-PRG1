class CalcularNota {
    public static void main(String[] args) {
       
        double examenFinal, examenParcial, evaluacionContinua, evaluacionProfesor;
       
        examenFinal = 7;
        examenParcial = 9;
        evaluacionContinua = 6;
        evaluacionProfesor = 5;
       
       
       
       
        double EXAMEN_FINAL_PONDERADO = 0.5;
        double EXAMEN_PARCIAL_PONDERADO = 0.25;
        double  EVALUACION_CONTINUA_PONDERADO= 0.2;
        double EVALUACION_PROFESOR_PONDERADO= 0.05;

        double notaFinal;

        notaFinal = examenFinal * EXAMEN_FINAL_PONDERADO + examenParcial * EXAMEN_PARCIAL_PONDERADO + evaluacionContinua * EVALUACION_CONTINUA_PONDERADO + evaluacionProfesor * EVALUACION_PROFESOR_PONDERADO;
    

        System.out.println("Nota final ="  + notaFinal);
}
}
