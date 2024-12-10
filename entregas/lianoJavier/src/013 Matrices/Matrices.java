class Matrices {
  public static void main(String[] args) {

    int[][] mapa = {
      {1,1,0,0,0,0,0,2,2,2},
      {1,2,0,2,2,2,2,1,1,1},
      {1,2,0,2,0,2,0,2,1,0},
      {2,2,1,0,0,2,2,0,1,2},
      {2,0,0,0,1,1,2,0,2,2},
      {2,2,0,2,0,0,1,2,2,2},
      {0,2,2,1,1,0,1,2,2,1},
      {0,2,0,1,1,1,0,1,1,2},
      {1,2,2,1,0,2,2,1,0,0},
      {1,0,1,0,2,1,2,2,2,1}
    };
    imprimir(mapa);
  }

  static String parse(int pixel) {
    final String[] skins = {
      "[ ]",
      "...",
      "[-]"
    };
    return skins[pixel];
  }

  static void imprimir(int[][] mapa) {
    for (int[] columna : mapa) {
      for (int pixel : columna) {
        System.out.print(parse(pixel));
      }
System.out.println();
    }
  }
}
