import java.util.Scanner;

class FuncionMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int minimo;
        int maximo;
        int aleatorio;
        
        System.out.println("Numero minimo deseado");
        minimo = scanner.nextInt();
        System.out.println("Numero Maximo deseado");
        maximo = scanner.nextInt();
        aleatorio = (int)(Math.random()*(maximo-minimo)+minimo);

        System.out.println(aleatorio);

        scanner.close();
    }
}
