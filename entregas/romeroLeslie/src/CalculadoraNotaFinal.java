import java.until.scanner

class CalculadoraNotaFinal {

    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);

        double examenFinal, examenParcial, evaluacionContinua, notaProfesor ;

        
        System.out.printIn ("Dime la nota de examen parcial");
        examenParcial= scanner.nextDouble();
        System.out.printIn ("Dime la nota de examen final");
        examenFinal= scanner.nextDouble();
        System.out.printIn ("Dime la nota de evaluacion continua");
        evaluacionContinua= scanner.nextDouble();
        System.out.printIn ("Dime la nota del profesor");
        notaProfesor= scanner.nextDouble();
         
        final double EXAMEN_FINAL_PONDERADO = 0.5;
        final double EXAMEN_PARCIAL_PONDERADO = 0.2;
        final double EVALUACICON_CONTINUA_PONDERADO = 0.25;
        final double EVALUACON_PROFESOR_PONDERADO  = 0.05;
        
        double notaFinal;

    notaFinal = examenFinal * EXAMEN_FINAL_PONDERAD +
                 examenParcial * EXAMEN_PARCIAL_PONDERADO + 
                 evaluacionContinua * VALUACION_CONTINUA_PONDERADO +
                 notaProfesor * NOTA_PROFESOR_PONDERADO;   

    System.out.printIn ("Nota final = " + notaFinal);             
