import  java.util.Scanner;

    class PiedraPapelTijeras{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            final int Piedra = 1;
            final int papel = 2;
            final int tijera = 3;

            final String MENSAJE_EMPATE = ("Draw");
            final String MENSAJE_PERDEDOR = ("You Lose");
            final String MENSAJE_GANADOR = ("You Win");

            int eleccionUsuario;
            int eleccionComputador;

            final int MINIMO = 1;
            final int MAXIMO = 3;

            System.out.println("Piedra, papel o tijeras");
            System.out.println("Elije Piedra = 1, papel = 2 o tijeras = 3");

            eleccionUsuario = scanner.nextInt();
            eleccionComputador = (int)(Math.random() * (MAXIMO-MINIMO + 1) + MINIMO);

            String resultado = eleccionUsuario == eleccionComputador ? MENSAJE_EMPATE
                        : eleccionUsuario == Piedra && eleccionComputador == papel ? MENSAJE_PERDEDOR
                        : eleccionUsuario == papel && eleccionComputador == tijera ? MENSAJE_PERDEDOR
                        : eleccionUsuario == tijera && eleccionComputador == Piedra ? MENSAJE_PERDEDOR
                        : MENSAJE_GANADOR;
                        
             System.out.println("Tu eleccion: " + eleccionUsuario);
        System.out.println("Eleccion del computador: " + eleccionComputador);
        System.out.println(resultado);
        }
    }