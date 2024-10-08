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

        
        String opcionUsuario = (respuestaDelUsuario == 0) ? "Piedra" :
                       (respuestaDelUsuario == 1) ? "Papel" :
                       "Tijera";

        String opcionComputadora = (aleatorio == 0) ? "Piedra" :
                            (aleatorio == 1) ? "Papel" :
                            "Tijera";

        System.out.println("Tu elección: " + opcionUsuario);
        System.out.println("Elección de la computadora: " + opcionComputadora);


        
        String resultado;
        resultado = (respuestaDelUsuario == aleatorio) ? "Empate!" :

                    (respuestaDelUsuario == Piedra && aleatorio == Tijera) || 

                    (respuestaDelUsuario == Papel && aleatorio == Piedra) || 

                    (respuestaDelUsuario == Tijera && aleatorio == Papel) ? "Ganaste!" : "Perdiste :";

        System.out.println(resultado);

        scanner.close();
    }
}
