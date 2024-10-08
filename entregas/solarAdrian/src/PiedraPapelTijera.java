import java.util.Scanner;
import java.util.Random;

    class PiedraPapelTijera {
        public static void main(String[] args){

            final int Piedra = 1;
            final int Papel = 2;
            final int Tijera = 3;

            final String Mensaje_Empate = "Has empatado";
            final String Mensaje_Victoria = "¡Ganaste!";
            final String Mensaje_Derrota = "Perdiste";
            final String Error = "Has introducido un valor incorrecto";
           
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
                resultado = elección < Piedra ? Error
                    : elección == Piedra && elecciónOrdenador == Tijera ||
                    elección == Papel && elecciónOrdenador == Piedra ||
                    elección == Tijera && elecciónOrdenador == Papel ? Mensaje_Victoria
                    : elección == Piedra && elecciónOrdenador == Piedra ||
                    elección == Papel && elecciónOrdenador == Papel ||
                    elección == Tijera && elecciónOrdenador == Tijera ? Mensaje_Empate : Mensaje_Derrota;
                    

            System.out.println("Tu elección:" +elecciónUsuario);
            System.out.println("Elección del ordenador:" +elecciónAleatoria);
            System.out.println("Resultado:" +resultado);
        }


           

           
    }
    

