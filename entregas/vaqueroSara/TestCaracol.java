public class TestCaracol {

    public static void main(String[] args) {
        final int PROFUNDIDAD_MAXIMA = 20;
        final int PROFUNDIDAD_MINIMA = 10;
        final int SUPERFICIE = 0;
        int alturaCaracol = (int) (Math.random() * ((PROFUNDIDAD_MAXIMA - PROFUNDIDAD_MINIMA)) + PROFUNDIDAD_MINIMA);
        System.out.println(alturaCaracol);

        final String Caracol = "_@)_/’";
        final String Borde = " [__] ";
        final String fondo = ":.";

        boolean dentroDelPozo = (alturaCaracol != SUPERFICIE);

        while (dentroDelPozo) {
            for (int i = SUPERFICIE + 1; i <= PROFUNDIDAD_MAXIMA; i++) {
                
                if (i < alturaCaracol) {
                    System.out.println(Borde + fondo.repeat(10) + Borde);
                } else if (i == alturaCaracol) {
                    System.out.println(Borde + fondo.repeat(3) + Caracol + fondo.repeat(4) + Borde);
                } else {
                    System.out.println(Borde + fondo.repeat(10) + Borde);
                }
            }
        }
    }
}
