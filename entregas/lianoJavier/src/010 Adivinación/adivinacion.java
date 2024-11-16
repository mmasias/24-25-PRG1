import java.util.Scanner;

class adivinacion {
  private static final int NUMERO_MAXIMO = 100, NUMERO_MINIMO = 1;

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numeroOrdenador = eleccionOrdenador();

    int numeroUsuario;
    final int MAXIMO_NUMERO_INTENTOS = 4;
    int intento = 0;
    boolean acierta;
    do {
      numeroUsuario = eleccionUsuario(input);
      acierta = numeroOrdenador == numeroUsuario;
      if (!acierta)
        darPista(numeroUsuario, numeroOrdenador);
      intento++;
    } while (!acierta && intento <= MAXIMO_NUMERO_INTENTOS - 1);

    imprimirResumen(acierta, numeroOrdenador);

    input.close();
  }

  private static void darPista(int numeroUsuario, int numeroOrdenador) {
    String pista = "shh! es menor.";
    if (numeroOrdenador > numeroUsuario)
      pista = "shh! es mayor.";
    System.out.println(pista);
  }

  private static int eleccionOrdenador() {
    return (int) ((Math.random() * NUMERO_MAXIMO - NUMERO_MINIMO + 1) + NUMERO_MINIMO);
  }

  private static int eleccionUsuario(Scanner input) {
    int numero;
    boolean numeroCorrecto;
    System.out.println("Elija un número entre 1 y 100. Ambos incluidos.");

    do {
      numero = input.nextInt();

      numeroCorrecto = numero >= NUMERO_MINIMO && numero <= NUMERO_MAXIMO;
      if (!numeroCorrecto)
        System.out.println("Numero no valido.");
    } while (!numeroCorrecto);

    return numero;
  }

  private static void imprimirResumen(boolean acierta, int numeroOrdenador) {
    String resultado = "No has acertado";
    if (acierta)
      resultado = "Acertaste!";
    System.out.println(resultado);
    System.out.println("Numero elegido por el Ordenador: " + numeroOrdenador);
  }

}
