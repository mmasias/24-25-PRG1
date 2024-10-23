package entregas.entregas;
 import java.util.Scanner;

 class CarerraCamellos{
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        int posicionPrimero =0;
        int posicionSegundo = 0;

        final String CAMELLO = ",--,^";
        final String PISTA ="X";



        final int MAXIMO = 4;
        final int MINIMO = 1;

        final int FINAL = 30;

        boolean enCarrera = true;
        int turno =0;
        int avance =0;

        while (enCarrera) {
            turno++;

            avance = (int) (Math.random() * MAXIMO - MINIMO + 1) + MINIMO;
            posicionPrimero = posicionPrimero + avance;

            avance = (int) (Math.random() * MAXIMO - MINIMO + 1) + MINIMO;
            posicionSegundo = posicionSegundo + avance;

            System.out.println("=== ".repeat(FINAL+1));
            System.out.println("Turno:" + turno);
            System.out.println(PISTA.repeat(posicionPrimero) + CAMELLO);
            System.out.println(PISTA.repeat(posicionSegundo) + CAMELLO);
            enCarrera = posicionPrimero < FINAL;
            entrada.nextLine();
        }

        System.out.println("Ha ganado el " + (posicionPrimero > posicionSegundo ? "primer"
           : (posicionPrimero == posicionSegundo ? "empate" : "segundo")));

           entrada.close();






        }
    }
 



