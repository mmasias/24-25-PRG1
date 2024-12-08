import java.util.Scanner;
class Carrera {
  public static void main(String[] args) {
    int casillaActual = 0;

    int agujeroElegido = preguntarJugador();
    casillaActual += calcularAvance();
    evaluarResulrado(casillaActual);
  }

  static int preguntarJugador() {
    Scanner entrada = new Scanner(System.in);
    int respuesta = entrada.nextInt();
    entrada.close();
    return respuesta;
  }

  static int calcularAvance(int agujero) {
    final int[] AVANCE = {1,2,4,6};
    if (isAcierto()) {
      return AVANCE[agujero]
    }
  }
  
  static boolean isAcierto(int agujero) {
    double[] PROBABILIDAD_ACIERTO = {0.6, 0.4, 0.3, 0.1};
    return math.random() <= PROBABILIDAD_ACIERTO[agujero];
  }

}
