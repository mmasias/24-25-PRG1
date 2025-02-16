import java.util.Scanner;

class CarreraDeCaballos{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        int posicion;
        int turno;

        final int MAXIMO = 4;
        final int MINIMO = 1;

        final int FINAL = 20;

        boolean haFinalizado = false;

        final String speed = "*#-";
        final String horse = " 7===/º";

        turno = 0;
        posicion = 0;

        while(!haFinalizado){
            turno++;
            int avance = (int) (Math.random()*MAXIMO-MINIMO+1)+MINIMO;
            System.out.println("Turno " + turno);
            System.out.println("Avance: " + avance + " Posicion: " + posicion);
            for(int i=0; i<=posicion; i++){
                System.out.print(speed);
            }
            System.out.print(horse);
            posicion = posicion+avance;
            haFinalizado = posicion>=FINAL;
            entrada.nextLine();
        }

        entrada.close();

    }
}