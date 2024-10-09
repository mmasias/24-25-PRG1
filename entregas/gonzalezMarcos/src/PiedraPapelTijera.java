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

    int eleccion;

    do
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Escoja su elección: ");
        System.out.println("1. Piedra ");
        System.out.println("2. Papel ");
        System.out.println("3. Tijera ");
        System.out.println("-----------------------");
        eleccion = entrada.nextInt();
        System.out.println("-----------------------");
        if (eleccion < 1 || eleccion > 3)
        {
            System.out.println(ERROR);
        }
    }while(!(eleccion >= 1 && eleccion <=3));

    int aleatorio = (int)(Math.random()*(3-1)+1);
    
    String eleccionAleatoria;
    eleccionAleatoria = (aleatorio == 1) ? "Piedra" : 
                        (aleatorio == 2) ? "Papel" : 
                        (aleatorio == 3) ? "Tijera" : "ERROR";
    
    System.out.println("Elección del contrincante = " + eleccionAleatoria);

    String resultado=PIERDES;

    if (eleccion==aleatorio) {
        resultado = EMPATE;
    }else if ((eleccion == PIEDRA && eleccion == TIJERA || 
                eleccion == PAPEL && aleatorio == PIEDRA ||
                eleccion == TIJERA && aleatorio == PAPEL)){
            resultado = GANAS;
    }



    System.out.println("El resultado es: " + resultado);
    System.out.println("-----------------------");
    }
}
