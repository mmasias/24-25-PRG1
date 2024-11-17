public class herradura {
  public static void main(String[] args) {
    String resultado = tirarHerradura();
    System.out.println(resultado);
  }

  private static String tirarHerradura() {
    final double PROBABILIDAD_PRIMER_TRAMO = .1, PROBABILIDAD_SEGUNDO_TRAMO = .12, PROBABILIDAD_TERCER_TRAMO = .78;

    double precision = Math.random();
    boolean primerTramo = precision <= PROBABILIDAD_PRIMER_TRAMO;
    boolean segundoTramo = precision >= PROBABILIDAD_PRIMER_TRAMO && precision <= PROBABILIDAD_SEGUNDO_TRAMO;
    boolean tercerTramo = precision >= PROBABILIDAD_SEGUNDO_TRAMO && precision <= PROBABILIDAD_TERCER_TRAMO;

    String resultado = "fuera de pista";
    if (primerTramo) {
      resultado = "muy cerca";
    } else if (segundoTramo) {
      resultado = "cerca";
    } else if (tercerTramo) {
      resultado = "lejos";
    }
    return resultado;
  }
}
