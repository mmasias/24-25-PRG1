import java.util.Scanner;
import java.util.Random;

        class AdivinaNumeroRandom {
            public static void main(String[] args) {
                Scanner object = new Scanner(System.in);
                Random random = new Random();

                int minimo = 1;
                int maximo = 20;
                int numeroUsuario;

                int numeroRandom = random.nextInt(maximo - minimo) + minimo;


                System.out.println("Dime un numero entre 1 y 20");
                numeroUsuario = object.nextInt();
                System.out.println("El numero random es: " +numeroRandom);
            
            }
                

    
}
