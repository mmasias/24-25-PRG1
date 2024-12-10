import java.util.Scanner;
import java.util.Arrays;

class Triangle {
  static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    final int NUMERO_LADOS = 3;
    int[] medidas = new int[NUMERO_LADOS];

    medidas = añadirMedidas(medidas);

    String resultado = evaluarTriangulo(medidas);

    imprimirHistoria(resultado, medidas);

    entrada.close();
  }

  static int[] añadirMedidas(int[] medidas) {
    for (int i = 0; i < medidas.length; i++) {
      medidas[i] = pedirLado(i + 1);
    }
    return medidas;
  }

  static int pedirLado(int numeroLado) {
    System.out.print("Dame la medida del lado " + numeroLado + ": ");
    int respuesta = entrada.nextInt();
    if (respuesta <= 0) {
      System.out.println("La medida debe ser un número positivo. Intenta de nuevo.");
      return pedirLado(numeroLado);
    }
    return respuesta;
  }

  static String evaluarTriangulo(int[] medidas) {
    String resultado = "error";
    if (isEscaleno(medidas))
      resultado = "escaleno";
    else if (isIsosceles(medidas))
      resultado = "isosceles";
    else if (isEquilatero(medidas))
      resultado = "equilatero";
    return resultado;
  }

  static boolean isEscaleno(int[] medidas) {
    isTriangleValid(medidas);
    return medidas[0] != medidas[1] && medidas[0] != medidas[2] && medidas[1] != medidas[2];
  }

  static boolean isIsosceles(int[] medidas) {
    isTriangleValid(medidas);
    return (medidas[0] == medidas[1] ||
        medidas[0] == medidas[2] ||
        medidas[1] == medidas[2]);
  }

  static boolean isEquilatero(int[] medidas) {
    isTriangleValid(medidas);
    return medidas[0] == medidas[1] && medidas[1] == medidas[2];
  }

  static void isTriangleValid(int[] medidas) {
    if (medidas.length != 3) {
      throw new IllegalArgumentException("El triángulo debe tener exactamente 3 lados.");
    }

    // Verificamos la regla del triángulo
    if (medidas[0] + medidas[1] <= medidas[2] ||
        medidas[0] + medidas[2] <= medidas[1] ||
        medidas[1] + medidas[2] <= medidas[0]) {
      throw new IllegalArgumentException("Las medidas no forman un triángulo válido.");
    }
  }

  static void imprimirHistoria(String resultado, int[] medidas) {
    System.out.print("Medidas: ");
    System.out.println(Arrays.toString(medidas));
    System.out.println(resultado);
  }
}
