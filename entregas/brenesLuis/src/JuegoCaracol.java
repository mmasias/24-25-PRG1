public class JuegoCaracol {
    public static void main(String[] args) {
        final int PROFUNDIDAD = 20;
        final String POZO_BASE = "[][][][][][][][][][][][][]";
        final String POZO_TOPE = "[_]                    [_]";
        final String POZO_PARED = "  [][]: .: .: .: .: .[][] _ __";
        final String POZO_AGUA = "   # #~~~~~~~~~~~~~~~~~~~ _ __";
        final String POZO_CARACOL = "  ##     _@)_/'     ##     _ __";

        int profundidadAgua = 18;
        int profundidadCaracol = 16;

        System.out.println(POZO_TOPE);

        for (int i = 0; i <= PROFUNDIDAD; i++) {

            if (profundidadCaracol == i) {
                System.out.println(POZO_CARACOL + 1);
            } else if (i > PROFUNDIDAD - profundidadAgua) {
                System.out.println(POZO_AGUA + i);
            } else {
                System.out.println(POZO_PARED + i);
            }
        }
        System.out.println(POZO_BASE);
    }
}
