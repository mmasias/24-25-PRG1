class adivinacion {
  public static void main(String[] args) {
    final int NUMERO_MAXIMO = 100, NUMERO_MINIMO = 1;

    int numeroOrdenador = eleccionOrdenador(NUMERO_MAXIMO, NUMERO_MINIMO);

  }

  private static int eleccionOrdenador(int numeroMaximo, int numeroMinimo) {
    return (int) ((Math.random() * numeroMaximo - numeroMinimo + 1) + numeroMinimo);
  }
}
