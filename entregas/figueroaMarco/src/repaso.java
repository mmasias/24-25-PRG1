import java.util.Scanner;

public class repaso {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int position1 = 0;
    int position2 = 0;
    final String CAMELLO = "',--,^'";
    final String Pista = "XX";
    final String Delimitador = "===";

    final int MAX = 5;
    final int MIN = 1;

    final int FINAL = 10;

    boolean enCarrera = true;
    int turno=0;

    while(enCarrera){
        turno++;
        System.out.println(Delimitador.repeat(turno*4));
        System.out.println("Turno:" + turno);
        int avance = (int) (Math.random() * MAX - MIN + 1) + MIN;
        position1 = position1 + avance;
        avance = (int) (Math.random() * MAX - MIN + 1) + MIN;
        position2 = position2 + avance;
        System.out.println(Pista.repeat(position1)+CAMELLO);
        System.out.println(Pista.repeat(position2)+CAMELLO);
        enCarrera = (turno < FINAL);
        input.nextLine();
    }
    
    System.out.println("Ha" + (position1 > position2 ? "ganado el primero" : (position1 == position2) ? "n empatado" : "ganado el segundo"));

input.close();
}

}