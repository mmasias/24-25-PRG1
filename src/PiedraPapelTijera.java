import java.util.Scanner;


class PiedraPapelTijera{

    public static void main(String[] args){

        final String MENSAJE_EMPATE = "¡Empate!";
        final String MENSAJE_GANAR = "¡Ganaste!";
        final String MENSAJE_PERDER = "¡Perdiste!";

        final int PIEDRA = 1;
        final int PAPEL = 2;
        final int TIJERA = 3;

        final int MAXIMO = 3;
        final int MINIMO = 1;


        Scanner scanner = new Scanner(System.in);
        int eleccionUsuario;
        int eleccionOrdenador;

        System.out.println("PIEDRA, PAPEL O TIJERA");
        System.out.println("======================");

        for(int turno=0 ; turno<3 ; turno++){
            do{
                System.out.println("Elige: 1 para piedra, 2 para papel, 3 para tijera:");

                eleccionUsuario = scanner.nextInt();
                eleccionOrdenador = (int)(Math.random()*(MAXIMO-MINIMO+1)+MINIMO);

                if(eleccionUsuario < MINIMO || eleccionUsuario > MAXIMO)
                {
                    System.out.println("¡ERROR!");
                }

            }while(!(eleccionUsuario >= MINIMO && eleccionUsuario <=MAXIMO));


            String resultado = eleccionUsuario == eleccionOrdenador ? MENSAJE_EMPATE
                        : eleccionUsuario == PIEDRA && eleccionOrdenador == PAPEL 
                        || eleccionUsuario == PAPEL && eleccionOrdenador == TIJERA 
                        || eleccionUsuario == TIJERA && eleccionOrdenador == PIEDRA 
                        ? MENSAJE_PERDER : MENSAJE_GANAR;

            System.out.println("Tu eleccion es: " + eleccionUsuario);
            System.out.println("La eleccion del ordenador es: " + eleccionOrdenador);
            System.out.println(resultado);
        }
    }
}