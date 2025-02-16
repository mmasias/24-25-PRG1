import java.util.Scanner;
public class CarreraCamellos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int posicionPrimero = 0;
        int posicionSegundo = 0;

        final String CAMELLO = ",--,^";
        final String PISTA = "...";

        final int MAXIMO = 4;
        final int MINIMO = 1;

        final int FINAL = 30;

        boolean enCarrera = true;
        int turno = 0;
        int avance;

        while (enCarrera) {
            turno++;

            int opcionUsuario = entrada.nextInt();
            double probabilidad = Math.random();

            if (opcionUsuario==1 && probabilidad<=0.6) {avance=1;} else
            if (opcionUsuario==2 && probabilidad<=0.4) {avance=2;} else
            if (opcionUsuario==3 && probabilidad<=0.3) {avance=4;} else
            if (opcionUsuario==4 && probabilidad<=0.1) {avance=6;} 

            avance = (int) (Math.random() * MAXIMO - MINIMO + 1) + MINIMO;
            posicionPrimero = posicionPrimero + avance;

            avance = (int) (Math.random() * MAXIMO - MINIMO + 1) + MINIMO;
            posicionSegundo = posicionSegundo + avance;

            System.out.println("===".repeat(FINAL + 1));
            System.out.println("Turno:" + turno);
            System.out.println(PISTA.repeat (posicionPrimero) + CAMELLO);
            System.out.println(PISTA.repeat (posicionSegundo) + CAMELLO);
            enCarrera = (posicionPrimero >  FINAL || posicionSegundo > FINAL);
            entrada.nextLine();
        }

        System.out.println("Ha ganado el " + (posicionPrimero > posicionSegundo ? "primero"
                : (posicionPrimero == posicionSegundo ? "empate" : "segundo")));

        entrada.close();
    }
}