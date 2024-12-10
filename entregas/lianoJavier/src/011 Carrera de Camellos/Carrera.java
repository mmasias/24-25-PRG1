import java.util.Scanner;

class Carrera {
  public static void main(String[] args) {
    int casillaActual = 0;

    int agujeroElegido = preguntarJugador();
    casillaActual += calcularAvance(agujeroElegido);
  }

  static int preguntarJugador() {
    Scanner entrada = new Scanner(System.in);
    int respuesta = entrada.nextInt();
    entrada.close();
    return respuesta;
  }

  static int calcularAvance(int agujero) {
    final int[] AVANCE = { 1, 2, 4, 6 };
    return isAcierto(agujero) ? AVANCE[agujero] : 0;
  }

  static boolean isAcierto(int agujero) {
    double[] PROBABILIDAD_ACIERTO = { 0.6, 0.4, 0.3, 0.1 };
    return Math.random() <= PROBABILIDAD_ACIERTO[agujero];
  }

}
