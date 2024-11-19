import java.util.Scanner;
import java.util.Random;


class AdivinaNumeroRandom{
    public static void main(String[] args) {
              
        final int NUMERO_TURNOS = 10;
        boolean estanJugando = true;
        int turno = 0;
        int numeroOrdenador = pensarNumeroMaquina();

        do{
            turno++;
            int numeroUsuario = pedirNumeroUsuario();
            verificarNumero(numeroOrdenador, numeroUsuario);
            boolean adivino = numeroUsuario == numeroOrdenador;
            estanJugando = !adivino && turno <  NUMERO_TURNOS;
        }while(estanJugando);
        String estadoFinal = (turno < NUMERO_TURNOS ? "" : "no") + "gano!";
        System.out.println(estadoFinal);
    }

    static int pedirNumeroUsuario()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero entre el 1 y el 100");
        return scanner.nextInt();
        
    }

    static int pensarNumeroMaquina()
    {
        Random random = new Random();
        int numeroRandom = random.nextInt(100 - 1) + 1;
        return numeroRandom;   
    }

    static void verificarNumero(int numeroOrdenador, int numeroUsuario) {
        int diferencia = Math.abs(numeroOrdenador-numeroUsuario);
        System.out.println(diferencia <= 5 ? "Caliente" : diferencia <= 10 ? "Tibio" : "Frio");
    }  
}