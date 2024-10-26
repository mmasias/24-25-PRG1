import java.util.Scanner;

class CalcularNota{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaExFinal;
        double notaParcial;
        double notaContinua;
        double notaProfe;
        double notaFinal;

        double porcentajeFinal = 0.5;
        double porcentajeParcial = 0.25;
        double porcentajeContinua = 0.20;
        double porcentajeProfe = 0.05;

        System.out.println(" Cuanto has sacado en tu examen final");
        notaExFinal = scanner.nextDouble();

        System.out.println(" Cuanto has sacado en el parcial");
        notaParcial = scanner.nextDouble();

        System.out.println(" Cuanto has sacado en Evaluacion Continua");
        notaContinua = scanner.nextDouble();

        System.out.println(" Cuanto te a dado el profesor en participacion de clase e interes ");
        notaProfe = scanner.nextDouble();

        notaFinal = porcentajeFinal*notaExFinal + porcentajeParcial*notaParcial + porcentajeContinua*notaContinua + porcentajeProfe*notaProfe;

        System.out.println("Tu nota final del curso es de: "+notaFinal+"");


    }
}