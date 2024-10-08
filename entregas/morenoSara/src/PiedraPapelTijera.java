import java.util.Scanner;
class PierdaPapelTijera {
    public static void main(String[] args);
    
    Scanner scanner = new Scanner(System.in);

    final int PIEDRA = 1;
    final int PAPEL = 2;
    final int TIJERA = 3;
    
    System.out.println("Elige 1 para piedra, 2 para pael y 3 para tijera.");

    int eleccionUsuario;
    eleccionUsuario = scanner.nextInt();

    String eleccionUsuarioTexto;

    eleccionUsuarioTexto = (eleccionUsuario == PIEDRA) ? "Piedra"
            : (eleccionUsuario == PAPEL) ? "Papel"
            : (eleccionUsuario == TIJERA) ? "Tijera";

    System.out.println("Tu elección es:" + eleccionUsuarioTexto);

    int eleccionOrdenador = (int) ((Math.random()*3)+1);

    System.out.println("La elección del ordenador es:" + eleccionOrdenador);
    String resultado;
    resultado = eleccionUsuario
    System.out.println(resultado)
}