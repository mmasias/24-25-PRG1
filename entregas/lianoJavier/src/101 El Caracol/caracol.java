class caracol {

  static final String borde = "[__]",
      pared = "[]",
      fondo = ":.",
      caracol = "_@)_/`",
      agua = "~~~~",
      coche = "o-=-o";
  static final int ALTURA_SUPERFICIE = 0;

  public static void main(String[] args) {

    int profundidad = calcularAterrizaje();
    while (profundidad > ALTURA_SUPERFICIE) {
      profundidad += calcularSubida() - calcularBajada();
      System.out.println(profundidad);
    }

    profundidad = profundidad > ALTURA_SUPERFICIE ? 20 : profundidad;
    System.out.println(profundidad);
  }

  static int calcularAterrizaje() {
    return calcularIntAleatorio(0, 10);
  }

  static int calcularIntAleatorio(int minimo, int maximo) {
    return (int) (Math.random() * (maximo - minimo + 1) + minimo);
  }

  static int calcularSubida() {
    return calcularIntAleatorio(1, 4);
  }

  static int calcularBajada() {
    return calcularIntAleatorio(0, 2);
  }

}
