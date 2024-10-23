import java.util.Scanner;

class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAXIMO = 3;
        final int MINIMO = 1;

        final int PIEDRA = 1; 
        final int PAPEL = 2; 
        final int TIJERA = 3; 


        System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para Tijera");
        int eleccionDelUsuario = scanner.nextInt();

        int numeroAleatorio = (int) (Math.random() * (MAXIMO - MINIMO + 1)) + MINIMO;


        String resultado = (eleccionDelUsuario == numeroAleatorio) ? "¡Empate!" :
                           (eleccionDelUsuario == PIEDRA && numeroAleatorio == TIJERA) ? "¡Ganaste!" :
                           (eleccionDelUsuario == PAPEL && numeroAleatorio == PIEDRA) ? "¡Ganaste!" :
                           (eleccionDelUsuario == TIJERA && numeroAleatorio == PAPEL) ? "¡Ganaste!" :
                           "¡Perdiste!";
                           
        String eleccionUsuarioEnString = eleccionDelUsuario == PIEDRA ? "Piedra" 
                            : eleccionDelUsuario == PAPEL ? "Papel" 
                            : "Tijera";
           
        String eleccionAleatoriaMaquinaEnString = (numeroAleatorio == PIEDRA) ? "Piedra" 
                            : (numeroAleatorio == PAPEL) ? "Papel" 
                            : "Tijera";


        System.out.println("Tu eleccion: " + eleccionUsuarioEnString);
        System.out.println("Elección de la maquina: " + eleccionAleatoriaMaquinaEnString);
        System.out.println(resultado);

        scanner.close();


    }
}