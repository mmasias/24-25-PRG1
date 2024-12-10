import java.util.Scanner;

class Matrices {
  public static void main(String[] args) {

    int[][] mapa = {
        { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 1, 0, 0, 1, 1, 1, 0, 1, 1 },
        { 0, 1, 0, 0, 1, 0, 1, 0, 1, 0 },
        { 0, 1, 1, 1, 1, 0, 1, 0, 1, 0 },
        { 0, 0, 0, 0, 0, 0, 1, 0, 1, 0 },
        { 0, 0, 0, 1, 1, 1, 1, 0, 1, 0 },
        { 0, 0, 0, 1, 0, 0, 0, 0, 1, 0 },
        { 0, 1, 1, 1, 0, 1, 1, 1, 1, 0 },
        { 0, 1, 0, 0, 0, 1, 0, 0, 0, 0 },
        { 0, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };

    int[] posicion = { 1, 0 };

    int[] posicion = mover();

    imprimir(mapa, posicion);
  }

  static String parse(int pixel) {
    final String[] SKINS = {
        "[ ]",
        "///",
        "[-]",
        "_O_"
    };
    return SKINS[pixel];
    // TODO: Añadir parsers distintos.
  }

  static void imprimir(int[][] mapa, int[] coordenadaPersonaje) {
    int PERSONAJE = 3;
    boolean isPersonaje;
    String skin;

    for (int fila = 0; fila < mapa.length; fila++) {
      for (int columna = 0; columna < mapa[columna].length; columna++) {
        skin = parse(mapa[fila][columna]);

        isPersonaje = fila == coordenadaPersonaje[1] && columna == coordenadaPersonaje[0];
        skin = isPersonaje ? parse(PERSONAJE) : skin;

        System.out.print(skin);
      }

      System.out.println();
    }
  }
}
