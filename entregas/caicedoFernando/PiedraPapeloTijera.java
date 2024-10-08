import java.util.Scanner;

class PiedraPapeloTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int Piedra = 0;
        int Papel = 1;
        int Tijera = 2;

        System.out.println("Juguemos Piedra, Papel o Tijera");
        System.out.println("0 para Piedra, 1 para Papel, 2 para Tijera: ");

        
        int respuestaDelUsuario = scanner.nextInt();

        
        int aleatorio = (int) (Math.random() * 3);

        
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        System.out.println("Tu elección: " + opciones[respuestaDelUsuario]);
        System.out.println("Elección de la computadora: " + opciones[aleatorio]);

        
        String resultado;
        resultado = (respuestaDelUsuario == aleatorio) ? "Empate!" :
                    (respuestaDelUsuario == Piedra && aleatorio == Tijera) || 
                    (respuestaDelUsuario == Papel && aleatorio == Piedra) || 
                    (respuestaDelUsuario == Tijera && aleatorio == Papel) ? "Ganaste!" : "Perdiste :";

        System.out.println(resultado);

        scanner.close();
    }
}
