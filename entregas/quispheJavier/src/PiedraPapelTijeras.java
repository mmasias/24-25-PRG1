import  java.util.Scanner;

    class PiedraPapelTijeras{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            final int PIEDRA = 1;
            final int PAPEL = 2;
            final int TIJERAS = 3;

            final String MENSAJE_EMPATE = ("Draw");
            final String MENSAJE_PERDEDOR = ("You Lose");
            final String MENSAJE_GANADOR = ("You Win");

            int eleccionUsuario;
            int eleccionComputador;

            final int MINIMO = 1;
            final int MAXIMO = 3;

            System.out.println("PIEDRA, PAPEL o TIJERAS");
            System.out.println("Elije PIEDRA = 1, PAPEL = 2 o TIJERAS = 3");

            eleccionUsuario = scanner.nextInt();
            eleccionComputador = (int)(Math.random() * (MAXIMO-MINIMO) + MINIMO);

            String resultado = eleccionUsuario == eleccionComputador ? MENSAJE_EMPATE
                        : eleccionUsuario == PIEDRA && eleccionComputador == PAPEL ? MENSAJE_PERDEDOR
                        : eleccionUsuario == PAPEL && eleccionComputador == TIJERAS ? MENSAJE_PERDEDOR
                        : eleccionUsuario == TIJERAS && eleccionComputador == PIEDRA ? MENSAJE_PERDEDOR
                        : MENSAJE_GANADOR;
                        
             System.out.println("Tu eleccion: " + eleccionUsuario);
        System.out.println("Eleccion del computador: " + eleccionComputador);
        System.out.println(resultado);
        }
    }