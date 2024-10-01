import java.util.Scanner;

public class MiNota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ex_final, ev_con, ex_par, ev_prof, nota_final;
        
        System.out.println("Nota examen final: ");
        ex_final = scanner.nextDouble() * 0.5;
        System.out.println("Nota evaluacion continua: ");
        ev_con = scanner.nextDouble() * 0.2;
        System.out.println("Nota examen parcial: ");
        ex_par = scanner.nextDouble() * 0.25;
        System.out.println("Nota evaluacion profesor: ");
        ev_prof = scanner.nextDouble() * 0.05;

        nota_final = ex_final + ev_con + ex_par + ev_prof;
        
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
