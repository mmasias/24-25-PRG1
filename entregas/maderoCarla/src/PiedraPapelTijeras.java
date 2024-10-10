import java.util.Scanner;

class PiedraPapelTijeras{
    public static void main(String[] args){
        
        final int PIEDRA= 1;
        final int PAPEL = 2;
        final int TIJERAS = 3;
        final int LIMITE_INFERIOR = 0;
        final int LIMITE_SUPERIOR = 4;

        final String PIEDRA_DESCRIPTOR = "Piedra";
        final String PAPEL_DESCRIPTOR = "Papel";
        final String TIJERAS_DESCRIPTOR = "Tijeras";
        final String ERROR = "Opcion no valida";

        int eleccion;


        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Juguemos a piedra, papel o tijeras");
        System.out.println("Elige: 1(Piedra), 2(Papel) o 3(Tijeras)");
        eleccion= entrada.nextInt();
        
        String descriptor;
        descriptor = eleccion <= LIMITE_INFERIOR ? ERROR
        : eleccion == PIEDRA ? PIEDRA_DESCRIPTOR
        : eleccion == PAPEL ? PAPEL_DESCRIPTOR
        : eleccion == TIJERAS ?  TIJERAS_DESCRIPTOR
        : eleccion >= LIMITE_SUPERIOR ? ERROR : ERROR;

        System.out.println("Tu eleccion: " + descriptor);

        int randomNumber = (int)(Math.random() * 3) + 1;
        String eleccionRandom;

        eleccionRandom = randomNumber <= LIMITE_INFERIOR ? ERROR
        : randomNumber == PIEDRA ? PIEDRA_DESCRIPTOR
        : randomNumber == PAPEL ? PAPEL_DESCRIPTOR
        : randomNumber == TIJERAS ?  TIJERAS_DESCRIPTOR
        : randomNumber >= LIMITE_SUPERIOR ? ERROR : ERROR;

        System.out.println("Elección del ordenador: " + eleccionRandom);

        String resultado;
        resultado =  eleccion == randomNumber ? "Empate"
        : eleccion == PIEDRA && randomNumber == PAPEL ? "Pierdes"
        : eleccion == PIEDRA && randomNumber == TIJERAS  ? "Ganas"
        : eleccion == PAPEL && randomNumber == PIEDRA ? "Ganas"
        : eleccion == PAPEL && randomNumber == TIJERAS ? "Pierdes"
        : eleccion == TIJERAS && randomNumber == PIEDRA ? "Pierdes"
        : eleccion == TIJERAS && randomNumber == PAPEL ? "Ganas"
        : "No hay resultado";
        System.out.println(resultado);
    
        scanner.close();
    }
}