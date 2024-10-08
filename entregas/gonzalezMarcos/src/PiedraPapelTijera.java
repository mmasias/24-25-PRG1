import java.util.Scanner;

class PiedraPapelTijera {
    public static void main(String[] args){

    final int PIEDRA = 1;
    final int PAPEL = 2;
    final int TIJERA = 3;

    final String GANAS = "Ganaste";
    final String PIERDES = "Perdiste";
    final String EMPATE = "Empataste";
    final String ERROR = "Has introducido un valor incorrecto";

    Scanner entrada = new Scanner(System.in);
    int eleccion;
    System.out.println("-----------------------");
    System.out.println("Escoja su elección: ");
    System.out.println("1. Piedra ");
    System.out.println("2. Papel ");
    System.out.println("3. Tijera ");
    System.out.println("-----------------------");
    eleccion = entrada.nextInt();
    System.out.println("-----------------------");

    int aleatorio = (int)(Math.random()*(3-1)+1);
    
    String eleccionAleatoria;
    eleccionAleatoria = (aleatorio == 1) ? "Piedra" : 
                        (aleatorio == 2) ? "Papel" : 
                        (aleatorio == 3) ? "Tijera" : "ERROR";
    
    System.out.println("Elección del contrincante = " + eleccionAleatoria);

    String resultado;
        resultado = eleccion < PIEDRA ? ERROR
            : eleccion == PIEDRA && aleatorio == TIJERA ||
            eleccion  == PAPEL && aleatorio == PIEDRA ||
            eleccion == TIJERA && aleatorio == PAPEL ? GANAS 
            : eleccion == PIEDRA && aleatorio == PIEDRA ||
            eleccion == PAPEL && aleatorio == PAPEL ||
            eleccion == TIJERA && aleatorio == TIJERA ? EMPATE : PIERDES;


    System.out.println("El resultado es: " + resultado);
    System.out.println("-----------------------");
    }
}
