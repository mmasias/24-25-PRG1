import java.util.Scanner;

class JuegoPiedraPapelTijerasConBucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERAS = 3;
        final int LIMITE_MINIMO = 1;
        final int LIMITE_MAXIMO = 3;

        final String MENSAJE_EMPATE = ("Empate!");
        final String MENSAJE_HAS_GANADO = ("Has Ganado!");
        final String MENSAJE_HAS_PERDIDO = ("Has Perdido!");

        int eleccionUsuario;
        int eleccionAleatoriaMaquina;
        String mensaje = ("Elige: 1 para Piedra, 2 para Papel, 3 para Tijeras");

        for (int turno = 0; turno < 3; turno = turno + 1) {

            System.out.println("Jueguemos a Piedra, Papel o Tijeras!");
            do {
                System.out.println(mensaje);
                eleccionUsuario = scanner.nextInt();
                mensaje = ("ERROR! Elije entre 1 y 3!");
            } while (!(eleccionUsuario >= LIMITE_MINIMO && eleccionUsuario <= LIMITE_MAXIMO));
            
            mensaje = ("Elige: 1 para Piedra, 2 para Papel, 3 para Tijeras");
            eleccionAleatoriaMaquina = (int) (Math.random() * (LIMITE_MAXIMO - LIMITE_MINIMO + 1) + LIMITE_MINIMO);

            String resultado = MENSAJE_HAS_GANADO;

            if (eleccionUsuario == eleccionAleatoriaMaquina) {
                resultado = MENSAJE_EMPATE;
            } else if (eleccionUsuario == PIEDRA && eleccionAleatoriaMaquina == PAPEL ||
                eleccionUsuario == PAPEL && eleccionAleatoriaMaquina == TIJERAS || 
                eleccionUsuario == TIJERAS && eleccionAleatoriaMaquina == PIEDRA) {
                resultado = MENSAJE_HAS_PERDIDO;
            }

            String eleccionUsuarioEnString = eleccionUsuario == PIEDRA ? "Piedra"
                    : eleccionUsuario == PAPEL ? "Papel"
                    : "Tijeras";
            String eleccionAleatoriaMaquinaEnString = (eleccionAleatoriaMaquina == PIEDRA) ? "Piedra"
                    : (eleccionAleatoriaMaquina == PAPEL) ? "Papel"
                    : "Tijeras";

            System.out.println("Tu eleccion es: " + eleccionUsuarioEnString);
            System.out.println("La eleccion de la maquina es: " + eleccionAleatoriaMaquinaEnString);
            System.out.println(resultado);
        }
        scanner.close();
    }

}
