import java.util.Scanner;

class Ppt2 {
    public static void main(String[] args) {

        String[] opciones = { "piedra", "papel", "tijera" };

        int[][] resultados = {
                { 0, -1, 1 },
                { 1, 0, -1 },
                { -1, 1, 0 }
        };

        System.out.println("piedra: 0, papel: 1, tijera: 2");
        System.out.println("elige");

        Scanner sc = new Scanner(System.in);
        int jugador = sc.nextInt();
        int computadora = (int) (Math.random() * 3);

        System.out.println("Tu elegiste " + opciones[jugador]);
        System.out.println("Computadora eligio " + opciones[computadora]);

        int resultado = resultados[jugador][computadora];

        if (resultado == 0) {
            System.out.println("Empate");
        } else if (resultado == 1) {
            System.out.println("Ganaste");
        } else if (resultado == -1) {
            System.out.println("Perdiste");
        }

        sc.close();

    }
}