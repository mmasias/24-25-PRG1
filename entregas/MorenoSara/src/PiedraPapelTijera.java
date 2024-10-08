import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERA = 3;
        
        final int MINIMO = 0;
        final int MAXIMO = 4;

        final String PIEDRA_TEXTO = "Piedra";
        final String PAPEL_TEXTO = "Papel";
        final String TIJERA_TEXTO = "Tijera";

        final String INVALIDO = "Opción inválida, revise la elección.";
        

        System.out.println("Elige 1 para piedra, 2 para papel y 3 para tijera para iniciar el juego");

        int eleccionUsuarioNumero;
        
        eleccionUsuarioNumero = scanner.nextInt();
        
        String eleccionUsuarioTexto;
        
        eleccionUsuarioTexto = eleccionUsuarioNumero <= MINIMO ? INVALIDO
        : eleccionUsuarioNumero == PIEDRA ? PIEDRA_TEXTO
        : eleccionUsuarioNumero == PAPEL ? PAPEL_TEXTO
        : eleccionUsuarioNumero == TIJERA ?  TIJERA_TEXTO
        : eleccionUsuarioNumero >= MAXIMO ? INVALIDO : INVALIDO;

        System.out.println("Tu eleccion: " + eleccionUsuarioTexto);

        int eleccionOrdenadorNumero = (int)(Math.random() * 3) + 1;
        
        String eleccionOrdenadorTexto;

        eleccionOrdenadorTexto = eleccionOrdenadorNumero <= MINIMO ? INVALIDO
        : eleccionOrdenadorNumero == PIEDRA ? PIEDRA_TEXTO
        : eleccionOrdenadorNumero == PAPEL ? PAPEL_TEXTO
        : eleccionOrdenadorNumero == TIJERA ?  TIJERA_TEXTO
        : eleccionOrdenadorNumero >= MAXIMO ? INVALIDO : INVALIDO;

        System.out.println("Elección del ordenador: " + eleccionOrdenadorTexto);

        String resultado;
        
        resultado =  eleccionUsuarioNumero == eleccionOrdenadorNumero ? "Empate!"
        : eleccionUsuarioNumero == PIEDRA && eleccionOrdenadorNumero == PAPEL ? "¡Pierdes!"
        : eleccionUsuarioNumero == TIJERA && eleccionOrdenadorNumero == PIEDRA ? "¡Pierdes!"
        : eleccionUsuarioNumero == PAPEL && eleccionOrdenadorNumero == PIEDRA ? "¡Ganas!"
        : eleccionUsuarioNumero == PIEDRA && eleccionOrdenadorNumero == TIJERA  ? "¡Ganas!"
        : eleccionUsuarioNumero == PAPEL && eleccionOrdenadorNumero == TIJERA ? "¡Pierdes!"
        : eleccionUsuarioNumero == TIJERA && eleccionOrdenadorNumero == PAPEL ? "¡Ganas!"
        : "Error";
        
        System.out.println(resultado);
    
        scanner.close();
    }
}