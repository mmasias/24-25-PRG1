import java.util.Scanner;

class Conduccion {
  static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {

    int edad = pedirEdad();
    boolean tieneCarnet = pedirCarnet();

    String mensaje;
    if (tieneCarnet) {
      mensaje = "Eres " + evaluar(edad) + ".";
    } else {
      mensaje = "No puedes conducir sin carnet de conductor.";
    }
    System.out.println(mensaje);

    entrada.close();
  }

  static int pedirEdad() {
    System.out.println("Ingrese su edad:");

    int edad = entrada.nextInt();

    if (evaluar(edad) == "error")
      edad = pedirEdad();

    return edad;
  }

  static boolean pedirCarnet() {
    System.out.println("¿Tiene licencia de conducir? (true/false):");

    return entrada.nextBoolean();
  }

  static String evaluar(
      int edad) {
    final String ERROR = "error";
    String mensaje;
    if (edad <= 0)
      mensaje = ERROR;
    if (edad < 18)
      mensaje = "menor de edad";
    else if (edad <= 19)
      mensaje = "conductor novel";
    else if (edad <= 27)
      mensaje = "conductor experimentado";
    else if (edad <= 64)
      mensaje = "conductor senior";
    else if (edad < 100)
      mensaje = "conductor juvilado";
    else
      mensaje = ERROR;
    return mensaje;
  }
}
