public class herradura {
  private final static String persona1 = "Naneh";
  private final static String persona2 = "Armand";

  private final static int valorPrimerTramo = 1,
      valorSegundoTramo = 2,
      valorTercerTramo = 3,
      valorFueraPista = 0;

  public static void main(String[] args) {

    int puntosPersona1 = 0,
        puntosPersona2 = 0;
    do {

      int resultadoPersona1 = tirarHerradura();
      int resultadoPersona2 = tirarHerradura();

      if (resultadoPersona1 == resultadoPersona2) {
        puntosPersona1 += 1;
        puntosPersona2 += 1;
      } else {

        if (resultadoPersona1 == valorPrimerTramo)
          puntosPersona1 += 5;
        if (resultadoPersona2 == valorPrimerTramo)
          puntosPersona2 += 5;

      }

      if (resultadoPersona1 > resultadoPersona2)
        puntosPersona1 += 3;
      else
        puntosPersona2 += 3;
      imprimirResultado(resultadoPersona1, resultadoPersona2);

    } while (puntosPersona1 < 50 && puntosPersona2 < 50);

    System.out.println("Puntos " + persona1 + ": " + puntosPersona1);
    System.out.println("Puntos " + persona2 + ": " + puntosPersona2);
  }

  private static void imprimirResultado(int resultadoPersona1, int resultadoPersona2) {
    System.out.println(persona1 + ": [Tramo " + resultadoPersona1 + "] " + persona2 + ": [Tramo " + resultadoPersona2 + "]");
  }

  private static int tirarHerradura() {
    final double PROBABILIDAD_PRIMER_TRAMO = .1, PROBABILIDAD_SEGUNDO_TRAMO = .12, PROBABILIDAD_TERCER_TRAMO = .78;

    double precision = Math.random();
    boolean primerTramo = precision <= PROBABILIDAD_PRIMER_TRAMO;
    boolean segundoTramo = precision >= PROBABILIDAD_PRIMER_TRAMO && precision <= PROBABILIDAD_SEGUNDO_TRAMO;
    boolean tercerTramo = precision >= PROBABILIDAD_SEGUNDO_TRAMO && precision <= PROBABILIDAD_TERCER_TRAMO;

    int resultado = valorFueraPista;
    if (primerTramo) {
      resultado = valorPrimerTramo;
    } else if (segundoTramo) {
      resultado = valorSegundoTramo;
    } else if (tercerTramo) {
      resultado = valorTercerTramo;
    }
    return resultado;
  }
}
