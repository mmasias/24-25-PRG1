
class mercadona {

    public static void main(String[] args) {
        final int MINUTOS_POR_HORA = 60;
        final int HORAS_ABIERTO = 12;
        final double PROBABILIDAD_DE_LLEGADA = 0.4;

        int cola = 0;
        int caja1 = 0;
        int caja2 = 0;
        int caja3 = 0;
        int caja4 = 0;
        int minutosColaVacia = 0;
        int numeroPersonasAtendidas = 0;
        int numeroItemsVendidos = 0;

        for (int tiempoActual = 0; tiempoActual < HORAS_ABIERTO * MINUTOS_POR_HORA; tiempoActual++) {

            boolean llegaAlguien = Math.random() <= PROBABILIDAD_DE_LLEGADA;
            if (llegaAlguien) {
                cola++;
            }

            boolean caja1Vacia = caja1 == 0;
            if (puedePasar(caja1, cola)) {
                cola--;
                numeroPersonasAtendidas++;
                caja1 = ponerProductos();
            } else if (!caja1Vacia) {
                caja1--;
                numeroItemsVendidos++;
            }

            boolean caja2Vacia = caja2 == 0;
            if (puedePasar(caja2, cola)) {
                cola--;
                numeroPersonasAtendidas++;
                caja2 = ponerProductos();
            } else if (!caja2Vacia) {
                caja2--;
                numeroItemsVendidos++;
            }

            boolean caja3Vacia = caja3 == 0;
            if (puedePasar(caja2, cola)) {
                cola--;
                numeroPersonasAtendidas++;
                caja3 = ponerProductos();
            } else if (!caja3Vacia) {
                caja3--;
                numeroItemsVendidos++;
            }

            boolean caja4Vacia = caja4 == 0;
            if (puedePasar(caja2, cola)) {
                cola--;
                numeroPersonasAtendidas++;
                caja4 = ponerProductos();
            } else if (!caja4Vacia) {
                caja4--;
                numeroItemsVendidos++;
            }

            if (mirarColaVacia(cola, llegaAlguien)) {
                minutosColaVacia++;
            }

            decirTiempo(tiempoActual);
            contarHistoria(cola, caja1, caja2, caja3, caja4);

        }
        decirResumen(minutosColaVacia, cola, numeroPersonasAtendidas, numeroItemsVendidos);

    }

    static void decirTiempo(int tiempoActual) {
        final int HORA_DE_APERTURA = 9;
        int hora = (int) (tiempoActual / 60) + HORA_DE_APERTURA;
        int minuto = tiempoActual % 60;
        System.out.println("Tiempo: " + hora + ":" + minuto);
    }

    static int ponerProductos() {
        final int MINIMOS_ITEMS = 5, MAXIMOS_ITEMS = 15;

        return (int) (Math.random() * (MAXIMOS_ITEMS - MINIMOS_ITEMS + 1) + MINIMOS_ITEMS);
    }

    private static boolean puedePasar(int caja1, int cola) {
        return caja1 <= 0 && cola > 0;
    }

    private static boolean mirarColaVacia(int cola, boolean llegaAlguien) {
        return cola <= 0 && !llegaAlguien;
    }

    static void contarHistoria(
            int cola,
            int caja1, int caja2, int caja3, int caja4
    ) {
        String PRODUCTO = " [ ] ",
                PERSONA = " _O_ ";

        System.out.println("Cola: " + PERSONA.repeat(cola));
        System.out.println("Caja 1: " + PRODUCTO.repeat(caja1));
        System.out.println("Caja 2: " + PRODUCTO.repeat(caja2));
        System.out.println("Caja 3: " + PRODUCTO.repeat(caja3));
        System.out.println("Caja 4: " + PRODUCTO.repeat(caja4));
    }

    static void decirResumen(int minutosColaVacia, int cola, int numeroPersonasAtendidas, int numeroItemsVendidos) {
        System.out.println("");
        System.out.println("RESUMEN");
        System.out.println("===============================================");
        System.out.println("Minutos con la cola vacia: " + minutosColaVacia);
        System.out.println("Número de personas en cola al final del día: " + cola);
        System.out.println("Número de personas atendidas hoy: " + numeroPersonasAtendidas);
        System.out.println("Número de items vendidos hoy: " + numeroItemsVendidos);
        System.out.println("===============================================");
    }
}
