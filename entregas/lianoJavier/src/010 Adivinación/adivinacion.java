import java.util.Scanner;

class adivinacion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final int NUMERO_MAXIMO = 100, NUMERO_MINIMO = 1;

    int numeroOrdenador = eleccionOrdenador(NUMERO_MAXIMO, NUMERO_MINIMO);

    int numeroUsuario;
    final int NUMERO_INTENTOS = 4;
    int intento = 0;
    boolean acierta;
    do {
      numeroUsuario = eleccionUsuario(input, NUMERO_MAXIMO, NUMERO_MINIMO);
      acierta = numeroOrdenador == numeroUsuario;
      if (!acierta)
        darPista(numeroUsuario, numeroOrdenador);
      intento++;
    } while (!acierta && intento <= NUMERO_INTENTOS - 1);

    imprimirResumen(acierta, numeroOrdenador);

    input.close();
  }

  private static void darPista(int numeroUsuario, int numeroOrdenador) {
    if (numeroOrdenador > numeroUsuario)
      System.out.println("shh! es mayor.");
    if (numeroOrdenador < numeroUsuario)
      System.out.println("shh! es menor.");
  }

  private static int eleccionOrdenador(int numeroMaximo, int numeroMinimo) {
    return (int) ((Math.random() * numeroMaximo - numeroMinimo + 1) + numeroMinimo);
  }

  private static int eleccionUsuario(Scanner input, int numeroMaximo, int numeroMinimo) {
    int numero;
    boolean numeroCorrecto;
    System.out.println("Elija un número entre 1 y 100. Ambos incluidos.");

    do {
      numero = input.nextInt();

      numeroCorrecto = numero >= numeroMinimo && numero <= numeroMaximo;
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
