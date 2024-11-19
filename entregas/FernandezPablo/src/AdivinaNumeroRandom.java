import java.util.Scanner;

class Ejemplo{
    public static void main (String[] args) {
        final int NUMERO_TURNOS = 10;
        boolean estaJugando = true;
        int NumeroOrdenador = pensarNumero();
        int turnos = 0;
        while (estaJugando) {
            turnos++;
            int numeroUsuario = pensarNumero();
            boolean adivino = numeroUsuario == NumeroOrdenador;
            darPista(numeroUsuario, NumeroOrdenador);
            estaJugando = !adivino && turnos < NUMERO_TURNOS;
        }
        String estadoFinal = (turnos < NUMERO_TURNOS ? "" : "no") + "gano";
        System.out.println(estadoFinal);

    }
static int pensarNumero(){
final int MAXIMO = 100;
final int MINIMO = 1;
int NumeroOrdenador = (int)(Math.random()*(MAXIMO-MINIMO)+MINIMO);
return NumeroOrdenador;
}

static int pedirNumero(){
System.out.println("Dime un numero entre 1 y 100");
Scanner entradaUsuario = new Scanner(System.in);
return entradaUsuario.nextInt();
}

static void darPista(int numeroUsuario,int NumeroOrdenador){
int diferencia = Math.abs(NumeroOrdenador - numeroUsuario);
System.out.println(diferencia <= 5 ? "Caliente" : diferencia <= 10 ? "Tibio" : "Frio");
}

}
