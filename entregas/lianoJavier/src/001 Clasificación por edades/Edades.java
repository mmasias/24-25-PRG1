import java.util.Scanner;

class Edades {
  public static void main(String[] args) {
    int añosUsuario = pedirAño();

    System.out.println("Perteneces a la etapa de la vida:");
    System.out.println(calificarEdad(añosUsuario));
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

  static String calificarEdad(int edad) {
    String etapa;
    if (edad <= 5)
      etapa = "primera infancia";
    else if (edad <= 11)
      etapa = "infancia";
    else if (edad <= 18)
      etapa = "adolescencia";
    else if (edad <= 25)
      etapa = "juventud";
    else if (edad <= 59)
      etapa = "adultez";
    else
      etapa = "persona mayor";

    return etapa;
  }
}
