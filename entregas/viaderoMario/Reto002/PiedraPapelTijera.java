import java.util.Scanner;

class PiedraPapelTijera {
    public static void main(String[] args) {

        final int PIEDRA = 1;

        final int PAPEL = 2;
        final int TIJERA = 3;

        final String MENSAJE_EMPATE = "¡Habeis empatado!";
        final String MENSAJE_DERROTA = "¡Has perdido!";
        final String MENSAJE_VICTORIA = "¡Has ganado!";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Juguemos a piedra, papel y tijera!");
        System.out.println("Elige 1 para Piedra, 2 para Papel y 3 para Tijera");
        int eleccionUsuario = entrada.nextInt();
        int eleccionMaquina = (int) (Math.random() * (3) + 1);

        String resultado = eleccionUsuario == eleccionMaquina ? MENSAJE_EMPATE
                : eleccionUsuario == PIEDRA && eleccionMaquina == PAPEL ? MENSAJE_DERROTA
                        : eleccionUsuario == PAPEL && eleccionMaquina == TIJERA ? MENSAJE_DERROTA
                                : eleccionUsuario == TIJERA && eleccionMaquina == PIEDRA ? MENSAJE_DERROTA
                                        : MENSAJE_VICTORIA;

        System.out.println("Tu eleccion es:" + eleccionUsuario);
        System.out.println("La eleccion de la maquina es:" + eleccionMaquina);
        System.out.println("Resultado:" + resultado);

        entrada.close();
    }
}