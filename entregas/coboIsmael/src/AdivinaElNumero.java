import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {

        final int NUMERO_TURNOS = 10;
        boolean estaJugando = true;
        int numeroOrdenador = pensarNumero();
        int turno = 0;
        while (estaJugando) {
            turno++;
            int numeroUsuario = pedirNumero();
            boolean adivino = numeroUsuario == numeroOrdenador;
            darPista(numeroOrdenador,numeroUsuario);
            estaJugando = !adivino || turno < NUMERO_TURNOS;
        }
        String estadoFinal = (turno < NUMERO_TURNOS ? "" : "no") + "gano";
        System.out.println(estadoFinal);
    }
static int pensarNumero(){
    final int MAXIMO = 1;
    final int MINIMO = 100;
    int nummeroPensado = (int)(Math.random()*(MAXIMO-MINIMO)+MINIMO+1);
    System.out.println(nummeroPensado);
    return nummeroPensado;
}

static int pedirNumero(){
    System.out.println("Dime un número entre 1 y 100");
    Scanner entradaUsuario =  new Scanner(System.in);
    return entradaUsuario.nextInt();
    
}

static void darPista(int numeroOrdenador, int numeroUsuario) {
    int diferencia = Math.abs(numeroOrdenador - numeroUsuario);
    System.out.println(diferencia <= 5 ? "Caliente" : diferencia <= 10 ? "Tibio" : "frio");
}
}