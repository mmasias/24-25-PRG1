public class herradura {
  private final static String Persona1 = "Naneh";
  private final static String Persona2 = "Armand";

  private final static String valorPrimerTramo = "Tramo 1";
  private final static String valorSegundoTramo = "Tramo 2";
  private final static String valorTercerTramo = "Tramo 3";
  private final static String valorFueraPista = "fuera de pista";

  public static void main(String[] args) {

    String resultadoPersona1 = tirarHerradura();
    String resultadoPersona2 = tirarHerradura();

    imprimirResultado(resultadoPersona1, resultadoPersona2);

  }

  private static void imprimirResultado(String resultadoPersona1, String resultadoPersona2) {
    System.out.println(Persona1 + ": [" + resultadoPersona1 + "]" + Persona2 + ": [" + resultadoPersona2 + "]");
  }

  private static String tirarHerradura() {
    final double PROBABILIDAD_PRIMER_TRAMO = .1, PROBABILIDAD_SEGUNDO_TRAMO = .12, PROBABILIDAD_TERCER_TRAMO = .78;

    double precision = Math.random();
    boolean primerTramo = precision <= PROBABILIDAD_PRIMER_TRAMO;
    boolean segundoTramo = precision >= PROBABILIDAD_PRIMER_TRAMO && precision <= PROBABILIDAD_SEGUNDO_TRAMO;
    boolean tercerTramo = precision >= PROBABILIDAD_SEGUNDO_TRAMO && precision <= PROBABILIDAD_TERCER_TRAMO;

    String resultado = valorFueraPista;
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
