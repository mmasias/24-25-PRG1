public class CF {
    public static void main(String[] args) {
        int cola = 0;
        int minutosColaVacia = 0;
        int personasAtendidas = 0;
        int numeroItemsVendidos = 0;

        final int HORAS_ABIERTO = 12;
        final int MINUTOS_POR_HORA = 60;

        final int CAJAS = 4;
        int[] caja = new int[CAJAS];

        for (int tiempo = 0; tiempo <= HORAS_ABIERTO * MINUTOS_POR_HORA; tiempo++) {

            System.out.println();
            imprimirHora(tiempo);
            System.out.println("-----------------------------------------------------");

            if (llegaAlguien())
                cola++;

            imprimirCola(cola);

            for (int numeroCaja = 0; numeroCaja < CAJAS; numeroCaja++) {

                if (puedePasar(cola, caja[numeroCaja])) {
                    cola--;
                    caja[numeroCaja] = poneItemsCaja(caja[numeroCaja]);
                    personasAtendidas++;
                } else {
                    caja[numeroCaja]--;
                    numeroItemsVendidos++;
                    caja[numeroCaja] = caja[numeroCaja] < 0 ? 0 : caja[numeroCaja];
                }

                imprimirCajas(caja[numeroCaja], numeroCaja);

                if (colaVacia(cola))
                    minutosColaVacia++;
            }
            System.out.println("-----------------------------------------------------");

        }
        imprimirResultados(
                minutosColaVacia,
                cola,
                personasAtendidas,
                numeroItemsVendidos);

    }

    private static void imprimirResultados(
            int personasAtendidas,
            int cola,
            int minutosColaVacia,
            int numeroItemsVendidos) {
        System.out.println("Se atendieron " + personasAtendidas + " personas.");
        System.out.println("Al final del día había en la cola " + cola + " personas.");
        System.out.println("La cola ha estado vacia " + minutosColaVacia + " minutos. ");
        System.out.println("Se vendieron " + numeroItemsVendidos + " Items. ");
    }

    private static boolean colaVacia(int cola) {
        return llegaAlguien() && cola == 0;
    }

    private static boolean llegaAlguien() {
        double PROBABILIDAD_LLEGA_ALGUIEN = 0.4;

        return Math.random() <= PROBABILIDAD_LLEGA_ALGUIEN;
    }

    private static boolean puedePasar(int cola, int caja) {
        return cola >= 1 && caja <= 0;
    }

    private static int poneItemsCaja(int caja) {
        final int MAXIMO_ITEMS = 15;
        final int MINIMO_ITEMS = 5;

        return (int) ((Math.random() * MAXIMO_ITEMS - MINIMO_ITEMS + 1) + MINIMO_ITEMS);
    }

    private static void imprimirHora(int tiempo) {

        final int HORA_DE_INICIO = 9;
        int minuto = tiempo % 60;
        int hora = tiempo / 60 + HORA_DE_INICIO;

        System.out.println("[" + (hora < 10 ? "0" + hora : hora) + ":" + (minuto < 10 ? "0" + minuto : minuto) + "]");
    }

    private static void imprimirCola(int cola) {
        final String PERSONA = " _O_ ";

        System.out.println("Cola:" + PERSONA + "x" + cola);
    }

    private static void imprimirCajas(int caja, int numeroCaja) {
        final String ITEM = "[ ]";

        System.out.println("Caja " + (numeroCaja + 1) + ": " + ITEM.repeat(caja));
    }
}
