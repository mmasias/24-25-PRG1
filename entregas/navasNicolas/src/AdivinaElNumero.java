import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {

        final int NUMERO_TURNOS = 10;
        boolean jugando = true;
        int unidadAleatoria = pensarNumero();
        int turno = 0;
        int vecesCaliente = 0;

        while (jugando) {
            turno++;
            int numeroUsuario = pedirNumero();
            
            if (!numeroValido(numeroUsuario)) {
                System.out.println("Del 1 al 100!");
            } else {
                boolean adivino = numeroUsuario == unidadAleatoria;
                vecesCaliente = darPista(unidadAleatoria, numeroUsuario, vecesCaliente);

                if (vecesCaliente >= 2) {
                    unidadAleatoria = pensarNumero();
                    vecesCaliente = 0;
                }
                jugando = !adivino && turno < NUMERO_TURNOS;
            }
        }
        resultadoFinal(turno < NUMERO_TURNOS);
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

    static boolean numeroValido(int numero) {
        return numero >= 1 && numero <= 100;
    }

    static int darPista(int unidadAleatoria, int numeroUsuario, int vecesCaliente) {
        int diferencia = Math.abs(unidadAleatoria - numeroUsuario);
        System.out.println(estaCaliente(diferencia) ? "Caliente" : diferencia <= 10 ? "Tibio" : "Frio");
        return estaCaliente(diferencia) ? vecesCaliente + 1 : vecesCaliente;
    }

   static boolean estaCaliente(int diferencia) {
        return diferencia <= 5;
    }

    static void resultadoFinal(boolean gano) {
        String estadoFinal = gano ? "¡Gano!" : "¡No Gano!";
        System.out.println(estadoFinal);
    }
}
