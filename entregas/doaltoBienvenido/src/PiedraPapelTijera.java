import java.util.Scanner;


class PiedraPapelTijera{
    
    public static void main(String[] args){

        final String MENSAJE_EMPATE = "¡Empate!";
        final String MENSAJE_GANAR = "¡Ganaste!";
        final String MENSAJE_PERDER = "¡Perdiste!";

        Scanner scanner = new Scanner(System.in);
        int eleccionUsuario;
        int eleccionOrdenador;

        System.out.println("PIEDRA, PAPEL O TIJERA");
        System.out.println("======================");

        System.out.println("Elige: 1 para piedra, 2 para papel, 3 para tijera:");
        eleccionUsuario = scanner.nextInt();
        eleccionOrdenador = (int)(Math.random()*(3-1)+1);

        String resultado = eleccionUsuario == eleccionOrdenador ? MENSAJE_EMPATE
                        : eleccionUsuario == 1 && eleccionOrdenador == 2 ? MENSAJE_PERDER
                        : eleccionUsuario == 2 && eleccionOrdenador == 3 ? MENSAJE_PERDER
                        : eleccionUsuario == 3 && eleccionOrdenador == 1 ? MENSAJE_PERDER
                        : MENSAJE_GANAR;
                        
        System.out.println("Tu eleccion es: " + eleccionUsuario);
        System.out.println("La eleccion del ordenador es: " + eleccionOrdenador);
        System.out.println(resultado);

    }
}