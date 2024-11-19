import java.util.Scanner;

public class Repaso {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int posicionPrimero = 0;
        int posicionSegundo = 0;

        final String CAMELLO = ",---,^";
        final String PISTA = "XX";

        final int MAXIMO = 4;
        final int MINIMO = 1;

        final int FINAL = 30;

        boolean enCarrera = true;
        int turno = 0;
        int avance_uno;
        int avance_dos;

        
        System.out.println("===================================");
        System.out.println("BIENVENIDO A LA CARRERA DE CABALLOS");
        System.out.println("===================================");

        while (enCarrera){
            turno++;

            avance_uno = (int) (Math.random()*(MAXIMO-MINIMO +1)+MINIMO);
            posicionPrimero = posicionPrimero + avance_uno;
            avance_dos = (int) (Math.random()*(MAXIMO-MINIMO +1)+MINIMO);
            posicionSegundo = posicionSegundo +avance_dos;

            
            System.out.println("===".repeat(FINAL +1));
            System.out.println("Turno "+turno);
            System.out.println(PISTA.repeat(posicionPrimero)+CAMELLO);
            System.out.println(PISTA.repeat(posicionSegundo)+CAMELLO);
            enCarrera = (posicionPrimero < FINAL || posicionSegundo < FINAL);

            
            entrada.nextLine();
           
        }

        System.out.println("Ha ganado el " + (posicionPrimero > posicionSegundo ? "primero" : (posicionPrimero == posicionSegundo ? "empate" : "segundo")));

        entrada.close();
    }
}
