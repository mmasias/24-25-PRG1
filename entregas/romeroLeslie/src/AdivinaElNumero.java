import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMERO_TURNOS = 10;
        boolean estaJugando = true;
        int numeroOrdenador= pensarNumero();
        int turno=0;
        boolean hacertrampa= false;
        boolean esCaliente= false;
        boolean calienteAnterior= false;
        

        while (estaJugando) {
            turno++;
            int numeroUsuario= PedirNumero();
            boolean adivino = numeroUsuario == numeroOrdenador;
            darPista (numeroOrdenador, numeroUsuario);
            if (calienteAnterior == true && esCaliente (numeroOrdenador, numeroUsuario)== true);
              numeroOrdenador = hacerTrampa(numeroOrdenador)
            calienteAnterior = esCaliente (numeroOrdenador, numeroUsuario));
            estaJugando = !adivino && turno <NUMERO_TURNOS;
        }

        String estadoFinal = (turno < NUMERO_TURNOS  ? "": "no" + "gano!");
        System.out.println(estadoFinal);

static int pensarNumero (){
    final int MINIMO=1;
    final int MAXIMO=100;
    return (int)(Math.random()(*MAXIMO-MINIMO)+MINIMO);

}


static int PedirNumero (){
    System.out.println("Dime un numero entre 1 y 100");
    Scanner entradaUsuario=new Scanner(System.in);
    return entradaUsuario.nextInt();
}

static void darPista (int numeroOrdenador, int numeroUsuario){
    int diferencia =  Math.abs(numeroOrdenador -numeroOrdenador);
    System.out.println (diferencia<=5? "Caliente": diferencia<=10? "Tibio": "frio");

}
static boolean esCaliente(int numeroOrdenador, int numeroUsuario){
    int diferencia= Math.abs(numeroOrdenador-numeroUsuario)


static int hacerTrampa (int numeroOrdenador){
    int signo = (int)(Math.random() <0.5 ? - 1 : 1>);
    int numero = (int)(Math.random()*5+1);
    numero = signo * numero;
    numeroOrdenador = numeroOrdenador + numero;
    System.out.println("Atchis!")

    return numeroOrdenador;}
}
