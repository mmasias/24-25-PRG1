import java.util.Scanner;

class PiedraPapelTijera {
    public static void main(String[] args) {

        final String MENSAJE_EMPATE = "¡Empate!";
        final String MENSAJE_GANAR = "¡Ganaste!";
        final String MENSAJE_PERDER = "¡Perdiste!";

        Scanner scanner = new Scanner(System.in);
        int eleccionUsuario;
        int eleccionOrdenador;

        System.out.println("PIEDRA, PAPEL O TIJERA");
        do
        {
        System.out.println("Elige: 1 para piedra, 2 para papel, 3 para tijera:");
        eleccionUsuario = scanner.nextInt();
        eleccionOrdenador = (int)(Math.random() * 3 + 1);
        if(eleccionUsuario < 1 || eleccionUsuario > 3 );
        {
            System.out.println( "ERROR");
        }
        }while (!(eleccionUsuario >= 1 && eleccionUsuario <= 3));
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        System.out.println("Tu elección es: " + opciones[eleccionUsuario - 1]);
        System.out.println("La elección del ordenador es: " + opciones[eleccionOrdenador - 1]);

        String resultado = eleccionUsuario == eleccionOrdenador ? MENSAJE_EMPATE
                        : (eleccionUsuario == 1 && eleccionOrdenador == 2)  
                        || (eleccionUsuario == 2 && eleccionOrdenador == 3)  
                        || (eleccionUsuario == 3 && eleccionOrdenador == 1)  
                        ? MENSAJE_PERDER
                        : MENSAJE_GANAR;

        System.out.println(resultado);

        scanner.close();

    }
}
