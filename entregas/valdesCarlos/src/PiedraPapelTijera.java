import java.util.Scanner;

class PiedraPapelTijera{
    public static void main(String[] args) {

        final int piedra = 1;
        final int papel = 2;
        final int tijera = 3;

        final String MENSAJE_EMPATE = "¡Habeis empatado!";
        final String MENSAJE_DERROTA = "¡Has perdido!";
        final String MENSAJE_VICTORIA = "¡Has ganado!";

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Juguemos al piedra, papel y tijera!");
        System.out.println("Elige 1 para Piedra, 2 para Papel y 3 para Tijera");
        int eleccionUsuario = entrada.nextInt();
        int eleccionMaquina = (int)(Math.random()*(3)+1);
        do
        {
        if(eleccionUsuario < 1 || eleccionUsuario > 3 );
        {
            System.out.println("ERROR");
        }    
        }while(!(eleccionUsuario >= 1 && eleccionUsuario <= 3));

        String resultado = eleccionUsuario == eleccionMaquina ? MENSAJE_EMPATE
            : eleccionUsuario == 1 && eleccionMaquina == 2 ? MENSAJE_DERROTA
            : eleccionUsuario == 2 && eleccionMaquina == 3 ? MENSAJE_DERROTA
            : eleccionUsuario == 3 && eleccionMaquina == 1 ? MENSAJE_DERROTA
            :MENSAJE_VICTORIA ;

        System.out.println("Tu eleccion es:" +eleccionUsuario);
        System.out.println("La eleccion de la maquina es:" +eleccionMaquina);
        System.out.println("Resultado:" +resultado);
       
        entrada.close();
      }
}      