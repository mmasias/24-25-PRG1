import java.util.Scanner;

public class Adivinacion {
    public static void main(String[] args) {

        final int NUMERO_TURNOS = 10;
        boolean jugando = true;
        int unidadAleatoria = pensarNumero();
        int turno = 0;
        int vecesCaliente = 0;

        System.out.println("Número secreto generado para depuración: " + unidadAleatoria);

        while (jugando) {
            turno++;
            int numeroUsuario = pedirNumero();
            if (numeroUsuario >= 101 || numeroUsuario <= 0) {
                System.out.println("Del 1 al 100!");
            } else {
                boolean adivino = numeroUsuario == unidadAleatoria;
                vecesCaliente = darPista(unidadAleatoria, numeroUsuario, vecesCaliente);

                if (vecesCaliente >= 2) {
                    unidadAleatoria = pensarNumero();
                    System.out.println("El número secreto ha cambiado.");
                    vecesCaliente = 0;
                }
                jugando = !adivino && turno < NUMERO_TURNOS;
            }
        }
        String estadoFinal = (turno < NUMERO_TURNOS ? "" : "no") + "Gano!";
        System.out.println(estadoFinal);
    }

    static int pedirNumero() {
        System.out.println("Adivina el Número entre 1 y 100");
        Scanner entradaUsuario = new Scanner(System.in);
        return entradaUsuario.nextInt();
    }

    static int pensarNumero() {
        final int MAXIMO = 100;
        final int MINIMO = 1;
        return (int) (Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);
    }

    static int darPista(int unidadAleatoria, int numeroUsuario, int vecesCaliente) {
        int diferencia = Math.abs(unidadAleatoria - numeroUsuario);
        System.out.println(diferencia<=5?"Caliente":diferencia<=10?"TIbio":"Frio");
        return vecesCaliente + 1;
    }
}