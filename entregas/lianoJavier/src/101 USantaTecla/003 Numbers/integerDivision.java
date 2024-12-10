import java.util.Scanner;

class MultiplicationTable {
  static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    int[] numeros = pedirNumeros();
    int resultado = calcularResultado(numeros);
    int resto = calcularResto(numeros);
    imprimirResultado(numeros, resultado, resto);
  }

  static int[] pedirNumero() {
    int[] numeros = new int[2];
    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Dame un número: ");
      numeros[i] = entrada.nextInt();
    }
    return numeros;
  }

  static int calcularResultado(int[] numeros) {
    return numeros[0] / numeros[1];
  }

  static int calcularResto(int[] numeros) {
    return numeros[0] % numeros[1];
  }

  static void imprimirResultado(int[] numeros, int resultado, int resto) {
    System.out.print(numeros[0]);
    System.out.print(" / ");
    System.out.print(numeros[1]);
    System.out.print(" = ");
    System.out.print(resultado);
    System.out.print(" y sobran ");
    System.out.println(resto);
  }
}
