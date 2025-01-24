import java.util.Scanner;

class Batalla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vidaGuerrero = 20;
        int vidaVampiro = 10;
        int turno = 0;
        boolean estanJugando = false;
        int dañoVampiro;
        int dañoGuerrero;

        do {
            turno++;
            System.out.println("Turno " + turno);
            System.out.println("El guerrero tiene " + vidaGuerrero + " de vida");
            System.out.println("El Vampiro tiene " + vidaVampiro + " de vida");
            dañoGuerrero = calcularAtaqueGuerrero();
            dañoVampiro = calcularAtaqueVampiro();
            vidaGuerrero = vidaGuerrero - dañoVampiro;
            vidaVampiro = vidaVampiro - dañoGuerrero;
            estanJugando = vidaGuerrero > 0 && vidaVampiro > 0;
            scanner.nextLine();

        } while (estanJugando);

        System.out.println(calcularGanador(vidaGuerrero, vidaVampiro));

        scanner.close();

    }

    static String calcularGanador(int vidaGuerrero, int vidaVampiro) {
        if(vidaGuerrero <= 0 && vidaVampiro <= 0 ) {
           return "Empate";
        }else if(vidaGuerrero <= 0) {
            return "Gano el Vampiro";
        }else {
            return "Gano el Guerrero";
        }

    }

    static int calcularAtaqueGuerrero() {
        final int ATAQUE_GUERRERO = 2;
        final double PROBABILIDAD_ATAQUE_GUERRERO = 0.5;

        double probabilidadDeAtaqueExitoso = Math.random();

        if (probabilidadDeAtaqueExitoso < PROBABILIDAD_ATAQUE_GUERRERO) {
            System.out.println("¡El Guerrero ataca exitosamente!");
            return ATAQUE_GUERRERO;
        } else {
            System.out.println("El Guerrero falla el ataque.");
            return 0;
        }
    }
    
    static int calcularAtaqueVampiro() {
        final int ATAQUE_VAMPIRO = 4;
        final double PROBABILIDAD_ATAQUE_VAMPIRO = 0.5;

        double probabilidadDeAtaqueExitoso = Math.random();

        if (probabilidadDeAtaqueExitoso < PROBABILIDAD_ATAQUE_VAMPIRO) {
            System.out.println("¡El vampiro ataca exitosamente!");
            return ATAQUE_VAMPIRO;
        } else {
            System.out.println("El vampiro falla el ataque.");
            return 0;
        }

    }
}
