
class Caracol {

    public static void main(String[] args) {

        int dia = 0;
        int nivelAgua = 0;

        int PROFUNDIDAD_MAXIMA_CARACOL = 20;
        int PROFUNDIDAD_MINIMA_CARACOL = 10;
        int posicionCaracol = (int) (Math.random() * PROFUNDIDAD_MAXIMA_CARACOL - PROFUNDIDAD_MINIMA_CARACOL + 1) + PROFUNDIDAD_MINIMA_CARACOL;

        final String SUPERFICIE = "[__]            [__]";
        final String PAREZ_VACIA = "  []:. :. :. :. []";
        final String PAREZ_CON_AGUA = "  []~~~~~~~~~~~~[]";
        final String PAREZ_CON_CARACOL = "  []    _@)/'   []";
        final String BASE = "  [][][][][][][][]";

        do {
            System.out.println("DÍA: " + dia);
            System.out.println(SUPERFICIE);

            final int PROFUNDIDAD = 20;
            for (int i = 1; i <= PROFUNDIDAD; i++) {

                String Dibujo;

                Dibujo = i == posicionCaracol ? PAREZ_CON_CARACOL
                        : i >= (PROFUNDIDAD - nivelAgua + 1) ? PAREZ_CON_AGUA
                                : PAREZ_VACIA;

                String Contrador = "_ __" + i;

                System.out.println(Dibujo + Contrador);
            }

            System.out.println(BASE);
            System.out.println(posicionCaracol);

            dia++;
        } while (posicionCaracol > 0);

    }
}
