import java.util.Scanner;

public class TestMercadona {

    public static void main(String[] args) {

        final int TIEMPO_ABIERTO = 720;
        final int MIN_PACKS = 5;
        final int MAX_PACKS = 15;
        final int CAJA_VACIA = 0;
        final int CLIENTE_EN_COLA = 1;
        final double PROBABILIDAD_LLEGADA = 0.6;

        int genteEsperando = 0;

        int itemsCaja1 = 0;
        int itemsCaja2 = 0;
        int itemsCaja3 = 0;
        int itemsCaja4 = 0;

       
        int minutosSinCola = 0;
        int personasAtendidas = 0;
        int itemsVendidos= 0;


        Scanner scanner = new Scanner(System.in);

        for (int tiempoActual = 0; tiempoActual <= TIEMPO_ABIERTO; tiempoActual++) {

            genteEsperando = llegaGente(PROBABILIDAD_LLEGADA, genteEsperando, tiempoActual, CLIENTE_EN_COLA);

            if (genteEsperando == 0) {minutosSinCola++;}

            if (genteEsperando > 0) {

                if (itemsCaja1 == CAJA_VACIA && genteEsperando > 0) {
                    genteEsperando--;
                    personasAtendidas++;
                    itemsCaja1 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS) + MIN_PACKS);
                }

                if (itemsCaja2 == CAJA_VACIA && genteEsperando > 0) {
                    genteEsperando--;
                    personasAtendidas++;
                    itemsCaja2 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS) + MIN_PACKS);
                }

                if (itemsCaja3 == CAJA_VACIA && genteEsperando > 0) {
                    genteEsperando--;
                    personasAtendidas++;
                    itemsCaja3 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS) + MIN_PACKS);
                }

                if (itemsCaja4 == CAJA_VACIA && genteEsperando > 0) {
                    genteEsperando--;
                    personasAtendidas++;
                    itemsCaja4 = (int) (Math.random() * (MAX_PACKS - MIN_PACKS) + MIN_PACKS);
                }
            }

            if (itemsCaja1 > 0) {itemsCaja1--; itemsVendidos++;}
            if (itemsCaja2 > 0) {itemsCaja2--; itemsVendidos++;}
            if (itemsCaja3 > 0) {itemsCaja3--; itemsVendidos++;}
            if (itemsCaja4 > 0) {itemsCaja4--; itemsVendidos++;}


            System.out.println("Tiempo que ha pasado: " + tiempoActual + " minutos.");
            System.out.println("Gente en la cola: " + genteEsperando);
            System.out.println("Objetos pagándose en caja 1: " + itemsCaja1);
            System.out.println("Objetos pagándose en caja 2: " + itemsCaja2);
            System.out.println("Objetos pagándose en caja 3: " + itemsCaja3);
            System.out.println("Objetos pagándose en caja 4: " + itemsCaja4);

            

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

    static void resultadosFinales(int minutosSinCola, int genteEsperando, int personasAtendidas, int itemsVendidos){

        System.out.println("-------------------");
        System.out.println("FIN DE JORNADA");
        System.out.println("Número de minutos sin nadie en cola: " + minutosSinCola);
        System.out.println("Gente en la cola al final del día: "+genteEsperando);
        System.out.println("Personas atendidas: "+personasAtendidas);
        System.out.println("Ítems vendidos: "+itemsVendidos);
    }
}
