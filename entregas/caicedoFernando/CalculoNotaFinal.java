package entregas.caicedoFernando;

import java.util.Scanner;

 

    class CalculoNotaFinal {

        public static void main(String[]args){

                Scanner scanner = new Scanner(System.in);

      

 

            double examenFinal, examenParcial, evaluacionContinua, notaProfesor;

       

             System.out.println("Ingrese la calificación del examen final: ");

              examenFinal = scanner.nextDouble();

 

             System.out.println("Ingrese la calificación del examen parcial: ");

             examenParcial = scanner.nextDouble();

 

                System.out.println("Ingrese la calificación de evaluación continua: ");

                evaluacionContinua = scanner.nextDouble();

 

                System.out.println("Ingrese la calificación del profesor: ");

                notaProfesor = scanner.nextDouble();

 

                double Examen_Final_Ponderado = 0.5;

                double Examen_Parcial_Ponderado = 0.25;

                double Evaluacion_Continua_Ponderado = 0.2;

                double Nota_Profesor_Ponderado = 0.05;

 

                double notaFinal;

 

                notaFinal = examenFinal * Examen_Final_Ponderado +

                    examenParcial * Examen_Parcial_Ponderado +

                    evaluacionContinua * Evaluacion_Continua_Ponderado +

                    notaProfesor * Nota_Profesor_Ponderado;

 

                System.out.println("Nota final =" + notaFinal);

 

                scanner.close();

            }
            
}
