import java.util.Scanner;
public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NUMERO_A_ADIVINAR = pensarNumero();
        int oportunidadesRestantes = 10;
        final int NUMERO_CALIENTE = 5;
        final int NUMERO_TIBIO = 10;
        boolean adivinoElNumero = false;


        System.out.println("Adivina el Numero!");
        while (oportunidadesRestantes > 0 && !adivinoElNumero){
            System.out.println("te quedan " + oportunidadesRestantes + " oportunidades");
            int entradaUsuario = pedirNumero();
            System.out.println(NUMERO_A_ADIVINAR);
            if (entradaUsuario == NUMERO_A_ADIVINAR){
                System.out.println("Has Adivinado el numero!");
                adivinoElNumero = true;
            } else if (NUMERO_A_ADIVINAR - entradaUsuario <= NUMERO_CALIENTE){
                System.out.println("Caliente");
                oportunidadesRestantes = oportunidadesRestantes - 1;
            } else if (NUMERO_A_ADIVINAR - entradaUsuario <= NUMERO_TIBIO){
                System.out.println("Tibio");
                oportunidadesRestantes = oportunidadesRestantes - 1;
            } else {
                System.out.println("Frio");
                oportunidadesRestantes = oportunidadesRestantes - 1;
            }
        }
    }
    
    public static int pensarNumero(){
        final int LIMITE_MAXIMO = 100;
        final int LIMITE_MINIMO = 1;
        final int NUMERO_A_ADIVINAR = (int)(Math.random()*LIMITE_MAXIMO-LIMITE_MINIMO + 1)+LIMITE_MINIMO;
        return (NUMERO_A_ADIVINAR);
    }

    public static int pedirNumero(){
        int entradaUsuario;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta un numero entre 1 y 100");
        entradaUsuario = scanner.nextInt();
        return(entradaUsuario);
    }

}

