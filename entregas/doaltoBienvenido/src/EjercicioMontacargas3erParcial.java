import java.util.Scanner;

public class EjercicioMontacargas3erParcial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int plantaActual = 0;
        int plantaDeseada;
        final int PLANTA_MINIMA = 0;
        final int PLANTA_MAXIMA = 9;
        boolean enFuncionamiento = true;

        while (enFuncionamiento) {
            mostrarEstadoMontacargas(plantaActual);

            System.out.println("Seleccione el numero de la planta al que quieras ir (0-9 o -1 para salir)");
            plantaDeseada = entrada.nextInt();

            if (plantaDeseada == -1) {
                System.out.println("Tenga un buen dia!");
                enFuncionamiento = false;
            } else if (plantaDeseada < PLANTA_MINIMA || plantaDeseada > PLANTA_MAXIMA) {
                System.out.println("Planta Invalida");
            } else {
                moverMontacargas(plantaActual, plantaDeseada);
                plantaActual = plantaDeseada;
            }
        }
        System.out.println("Simulación finalizada");
    }

    private static void mostrarEstadoMontacargas(int plantaActual) {
        final int PLANTA_MINIMA = 0;
        final int PLANTA_MAXIMA = 9;
        final int CARGA_MINIMA = 30;
        final int CARGA_MAXIMA = 75;
        double cargaTransportada = (int) (Math.random() * CARGA_MAXIMA - CARGA_MINIMA + 1) + CARGA_MINIMA;

        System.out.println("====================");
        for (int planta = PLANTA_MAXIMA; planta >= PLANTA_MINIMA; planta--) {
            if (planta == plantaActual) {
                System.out.println(planta + " [---]");
            } else {
                System.out.println(planta + "   |");
            }
        }
        System.out.println("====================");
        System.out.println("Transportando " + cargaTransportada + " kilos");
        System.out.println("En planta " + plantaActual);
        System.out.println("Detenido");
    }

    private static void moverMontacargas(int plantaActual, int plantaDeseada) {
        if (plantaDeseada > plantaActual) {
            System.out.println("Subiendo a planta " + plantaDeseada);

        } else if (plantaDeseada < plantaActual) {
            System.out.println("Bajando a planta " + plantaDeseada);
        }
    }
}
