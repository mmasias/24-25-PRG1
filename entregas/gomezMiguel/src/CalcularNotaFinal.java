import java.util.Scanner;

class CalculaNotaFinal{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double  examenParcial, examenFinal, evaluacionContinua, notaProfesor;

    
     
     System.out.println("nota del final");
     examenFinal = scanner.nextDouble();
     System.out.println("nota del parcial");
     examenParcial = scanner.nextDouble();
     System.out.println("nota de la evaluacion continua");
     evaluacionContinua = scanner.nextDouble();
     System.out.println("nota del profesor");
     notaProfesor = scanner.nextDouble();

     
     double EXAMEN_FINAL_PONDERADO = 0.5;
     double EXAMEN_PARCIAL_PONDERADO=0.25;
     double EVALUACION_CONTINUA_PONDERADO =0.2;
     double NOTA_PROFESOR_PONDERADO = 0.05;

     double notaFinal;

     notaFinal = examenFinal * EXAMEN_FINAL_PONDERADO + examenParcial * EXAMEN_PARCIAL_PONDERADO + evaluacionContinua * EVALUACION_CONTINUA_PONDERADO + notaProfesor * NOTA_PROFESOR_PONDERADO;
      System.out.println("Nota Final=" + notaFinal);

}
