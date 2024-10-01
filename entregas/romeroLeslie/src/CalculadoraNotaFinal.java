impor java.until.scanner

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
    double notaFinal;

    notaFinal = examenFinal * EXAMEN_FINAL_PONDERAD +
                 examenParcial * EXAMEN_PARCIAL_PONDERADO + 
                 evaluacionContinua * VALUACION_CONTINUA_PONDERADO +
                 notaProfesor * NOTA_PROFESOR_PONDERADO;   

    System.out.printIn ("Nota final = " + notaFinal);             
