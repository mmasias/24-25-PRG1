import java.util.Scanner;
class CalculadoraDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaExaFinal, notaEvacontinua, notaParcial, evaluacionProfesor; 

        System.out.println("nota de examen final");
        notaExaFinal = scanner.nextDouble();
        System.out.println("nota evaluacion continua");
        notaEvacontinua = scanner.nextDouble(); 
        System.out.println("nota parcial");
        notaParcial = scanner.nextDouble(); 
        System.out.println("nota de la evaluacion del profesor");
        evaluacionProfesor = scanner.nextDouble(); 

        final double examenFinalPonderado = 0.5;
        final double examenParcialPonderado = 0.25; 
        final double evaluacionContinuaPonderado = 0.20;
        final double evaluacionProfesorPonderado = 0.05;

        double notaFinal; 

        notaFinal = notaExaFinal * examenFinalPonderado + notaEvacontinua * evaluacionContinuaPonderado + 
        notaParcial * examenParcialPonderado + evaluacionProfesor * evaluacionProfesorPonderado; 


        System.out.println( notaFinal + "ES TU NOTA FINAL");

    

    }
} 