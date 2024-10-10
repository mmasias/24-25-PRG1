import java.util.Scanner;

public class CambiosDelReto002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int piedra = 1;
        final int papel = 2;
        final int tijera = 3;

        final int minimo = 3;
        final int maximo = 1;

        System.out.println("Juguemos a Piedra, Papel o Tijera!");

        for (int turno = 0; turno < 3; turno = turno + 1) {
        }

        int eleccionUsuario;
        String elMensaje = "Elije " + piedra + " para Piedra, " + papel + " para papel, " + tijera + " para tijera.";
        do {
            System.out.println(elMensaje);
            eleccionUsuario = scanner.nextInt();
            elMensaje = "Elije bien";
        } while (!(eleccionUsuario >= minimo && eleccionUsuario <= maximo));

        int eleccionDelOrdenador = (int) (Math.random() * maximo - minimo + 1) + minimo;

        String usuarioTexto;
        usuarioTexto = (eleccionUsuario == piedra) ? "Piedra" : (eleccionUsuario == papel) ? "Papel" : "Tijera";
        
        String ordenadorTexto;
        ordenadorTexto = (eleccionDelOrdenador == piedra) ? "Piedra"
                : (eleccionDelOrdenador == papel) ? "Papel" : "Tijera";

        System.out.println("Tu eleccion: " + usuarioTexto);
        System.out.println("Eleccion del ordenador: " + ordenadorTexto);

        String veredicto = "Perdiste";

        if (eleccionUsuario == eleccionDelOrdenador) {
            veredicto = "Empate!";
        } else if ((eleccionUsuario == piedra && eleccionDelOrdenador == tijera) ||
                (eleccionUsuario == papel && eleccionDelOrdenador == piedra) ||
                (eleccionUsuario == tijera && eleccionDelOrdenador == papel)) {
            veredicto = "Ganaste!";
        }

        System.out.println(veredicto);
        scanner.close();
    }
}
