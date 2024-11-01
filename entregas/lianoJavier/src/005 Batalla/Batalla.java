class Batalla {
    public static void main(String[] args) {
        int poderGuerrero = 20, poderVampiro = 40;
        final int ataqueGuerrero = 2, ataqueVampiro = 4;
        final double exitoGuerrero = 0.5, exitoVampiro = 0.5;

        boolean ganaGuerrero;
        boolean ganaVampiro;

        do {

            boolean aciertaGuerrero = Math.random() >= exitoGuerrero;
            int dañoVampiro = aciertaGuerrero ? ataqueGuerrero : 0;
            poderVampiro -= dañoVampiro;

            boolean aciertaVampiro = Math.random() >= exitoVampiro;
            int dañoGuerrero = aciertaVampiro ? ataqueVampiro : 0;
            poderGuerrero -= dañoGuerrero;

            ganaGuerrero = poderGuerrero <= 0;
            ganaVampiro = poderVampiro <= 0;

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