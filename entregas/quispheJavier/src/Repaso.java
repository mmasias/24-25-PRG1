import java.util.Scanner;

class Repaso{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

    int posicion = 0;

    final String CAMELLLO = ",--,`";
    final String PISTA = "X";

    final int MAXIMO = 4;
    final int MINIMO = 1;

    final int FINAL = 20;

    boolean enCarrera = true;
    int turno = 0;

    while(enCarrera) {
        turno++;

        int avance = (int) (Math.random() * MAXIMO - MINIMO + 1) + MINIMO;
        posicionPrimero = posicionPrimero + avance;

        int avance = (int) (Math.random() * MAXIMO - MINIMO + 1) + MINIMO;
        posicionSegundo = posicionSegundo + avance;

        System.out.println("===".repeat(20))
        System.out.println("Turno:" + turno);
        System.out.println(PISTA.repeat(posicionPrimero) + CAMELLLO);
        System.out.println(PISTA.repeat(posicionSegundo ) + CAMELLLO);
        enCarrera = posicion < FINAL;
        entrada.nextLine();
    }

        entrada.close();
    }
}