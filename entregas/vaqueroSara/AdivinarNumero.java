import java.util.Scanner;

public class AdivinarNumero {

    public static void main(String[] args) {

        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        final int INTENTOS_DISPONIBLES = 10;
        int intento_actual = 1;
        
        pedirNumero();

        Scanner entrada = new Scanner(System.in);
        String preparado = entrada.nextLine();

        int decisionComputadora = (int) (Math.random() * ((NUMERO_MAXIMO - NUMERO_MINIMO + 1) + NUMERO_MINIMO));
        int numeroUsuario;

        System.out.println(decisionComputadora);
        
        do { 
            
            System.out.println("Intento número " + intento_actual);
            numeroUsuario = entrada.nextInt();
            int diferencia = Math.abs(decisionComputadora - numeroUsuario);
            int diferencia2 = Math.abs(decisionComputadora - numeroUsuario);

            if (numeroUsuario != decisionComputadora) {
                System.out.println("Incorrecto.");
            } else 

            if (diferencia <= 5) {
                System.out.println("Caliente");
            } else if (diferencia <= 10) {
                System.out.println("Tibio");
            } else {
                System.out.println("Frío");
            }
    
            if (diferencia2 <= 5) {
                System.out.println("Caliente");
            } else if (diferencia2 <= 10) {
                System.out.println("Tibio");
            } else {
                System.out.println("Frío");
            }

            if (diferencia < 5 || diferencia2 < 5) {
                System.out.println("Achús!");
                decisionComputadora= decisionComputadora + (int)(Math.random()* (5-1+1)+1);
            } else 
            

            intento_actual++;
            
        } while (intento_actual <= INTENTOS_DISPONIBLES && numeroUsuario != decisionComputadora);

        if (intento_actual > INTENTOS_DISPONIBLES) {

            System.out.println("Perdiste");

        } else 

        System.out.println("Adivinaste");
        entrada.close();

    }
    static void pedirNumero(){
        System.out.println("Bienvenido a Adivina el Número.");
        System.out.println("Deberás adivinar un número del 1 al 100, ambos incluidos.");
        System.out.println("Dispondrás de 10 intentos para adivinarlo, si no lo logras perderás.");
        System.out.println("¿Preparad@?");
    }


}
