public class EjercicioHalloweenPrueba {
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

                    // Probabilidad del 80% de que den caramelos en esta casa
                    if (Math.random() * 100 < 80) {
                        System.out.println("¡Dan caramelos en esta casa!");

                        
                        if (!bolsa1) {
                            int caramelosRecibidos1 = (int) (Math.random() * 3 + 1);
                            if (caramelo1 + caramelosRecibidos1 > MAXIMO_CARAMELOS_BOLSA) {
                                caramelosRecibidos1 = MAXIMO_CARAMELOS_BOLSA - caramelo1;
                            }
                            caramelo1 += caramelosRecibidos1;
                            System.out.println("Niño 1 recibió " + caramelosRecibidos1 + " caramelos");
                            if (caramelo1 >= MAXIMO_CARAMELOS_BOLSA) {
                                bolsa1 = true;
                                System.out.println("¡La bolsa del niño 1 está llena!");
                            }
                        } else {
                            System.out.println("Niño 1 ya tiene la bolsa llena y no recibe más caramelos.");
                        }

                        // Niño 2
                        if (!bolsa2) {
                            int caramelosRecibidos2 = (int) (Math.random() * 3 + 1);
                            if (caramelo2 + caramelosRecibidos2 > MAXIMO_CARAMELOS_BOLSA) {
                                caramelosRecibidos2 = MAXIMO_CARAMELOS_BOLSA - caramelo2;
                            }
                            caramelo2 += caramelosRecibidos2;
                            System.out.println("Niño 2 recibió " + caramelosRecibidos2 + " caramelos");
                            if (caramelo2 >= MAXIMO_CARAMELOS_BOLSA) {
                                bolsa2 = true;
                                System.out.println("¡La bolsa del niño 2 está llena!");
                            }
                        } else {
                            System.out.println("Niño 2 ya tiene la bolsa llena y no recibe más caramelos.");
                        }

                        // Niño 3
                        if (!bolsa3) {
                            int caramelosRecibidos3 = (int) (Math.random() * 3 + 1);
                            if (caramelo3 + caramelosRecibidos3 > MAXIMO_CARAMELOS_BOLSA) {
                                caramelosRecibidos3 = MAXIMO_CARAMELOS_BOLSA - caramelo3;
                            }
                            caramelo3 += caramelosRecibidos3;
                            System.out.println("Niño 3 recibió " + caramelosRecibidos3 + " caramelos");
                            if (caramelo3 >= MAXIMO_CARAMELOS_BOLSA) {
                                bolsa3 = true;
                                System.out.println("¡La bolsa del niño 3 está llena!");
                            }
                        } else {
                            System.out.println("Niño 3 ya tiene la bolsa llena y no recibe más caramelos.");
                        }

                    } else {
                        System.out.println("No dan caramelos en esta casa.");
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
