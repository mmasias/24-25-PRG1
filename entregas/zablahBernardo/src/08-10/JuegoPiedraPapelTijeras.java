import java.util.Scanner;

class JuegoPiedraPapelTijeras {
    static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final int TIJERAS = 3 ;
            final int PAPEL = 2 ;
            final int PIEDRA = 1 ;

            final String EMPATE = ("Empate!");
            final String HAS_GANADO = ("Has Ganado!");
            final String HAS_PERDIDO = ("Has Perdido!");

            Scanner entrada = new Scanner(System.in) ;
            System.out.println("Jueguemos a Piedra, Papel o Tijera!") ;
            int eleccionUsuario;
            System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para Tijeras") ;
            eleccionUsuario = entrada.nextInt() ;

            String resultado; 
            resultado = (eleccionUsuario == TIJERAS) ? EMPATE
            :resultado = (eleccionUsuario == PAPEL) ? EMPATE
            :

            System.out.println(resultado);
            entrada.close();
            





    }
}
