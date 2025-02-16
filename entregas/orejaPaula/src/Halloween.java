
public class Halloween {

    public static void main(String args[]) {
        int caramelosNiño1 = 0;
        int caramelosNiño2 = 0;
        int caramelosNiño3 = 0;

        boolean bolsa1Llena = false;
        boolean bolsa2Llena = false;
        boolean bolsa3Llena = false;

        final int MINIMO_VALOR_DE_CARAMELOS_QUE_DAN = 1;
        final int MAXIMO_VALOR_DE_CARAMELOS_QUE_DAN = 3;

        final double PROBABILIDAD_DEN_CARAMELOS = 0.8;
        final double PROBABILIDAD_DEN_CASA_ABIERTA = 0.7;

        int casasVisitadas = 0;

        final int CHUCHES_MAXIMAS_POR_BOLSA = 20;

        int piso = 1;
        while (piso <= 5 || !(bolsa1Llena && bolsa2Llena && bolsa3Llena)) {
            System.out.println("");
            System.out.println("=== Piso " + piso + " ===");

            int casa = 1;
            while (casa <= 4 || !(bolsa1Llena && bolsa2Llena && bolsa3Llena)) {
                System.out.println("");
                System.out.println("Visitando casa " + casa + " del piso " + piso);

                boolean casaAbierta = Math.random() <= PROBABILIDAD_DEN_CASA_ABIERTA;
                if (casaAbierta) {
                    System.out.println("¡La casa está abierta!");

                    boolean danCaramelos = Math.random() <= PROBABILIDAD_DEN_CARAMELOS;

                    if (bolsa1Llena) {
                        caramelosNiño1 = CHUCHES_MAXIMAS_POR_BOLSA;

                        System.out.println("¡La bolsa del niño 1 está llena!");
                    } else if (danCaramelos) {
                        int numeroCaramelasQueDan = (int) (Math.random() * (MAXIMO_VALOR_DE_CARAMELOS_QUE_DAN - MINIMO_VALOR_DE_CARAMELOS_QUE_DAN + 1) + MINIMO_VALOR_DE_CARAMELOS_QUE_DAN);
                        caramelosNiño1 += numeroCaramelasQueDan;
                        bolsa1Llena = caramelosNiño1 >= CHUCHES_MAXIMAS_POR_BOLSA;
                        System.out.println("Niño 1 recibió " + numeroCaramelasQueDan + " caramelos");
                    }

                    if (bolsa2Llena) {
                        caramelosNiño2 = CHUCHES_MAXIMAS_POR_BOLSA;

                        System.out.println("¡La bolsa del niño 2 está llena!");
                    } else if (danCaramelos) {
                        int numeroCaramelasQueDan = (int) (Math.random() * (MAXIMO_VALOR_DE_CARAMELOS_QUE_DAN - MINIMO_VALOR_DE_CARAMELOS_QUE_DAN + 1) + MINIMO_VALOR_DE_CARAMELOS_QUE_DAN);
                        caramelosNiño2 += numeroCaramelasQueDan;
                        bolsa2Llena = caramelosNiño2 >= CHUCHES_MAXIMAS_POR_BOLSA;
                        System.out.println("Niño 2 recibió " + numeroCaramelasQueDan + " caramelos");
                    }

                    if (bolsa3Llena) {
                        caramelosNiño3 = CHUCHES_MAXIMAS_POR_BOLSA;

                        System.out.println("¡La bolsa del niño 3 está llena!");
                    } else if (danCaramelos) {
                        int numeroCaramelasQueDan = (int) (Math.random() * (MAXIMO_VALOR_DE_CARAMELOS_QUE_DAN - MINIMO_VALOR_DE_CARAMELOS_QUE_DAN + 1) + MINIMO_VALOR_DE_CARAMELOS_QUE_DAN);
                        caramelosNiño3 += numeroCaramelasQueDan;
                        bolsa3Llena = caramelosNiño3 >= CHUCHES_MAXIMAS_POR_BOLSA;
                        System.out.println("Niño 3 recibió " + numeroCaramelasQueDan + " caramelos");
                    }

                } else {
                    System.out.println("Casa cerrada, seguimos adelante...");
                }
                casa++;
                casasVisitadas++;
            }

            piso++;
        }

        if (bolsa1Llena && bolsa2Llena && bolsa3Llena) {
            System.out.println("");
            System.out.println("¡Todas las bolsas están llenas! Terminamos la búsqueda.");

        }

        System.out.println("");
        System.out.println("=== Resultados Finales ===");
        System.out.println("Casas visitadas: " + casasVisitadas);
        System.out.println("Niño 1: " + caramelosNiño1 + " caramelos" + (bolsa1Llena ? " (Bolsa llena)" : ""));
        System.out.println("Niño 2: " + caramelosNiño2 + " caramelos" + (bolsa2Llena ? " (Bolsa llena)" : ""));
        System.out.println("Niño 3: " + caramelosNiño3 + " caramelos" + (bolsa3Llena ? " (Bolsa llena)" : ""));
    }
}
