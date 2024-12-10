
import java.util.Scanner;

class Rectangle {
  static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    int lado1 = pedirLado();
    int lado2 = pedirLado();
    int perimetro = calcularPerimetro(lado1, lado2);
    int area = calcularArea(lado1, lado2);
    imprimirHistoria(perimetro, area);
    entrada.close();
  }

  static int pedirLado() {
    System.out.print("Dame el lado del rectángulo: ");
    int respuesta = entrada.nextInt();
    System.out.println();
    if (respuesta < 0)
      respuesta = pedirLado();
    return respuesta;
  }

  static int calcularPerimetro(int lado1, int lado2) {
    return lado1 * 2 + lado2 * 2;
  }

  static int calcularArea(int lado1, int lado2) {
    return lado1 * lado2;
  }

  static void imprimirHistoria(int perimetro, int area) {
    System.out.println("Perímetro: " + perimetro);
    System.out.println("Área: " + area);
  }
}
