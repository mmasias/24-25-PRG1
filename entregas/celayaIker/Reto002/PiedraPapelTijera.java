package entregas.celayaIker.Reto002;
import java.util.Scanner;

class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ELEGIR_PIEDRA = 1;
        final int ELEGIR_PAPEL = 2;
        final int ELEGIR_TIJERA = 3;
        final int MINIMO = 1;
        final int MAXIMO = 3;

        for(int turno = 0; turno < 3; turno = turno + 1){
            int numeroOrdenador = (int) (Math.random()*(MAXIMO-MINIMO + 1) + MINIMO);
            int numeroUsuario;

            System.out.println("Juguemos a Piedra, Papel o Tijera!");
            do {
                System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para Tijera");
                numeroUsuario = scanner.nextInt();
            }while (!(numeroUsuario >= MINIMO && numeroUsuario <= MAXIMO));
            

            String eleccionUsuario;
            String eleccionOrdenador;

            eleccionUsuario = numeroUsuario == 1 ? "Piedra"
                : numeroUsuario == 2 ? "Papel"
                : "Tijera";

            eleccionOrdenador = numeroOrdenador == 1 ? "Piedra"
                : numeroOrdenador == 2 ? "Papel"
                : "Tijera";

            System.out.println("Tu elección: " + eleccionUsuario);
            System.out.println("Elección del ordenador: " + eleccionOrdenador);

            String resultado = "Perdiste!";

            if (numeroUsuario == numeroOrdenador){
                resultado = "Empate!";
            } else if((numeroUsuario == ELEGIR_PIEDRA && numeroOrdenador == ELEGIR_TIJERA ||
                        numeroUsuario == ELEGIR_PAPEL && numeroOrdenador == ELEGIR_PIEDRA ||
                        numeroUsuario == ELEGIR_TIJERA && numeroOrdenador == ELEGIR_PAPEL)) {
                resultado = "Ganaste!";
            }


            System.out.println(resultado);
        }
        
        scanner.close();
    }
}