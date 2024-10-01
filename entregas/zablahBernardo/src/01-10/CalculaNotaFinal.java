import java.util.Scanner;
public class CalculaNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    double examenFinal;
    double examenParcial;
    double evaluacionContinua;
    double evalucionProfesor;

    final double EXAMEN_FINAL_PONDERADO = 0.5;
    final double EXAMEN_PARCIAL_PONDERADO = 0.25;
    final double EVALUACION_CONTINUA_PONDERADO = 0.2;
    final double EVALUACION_PROFESOR_PONDERADO = 0.05;

    examenFinal = 7;
    examenParcial = 6;
    evaluacionContinua = 9;
    evalucionProfesor = 9;
    
    double promedioNota;
    
    promedioNota = (examenFinal * EXAMEN_FINAL_PONDERADO 
                    + examenParcial * EXAMEN_PARCIAL_PONDERADO 
                    + evaluacionContinua * EVALUACION_CONTINUA_PONDERADO 
                    + evalucionProfesor * EVALUACION_PROFESOR_PONDERADO);

    System.out.println("Nota final = " + promedioNota);
    }

}