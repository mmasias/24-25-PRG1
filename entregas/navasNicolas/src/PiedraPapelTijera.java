import java.util.Scanner;

class PiedraPapelTijera {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        for (int turno = 0; turno < 3; turno = turno + 1) {
            int eleccionUsuario;

            System.out.print("Indique su selección [1=Piedra, 2=Papel, 3=Tijera]: ");
            eleccionUsuario = scanner.nextInt();

            int eleccionAleatoria = (int) (Math.random() * 3);

            String eleccionOrdenador = (eleccionAleatoria == 0) ? "piedra"
                    : (eleccionAleatoria == 1) ? "papel" : "tijera";

            String resultado;

            if (eleccionUsuario == eleccionAleatoria) {
                resultado = "empate";
            } else if ((eleccionUsuario == 1 && eleccionOrdenador == "tijera" ||
                    eleccionUsuario == 2 && eleccionOrdenador == "piedra" ||
                    eleccionUsuario == 3 && eleccionOrdenador == "papel")) {
                resultado = "Ganaste!";
            } else {
                resultado = "Perdiste!";
            }

            // String resultado = (eleccionUsuario == 1 &&
            // eleccionOrdenador.equals("tijera")) ? "Ganaste!"
            // : (eleccionUsuario == 2 && eleccionOrdenador.equals("piedra")) ? "Ganaste!"
            // : (eleccionUsuario == 3 && eleccionOrdenador.equals("papel")) ? "Ganaste!"
            // : (eleccionUsuario == 1 && eleccionOrdenador.equals("papel")) ? "Perdiste!"
            // : (eleccionUsuario == 2 && eleccionOrdenador.equals("tijera")) ? "Perdiste!"
            // : (eleccionUsuario == 3 && eleccionOrdenador.equals("piedra")) ? "Perdiste!"
            // : "Empate!";

            System.out.println("La computadora eligió: " + eleccionOrdenador);
            System.out.println(resultado);
        }
    }
}
