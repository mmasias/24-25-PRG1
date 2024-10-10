import java.util.Scanner;

class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MIN = 1;
        final int MAX = 3;
        
        final int Papel = 1;
        final int Tijera = 2;
        final int Piedra = 3;
        
        System.out.println("Elige: 1 (Papel), 2 (Tijera), 3 (Piedra)");
        int usuario = scanner.nextInt();

        int aleatorio = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        String resultado = (usuario == aleatorio) ? "Empate"
                : (usuario == 1 && aleatorio == 3) ? "Ganaste"
                        : (usuario == 2 && aleatorio == 1) ? "Ganaste"
                                : (usuario == 3 && aleatorio == 2) ? "Ganaste"
                                        : (usuario == Piedra && aleatorio == Tijera) ? "Ganaste"
                                                : (usuario == Papel && aleatorio == Piedra) ? "Ganaste"
                                                        : (usuario == Tijera && aleatorio == Papel) ? "Ganaste"
                                                                : "Perdiste";

        String eleccionUsuario = usuario == Piedra ? "Piedra"
                : usuario == Papel ? "Papel"
                        : "Tijeras";

        String eleccionMaquina = (aleatorio == Piedra) ? "Piedra"
                : (aleatorio == Papel) ? "Papel"
                        : "Tijeras";

        System.out.println("Tu eleccion es: " + eleccionUsuario);
        System.out.println("La eleccion de la maquina es: " + aleatorio);
        System.out.println(resultado);
        scanner.close();
    }
}
