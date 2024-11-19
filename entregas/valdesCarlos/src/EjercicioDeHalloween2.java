public class EjercicioDeHalloween2 {
    public static void main(String args[]) {
  
      int caramelo1 = 0;
      int caramelo2 = 0;
      int caramelo3 = 0;
  
      boolean bolsa1 = false;
      boolean bolsa2 = false;
      boolean bolsa3 = false;
  
      int piso = 1; 
      int casasVisitadas = 0;
      final int MAXIMO_CARAMELOS_BOLSA = 20;

      while (piso <= 5 && !(bolsa1 && bolsa2 && bolsa3)) { 
        System.out.println("\n=== Piso " + piso + " ===");
  
        for (int casa = 1; casa <= 4 && !(bolsa1 && bolsa2 && bolsa3); casa++) {
          casasVisitadas++;
          System.out.println("\nVisitando casa " + casa + " del piso " + piso);
  
          if (Math.random() * 100 < 70) { 
              System.out.println("¡La casa está abierta!");
              if (!bolsa1 && Math.random() * 100 < 80) {
                caramelo1 += (int) (Math.random() * 3 + 1);
                int caramelosRecibidos1 = (caramelo1 > MAXIMO_CARAMELOS_BOLSA) ? MAXIMO_CARAMELOS_BOLSA : caramelo1;
                System.out.println("Niño 1 recibió " + caramelosRecibidos1 + " caramelos");
                if (caramelo1 >= MAXIMO_CARAMELOS_BOLSA) {
                    bolsa1 = true;
                    caramelo1 = MAXIMO_CARAMELOS_BOLSA;
                    System.out.println("¡La bolsa del niño 1 está llena!");
                }
            }

            
            // Niño 2
            if (!bolsa2 && Math.random() * 100 < 80) {
                caramelo2 += (int) (Math.random() * 3 + 1);
                int caramelosRecibidos2 = (caramelo2 > MAXIMO_CARAMELOS_BOLSA) ? MAXIMO_CARAMELOS_BOLSA : caramelo2;
                System.out.println("Niño 2 recibió " + caramelosRecibidos2 + " caramelos");
                if (caramelo2 >= MAXIMO_CARAMELOS_BOLSA) {
                    bolsa2 = true;
                    caramelo2 = MAXIMO_CARAMELOS_BOLSA;
                    System.out.println("¡La bolsa del niño 2 está llena!");
                }
            }

          
            // Niño 3
            if (!bolsa3 && Math.random() * 100 < 80) {
                caramelo3 += (int) (Math.random() * 3 + 1);
                int caramelosRecibidos3 = (caramelo3 > MAXIMO_CARAMELOS_BOLSA) ? MAXIMO_CARAMELOS_BOLSA : caramelo3;
                System.out.println("Niño 3 recibió " + caramelosRecibidos3 + " caramelos");
                if (caramelo3 >= MAXIMO_CARAMELOS_BOLSA) {
                    bolsa3 = true;
                    caramelo3 = MAXIMO_CARAMELOS_BOLSA;
                    System.out.println("¡La bolsa del niño 3 está llena!");
                }
            }
        } else {
            System.out.println("Casa cerrada, seguimos adelante...");
        }
      }
      piso++; 
    }
    System.out.println("\n=== Resultados Finales ===");
    System.out.println("Casas visitadas: " + casasVisitadas);
    System.out.println("Niño 1: " + caramelo1 + " caramelos" + (bolsa1 ? " (Bolsa llena)" : ""));
    System.out.println("Niño 2: " + caramelo2 + " caramelos" + (bolsa2 ? " (Bolsa llena)" : ""));
    System.out.println("Niño 3: " + caramelo3 + " caramelos" + (bolsa3 ? " (Bolsa llena)" : ""));
  }
}
