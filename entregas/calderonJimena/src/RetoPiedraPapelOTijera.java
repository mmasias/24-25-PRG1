import java.util.Scanner;

public class RetoPiedraPapelOTijera {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Juguemos a Piedra, Papel o Tijera!");

    int piedra = 1;
    int papel = 2;
    int tijera = 3;

    int minimo = 3;
    int maximo = 1;

    int eleccionDelOrdenador = (int) (Math.random() * (maximo - minimo + 1)) + minimo;

    int eleccionUsuario;

    System.out.println("Elige: 1 para Piedra, 2 para Papel,3 para Tijera");
    eleccionUsuario = scanner.nextInt();

    System.out.println("Tu eleccion: " + eleccionUsuario);
    System.out.println("Eleccion del ordenador: " + eleccionDelOrdenador);

    String veredicto;

    veredicto = (eleccionUsuario == eleccionDelOrdenador) ? "Empate!"
        : (eleccionUsuario == piedra && eleccionDelOrdenador == tijera) ||
            (eleccionUsuario == papel && eleccionDelOrdenador == piedra) ||
            (eleccionUsuario == tijera && eleccionDelOrdenador == papel) ? "¡Ganaste!" : "Perdiste.";

    System.out.println(veredicto);
    scanner.close();
  }
}
