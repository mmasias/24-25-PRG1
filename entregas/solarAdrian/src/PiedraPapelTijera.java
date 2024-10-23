import java.util.Scanner;
import java.util.Random;

    class PiedraPapelTijera {
        public static void main(String[] args){

            final int PIEDRA = 1;
            final int PAPEL = 2;
            final int TIJERA = 3;

            final String EMPATE = "Has empatado";
            final String VICTORIA = "¡Ganaste!";
            final String DERROTA = "Perdiste";
            final String ERROR = "Has introducido un valor incorrecto";
           
            Scanner entrada = new Scanner(System.in);
            int elección;
            System.out.println("Juguemos a piedra papel o tijera");
            System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para tijera");

            elección = entrada.nextInt();
            String elecciónUsuario;
            elecciónUsuario = (elección == 1) ? "Piedra" :
                                (elección == 2) ? "Papel"  :
                                (elección == 3) ? "Tijera" : "Error";
            
            int elecciónOrdenador = (int)(Math.random()*(3-1)+1);

            String elecciónAleatoria;
            elecciónAleatoria = (elecciónOrdenador == 1) ? "Piedra" :
                                (elecciónOrdenador == 2) ? "Papel"  :
                                (elecciónOrdenador == 3) ? "Tijera" : "Error";


            String resultado; 
                resultado = elección < PIEDRA ? ERROR
                    : elección == PIEDRA && elecciónOrdenador == TIJERA ||
                    elección == PAPEL && elecciónOrdenador == PIEDRA ||
                    elección == TIJERA && elecciónOrdenador == PAPEL ? VICTORIA
                    : elección == PIEDRA && elecciónOrdenador == PIEDRA ||
                    elección == PAPEL && elecciónOrdenador == PAPEL ||
                    elección == TIJERA && elecciónOrdenador == TIJERA ? EMPATE : DERROTA;
                    

            System.out.println("Tu elección:" +elecciónUsuario);
            System.out.println("Elección del ordenador:" +elecciónAleatoria);
            System.out.println("Resultado:" +resultado);
        }


           

           
    }
    

