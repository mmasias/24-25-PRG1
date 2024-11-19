import java.util.Scanner;

public class AdivinaNumero {

     public static void main(String[] args){
        final int NUMERO_DE_TURNOS = 10;
        boolean estaJugando = true;
        int NumeroOrdenador = pensarNumero();
        int turno = 0;
        while(estaJugando) {
            turno++;
            int numeroUsuario = pedirNumero();
            boolean adivino = numeroUsuario == NumeroOrdenador;
            darPista(NumeroOrdenador, numeroUsuario);
            estaJugando = !adivino && turno < NUMERO_DE_TURNOS;
        }
        String estadoFinal = (turno < 10 ? "" : "no ") + "gano!";
        System.out.println(estadoFinal);

        }


    static int pensarNumero(){
        final int MAXIMO = 100;
        final int MINIMO = 1;
        int NumeroOrdenador = (int) (Math.random()*(MAXIMO-MINIMO)+MINIMO);
        return NumeroOrdenador;
    }

    static int pedirNumero(){
        System.out.println("Dime un numero entre 1 y 100");
        Scanner entradaUsuario = new Scanner(System.in);
        return entradaUsuario.nextInt();
    }
    static void darPista(int numeroUsuario,int NumeroOrdenador){
        int diferencia = Math.abs(NumeroOrdenador- numeroUsuario);
        System.out.println(diferencia <= 5 ? "Caliente" : diferencia <= 10 ? "tibio" : "Frio" );
    }
}


