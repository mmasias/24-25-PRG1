import java.util.Scanner;
class CalculaNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    
    double examenFinal;
    double examenParcial;
    double evaluacionContinua;
    double evalucionProfesor;
    
    System.out.println("dime tu nota examen final");
    examenFinal = scanner.nextDouble();
    System.out.println("dime tu nota examen parcial");
    examenParcial = scanner.nextDouble();
    System.out.println("dime tu nota evaluacion continua"); 
    evaluacionContinua = scanner.nextDouble();
    System.out.println("dime tu nota evaluacion profesor");
    evalucionProfesor = scanner.nextDouble();
    
    final double EXAMEN_FINAL_PONDERADO;
    final double EXAMEN_PARCIAL_PONDERADO;
    final double EVALUACION_CONTINUA_PONDERADA;
    final double EVALUACION_PROFESOR_PONDERADA; 

    EXAMEN_FINAL_PONDERADO = 0.5;
    EXAMEN_PARCIAL_PONDERADO = 0.25;
    EVALUACION_CONTINUA_PONDERADA = 0.2;
    EVALUACION_PROFESOR_PONDERADA = 0.05 ; 
    
    double promedioNota;
    
    promedioNota = (examenFinal * EXAMEN_FINAL_PONDERADO + examenParcial * EXAMEN_PARCIAL_PONDERADO + evaluacionContinua * 
    EVALUACION_CONTINUA_PONDERADA + evalucionProfesor * EVALUACION_PROFESOR_PONDERADA);
    System.out.println("Nota final = " + promedioNota);
    scanner.close();
    }

}
