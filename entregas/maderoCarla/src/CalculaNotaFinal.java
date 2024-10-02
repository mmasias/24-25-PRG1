
class CalculaNotaFinal {
    public static void main(string [] args ){
        
        double examenParcias, examenFinal, evaluacionContinua, notaProfesor;

        final double examenParcialPonderado = 0.25; 
        final double examenFinalPonderado= 0.5;
        final double evaluacionContinuaPonderado= 0.2;
        final double notaProfesorPonderado = 0.05;

        examenParcial = 7; 
        examenFinal= 9;
        evaluacionContinua= 6;
        notaProfesor = 5;

        double notaFinal;
        
        notaFinal = examenFinal * examenFinalPonderado + examenParcial * examenParcialPonderado + evaluacionContinua * evaluacionContinuaPonderado + notaProfesor * notaProfesorPonderado

        system.out.println("Nota Final = " + notaFinal);
    }
}

//codigo para poder utilizar mas valores
import.java.until.Scanner;
class CalculaNotaFinal {
    public static void main(string [] args ){
        Scanner scanner = new Scanner(system.in);

        double examenParcias, examenFinal, evaluacionContinua, notaProfesor;

        system.out.println("Dime tu examen parcial:");
        examenParcial = scanner.nextDouble(); 
        system.out.println("Dime tu examen final:");
        examenFinal= scanner.nextDouble();
        system.out.println("Dime tu evaluacion continua:");
        evaluacionContinua= scanner.nextDouble();
        system.out.println("Dime tu nota del profesor:");
        notaProfesor = scanner.nextDouble();

        final double examenParcialPonderado = 0.25; 
        final double examenFinalPonderado= 0.5;
        final double evaluacionContinuaPonderado= 0.2;
        final double notaProfesorPonderado = 0.05;

        double notaFinal;
        
        notaFinal = examenFinal * examenFinalPonderado + examenParcial * examenParcialPonderado + evaluacionContinua * evaluacionContinuaPonderado + notaProfesor * notaProfesorPonderado

        system.out.println("Nota Final = " + notaFinal);
    }
}