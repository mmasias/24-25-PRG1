import java.util.Scanner;
class CalculaNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double examenFinal, examenParcial, evaluacionContinua, notaProfesor; 

        System.out.println("Dime tu examen parcial: ");
        examenParcial = scanner.nextDouble();
        System.out.println("Dime tu examen final: ");
        examenFinal = scanner.nextDouble();
        System.out.println("Dime tu evaluacion continua: ");
        evaluacionContinua = scanner.nextDouble(); 
        System.out.println("Dime tu nota del profesor: ");
        notaProfesor = scanner.nextDouble();

        final double FINAL_PONDERADO = 0.5;
        final double PARCIAL_PONDERADO = 0.25;
        final double CONTINUA_PONDEARADO = 0.2;
        final double PROFESOR_PONDERADO = 0.05;

        double notaFinal; 

        notaFinal = examenFinal * FINAL_PONDERADO + 
                    examenParcial * PARCIAL_PONDERADO + 
                    evaluacionContinua * CONTINUA_PONDEARADO + 
                    notaProfesor * PROFESOR_PONDERADO;

        System.out.println("Nota final = " + notaFinal);
    }
}
