import java.util.Scanner;

public class JuegoSumarHasta100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jugarDeNuevo = true;

        System.out.println("¡Bienvenido a Sumar Hasta 100!");

        while (jugarDeNuevo) {
            int sumaAcumulada = 0;

            while (sumaAcumulada < 100) {
        
                System.out.print("Introduce un número: ");
                int numero = scanner.nextInt();

                
                sumaAcumulada += numero;
                System.out.println("Suma acumulada: " + sumaAcumulada);
            }
        
        }

        System.out.println("¡Felicidades! Has alcanzado o superado 100.");

            
        System.out.print("¿Quieres jugar de nuevo? (Sí/No): ");
        scanner.nextLine(); 
        String respuesta = scanner.nextLine();

        if (!respuesta.equals("sí")) {
                jugarDeNuevo = false;
        }






    }

    
}
