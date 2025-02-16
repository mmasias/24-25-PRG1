import java.util.Scanner;

public class CalculoNotaFinal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        double examenFinal, evaluacionContinua, examenParcial, notaProfesor;
      System.out.println("Dime tu examen parcial : ");
      examenParcial = scanner.nextDouble();
      System.out.println("Dime tu examen final : ");
      examenFinal = scanner.nextDouble();
      System.out.println("Dime tu evaluacion continua : ");
      evaluacionContinua = scanner.nextDouble() ;
      System.out.println("Dime tu nota del profesor : ");
      notaProfesor = scanner.nextDouble();

     final double examenFinalPonderado= 0.5;
     final double  examenParcialPonderado= 0.25;
     final double  evaluacionContinuaPonderado=0.2;
     final double notaProfesorPonderado=0.05;

      double notaFinal;
      notaFinal = examenFinal * examenFinalPonderado +
                  examenParcial * examenParcialPonderado +
                  evaluacionContinua * evaluacionContinuaPonderado *
                  notaProfesor * notaProfesorPonderado;
                  System.out.println("Nota final = " + notaFinal);
      }
      }
  
    