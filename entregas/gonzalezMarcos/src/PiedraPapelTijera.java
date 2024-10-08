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
    System.out.println("Escoja su eleccion: ");
    System.out.println("1. Piedra ");
    System.out.println("2. Papel ");
    System.out.println("3. Tijera ");
    eleccion = entrada.nextInt();

    int aleatorio = (int)(Math.random()*(3-1)+1);
    
    System.out.println("eleccion del contrincante = " + aleatorio);

    String descriptor;
        descriptor = eleccion < PIEDRA ? ERROR
            : eleccion == PIEDRA && aleatorio == TIJERA ? GANAS
            : eleccion  == PAPEL && aleatorio == PIEDRA ? GANAS
            : eleccion == TIJERA && aleatorio == PAPEL ? GANAS
            : eleccion == PIEDRA && aleatorio == PAPEL ? PIERDES
            : eleccion == PAPEL && aleatorio == TIJERA ? PIERDES
            : eleccion == TIJERA && aleatorio == PIEDRA ? PIERDES
            : eleccion == PIEDRA && aleatorio == PIEDRA ? EMPATE
            : eleccion == PAPEL && aleatorio == PAPEL ? EMPATE
            : eleccion == TIJERA && aleatorio == TIJERA ? EMPATE
            : eleccion > TIJERA ? ERROR : ERROR;

    System.out.println("El resultado es: " + descriptor);






    }
}
