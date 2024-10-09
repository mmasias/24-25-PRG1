import java.util.Scanner;

class PiedraPapelTijera {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     final int PIEDRA = 1;
     final int PAPEL = 2;
    final int TIJERA = 3;



        final int MINIMO = 1;
        final int MAXIMO = 2;

        System.out.println("Elige: 1= Piedra, 2= Papel, 3= Tijera:");
        int eleccionDelUsuario = scanner.nextInt();

        int aleatorio = (int) (Math.random() * (MAXIMO - MINIMO) + MINIMO);

        String resultado="PIERDES";

        if (eleccionDelUsuario==aleatorio) {
            resultado = "EMPATE";
        }else if ((eleccionDelUsuario == PIEDRA && eleccionDelUsuario == TIJERA || 
                    eleccionDelUsuario == PAPEL && aleatorio == PIEDRA ||
                    eleccionDelUsuario == TIJERA && aleatorio == PAPEL)){
                resultado = "GANAS";
        }

        System.out.println("Tu eleccion: " + eleccionDelUsuario);
        System.out.println("Eleccion de la maquina: " + aleatorio);
        System.out.println(resultado);

        scanner.close();
    }
}