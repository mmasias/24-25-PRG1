import java.util.Scanner;

class Reto002 {

    public static void main(String[] args) {
        final int PIEDRA = 0;
        final int PAPEL = 1;
        final int TIJERA = 2;

        int jugadaPersona = 0;
        int jugadaOrdenador = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Introduzca 0-piedra 1-papel o 2-tijera");
            jugadaPersona = scanner.nextInt();
            if (jugadaPersona < 0 || jugadaPersona > 2) {
                System.out.println("No es un ajugada válida");
            }
        } while (jugadaPersona < 0 || jugadaPersona > 2);

        /* 
        for(int i=0;i<50;i++){
            jugadaOrdenador=(int)(Math.random()*100)%3;
            System.out.println(jugadaOrdenador);
        }
         */
        jugadaOrdenador = (int) (Math.random() * 100) % 3;
        String jugadaPersonaTexto = "";
        String jugadaOrdenadorTexto = "";
       
    }
}

