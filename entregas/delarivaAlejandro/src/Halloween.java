public class Halloween {
  public static void main(String args[]) {
    
    int caramelos_niño1 = 0;
    int caramelos_niño2 = 0;
    int caramelos_niño3 = 0;

    boolean bolsa_niño1 = false;
    boolean bolsa_niño2 = false;
    boolean bolsa_niño3 = false;

    int piso = 1;
    int casasVisitadas = 0;

    int maximoCaramelos = 20;

    while (true) {
      System.out.println("\n=== Piso " + piso + " ===");

      int casa = 1;
      while (casa <= 4) {
        casasVisitadas++;
        System.out.println("\nVisito la casa " + casa + " del piso " + piso);

        double suerte = Math.random() * 100 + 1;
        if ((int) suerte <= 70) {
          System.out.println("La casa está abierta.");

          if (!bolsa_niño1) {
            double suerteCaramelo = Math.random() * 100 + 1;
            if ((int) suerteCaramelo <= 80) {
              int caramelos = (int) (Math.random() * 3 + 1);
              caramelos_niño1 += caramelos;
              System.out.println("El Niño 1 recibió " + caramelos + " caramelos");

              if (caramelos_niño1 >= maximoCaramelos) {
                bolsa_niño1 = true;
                caramelos_niño1 = maximoCaramelos;
                System.out.println("La bolsa del Niño 1 está llena.");
              }
            }
          }

          if (!bolsa_niño2) {
            double suerteCaramelo = Math.random() * 100 + 1;
            if ((int) suerteCaramelo <= 80) {
              int caramelos = (int) (Math.random() * 3 + 1);
              caramelos_niño2 += caramelos;
              System.out.println("Niño 2 recibió " + caramelos + " caramelos");

              if (caramelos_niño2 >= maximoCaramelos) {
                bolsa_niño2 = true;
                caramelos_niño2 = maximoCaramelos;
                System.out.println("La bolsa del niño 2 está llena.");
              }
            }
          }

          if (!bolsa_niño3) {
            double suerteCaramelo = Math.random() * 100 + 1;
            if ((int) suerteCaramelo <= 80) {
              int caramelos = (int) (Math.random() * 3 + 1);
              caramelos_niño3 += caramelos;
              System.out.println("Niño 3 recibió " + caramelos + " caramelos");

              if (caramelos_niño3 >= maximoCaramelos) {
                bolsa_niño3 = true;
                caramelos_niño3 = maximoCaramelos;
                System.out.println("La bolsa del niño 3 está llena.");
              }
            }
          }

        } else {
          System.out.println("Casa cerrada, seguimos adelante.");
        }

        if (bolsa_niño1 && bolsa_niño2 && bolsa_niño3) {
          System.out.println("\n¡Todas las bolsas están llenas! Terminamos la búsqueda.");
          break;
        }

        casa++;
      }
       
        if (bolsa_niño1 && bolsa_niño2 && bolsa_niño3) {
        break;
      }

      if (piso == 5) {
        break;
      }

      piso++;
    }

    System.out.println("\n=== Resultados Finales ===");
    System.out.println("Casas visitadas: " + casasVisitadas);
    System.out.println("Niño 1: " + caramelos_niño1 + " caramelos" + (bolsa_niño1 ? " (Bolsa llena)" : ""));
    System.out.println("Niño 2: " + caramelos_niño2 + " caramelos" + (bolsa_niño2 ? " (Bolsa llena)" : ""));
    System.out.println("Niño 3: " + caramelos_niño3 + " caramelos" + (bolsa_niño3 ? " (Bolsa llena)" : ""));
  }
}  