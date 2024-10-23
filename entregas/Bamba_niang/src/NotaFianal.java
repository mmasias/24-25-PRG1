import java.util.Scanner;
class NotaFianal{

    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        double examenFinal, examenParcial, evaluavionContinua, notaProfe;

        System.out.println("Dime tu nota de examen final: ");
        examenFinal = scanner.nextDouble();
        System.out.println("Dime tu nota de examen parcial:");
        examenParcial = scanner.nextDouble();
        System.out.println("Dime tu nota de evaluacion continua:");
        evaluavionContinua = scanner.nextDouble();
        System.out.println("Dime tu nota de frofesor:");
        notaProfe = scanner.nextDouble(); 

        final double EX_FINAL;
        final double EX_PARCIAL;
        final double  EV_CONTINUA;
        final double NOTA_PROFE;

        EX_FINAL = 0.5;
        EX_PARCIAL = 0.2;
        EV_CONTINUA = 0.25;
        NOTA_PROFE = 0.05;

        double notaFinal;

        notaFinal = examenFinal * EX_FINAL +
                    examenParcial * EX_PARCIAL +
                    evaluavionContinua * EV_CONTINUA +
                    notaProfe * NOTA_PROFE;


                    System.out.println("Nota final = " + notaFinal);






        

        
        
    } 
    
        
    
}