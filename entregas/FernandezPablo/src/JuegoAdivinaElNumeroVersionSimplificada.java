import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaElNumeroVersionSimplificada {
    public static void main (String args[]){

        final int NUMERO_INTENTOS = 5;
        final int NUMERO_MAXIMO = 50;
        final int NUMERO_MINIMO = 1;
        boolean estaJugando = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego de Adivinar el Numero (Versión Simplificada)");

        int NumeroOrdenador = (int)(Math.random()*(NUMERO_MAXIMO-NUMERO_MINIMO)+NUMERO_MINIMO);

        while (estaJugando){
            
        }







    }
    
}
