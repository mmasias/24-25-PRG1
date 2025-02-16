import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CentroComercial {

    static class Cliente {
        int packs;

        public Cliente(int packs) {
            this.packs = packs;
        }
    }

    static class Caja {
        Cliente clienteActual;
        int tiempoRestante;
        Caja siguiente;

        public void atender(Cliente cliente) {
            this.clienteActual = cliente;
            this.tiempoRestante = cliente.packs;
        }

        public void procesar() {
            if (clienteActual != null) {
                tiempoRestante--;
                if (tiempoRestante <= 0) {
                    clienteActual = null;
                }
            }
        }

        public boolean estaLibre() {
            return clienteActual == null;
        }

        public String toString() {
            if (clienteActual == null) {
                return "Libre";
            } else {
                return "Atendiendo cliente con " + clienteActual.packs + " packs (" + tiempoRestante + " minutos restantes)";
            }
        }
    }

    public static void main(String[] args) {
        final int HORARIO_INICIO = 540;
        final int HORARIO_FIN = 1260;
        final double PROB_LLEGADA = 0.6;
        final int MIN_PACKS = 5;
        final int MAX_PACKS = 15;

        Queue<Cliente> cola = new LinkedList<>();
        Caja primeraCaja = new Caja();
        Caja actualCaja = primeraCaja;

        int numeroDeCajas = 4;
        for (int i = 1; i < numeroDeCajas; i++) {
            Caja nuevaCaja = new Caja();
            actualCaja.siguiente = nuevaCaja;
            actualCaja = nuevaCaja;
        }

        Random random = new Random();

        for (int tiempo = HORARIO_INICIO; tiempo < HORARIO_FIN; tiempo++) {
            if (random.nextDouble() < PROB_LLEGADA) {
                int packs = random.nextInt(MAX_PACKS - MIN_PACKS + 1) + MIN_PACKS;
                cola.add(new Cliente(packs));
                System.out.println("Minuto " + tiempo + ": Llega un cliente con " + packs + " packs a la cola.");
            }

            actualCaja = primeraCaja;
            while (actualCaja != null) {
                actualCaja.procesar();

                if (actualCaja.estaLibre() && !cola.isEmpty()) {
                    Cliente siguienteCliente = cola.poll();
                    actualCaja.atender(siguienteCliente);
                    System.out.println("Minuto " + tiempo + ": Caja comienza a atender cliente con " + siguienteCliente.packs + " packs.");
                }

                actualCaja = actualCaja.siguiente;
            }

            System.out.println("Minuto " + tiempo + ":\nCola: " + cola.size() + " clientes\nEstado de las cajas:");
            actualCaja = primeraCaja;
            int numeroCaja = 1;
            while (actualCaja != null) {
                System.out.println("  Caja " + numeroCaja + ": " + actualCaja);
                actualCaja = actualCaja.siguiente;
                numeroCaja++;
            }

            System.out.println("=============================");
        }

        System.out.println("Fin del horario del centro comercial.");
    }
}

