import java.util.Scanner;

class Matrices {
  public static void main(String[] args) {

    int[][] mapa = {
        { 1, 1, 0, 0, 0, 0, 0, 2, 2, 2 },
        { 1, 1, 0, 0, 0, 0, 0, 2, 2, 2 },
        { 1, 2, 0, 2, 2, 2, 2, 1, 1, 1 },
        { 1, 2, 0, 2, 0, 2, 0, 2, 1, 0 },
        { 2, 2, 1, 0, 0, 2, 2, 0, 1, 2 },
        { 2, 0, 0, 0, 1, 1, 2, 0, 2, 2 },
        { 2, 2, 0, 2, 0, 0, 1, 2, 2, 2 },
        { 0, 2, 2, 1, 1, 0, 1, 2, 2, 1 },
        { 0, 2, 0, 1, 1, 1, 0, 1, 1, 2 },
        { 1, 2, 2, 1, 0, 2, 2, 1, 0, 0 },
        { 1, 0, 1, 0, 2, 1, 2, 2, 2, 1 }
    };

    int[] posicion = constructorPosicion();

    imprimir(mapa, posicion);
  }

  static int[] constructorPosicion() {
    System.out.print("Dame el valor de X: ");
    int posicionX = pedirPosicion();
    System.out.print("Dame el valor de Y: ");
    int posicionY = pedirPosicion();
    int[] posicion = { posicionX, posicionY };
    return posicion;
  }

  static int pedirPosicion() {
    return new Scanner(System.in).nextInt();
  }

  static String parse(int pixel) {
    final String[] SKINS = {
        "[ ]",
        "...",
        "[-]",
        "_O_"
    };
    return SKINS[pixel];
  }

  static void imprimir(int[][] mapa, int[] coordenadaPersonaje) {
    int PERSONAJE = 3;
    boolean isPersonaje;
    String mensaje;
    for (int columna = 0; columna <= mapa.length; columna++) {
      for (int fila = 0; fila <= mapa[columna].length; fila++) {
        isPersonaje = fila == coordenadaPersonaje[1] && columna == coordenadaPersonaje[0];
        mensaje = isPersonaje ? parse(coordenadaPersonaje[PERSONAJE]) : parse(mapa[fila][columna]);
        System.out.print(mensaje);
      }
      System.out.println();
    }
  }
}
