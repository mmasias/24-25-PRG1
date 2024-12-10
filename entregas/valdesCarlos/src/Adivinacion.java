import java.util.Scanner;

public class Adivinacion {
    public static void main(String[] args) {
        final int NUMERO_TURNOS = 10;
        boolean estaJugando = true;
        int numeroMaquina = pensarNumero();
        int turno = 0;
        while(estaJugando) {
            turno ++;
            int numeroUsuario = pedirNumero();
            boolean adivino = numeroUsuario == numeroMaquina;
            darPista(numeroMaquina, numeroUsuario);
            estaJugando = !adivino && turno < NUMERO_TURNOS;
        }
        String estadoFinal = (turno < 10 ? "" : "no ") + "ganó!";
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
        System.out.println("Dime un numero entre el 1 y el 100");
        Scanner entradaUsuario = new Scanner (System.in);
        return entradaUsuario.nextInt();
    }

    static void darPista(int numeroMaquina, int numeroUsuario) {
        int diferencia = Math.abs(numeroMaquina - numeroUsuario);
        System.out.println(diferencia <= 5 ? "Caliente" : diferencia <= 10 ? "Tibio" : "Frio");
    }



}