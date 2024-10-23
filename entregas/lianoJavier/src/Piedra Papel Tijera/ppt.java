
import java.util.Scanner;

class ppt {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int VALOR_PIEDRA = 0;
        final int VALOR_PAPEL = 1;
        final int VALOR_TIJERA = 2;

        final int VALOR_MINIMO = 0;
        final int VALOR_MAXIMO = 2;

        int numeroDeVictorias = 0;
        int jugada = 1;
        
        do {
            int jugadaDelUsuario = entrada.nextInt();
            int jugadaDelRobot = (int) (Math.random() * (VALOR_MAXIMO - VALOR_MINIMO + 1) + VALOR_MINIMO);
            
            boolean victoria;
            victoria = !(jugadaDelRobot == jugadaDelUsuario)
                    || (jugadaDelUsuario == VALOR_PAPEL && jugadaDelRobot == VALOR_PIEDRA)
                    || (jugadaDelUsuario == VALOR_PIEDRA && jugadaDelRobot == VALOR_TIJERA)
                    || (jugadaDelUsuario == VALOR_TIJERA && jugadaDelRobot == VALOR_PAPEL);

            if (victoria) {
                numeroDeVictorias++;
            }

            jugada++;

            System.out.println("JUGADA: ");
            System.out.println();
            System.out.println();

        } while (numeroDeVictorias < 2 || jugada < 3);

        entrada.close();
    }
}
