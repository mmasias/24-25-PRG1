class CalculaNotaFinal {

    public static void main(String[] args) {

        double examenFinal, examenParcial, evaluacionContinua, notaProfesor:

        double examenFinalPonderado = 0.5;
        double examenParcialPonderado = 0.25;
        double evaluacionContinuaPonderado = 0.2;
        double notaProfesorPonderado = 0.05;

        examenParcial = 7;
        examenFinal = 9;
        evaluacionContinua = 6;
        notaProfesor = 5;

        double notaFinal;
        
        notaFinal = examenFinal + 0.5 +
                    examenParcial + 0.25 
                    evaluacionContinua + 0.2 +
                    notaProfesor + 0.05;

        System.out.println("Nota final = " + notaFinal);   
    }
}

