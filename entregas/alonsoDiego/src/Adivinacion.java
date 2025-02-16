import java.util.Scanner;
class Adivinacion{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMERO_TURNOS = 10;
        boolean estaJugando = true;
        int NumeroOrdenador = pensarNumero();
        int turnos = 0;
        while (estaJugando) {
            turnos++;
            int numeroDelUsuario = pedirNumero();
            boolean adivino = numeroDelUsuario == NumeroOrdenador;
            darPista(numeroDelUsuario,NumeroOrdenador);
            estaJugando = turnos < NUMERO_TURNOS || !adivino;
        }
        String estadoFinal = (turnos < NUMERO_TURNOS ? "" : "Perdiste   " ) + "  Suerte en la siguiente";
        System.out.println(estadoFinal);
        }

static int pensarNumero(){
    final int MAXIMO = 100;
    final int MINIMO = 1;
    int NumeroOrdenador = (int)(Math.random()*(MAXIMO-MINIMO)+MINIMO);
    return NumeroOrdenador;
}
static int pedirNumero(){
    System.out.println("Elige un numero del 1 al 100");
    Scanner entradaUsuario = new Scanner(System.in);
    return entradaUsuario.nextInt();
}
static  void darPista(int numeroDelUsuario, int NumeroOrdenador){
    int diferencia = Math.abs(NumeroOrdenador - numeroDelUsuario);
    if (numeroDelUsuario < NumeroOrdenador) {
        System.out.println("El número es mayor.");
    } else {
        System.out.println("El número es menor.");
    System.out.println(diferencia <= 5 ? "Caliente" : diferencia <= 10 ? "Tibio" : "Frio");
}   
    
} }



        
        
                

    
    