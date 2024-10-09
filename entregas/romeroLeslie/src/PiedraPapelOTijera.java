import java.util.Scanner;

public class PiedraPapelOTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a jugar Piedra, Papel o Tijera!");
        System.out.print("Elige tu jugada: 1 para Piedra, 2 para Papel, 3 para Tijera: ");
        
        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERA = 3;

        final int MIN = 1;
        final int MAX = 3;

        int eleccionUsuario = scanner.nextInt();
        int eleccionOrdenador = (int)(Math.random() * (MAX - MIN + 1)) + MIN;

       
        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("Elección del ordenador: " + eleccionOrdenador);


        String resultado = (eleccionUsuario == eleccionOrdenador) ? "Empate!" :
                   (eleccionUsuario == PIEDRA && eleccionOrdenador == TIJERA || 
                    eleccionUsuario == PAPEL && eleccionOrdenador == PIEDRA || 
                    eleccionUsuario == TIJERA && eleccionOrdenador == PAPEL) ? "¡Ganaste!" : "Perdiste.";
                           
        System.out.println(resultado);

        scanner.close();
    }
}
                           
 
