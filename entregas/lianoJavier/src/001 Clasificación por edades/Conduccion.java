import java.util.Scanner;

class Conduccion {
  public static void main(String[] args) {

    int edad;
    edad = pedirEdad();

    boolean tieneCarnet = pedirCarnet();
    if (tieneCarnet) {
      mensaje = evaluar(edad);
    } else {
      mensaje = "No puedes conducir sin carnet de conductor."
    }
    System.out.println(mensaje);

  }
  static int pedirEdad() {
    int edad;

    System.out.println("Ingrese su edad:");

    edad = new Scanner(System.in).nextInt();

    if (evaluar(edad) == "error") edad = pedirEdad();

    return edad;
  }
  static boolean pedirCarnet() {
    int edad;

    System.out.println("¿Tiene licencia de conducir? (true/false):");

    edad = new Scanner(System.in).nextBoolean();

    if (evaluar(edad) == "error") edad = pedirEdad();

    return edad;
  }
  static void evaluar(
    int edad
  ) {
    final String ERROR = "error";
    String mensaje;
    if (edad <= 0) mensaje = ERROR;
    if (edad < 18) mensaje = "menor de edad"; else
    if (edad <= 19) mensaje = "conductor novel"; else
    if (edad <= 27) mensaje = "conductor experimentado"; else
    if (edad <= 64) mensaje = "conducor senior"; else 
    if (edad < 100) mensaje = "conductor juvilado" else mensaje = ERROR;
    return mensaje;
  }
}
