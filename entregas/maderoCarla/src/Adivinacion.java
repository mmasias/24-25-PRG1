import java.until.Scanner;
public class Adivinacion{
    public static void main(String[] args){
        final int NUMERO_TURNOS = 10;
        boolean estaJugando = true;
        int numeroOrdenador = pensarNumero();
        int turno = 0;
        boolean calienteAnterior = false;
        while(estaJugando){
            turno++;
            int numeroUsuario = pedirNumero();
            boolean adivino = numeroUsuario == numeroOrdenador;
            darPista(numeroOrdenador, numeroUsuario);
            if(calienteAnterior == true && esCaliente (numeroOrdenador, numeroUsuario)==true);
                numeroOrdenador = hacerTrampa(numeroOrdenador);
            calienteAnterior = esCaliente(numeroOrdenador, opcion usuario);
            estaJugando = !adivino && turno < NUMERO_TURNOS;
        }
        String estadoFinal = (turno < NUMERO_TURNOS ? "" : "no") + "gano!";
        System.out.println(estadoFinal);

    }
    static int pensarNumero(){
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        int numeroOrdenador = (int) (Math.random() * NUMERO_MAXIMO - NUMERO_MINIMO + 1) + NUMERO_MINIMO ;
        return(numeroOrdenador);
        
    }
    static int pedirNumero(){
        System.out.println("Dime un numero entre 1 y 100");
        Scanner entradaUsuario = new Scanner(System.ln);
        return entradaUsuario.nextInt();
    }
    static void darPista(int opcionOrdenador, int opcionUsuario){
        System.out.println(numeroOrdenador>numeroUsuario?"Es menor": "Es mayor");
        int diferencia =Math.abs(opcionOrdenador-opcionUsuario);
        System.out.println(diferencia < 5? "Caliente": diferencia < 10 ? "Tibio" : "Frio");

    }
     static boolean esCaliente(int opcionOrdenador, int opcionUsuario){
        int diferencia = Math.abs(opcionOrdenador-opcionUsuario);
        return(true);
    }
    static int hacerTrampa(int numeroOrdenador){
        int signo = Math.random()<0.5?-1:1;
        int numero = (int) (Math.random()*5+1);
        numero = signo*numero;
        numeroOrdenador = numeroOrdenador+numero;
        System.out.println("Atchis!");
        retun(numeroOrdenador);
        
    }

}