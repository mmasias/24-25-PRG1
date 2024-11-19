package entregas.caicedoEsteban;

Scanner entrada=new Scanner(System.in);


class Adivinacion {
    
    public static void main(String[] args) {
        final int NUMERO_DE_TURNOS = 10;
    
        boolean estaJugando = true;
        int numeroComputadora = pensarNumero();
        int turno = 0;

        while(estaJugando){
            turno++;
            System.out.println("Turno" + turno);
            int numeroUsuario = pensarNumero();
            boolean adivino = numeroUsuario == numeroComputadora;
            algunasPistas (numeroUsuario, numeroComputadora);
            estaJugando = !adivino && turno NUMERO_DE_TURNOS;
            
        }
        String estadoFinal = ( turno < NUMERO_DE_TURNOS) ? "Ganaste" : "Perdiste";
        System.out.println(estadoFinal);
    }

    public static int pensarNumero() {
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        return (int) Math.random() * (NUMERO_MAXIMO - NUMERO_MINIMO + 1);
    }

    public static void algunasPistas(int numeroUsuario, int numeroComputadora) {
        int Caliente = 5;
        int Tibio = 10;
        if (numeroUsuario <= Caliente) {
            System.out.println("Caliente");
        } else if (numeroUsuario >= Tibio) {
            System.out.println("Tibio");
        } else {
            System.out.println("Frio");
        }
    
    }
    entrada.close();
}
