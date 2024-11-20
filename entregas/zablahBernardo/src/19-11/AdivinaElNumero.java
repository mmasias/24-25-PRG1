import java.util.Scanner;
public class AdivinaElNumero {
    public static void main(String[] args) {
        
        int NUMERO_A_ADIVINAR = pensarNumero();
        int oportunidadesRestantes = 10;
        boolean estaJugando = false;
        System.out.println("Adivina el Numero!");
        
        while (!estaJugando && oportunidadesRestantes > 0){
            System.out.println("te quedan " + oportunidadesRestantes + " oportunidades");
            int entradaUsuario = pedirNumero();

            if (entradaUsuario == NUMERO_A_ADIVINAR){
                System.out.println("Has Adivinado el numero!");
                estaJugando = true;
            } else {
                darPista(entradaUsuario, NUMERO_A_ADIVINAR);
                oportunidadesRestantes -= 1;
            }
        }
    }
    
    private static int pensarNumero(){
        final int LIMITE_MAXIMO = 100;
        final int LIMITE_MINIMO = 1;
        final int NUMERO_A_ADIVINAR = (int)(Math.random()*LIMITE_MAXIMO-LIMITE_MINIMO + 1)+LIMITE_MINIMO;
        return (NUMERO_A_ADIVINAR);
    }

    private static int pedirNumero(){
        int entradaUsuario;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta un numero entre 1 y 100");
        entradaUsuario = scanner.nextInt();
        return(entradaUsuario);
    }

    private static void darPista(int entradaUsuario,int NUMERO_A_ADIVINAR){
        int diferencia = Math.abs(NUMERO_A_ADIVINAR - entradaUsuario);
        System.out.println(diferencia <= 5 ? "Caliente" : diferencia <= 10 ? "Tibio" : "Frio");
        }
        
        
}
