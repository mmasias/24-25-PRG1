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

        for(int estacionActual = 1; estacionActual < NUMERO_ESTACIONES; estacionActual++){

            billetes[luis] = billetes[luis] - (int)(Math.random()*(GASTO_MAXIMO - GASTO_MINIMO + 1) + GASTO_MINIMO);
            billetes[maria] = billetes[maria] - (int)(Math.random()*(GASTO_MAXIMO - GASTO_MINIMO + 1) + GASTO_MINIMO);
            billetes[pedro] = billetes[pedro] - (int)(Math.random()*(GASTO_MAXIMO - GASTO_MINIMO + 1) + GASTO_MINIMO);



            if (billetes[luis] <= 0) {
                int compra = (int)(Math.random()*(COMPRA_MAXIMA_LUIS - COMPRA_MINIMA_LUIS + 1) + COMPRA_MINIMA_LUIS);
                billetes[luis] += compra;
                cantidadComprada[luis] += compra;
                System.out.println("Luis se ha quedado sin billetes, compra un nuevo billete");
                if (Math.random() < PROBABILIDAD_LUIS)
                    billetes[luis]++;

            } else if (billetes[maria] <= 0) {
                int compra = (int)(Math.random()*(COMPRA_MAXIMA_MARIA - COMPRA_MINIMA_MARIA + 1) + COMPRA_MINIMA_MARIA);
                billetes[maria] += compra;
                cantidadComprada[maria] += compra;
                System.out.println("Maria se ha quedado sin billetes, compra un nuevo billete");
                if (Math.random() < PROBABILIDAD_MARIA)
                    billetes[maria]++;
        
            } else if (billetes[pedro] <= 0) {
                int compra = (int)(Math.random()*(COMPRA_MAXIMA_PEDRO - COMPRA_MINIMA_PEDRO + 1) + COMPRA_MINIMA_PEDRO);
                billetes[pedro] += compra;
                cantidadComprada[pedro] += compra;
                System.out.println("Pedro se ha quedado sin billetes, compra un nuevo billete");
                if (Math.random() < PROBABILIDAD_PEDRO)
                    billetes[pedro]++;
            }

            
            
            System.out.println("Estacion actual = " + estacionActual);
            System.out.println("Billetes de Luis = " + billetes[luis] + " Billetes de Maria = " + billetes[maria] + " Billetes de Pedro = " + billetes[pedro]);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        
        }

        System.out.println("Billetes totales de Luis [" + billetes[luis] + "] --- Billetes totales de Maria [" + billetes[maria] + "] --- Billetes totales de Pesdro [" + billetes[pedro] + "]");
        System.out.println("Pedro ha comprado un total de [" + cantidadComprada[pedro] + "] billetes --- Maria ha comprado un total de [" + cantidadComprada[maria] + "] billetes --- Pedro ha comprado un total de [" + cantidadComprada[pedro] + "] billetes");
    }






}