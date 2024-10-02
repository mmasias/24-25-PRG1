import java.util.Scanner;

class matematicas{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        final int MAXIMO = 10;
        final int MINIMO = 1;


        int aleatorio = (int) (Math.random()*(MAXIMO-MINIMO)+MINIMO);


        System.out.println(aleatorio);

        scanner.close();                


    }


}