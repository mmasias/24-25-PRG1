
import java.util.Scanner;

class Carrera {

  public static void main(String[] args) {
    final String COLOR_RESET = "\u001B[0m";
    final String COLOR_BLUE = "\u001B[34m";
    final String COLOR_GREEN = "\u001B[32m";
    final String COLOR_RED = "\u001B[31m";
    final String COLOR_ORANGE = "\u001B[38;5;214m";
    final int RECORRIDO_TOTAL = 60;

    final String CAMELLO = ",---,^";
    final String PISTA = "__";

    Scanner inputUser = new Scanner(System.in);

    final double[] PROBABILIDADES_ACIERTAR = { 0.6, 0.4, 0.3, 0.1 };

    final double PROBABILIDAD_DE_QUE_EL_CAMELLO_TROPIECE = 0.1;

    final int[] AVANCES_AGUJERO = { 1, 2, 4, 6 };

    int posicionDelCamelloUsuario = 0;
    int posicionDelCamelloRobot = 0;
    int turno = 1;
    do {
      int fallosRealizados = 0;
      System.out.println("");
      System.out.println(COLOR_BLUE + "TURNO - [" + turno + "]" + COLOR_RESET);
      System.out.println(COLOR_GREEN + "Opciones: 1 | 2 | 3 | 4" + COLOR_RESET);
      System.out.println("Elige un agujero al que tirar: ");

      int seleccionJugador;

      do {
        seleccionJugador = inputUser.nextInt();
      } while (seleccionJugador < 1 || seleccionJugador > 4);

      final int SELECCION_MAXIMA_ROBOT = 1;
      final int SELECCION_MINIMA_ROBOT = 4;

      int seleccionRobot = (int) (Math.random() * (SELECCION_MAXIMA_ROBOT - SELECCION_MINIMA_ROBOT)
          + SELECCION_MINIMA_ROBOT);

      boolean AciertaEnElAgujeroUsuario;
      int avanceDelCamelloUsuario;

      AciertaEnElAgujeroUsuario = Math.random() <= PROBABILIDADES_ACIERTAR[seleccionJugador];
      avanceDelCamelloUsuario = AVANCES_AGUJERO[seleccionJugador];
      int avanceDelCamelloRobot;

      avanceDelCamelloRobot = AVANCES_AGUJERO[seleccionRobot];

      boolean camelloTropezo = Math.random() <= PROBABILIDAD_DE_QUE_EL_CAMELLO_TROPIECE;

      if (camelloTropezo) {
        avanceDelCamelloUsuario = 0;
      }

      posicionDelCamelloUsuario += avanceDelCamelloUsuario;
      posicionDelCamelloRobot += avanceDelCamelloRobot;

      if (!(AciertaEnElAgujeroUsuario)) {
        fallosRealizados++;
      }

      if (fallosRealizados >= 3) {
        fallosRealizados = 0;
        posicionDelCamelloUsuario = 0;
      }

      if (camelloTropezo) {
        System.out.println("El camello se tropezó.");
      }

      System.out.println(
          (avanceDelCamelloUsuario == 0 ? COLOR_RED : COLOR_ORANGE) + "Has avanzado: " + avanceDelCamelloUsuario
              + COLOR_RESET);

      int recorridoRestante = RECORRIDO_TOTAL - posicionDelCamelloUsuario;
      if (recorridoRestante <= 0) {
        recorridoRestante = 0;
      }
      System.out.println(
          (recorridoRestante == 0 ? COLOR_GREEN : COLOR_RED) + "Te quedan: " + recorridoRestante
              + COLOR_RESET);

      System.out.println(PISTA.repeat(posicionDelCamelloUsuario) + CAMELLO);
      System.out.println("---------------------------");
      System.out.println(PISTA.repeat(posicionDelCamelloRobot) + CAMELLO);

      turno += camelloTropezo ? 2 : 1;

    } while ((posicionDelCamelloUsuario < RECORRIDO_TOTAL && posicionDelCamelloRobot < RECORRIDO_TOTAL) && turno <= 50);

    inputUser.close();
  }
}
