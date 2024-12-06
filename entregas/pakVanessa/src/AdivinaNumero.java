import java.util.Scanner;
public class AdivinaNumero {
    public static void main(String[] args) {
        final int NUMERO_TURNOS = 10;
        boolean estanJugando = true;
        int numeroOrdenador = pensarNumero();
        int turno = 0;
        while (estanJugando) {
            turno++;
            int numeroUsuario = pedirNumero();
            boolean adivino = numeroUsuario == numeroOrdenador;
            darPista(numeroOrdenador, numeroUsuario);
            estanJugando = !adivino && turno < NUMERO_TURNOS ;
        }
        String estadoFinal = (turno < NUMERO_TURNOS ? "" : "no ") + "gano!";
        System.out.println(estadoFinal);
    }
    static int pensarNumero(){
        final int MAXIMO = 100;
        final int MINIMO = 1;
        int NumeroOrdenador = (int)(Math.random()*(MAXIMO-MINIMO)+MINIMO);
        return NumeroOrdenador;
    }

    static int  pedirNumero(){
        System.out.println("Dime un número entre 1 y 100");
        Scanner entradaUsuario = new Scanner(System.in);
        return entradaUsuario.nextInt();
    }

    public static void darPista(int numeroOrdenador, int numeroUsuario){
        int diferencia = Math.abs(numeroOrdenador-numeroUsuario);
        System.out.println(diferencia <= 5 ? "Caliente" : diferencia <= 10 ? "Tibio" : "Frio");

    }        

}