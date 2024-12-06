import java.util.Scanner;

class Square {
  static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    int lado = pedirLado();
    int perimetro = calcularPerimetro(lado);
    int area = calcularArea(lado);
    imprimirHistoria(perimetro, area);
    entrada.close();
  }

  static int pedirLado() {
    System.out.print("Dame el lado del cuadrado: ");
    int respuesta = entrada.nextInt();
    System.out.println();
    if (respuesta < 0)
      respuesta = pedirLado();
    return respuesta;
  }

  static int calcularPerimetro(int lado) {
    return lado * 4;
  }

  static int calcularArea(int lado) {
    return lado * lado;
  }

  static void imprimirHistoria(int perimetro, int area) {
    System.out.println("Perímetro: " + perimetro);
    System.out.println("Área: " + area);
  }
}
