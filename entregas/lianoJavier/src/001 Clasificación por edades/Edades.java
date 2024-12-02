import java.util.Scanner;

class Edades {
  public static void main(String[] args) {
    int añoUsuario = pedirAño();

    boolean pertenecePrimeraInfancia = añoUsuario <= 5,
        perteneceInfancia = añoUsuario <= 11,
        perteneceAdolescencia = añoUsuario <= 18,
        perteneceJuventud = añoUsuario <= 25,
        perteneceAdultez = añoUsuario <= 59;

    String aQueEtapaPertenece = pertenecePrimeraInfancia ? "Primera Infancia"
        : perteneceInfancia ? "Infancia"
            : perteneceAdolescencia ? "Adolescencia"
                : perteneceJuventud ? "Juventud"
                    : perteneceAdultez ? "Adultez"
                        : "Persona mayor";

    System.out.println("Perteneces a la etapa de la vida:");
    System.out.println(aQueEtapaPertenece);
  }

  static int pedirAño() {
    System.out.println("¿Cuál es tu edad?");
    int año;
    año = new Scanner(System.in).nextInt();
    boolean añoCorrecto = año < 100 && año > 0;
    if (!añoCorrecto)
      año = pedirAño();
    return año;
  }
}
