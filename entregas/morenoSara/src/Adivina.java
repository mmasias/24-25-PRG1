import java.util.Scanner;
public class Adivina{
    public static void main (String[] args){
        boolean estaJugando = true;
        int turno = 0;
        final int MAXIMO_TURNOS = 10;
        int opcionOrdenador = pensarNumero() ;
        boolean calienteAnterior = false;

        while (estaJugando) {
            turno ++;
            int opcionUsuario = pedirNumero();
            boolean adivino = opcionUsuario == opcionOrdenador;
            darPista(opcionOrdenador,opcionUsuario);
            if (calienteAnterior == true && esCaliente (opcionOrdenador,opcionUsuario)){
                opcionOrdenador = hacerTrampa(opcionOrdenador);
            }
            calienteAnterior = esCaliente (opcionOrdenador,opcionUsuario); 
            estaJugando = !adivino && turno <= MAXIMO_TURNOS ;
        }
        String estadoFinal = (turno < 10 ? "" : "No ") + "gano!";
        System.out.println(estadoFinal);
    }
    static int pensarNumero (){
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        int numeroOrdenador = (int) (Math.random() * NUMERO_MAXIMO - NUMERO_MINIMO+1) + NUMERO_MINIMO ;
        return (numeroOrdenador);
    }
    static int pedirNumero (){
        System.out.println("Dime un numero entre el 1 y el 100.");
        Scanner entradaUsuario = new Scanner(System.in);
        return entradaUsuario.nextInt(); 
    }
    static void darPista(int opcionOrdenador, int opcionUsuario){
        int diferencia = Math.abs(opcionOrdenador-opcionUsuario);
        System.out.println(diferencia <= 5 ? "Caliente": diferencia <= 10? "Tibio":"Frio");
    }
    static boolean esCaliente (int opcionOrdenador, int opcionUsuario){
        int diferencia = Math.abs(opcionOrdenador - opcionUsuario);
        return diferencia <= 5;
    }
    static int hacerTrampa (int opcionOrdenador){
        int signo = Math.random()< 0.5 ? -1 : 1;
        int numero = (int) (Math.random() * 5 + 1 );
        numero = signo * numero;
        opcionOrdenador = opcionOrdenador + numero;
        System.out.println("Achis!");
        return (opcionOrdenador);
    }
}