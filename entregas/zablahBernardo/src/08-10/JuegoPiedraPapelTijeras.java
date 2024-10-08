import java.util.Scanner;

public class JuegoPiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERAS = 3;

        final String MENSAJE_EMPATE = ("Empate!");
        final String MENSAJE_HAS_GANADO = ("Has Ganado!");
        final String MENSAJE_HAS_PERDIDO = ("Has Perdido!");

        int eleccionUsuario;
        int eleccionAleatoriaMaquina;
        
        final int MINIMO = 1;
        final int MAXIMO = 3;

        System.out.println("Jueguemos a Piedra, Papel o Tijeras!");
        System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para Tijeras");

        eleccionUsuario = scanner.nextInt();
        eleccionAleatoriaMaquina = (int) (Math.random() * (MAXIMO - MINIMO + 1) + MINIMO);

        String resultado = eleccionUsuario == eleccionAleatoriaMaquina ? MENSAJE_EMPATE
            : eleccionUsuario == PIEDRA && eleccionAleatoriaMaquina == PAPEL ? MENSAJE_HAS_PERDIDO
            : eleccionUsuario == PAPEL && eleccionAleatoriaMaquina == TIJERAS ? MENSAJE_HAS_PERDIDO
            : eleccionUsuario == TIJERAS && eleccionAleatoriaMaquina == PIEDRA ? MENSAJE_HAS_PERDIDO
            : MENSAJE_HAS_GANADO;

        String eleccionUsuarioEnString = eleccionUsuario == PIEDRA ? "Piedra" 
            : eleccionUsuario == PAPEL ? "Papel" 
            : "Tijeras";
        String eleccionAleatoriaMaquinaEnString = (eleccionAleatoriaMaquina == PIEDRA) ? "Piedra" 
            : (eleccionAleatoriaMaquina == PAPEL) ? "Papel" 
            : "Tijeras";

        System.out.println("Tu eleccion es: " + eleccionUsuarioEnString);
        System.out.println("La eleccion de la maquina es: " + eleccionAleatoriaMaquinaEnString);
        System.out.println(resultado);

        scanner.close();

    }
}
