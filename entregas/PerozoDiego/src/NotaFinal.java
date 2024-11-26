package src;

import java.util.Scanner;

public class NotaFinal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Examen_Final;
        double Evaluacion_Continua;
        double Examen_Parcial;
        double Evaluacion_Profesor;

        double Nota_Examen_Final;
        double Nota_Evaluacion_Continua;
        double Nota_Examen_Parcial;
        double Nota_Evaluacion_Profesor;

        System.out.print("Introduce tu nota del Examen Final: ");
        Examen_Final = input.nextDouble();

        System.out.print("Introduce tu nota de Evaluación Continua: ");
        Evaluacion_Continua = input.nextDouble();

        System.out.print("Introduce tu nota del Examen Parcial: ");
        Examen_Parcial = input.nextDouble();

        System.out.print("Introduce tu nota de Evaluación del Profesor: ");
        Evaluacion_Profesor = input.nextDouble();

        Nota_Examen_Final = (Examen_Final * 0.5);
        Nota_Evaluacion_Continua = (Evaluacion_Continua * 0.2);
        Nota_Examen_Parcial = (Examen_Parcial * 0.25);
        Nota_Evaluacion_Profesor = (Evaluacion_Profesor * 0.05);

        System.out.println("En el examen final sacaste " + Examen_Final + " y eso equivale a " + Nota_Examen_Final);
        System.out.println("En la evaluación continua sacaste " + Evaluacion_Continua + " y eso equivale a " + Nota_Evaluacion_Continua);
        System.out.println("En el examen parcial sacaste " + Examen_Parcial + " y eso equivale a " + Nota_Examen_Parcial);
        System.out.println("En la evaluación del profesor sacaste " + Evaluacion_Profesor + " y eso equivale a " + Nota_Evaluacion_Profesor);

        double notaFinal = Nota_Evaluacion_Continua + Nota_Evaluacion_Profesor + Nota_Examen_Final + Nota_Examen_Parcial;
        System.out.println("Por lo tanto, al final terminaste sacando un " + notaFinal);

        input.close();
    }
}
