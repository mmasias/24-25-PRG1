import java.util.Scanner;

class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int MAXIMO = 3;
        final int MINIMO = 0; 

        String[] opciones = {"Piedra", "Papel", "Tijeras"}; 

        System.out.println("Elige: 0= Piedra, 1= Papel, 2= Tijeras");
        int eleccionDeUsuario = entrada.nextInt();
        
        int aleatorio = (int) (Math.random() * MAXIMO); 
    
        String resultado = (eleccionDeUsuario == aleatorio) ? "Empate" :
            (eleccionDeUsuario == 0 && aleatorio == 2) || 
            (eleccionDeUsuario == 1 && aleatorio == 0) ||
            (eleccionDeUsuario == 2 && aleatorio == 1) ? "Ganaste" : "Perdiste";

        System.out.println("Tu elección: " + opciones[eleccionDeUsuario]);
        System.out.println("Elección del sistema: " + opciones[aleatorio]);
        System.out.println(resultado);

        entrada.close();
    }
}
