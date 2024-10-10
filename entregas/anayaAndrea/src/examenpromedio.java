public class CalculaNotafinal {

    public static void main(String[] args) {

        double examenFinal, examenParcial, evaluacionContinua, notaProfesor;
        
        final double notaExamenFinalPonderado = 0.5;
        final double notaEvContinuaPonderada = 0.25;
        final double notaExamenParcialPonderado = 0.2;
        final double notaProfesorPonderado = 0.05;

        examenParcial = 8;
        examenFinal = 9;
        evaluacionContinua = 8;
        notaProfesor = 8;

        double notaFinal;

        notaFinal = examenFinal * notaExamenFinalPonderado + 
                    examenParcial * notaExamenParcialPonderado +
                    evaluacionContinua * notaEvContinuaPonderada + 
                    notaProfesor * notaProfesorPonderado;

        System.out.println( "Nota Final =" + notaFinal );

    }  
}