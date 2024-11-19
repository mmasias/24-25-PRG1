class Adivinacion {
    public static void main(String [] args) {

        boolean estaJugndo = true;
        int numeroOrdenador = pensarNumero();
        int turno = 0;
        while (estaJugando) {
            turno++;
            int numeroUsuario=pedirNumero();
            boolean adivino = pedirNumero() == numeroOrdenador;
            darPista(numeroOrdenador,numeroUsuario);
            estaJugando = turno < 10 || !adivino;
        
        }
        String estadoFinal = (turno < 10? "": "no")+ "gano!";
        System.out.println(estadoFinal);
    }
}