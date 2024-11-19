package Java;

import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {

        final int INTENTOS_MAXIMOS = 10;

        boolean estaJugando = true;
        int numeroOrdenador = pensarNumero();
        int turno = 0;

        while (estaJugando) {
            turno++;
            int numeroUsuario = pedirNumero();
            boolean adivino = numeroOrdenador == numeroUsuario;
            darPista(numeroOrdenador, numeroUsuario);
            estaJugando = !adivino && turno < INTENTOS_MAXIMOS;
        }

        String estadoFinal = (turno < INTENTOS_MAXIMOS ? "" : "no") + "gano!";
        System.out.println(estadoFinal);

    }

    static int pedirNumero() {
        System.out.println("Adivina el número entre 1 y 100");
        Scanner entradaUsuario = new Scanner(System.in);
        return entradaUsuario.nextInt();
    }

    static int pensarNumero() {
        final int LIMITE_MINIMO = 1;
        final int LIMITE_MAXIMO = 100;
        return (int) (Math.random() * (LIMITE_MAXIMO - LIMITE_MINIMO + 1)) + LIMITE_MINIMO;
    }

    static void darPista(int numeroOrdenador, int numeroUsuario) {
        int diferencia = Math.abs(numeroOrdenador - numeroUsuario);
        System.out.println(diferencia <= 5 ? "Caliente" : diferencia <= 10 ? "templado" : "frio");
    }

    static int hacerTrampas(int numeroOrdenador, int numeroUsuario){
        if{  
         Math.abs(numeroOrdenador-numeroUsuario) <= 5
        }
    }

}