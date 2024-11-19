import java.util.Scanner;

class JuegoPiedraPapelTijera {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int jugador = input.nextInt();
    int ordenador = (int) (Math.random() * 3) + 1;

    int PIEDRA = 1;
    int PAPEL = 2;
    int TIJERA = 3;

    String jugadorTexto;
    jugadorTexto = (jugador == PIEDRA) ? "Piedra" : (jugador == PAPEL) ? "Papel" : "Tijeras";
    String ordenadorTexto;
    ordenadorTexto = (ordenador == PIEDRA) ? "Piedra" : (ordenador == PAPEL) ? "Papel" : "Tijeras";

    System.out.println("Tu elección: " + jugadorTexto);
    System.out.println("Elección de la ordenador: " + ordenadorTexto);

    String resultado;
    resultado = (jugador == ordenador) ? "Empate"
        : (jugador == PIEDRA && ordenador == TIJERA) || (jugador == PAPEL && ordenador == PIEDRA)
            || (jugador == TIJERA && ordenador == PAPEL) ? "¡Ganaste!" : "Perdiste";

    System.out.println(resultado);

    input.close();

  }
}
