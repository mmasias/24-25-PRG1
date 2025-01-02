public class EdificioAutomatico {

    public static void main(String[] args) {

        final int PLANTAS = 7;
        final int HABITACIONES = 6;
        final int HORAS_TOTALES = 168;
        final double PROBABILIDAD_PERSIANA_ABIERTA = 0.7;
        final double PROBABILIDAD_LUZ_ENCENDIDA = 0.6;

        System.out.println("El programa avanza automáticamente las horas");

        for (int hora = 1; hora <= HORAS_TOTALES; hora++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.printf("Hora " + hora);
            System.out.println("     __/\\__");
            System.out.println("   |    |  |####|  |    |   ");
            System.out.println("============================");

            for (int planta = PLANTAS; planta >= 1; planta--) {
                System.out.print("P" + planta + ": ");

                for (int habitacion = 1; habitacion <= HABITACIONES; habitacion++) {
                    double probabilidadAbierta = Math.random();
                    double probabilidadEncendida = Math.random();
                    boolean persianaAbierta = probabilidadAbierta < PROBABILIDAD_PERSIANA_ABIERTA;
                    boolean luzEncendida = probabilidadEncendida < PROBABILIDAD_LUZ_ENCENDIDA;

                    if (persianaAbierta) {
                        System.out.print("[º] ");
                    } else {
                        System.out.print(luzEncendida ? "[*] " : "[ ] ");
                    }
                }
                System.out.println();
            }
            System.out.println("----------------------------");
            System.out.println("============================");
        }
    }
}

