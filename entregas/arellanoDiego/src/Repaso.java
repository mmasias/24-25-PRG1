public class Repaso {
    public static void main(String[] args) {

        int[][] reglas = {
                { 0, -1, 1 },
                { 1, 0, -1 },
                { -1, 1, 0 }
        };

        String[][] matrizResultado ={"Pierde", "Empate", "Gana"}

        String[] piezas = { "Piedra", "Papel", "Tijeras" };
        int miJugada = pedirPieza();
        System.out.println(piezas[miJugada]);

        int jugadaCompu = jugarCompu(piezas);
        System.out.println(piezas[jugadaCompu]);

        int resultado = reglas[miJugada][jugadaCompu];
        System.out.println(matrizResultado[resultado+1]);

    }

    static int jugarCompu(String[] piezas) {
        return (int) (Math.random() * piezas.length);
    }

    static int pedirPieza() {
        System.out.println("Elige entre 0 y  2");
        return new Scanner(System.in).nextInt();
    }

}
