public class TestMercadona {

    public static void main(String[] args) {

        final int TIEMPO_ABIERTO = 720;
        final int MIN_PACKS = 5;
        final int MAX_PACKS = 15;
        final int CAJA_VACIA = 0;
        final int CLIENTE_EN_COLA = 1;
        final int NUMERO_CAJAS = 4;
        final double PROBABILIDAD_LLEGADA = 0.6;

        int genteEsperando = 0;


        int[] itemsCajas = new int[NUMERO_CAJAS];
       
        int minutosSinCola = 0;
        int personasAtendidas = 0;
        int itemsVendidos= 0;


        for (int tiempoActual = 0; tiempoActual <= TIEMPO_ABIERTO; tiempoActual++) {

            genteEsperando = llegaGente(PROBABILIDAD_LLEGADA, genteEsperando, tiempoActual, CLIENTE_EN_COLA);

            if (genteEsperando == 0) {minutosSinCola++;}

            if (genteEsperando > 0) {

                for (int i = 0; i < itemsCajas.length; i++) {
                    if (itemsCajas[i] == CAJA_VACIA && genteEsperando > 0) {
                        genteEsperando--;
                        personasAtendidas++;
                        itemsCajas[i] = generarItemsCliente(MIN_PACKS, MAX_PACKS);
                    }
                }
            }

            for (int i = 0; i < itemsCajas.length; i++) {
                if (itemsCajas[i] > 0) {
                    itemsCajas[i]--;
                    itemsVendidos++;
                }
            }

            for (int i = 0; i < itemsCajas.length; i++) {
                System.out.println("Objetos pagándose en caja " + (i + 1) + ": " + itemsCajas[i]);
            }


            System.out.println("Tiempo que ha pasado: " + tiempoActual + " minutos.");
            System.out.println("Gente en la cola: " + genteEsperando);
            System.out.println("Objetos pagándose en caja 1: " + itemsCajas[0]);
            System.out.println("Objetos pagándose en caja 2: " + itemsCajas[1]);
            System.out.println("Objetos pagándose en caja 3: " + itemsCajas[2]);
            System.out.println("Objetos pagándose en caja 4: " + itemsCajas[3]);

            

        }

        resultadosFinales(minutosSinCola, genteEsperando, personasAtendidas, itemsVendidos);
        

    }

    static int llegaGente(double PROBABILIDAD_LLEGADA, int genteEsperando, int tiempoActual, int CLIENTE_EN_COLA) {

        if (Math.random() <= PROBABILIDAD_LLEGADA) {

            genteEsperando = genteEsperando + CLIENTE_EN_COLA;
            System.out.println("Un cliente llegó en el minuto: " + tiempoActual);
        }

        return genteEsperando;
    }
    
    static int generarItemsCliente(int MIN_PACKS, int MAX_PACKS) {
        return (int) (Math.random() * (MAX_PACKS - MIN_PACKS) + MIN_PACKS);
    }
    
    static void resultadosFinales(int minutosSinCola, int genteEsperando, int personasAtendidas, int itemsVendidos){

        System.out.println("-------------------");
        System.out.println("FIN DE JORNADA");
        System.out.println("Número de minutos sin nadie en cola: " + minutosSinCola);
        System.out.println("Gente en la cola al final del día: "+genteEsperando);
        System.out.println("Personas atendidas: "+personasAtendidas);
        System.out.println("Ítems vendidos: "+itemsVendidos);
    }
}
