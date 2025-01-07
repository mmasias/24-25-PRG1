    import java.util.Scanner;
    public class Calcular_Nota_Final {

    public static void main(String[] args) {
    @SuppressWarnings("resource")           
    Scanner scanner = new Scanner(System.in); 
                 
      double evaluacionContinua;
      double  examenFinal;
      double examenParcial ; 
      double evaluacionProfe;

        System.out.println("Digite su nota");
        examenFinal =  scanner.nextDouble();
        System.out.println("Digite su nota");
        evaluacionContinua =scanner.nextDouble() ;
        System.out.println("Digite su nota");
        examenParcial = scanner.nextDouble();
        System.out.println("Digite su nota");
        evaluacionProfe = scanner.nextDouble();

      final double EXAMEN_FINAL_PONDERADO = 0.5;    
      final double EXAMEN_PARCIAL_PONDERADO = 0.25;  
      final double EVALUACION_CONTINUA_PONDERADO = 0.2;  
      final double NOTA_PROFESOR_PONDERADO = 0.05;  

        double notaFinal = (examenFinal*EXAMEN_FINAL_PONDERADO) + (evaluacionContinua*EVALUACION_CONTINUA_PONDERADO)  + (examenParcial*EXAMEN_PARCIAL_PONDERADO) +(evaluacionProfe*NOTA_PROFESOR_PONDERADO);
        System.out.println("Su nota final es "+ notaFinal*10 + "%");

}
}
