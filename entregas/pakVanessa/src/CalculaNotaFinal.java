class CalculaNotaFinal {
    
    public static void main(String[] args) {

        double examenFinal, examenParcial, evaluacionContinua, notaProfesor;

        examenFinal = 9;
        examenParcial = 7;
        evaluacionContinua = 6;
        notaProfesor = 5;


        double EXAMEN_FINAL_PONDERADO = 0.5;
        double EXAMEN_PARCIAL_PONDERADO = 0.25;
        double EVALUCAION_CONTINUA_PONDERADO = 0.2; 
        double NOTA_PROFESOR_PONDERADO = 0.05;


        double notaFinal;

        notaFinal = examenFinal * EXAMEN_FINAL_PONDERADO + examenParcial * EXAMEN_FINAL_PONDERADO + evaluacionContinua * EVALUCAION_CONTINUA_PONDERADO + notaProfesor * NOTA_PROFESOR_PONDERADO;

        System.out.println("Nota final = " + notaFinal);


                            
    }
}







