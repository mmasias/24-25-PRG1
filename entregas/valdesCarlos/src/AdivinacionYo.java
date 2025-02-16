import java.util.Scanner;

class AdivinacionYo {
    public static void main(String[] args) {
        Scanner eleccionUsuario = new Scanner (System.in);
        
        final int NUMERO_MINIMO = 1;
        final int NUMERO_MAXIMO = 100;

        int numeroMaquina;
        int numeroUsuario;
        int turno = 0;

        boolean estaJugando = true;

        while(estaJugando);
            turno ++;
            numeroMaquina = (int)(Math.random()*(NUMERO_MAXIMO-NUMERO_MINIMO+1)+NUMERO_MINIMO);
            numeroUsuario = eleccionUsuario.nextInt();
            boolean adivino = numeroUsuario == numeroMaquina;
            if(turno <= 10 && !adivino) {
                System.out.println("Dime un número del 1 al 100");
                

            }
            
        
        eleccionUsuario.close();

    }

}