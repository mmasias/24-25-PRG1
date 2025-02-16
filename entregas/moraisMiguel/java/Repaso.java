import java.util.Scanner;

class Repaso{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int posicion;
        int turno;

        final int MAXIMO = 4;
        final int MINIMO = 1;

        final int FINAL = 20;

        boolean haFinalizado = false;

        turno = 0;
        posicion = 0;

        while(!haFinalizado){
            turno++;
            int avance = (int) (Math.random()*MAXIMO-MINIMO+1)+MINIMO;
            System.out.println("Turno " + turno);
            System.out.println("Avance: " + avance + " Posicion: " + posicion);
            posicion = posicion+avance;
            haFinalizado = posicion>=FINAL;
            entrada.nextLine();
        }

        entrada.close();

    }
}