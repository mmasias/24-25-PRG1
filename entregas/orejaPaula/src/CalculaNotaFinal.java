import java.util.Scanner; 
class CalculaNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     double examenfinal, examenParcial, evaluacionContinua, notaProfesor;

     System.out.println("Dime tu examen parcial: ");
     examenParcial = scanner.nextDouble();
     System.out.println("Dime tu examen final: ");
     examenfinal =  scanner.nextDouble();
      System.out.println("Dime tu examen continua: ");
     evaluacionContinua = scanner.nextDouble() ;
      System.out.println("Dime tu examen profesor: ");
     notaProfesor =  scanner.nextDouble();

     final double EXAMEN_FINAL_PONDERADO = 0.5;
     final double EXAMEN_PARCIAL_PONDERADO = 0.25;
     final double EXAMEN_CONTINUA_PONDERADO = 0.2;
     final double EXAMEN_PROFESOR_PONDERADO = 0.05;

     double notaFinal;

   
     notaFinal = examenfinal * EXAMEN_FINAL_PONDERADO +
                 examenParcial * EXAMEN_PARCIAL_PONDERADO +
                 evaluacionContinua * EXAMEN_CONTINUA_PONDERADO +
                 notaProfesor * EXAMEN_PROFESOR_PONDERADO;

                 System.out.println("NotaFinal = " + notaFinal ) ;
     }
 }     