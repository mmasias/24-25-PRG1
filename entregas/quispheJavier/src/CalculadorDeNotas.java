import java.util.Scanner;

public class CalculadorDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir las notas
        System.out.print("Ingrese la nota del examen final (50%): ");
        double examenFinal = scanner.nextDouble();
        
        System.out.print("Ingrese la nota de la evaluación continua (20%): ");
        double evaluacionContinua = scanner.nextDouble();
        
        System.out.print("Ingrese la nota del examen parcial (25%): ");
        double examenParcial = scanner.nextDouble();
        
        System.out.print("Ingrese la nota de la evaluación del profesor (5%): ");
        double evaluacionProfesor = scanner.nextDouble();
        
        // Calcular la nota final
        double notaFinal = (examenFinal * 0.50) +
                           (evaluacionContinua * 0.20) +
                           (examenParcial * 0.25) +
                           (evaluacionProfesor * 0.05);
        
        // Mostrar la nota final
        System.out.printf("La nota final es: %.2f\n", notaFinal);
        
        scanner.close();
    }
}