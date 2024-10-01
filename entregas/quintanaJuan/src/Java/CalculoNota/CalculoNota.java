import java.util.Scanner;


class CalculoNota{

    public static void main(String [] args ) {

            Scanner scanner = new Scanner(System.in);

            double exFinal;
            double exParcial;
            double evContinua;
            double evProfesor;

            double exFinalPondera = 0.5;
            double exParcialPondera = 0.25;
            double evContinuaPondera = 0.20;
            double evProfesorPondera = 0.05;

                System.out.println("Dime tu examen parcial:");
                exFinal = scanner.nextDouble();

                System.out.println("Dime tu examen final");
                exParcial = scanner.nextDouble();
                
                System.out.println("Dime tu evaluación continua:");
                evContinua = scanner.nextDouble();

                System.out.println("Dime tu evaluación del profesor:");
                evProfesor = scanner.nextDouble();


                    double notaFinal;


                        notaFinal = exFinal * exFinalPondera + 
                        exParcial * exParcialPondera + 
                        evContinua * evContinuaPondera + 
                        evProfesor * evProfesorPondera;

                        System.out.println("Nota final = " + notaFinal);


    }
}

