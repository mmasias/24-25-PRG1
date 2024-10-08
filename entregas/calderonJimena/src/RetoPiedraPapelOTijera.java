import java.util.Scanner;

public class RetoPiedraPapelOTijera {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Juguemos a Piedra, Papel o Tijera!");

    int piedra = 1;
    int papel = 2;
    int tijera = 3;

    int eleccionDelOrdenador = (int) (Math.random() * (3 - 1) + 1);

    int eleccionUsuario;

    System.out.println("Elige: 1 para Piedra, 2 para Papel,3 para Tijera");
    eleccionUsuario = scanner.nextInt();

    System.out.println("Tu eleccion: " + eleccionUsuario);
    System.out.println("Eleccion del ordenador: " + eleccionDelOrdenador);

    String veredicto;

    veredicto = (eleccionUsuario == eleccionDelOrdenador) ? "Empate!"
        : (eleccionUsuario == 1 && eleccionDelOrdenador == 3) ||
            (eleccionUsuario == 2 && eleccionDelOrdenador == 1) ||
            (eleccionUsuario == 3 && eleccionDelOrdenador == 2) ? "¡Ganaste!" : "Perdiste.";

    System.out.println(veredicto);
    scanner.close();
  }
}
