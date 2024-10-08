import java.util.Scanner;

class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Opciones:");
        System.out.println("0: Piedra");
        System.out.println("1: Papel");
        System.out.println("2: Tijeras");
        
        int eleccionDeUsuario = entrada.nextInt();
        int aleatorio = (int) (Math.random() * 3); 

        String eleccionUsuario = (eleccionDeUsuario == 0) ? "Piedra" : (eleccionDeUsuario == 1) ? "Papel" : "Tijeras";
        String eleccionComputadora = (aleatorio == 0) ? "Piedra" : (aleatorio == 1) ? "Papel" : "Tijeras";

        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("Elección del sistema: " + eleccionComputadora);
        
        String resultado = (eleccionDeUsuario == aleatorio) ? "¡Es un empate!" :
                           (eleccionDeUsuario == 0 && aleatorio == 2) || 
                           (eleccionDeUsuario == 1 && aleatorio == 0) || 
                           (eleccionDeUsuario == 2 && aleatorio == 1) ? "¡Ganaste!" : "¡Perdiste!";

        System.out.println(resultado);

        entrada.close();
    }
}
