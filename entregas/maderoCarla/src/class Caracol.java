class Caracol{
    public static void main(String[] args){

        final int PROFUNDIDAD = 20;
        final String POZO_BASE = " [] [] [] [] [] [] [] [] []";
        final String POZO_TOPE = "[__]                      [__]";
        final String POZO_PARED = " []:. :. :. :. :.[] _ __";

        System.out.println(POZO_TOPE);
        for(int i=0; i<=PROFUNDIDAD; i++){
            System.out.println(POZO_PARED + i);
        }
        System.out.println(POZO_BASE);
    }
}