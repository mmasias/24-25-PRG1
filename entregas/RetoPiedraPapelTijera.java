import java.util.Scanner;

class RetoPiedraPapelTijera {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a Piedra, Papel o Tijera");
        System.out.println("===================================");
        System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para Tijera:");

        int seleccionJugador = teclado.nextInt();
        int seleccionComputadora = generarEleccionComputadora();

        mostrarElecciones(seleccionJugador, seleccionComputadora);
        System.out.println(determinarResultado(seleccionJugador, seleccionComputadora));
    }

    // Función que genera una elección aleatoria para la computadora
    public static int generarEleccionComputadora() {
        return (int)(Math.random() * 3) + 1;  // 1 para Piedra, 2 para Papel, 3 para Tijera
    }

    // Función para mostrar las elecciones del jugador y la computadora
    public static void mostrarElecciones(int jugador, int computadora) {
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        System.out.println("Tu elección fue: " + opciones[jugador - 1]);
        System.out.println("La elección de la computadora fue: " + opciones[computadora - 1]);
    }

   