class Batalla {
    public static void main(String[] args) {
        int poderGuerrero = 150, poderVampiro = 60;

        final int dañoGuerreroArma1 = 7,
                dañoGuerreroArma2 = 15,
                dañoGuerreroArma3 = 30;

        final int dañoVampiroAtaque1 = 5,
                dañoVampiroAtaque2 = 10,
                dañoVampiroAtaque3 = 20;

        final double exitoGuerreroArma1 = 0.5,
                exitoGuerreroArma2 = 0.25,
                exitoGuerreroArma3 = 0.12;

        final double exitoVampiroAtaque1 = 0.9,
                exitoVampiroAtaque2 = 0.6,
                exitoVampiroAtaque3 = 0.4;

        boolean ganaGuerrero;
        boolean ganaVampiro;

        do {
            int probabilidadAtaqueGuerrero = (int) (Math.random());
            int dañoVampiro = 0;

            if (probabilidadAtaqueGuerrero <= exitoGuerreroArma1) {
                dañoVampiro = dañoGuerreroArma1;
            } else if (probabilidadAtaqueGuerrero <= exitoGuerreroArma2) {
                dañoVampiro = dañoGuerreroArma2;
            } else if (probabilidadAtaqueGuerrero <= exitoGuerreroArma3) {
                dañoVampiro = dañoGuerreroArma3;
            }
            poderVampiro -= dañoVampiro;

            int dañoGuerrero = 0;
            int probabilidadAtaqueVampiro = (int) (Math.random());
            if (probabilidadAtaqueVampiro <= exitoVampiroAtaque1) {
                dañoGuerrero = dañoGuerreroArma1;
            } else if (probabilidadAtaqueVampiro <= exitoVampiroAtaque2) {
                dañoGuerrero = dañoGuerreroArma2;
            } else if (probabilidadAtaqueVampiro <= exitoVampiroAtaque3) {
                dañoGuerrero = dañoGuerreroArma3;
            }
            poderGuerrero -= dañoGuerrero;

            ganaVampiro = poderGuerrero <= 0;
            ganaGuerrero = poderVampiro <= 0;

            System.out.println("---------------------------------");
            System.out.println("Vida del Vampiro: " + poderVampiro);
            System.out.println("Vida del Guerrero: " + poderGuerrero);
        } while (!(ganaGuerrero || ganaVampiro));
        System.out.println("---------------------------------");

        String ganador = "guerrero";
        if (ganaVampiro) {
            ganador = "vampiro";
        }

        System.out.println("Gana: " + ganador);
    }
}