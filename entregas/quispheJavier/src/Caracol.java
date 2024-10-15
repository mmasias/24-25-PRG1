class Caracol{
    public static void main (String[] args) {

        final int PROFUNDIDAD = 20;
        final String POZO_BASE = "  ##################"
        final String POZO_TOPE = "####              ####";
        final String POZO_PARED = "   ##: . :. :. :. :.## : ::";
        final String POZO_AGUA = "   ##---------------# _ __";
        final String POZO_CARACOL = "   ##      _@)/    ## _ __";

        int profundidadAgua = 0;
        int profundidadCaracol = (int) (Math.random()*20-10+1) +10;

        Sytem.out.println(POZO_TOPE);
        for(int i=0; i<=PROFUNDIDAD; i++){
            if (profundidadCaracol==i){
                System.out.println(POZO_CARACOL)
            }
            Sytem.out.println(POZO_PAERED + i);
        }
        System.out.println(POZO_BASE);

    }
}