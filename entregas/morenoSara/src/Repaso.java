import java.util.Scanner;

public class Repaso{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int posicion = 0;

        final String CAMELLO = ",--,^";
        final String PISTA = "X";

        final int MAXIMO = 4;
        final int MINIMO = 1;

        final int FINAL = 20;

        boolean enCarrera = true;
        int turno = 0;

        while(enCarrera) {
            turno = turno + 1;
            int avance = (int) (Math.random() * MAXIMO-MINIMO +1)+ MINIMO;
            posicion = posicion + avance;
            System.out.println("Turno:"+ turno);
            System.out.println(PISTA.repeat(posicion) + CAMELLO);
            enCarrera = posicion < FINAL;
            entrada.nextLine();
        }
        entrada.close();
    }
}
