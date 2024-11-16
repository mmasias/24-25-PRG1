import java.util.Scanner;

class adivinacion {
  public static void main(String[] args) {
    final int NUMERO_MAXIMO = 100, NUMERO_MINIMO = 1;

    int numeroOrdenador = eleccionOrdenador(NUMERO_MAXIMO, NUMERO_MINIMO);
    int numeroUsuario = eleccionUsuario(NUMERO_MAXIMO, NUMERO_MINIMO);
    imprimirResumen(numeroUsuario, numeroOrdenador);

  }

  private static int eleccionOrdenador(int numeroMaximo, int numeroMinimo) {
    return (int) ((Math.random() * numeroMaximo - numeroMinimo + 1) + numeroMinimo);
  }

  private static int eleccionUsuario(int numeroMaximo, int numeroMinimo) {
    int numero;
    boolean numeroCorrecto;
    System.out.println("Elija un número entre 1 y 100. Ambos incluidos.");
    do {

      Scanner input = new Scanner(System.in);
      numero = input.nextInt();
      input.close();

      numeroCorrecto = numero >= numeroMinimo && numero <= numeroMaximo;
      if (!numeroCorrecto)
        System.out.println("Numero no valido.");
    } while (numeroCorrecto);
    return numero;
  }

  private static void imprimirResumen(int numeroUsuario, int numeroOrdenador) {
    boolean acierta = numeroOrdenador == numeroUsuario;
    String resultado = "No has acertado";
    if (acierta)
      resultado = "Acertaste!";
    System.out.println(resultado);
  }

}
