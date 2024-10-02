import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
    double examenFinal;
    double evaluacionProfesor;
    double evaluacionContinua;
    double calculoNota;
    final double CONTINUAP;
    double examenParcial;
    final double PARCIALP;
    final double PROFESORP;
    final double FINALP;
    
    System.out.println("Dime tu nota examen final");
    examenFinal = scanner.nextDouble();
    System.out.println("Dime tu nota de evaluacion continua");
    evaluacionContinua = scanner.nextDouble();
    System.out.println("Dime tu nota de examen parcial");
    examenParcial = scanner.nextDouble();
    System.out.println("Dime la nota que te dio el profesor de 1 al 5");
    evaluacionProfesor = scanner.nextDouble();
    scanner.close();
    FINALP = 0.5;
    CONTINUAP = 0.2;
    PARCIALP = 0.25;
    PROFESORP = 0.05;
        calculoNota = (((examenFinal * FINALP) + (evaluacionContinua * CONTINUAP) + (examenParcial * PARCIALP) + (evaluacionProfesor * PROFESORP)));
        double Notafinal = calculoNota * 10;    
            System.out.println("Tu nota final es un " + Notafinal + "%");

    }

}
