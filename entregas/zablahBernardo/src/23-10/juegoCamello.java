import java.util.Scanner;

public class juegoCamello {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int posicionPrimero = 0;
        int posicionSegundo = 0;
        final int MAXIMO = 4;
        final int MINIMO = 1;
        final int FINAL = 20;
        boolean enCarrera = true;
        int turno = 0;

        while (enCarrera){
            turno++;
            int avance = (int) (Math.random() * MAXIMO - MINIMO + 1) + MINIMO;
            int avance2 = (int) (Math.random() * MAXIMO - MINIMO + 1) + MINIMO;
            posicionPrimero = posicionPrimero + avance;
            posicionSegundo = posicionSegundo + avance2;

            System.out.println("===".repeat(FINAL + 1));
            System.out.println("turno: "+ turno);
            System.out.println("....".repeat(posicionPrimero) + "camello1");
            System.out.println("....".repeat(posicionSegundo) + "camello2");
            enCarrera = posicionPrimero < FINAL;
            enCarrera = posicionSegundo< FINAL;
            scanner.nextLine();
        }
        
        if (posicionPrimero < posicionSegundo){
            System.out.println("Ha ganado el camello 2");
        }else{
            System.out.println("Ha ganado el camello 1");
        }

        scanner.close();
    }
}
