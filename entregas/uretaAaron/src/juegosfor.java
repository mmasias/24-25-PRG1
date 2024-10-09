
import java.util.Scanner;

class juegosfor{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
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

            System.out.println("La computadora eligió: " + eleccionOrdenador);
            System.out.println(resultado);
        }
    }
}
