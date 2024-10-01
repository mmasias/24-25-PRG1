import java.util.Scanner;
public class CalculaNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double examenFinal, examenParcial, evaluacionContinua, notaProfesor;
            
        final double EXAMEN_FINAL_PONDERADO = 0.5;
        final double EXAMEN_PARCIAL_PONDERADO = 0.25;   
        final double EVALUACION_CONTINUA_PONDERADA = 0.2;
        final double NOTA_PROFESOR_PONDERADA = 0.05;    


        System.out.println("Vamos a calcular la media de tu nota en la asignatura de programacion:  ");
        System.out.println("Dime tu nota en el examen final ");
        examenFinal = scanner.nextDouble();
        System.out.println("Dime tu nota en el examen parcial ");
        examenParcial = scanner.nextDouble();
        System.out.println("Dime tu nota en la evaluacion continua ");
        evaluacionContinua = scanner.nextDouble();
        System.out.println("Dime tu nota en la nota del profeseor ");
        notaProfesor = scanner.nextDouble();

        double NotaFinal;
        NotaFinal = examenFinal * EXAMEN_FINAL_PONDERADO +
                    examenParcial * EXAMEN_PARCIAL_PONDERADO +
                    evaluacionContinua * EVALUACION_CONTINUA_PONDERADA + 
                    notaProfesor * NOTA_PROFESOR_PONDERADA;
        System.out.println(" Nota final = " + NotaFinal);
    }
}
