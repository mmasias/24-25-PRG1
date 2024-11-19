import java.util.Scanner;

public class Adivinacion{
    public static void main (String[] args){
      Random random = new Random();
      Scanner scanner = new Scanner(System.in);
        int numeroPensado = random.nextInt(100) + 1; 
        int intentos = 10;
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO =0;

        System.out.println("Bienvenido a 'Adivina el número que estoy pensando");
        System.out.println("El número está entre 1 y 100") 
        System.out.println("Tienes " + intentos + " oportunidades para adivinarlo.");


        for (int intento = 1; intento <= intentos; intento++) {
            System.out.print("Intento " + intento + ": Introduce un número: ");
            int adivinanza = scanner.nextInt(); 
    }   

}