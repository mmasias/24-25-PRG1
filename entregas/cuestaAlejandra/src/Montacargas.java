import java.util.Scanner;

class Montacargas {
    public static void main(String[] args) {
        final int PLANTAS = 9;
        int plantaSituacion;
        int plantaDestino;
        int carga;
        int cargaTotal = 0;

        plantaSituacion = 0;
        plantaDestino = 6;
        carga = calcularCarga();
        boolean simulando = true;

        while (simulando) {
            dibujarMontacargas(plantaSituacion, plantaDestino, carga);
            if (calcularMovimiento(plantaSituacion, plantaDestino) != 0) {
                plantaSituacion = calcularPlantaSituacion(plantaSituacion, plantaDestino);
            } else {
                plantaDestino = calcularPlantaDetino(PLANTAS);
                cargaTotal = cargaTotal + carga;
                carga = calcularCarga();
            }
            simulando = preguntarSiContinua();
        }
        System.out.println("Al final de la simulación ha transportado un total de " + cargaTotal + " kilos");
    }

    static int calcularPlantaDetino(int numeroPlantas) {
        return (int) (Math.random() * numeroPlantas);
    }

    static int calcularPlantaSituacion(int plantaSituacion, int plantaDestino) {
        return calcularMovimiento(plantaSituacion, plantaDestino) == 0 ? plantaSituacion : plantaSituacion + calcularMovimiento(plantaSituacion, plantaDestino);
    }

    static void dibujarMontacargas(int plantaSituacion, int plantaDestino, int carga) {
        final int PLANTAS = 9;
        final String BARRA = "  | |";
        final String SUBE = "^", BAJA = "v", DETENIDO = "-";
        for (int planta = PLANTAS; planta >= 0; planta--) {
            String detalleMovimiento = calcularMovimiento(plantaSituacion, plantaDestino) == 1 ? SUBE : calcularMovimiento(plantaSituacion, plantaDestino) == -1 ? BAJA : DETENIDO;
            String montacargas = "[" + detalleMovimiento + " " + plantaDestino + " " + detalleMovimiento + "]";
            System.out.println("P" + planta + " : " + (planta == plantaSituacion ? montacargas : BARRA));
        }
        System.out.println("=".repeat(12));
        System.out.println("En planta " + plantaSituacion);
        System.out.println(plantaDestino == plantaSituacion ? "Detenido" : "Yendo a planta " + plantaDestino + " mientras transporta " + carga + " kilos");
    }

    static int calcularMovimiento(int plantaSituacion, int plantaDestino) {
        return plantaSituacion < plantaDestino ? 1 : plantaSituacion > plantaDestino ? -1 : 0;
    }

    static boolean preguntarSiContinua() {
        System.out.println("Pulse x para salir");
        return !(new Scanner(System.in).nextLine().equalsIgnoreCase("x"));
    }

    static int calcularCarga() {
        final int CARGA_MAXIMA = 75;
        final int CARGA_MINIMA = 30;
        return (int) ((Math.random() * (CARGA_MAXIMA - CARGA_MINIMA)) + CARGA_MINIMA);
    }
}