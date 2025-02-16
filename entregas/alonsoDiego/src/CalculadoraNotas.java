import java.util.Scanner; 

 class CalcularNotaFinal  {

 public static void main(String[] args)  {

    Scanner scanner = new Scanner (System. in); 

    double examenFinal, examenParcial, evaluacionContinua, notaProfesor;  

    System.out.println("Dime tu examen parcial: "); 
    examenParcial = scanner .nextDouble();  

    System.out.println("Dime tu examen final: "); 
    examenFinal = scanner.nextDouble();  

    System.out.println("Dime tu evaluacion continua: ");  
    evaluacionContinua = scanner.nextDouble();  

    System.out.println("Dime la nota del profesor: "); 
    notaProfesor = scanner.nextDouble();  

    final double EXAMEN_FINAL_PONDERADO = 0.5;
    final double EXAMEN_PARCIAL_PONDERADO = 0.25;
    final double EVALUACION_CONTINUA_PONDERADA = 0.20; 
    final double NOTA_PROFESOR_PONDERADA = 0.05;  

        double notaFinal;  

        notaFinal = examenFinal * EXAMEN_FINAL_PONDERADO +
        examenParcial * EXAMEN_PARCIAL_PONDERADO +
        evaluacionContinua * EVALUACION_CONTINUA_PONDERADA
        + notaProfesor * NOTA_PROFESOR_PONDERADA; 

        System.out.println("Nota final = " + notaFinal);

        scanner.close();
}
}

