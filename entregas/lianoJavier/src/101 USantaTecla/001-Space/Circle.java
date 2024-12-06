import java.util.Scanner;

class Rectangle {
  static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    int radio = pedirRadio();
    int perimetro = calcularPerimetro(radio);
    int area = calcularArea(radio);
    imprimirHistoria(perimetro, area);
    entrada.close();
  }

  static int pedirRadio() {
    System.out.print("Dame el radio del circulo: ");
    int respuesta = entrada.nextInt();
    System.out.println();
    if (respuesta < 0)
      respuesta = pedirRadio();
    return respuesta;
  }

  static int calcularPerimetro(int radio) {
    return (int) (2 * Math.PI * radio);
  }

  static int calcularArea(int radio) {
    return (int) (Math.PI * Math.pow(radio, 2));
  }

  static void imprimirHistoria(int perimetro, int area) {
    System.out.println("Perímetro: " + perimetro);
    System.out.println("Área: " + area);
  }
}
