import java.util.Scanner;


public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimo, maximo;
        System.out.println("numero minimo");
        minimo = scanner.nextInt();
        System.out.println("numero maximo");
        maximo = scanner.nextInt();
       
       
        int aleatorio = (int) (Math.random() * (maximo - minimo) + minimo);


        int numeroUsuario;

        System.out.println("numero entre el minmo y el maximo");

        numeroUsuario = scanner.nextInt();

    


    

        
        


      

        
    }
    
}
