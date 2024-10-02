import java.util.Scanner;

public class CalculoNotaFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota_examen_final_ponderada, nota_evaluacion_continua_ponderada, nota_examen_parcial_ponderada, nota_evaluacion_profesor_ponderada, nota_final;
        
        final double PONDERACION_EXAMEN_FINAL = 0.5;
        final double PONDERACION_EVALUACION_CONTINUA = 0.25;
        final double PONDERACION_EXAMEN_PARCIAL = 0.2;
        final double PONDERACION_EVALUACION_PROFESOR = 0.05;

        System.out.println("Nota examen final: ");
        nota_examen_final_ponderada = scanner.nextDouble() * PONDERACION_EXAMEN_FINAL;

        System.out.println("Nota evaluacion continua: ");
        nota_evaluacion_continua_ponderada = scanner.nextDouble() * PONDERACION_EVALUACION_CONTINUA;
        
        System.out.println("Nota examen parcial: ");
        nota_examen_parcial_ponderada = scanner.nextDouble() * PONDERACION_EXAMEN_PARCIAL;
        
        System.out.println("Nota evaluacion profesor: ");
        nota_evaluacion_profesor_ponderada = scanner.nextDouble() * PONDERACION_EVALUACION_PROFESOR;

        nota_final = nota_examen_final_ponderada  + nota_evaluacion_continua_ponderada + nota_examen_parcial_ponderada + nota_evaluacion_profesor_ponderada;
        
        if (nota_final > 10) {
            System.out.println("Introduce bien los valores por favor.");
        }
        else if (nota_final < -1){
            System.out.println("Introduce bien los valores por favor.");
        }
        else if (nota_final < 5){
            System.out.println("Suerte la proxima, tu nota es " + nota_final);
        }
        else{
        System.out.println("¡Felicidades! Tu nota final es " + nota_final);
        }
        
        scanner.close();  
    }
}


/*
public class MiNota {
    public static double calcularNota(Scanner scanner, String tipoNota, double peso) {
        System.out.print("Nota " + tipoNota + ": ");
        return scanner.nextDouble() * peso;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota_final = calcularNota(scanner, "Examen Final", 0.5) +
                            calcularNota(scanner, "Evaluacion continua", 0.2) +
                            calcularNota(scanner, "Examen Parcial", 0.25) +
                            calcularNota(scanner, "Evaluacion profesor", 0.05);
        
        System.out.println("Nota final: " + nota_final);
    }
} 
*/
