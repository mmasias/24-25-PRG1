
import java.util.Scanner;

class ContraseñaCofre {
    public static void main(String[] args) {

        final int NUMERO_TURNOS = 5;
        int contraseñaCofre = generarContraseña();
        boolean estaAdivinando = true;
        int turno = 0;

        while(estaAdivinando){
            turno ++;
            System.out.println("Intente adivinar la contraseña del Cofre");
            System.out.println("El número se encuentra entre 1000 y 9999");
            int eleccionUsuario = darContraseña();
            boolean adivino = eleccionUsuario == contraseñaCofre;
            if(!adivino){
                System.out.println("No es ese número!");
                darPista(contraseñaCofre, eleccionUsuario);
                System.out.println("Te quedan " + (NUMERO_TURNOS-turno) + " intento(s)");
            }
            estaAdivinando = !adivino && turno < NUMERO_TURNOS;
        }
        String resultadoFinal = (turno < NUMERO_TURNOS ? "" : "No ") + "Ganaste";
        System.out.println(resultadoFinal);

        
    }
    static int generarContraseña(){
        final int NUMERO_MINIMO = 1000;
        final int NUMERO_MAXIMO = 9999;
        int numeroPensado = (int)(Math.random()*(NUMERO_MAXIMO-NUMERO_MINIMO+1)+NUMERO_MINIMO);
        System.out.println(numeroPensado);
        return numeroPensado;
    }

    static int darContraseña(){
        Scanner entrada = new Scanner (System.in);
        return entrada.nextInt();
    }

    static void darPista(int contraseñaCofre, int eleccionUsuario){
        if(contraseñaCofre < eleccionUsuario){
            System.out.println("El numero es menor");
        }else{
            System.out.println("El numero es mayor");
        }
    }

}