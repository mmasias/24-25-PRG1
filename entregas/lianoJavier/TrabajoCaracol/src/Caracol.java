
class Caracol {
    public static void main(String[] args) {

        int nivelAgua = 3;
        int posicionCaracol = 13;

        final String SUPERFICIE =           "[__]            [__]";
        final String PAREZ_VACIA =          "  []:. :. :. :. []";
        final String PAREZ_CON_AGUA =       "  []~~~~~~~~~~~~[]";
        final String PAREZ_CON_CARACOL =    "  []    _@)/'   []";
        final String BASE =                 "  [][][][][][][][]";

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

    }
}
