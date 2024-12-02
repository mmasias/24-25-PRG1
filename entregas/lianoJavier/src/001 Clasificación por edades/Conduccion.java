import java.util.Scanner;

class Conduccion {
  public static void main(String[] args) {

    boolean tieneCarnetDeConducir;
    int edad;

    edad = pedirEdad();

    System.out.println("¿Tiene licencia de conducir? (true/false):");
    tieneCarnetDeConducir = entrada.nextBoolean();

    boolean menorDeEdad = edad < 18;
    boolean mayorSinLicencia = edad >= 18 && !tieneCarnetDeConducir;
    boolean conductorNovel = edad <= 19 && tieneCarnetDeConducir;
    boolean conductorExperimentado = edad <= 27 && tieneCarnetDeConducir;
    boolean conductorJubilado = edad >= 65 && tieneCarnetDeConducir;

    String resultado = menorDeEdad ? "Eres menor"
    : mayorSinLicencia ? "No tiene licencia"
    : conductorNovel ? "Conductor Novel"
    : conductorExperimentado ? "Conductor Experimentado"
    : "Conductor Senior";

    System.out.println(
      "Clasificación: " + resultado + ". " +
    ((!tieneCarnetDeConducir || conductorJubilado)
      ? "No puede conducir"
      : "Puede conducir"));

  }
  static int pedirEdad() {
    System.out.println("Ingrese su edad:");
    respuesta = new Scanner(System.in).nextInt();
    // if(evaluarRespuesta(respuesta) == "error") respuesta = pedirEdad();
    return respuesta;
  }
}
