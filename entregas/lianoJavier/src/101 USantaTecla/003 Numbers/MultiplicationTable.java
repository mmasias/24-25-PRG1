import java.util.Scanner;

class MultiplicationTable {
  static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    int numero = pedirNumero();
    imprimirTabla(numero);
  }

  static int pedirNumero() {
    System.out.print("Dame un número: ");
    return entrada.nextInt();
  }

  static void imprimirTabla(int numero1) {
    int[] multiplicadores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int multiplicacion;
    for (int numero2 : multiplicadores) {
      multiplicacion = numero1 * numero2;
      System.out.print(numero1);
      System.out.print(" * ");
      System.out.print(numero2);
      System.out.print(" = ");
      System.out.println(multiplicacion);
    }
  }
}
