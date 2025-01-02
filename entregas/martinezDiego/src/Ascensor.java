import java.util.Scanner;

public class Ascensor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] plantas = { 3, 2, 1, 0, -1, -2, -3 };
        boolean ascensorEnUso = true;
        boolean ascensorDisponible = true;

        int plantaActual = 0;
        int plantaDestino = 0;

        while (ascensorEnUso) {
            if (ascensorDisponible) {
                System.out.println("Introduce la planta: ");
                plantaDestino = scanner.nextInt();
                ascensorDisponible = false;
            }

            boolean subiendo = plantaDestino > plantaActual;

            if (subiendo) {
                System.out.println("--------");
                System.out.println(" SUBIENDO");
                System.out.println("--------");
            } else if (plantaDestino < plantaActual) {
                System.out.println("--------");
                System.out.println(" BAJANDO");
                System.out.println("--------");
            }

            for (int i = 0; i < plantas.length; i++) {
                if (plantas[i] == plantaDestino) {
                    System.out.println(" Planta: " + plantas[i] + " [X]");
                } else if (plantas[i] == plantaActual) {
                    System.out.println(" Planta: " + plantas[i] + " [O]");
                } else if (subiendo && plantas[i] == plantaActual + 1) {
                    System.out.println(" Planta: " + plantas[i] + " [^]");
                } else if (!subiendo && plantas[i] == plantaActual - 1) {
                    System.out.println(" Planta: " + plantas[i] + " [v]");
                } else {
                    System.out.println(" Planta: " + plantas[i] + " []");
                }
            }

            if (subiendo) {
                plantaActual++;
            } else if (!subiendo) {
                plantaActual--;
            }

            if (plantaActual == plantaDestino) {
                System.out.println("Has llegado a la planta deseada.");
                ascensorDisponible = true;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}

