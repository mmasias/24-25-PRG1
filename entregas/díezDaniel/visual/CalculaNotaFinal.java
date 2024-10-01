public class CalculaNotaFinal {
    public static void main(String[] args) {

        double examenFinal, examenParcial, evalucaionContinua, notaProfesor;

        double examenFinalPonderado = 0.5;
        double examenParcialPonderado = 0.25;
        double evalucaionContinuaPonderado = 0.25;
        double notaProfesorPonderado = 0.05;

        examenParcial = 5;
        examenFinal = 6;
        evalucaionContinua = 3;
        notaProfesor = 5;

        double notaFinal;

        notaFinal = examenFinal * examenFinalPonderado + examenParcial * examenParcialPonderado
                + evalucaionContinua * evalucaionContinuaPonderado + notaProfesor * notaProfesorPonderado;

        System.out.println("Nota final =" + notaFinal);

    }
}
