public class PruebaExamen {
    public static void main(String[] args) {

        final int NUMERO_ESTACIONES = 5;
        final double PROBABILIDAD_LUIS = 0.3;
        final double PROBABILIDAD_MARIA = 0.5;
        final double PROBABILIDAD_PEDRO = 0.7;
        final int GASTO_MAXIMO = 3;
        final int GASTO_MINIMO = 1;
        final int COMPRA_MAXIMA_LUIS = 2;
        final int COMPRA_MAXIMA_MARIA = 3;
        final int COMPRA_MAXIMA_PEDRO = 4;
        final int COMPRA_MINIMA_LUIS = 1;
        final int COMPRA_MINIMA_MARIA = 2;
        final int COMPRA_MINIMA_PEDRO = 1;

        int[] billetes = new int[3];
        int[] cantidadComprada = new int[3];

        int luis = 0;
        int maria = 1;
        int pedro = 2;

        billetes[luis] = 10;
        billetes[maria] = 8;
        billetes[pedro] = 5;

        for (int estacionActual = 1; estacionActual <= NUMERO_ESTACIONES; estacionActual++) {
            System.out.println("Estacion actual = " + estacionActual);

            for (int i = 0; i < billetes.length; i++) {

                int gasto = (int)(Math.random()*(GASTO_MAXIMO - GASTO_MINIMO + 1) + GASTO_MINIMO);
                billetes[i] -= gasto;

                String nombre = (i == 0) ? "Luis" : (i == 1) ? "María" : "Pedro";
                System.out.println(nombre + " gastó un total de " + gasto + " billete/s");

                if (billetes[i] <= 0) {
                    billetes[i] = 0;
                    double probabilidadCompra = (i == luis) ? PROBABILIDAD_LUIS : (i == maria) ? PROBABILIDAD_MARIA : PROBABILIDAD_PEDRO;    
                    int compraMaxima = (i == luis) ? COMPRA_MAXIMA_LUIS : (i == maria) ? COMPRA_MAXIMA_MARIA : COMPRA_MAXIMA_PEDRO;
                    int compraMinima = (i == luis) ? COMPRA_MINIMA_LUIS : (i == maria) ? COMPRA_MINIMA_MARIA : COMPRA_MINIMA_PEDRO;
                    
                    if (Math.random() < probabilidadCompra) {
                        int compra = (int)(Math.random()*(compraMaxima - compraMinima + 1) + compraMinima);
                        billetes[i] += compra;
                        cantidadComprada[i] += compra;
                        System.out.println(nombre + " se quedó sin billetes y compró " + compra + " nuevos billetes.");                        
                    } else {
                        billetes[i]++;
                        cantidadComprada[i]++;
                    }

                }
            }

            System.out.println("Billetes de Luis = " + billetes[luis] + " Billetes de Maria = " + billetes[maria] + " Billetes de Pedro = " + billetes[pedro]);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        }

        System.out.println("Billetes totales de Luis [" + billetes[luis] + "] --- Billetes totales de Maria [" + billetes[maria] + "] --- Billetes totales de Pesdro [" + billetes[pedro] + "]");
        System.out.println("Luis ha comprado un total de [" + cantidadComprada[luis] + "] billetes --- Maria ha comprado un total de [" + cantidadComprada[maria] + "] billetes --- Pedro ha comprado un total de [" + cantidadComprada[pedro] + "] billetes");
    }
}