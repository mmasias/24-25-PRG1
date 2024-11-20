class Caracol{
    public static void main(String[] args){

        final int PROFUNDIDAD = 20;
        final String POZO_BASE = " [] [] [] [] [] [] [] [] []";
        final String POZO_TOPE = "[__]                      [__]";
        final String POZO_PARED = " []:. :. :. :. :.[] _ __";
        final String POZO_AGUA = " [~~~~~~~~~~~~~~~~[] _ __";
        final String POZO_CARACOL = "  []      _@)_/´    [][] _ __";

        final int PROFUNDIDAD_MAXIMA = 20;
        final int PROFUNDIDAD_MINIMA = 10;


        int profundidadAgua = 0;
        int profundidadCaracol = (int)(Math.random()*PROFUNDIADA_MAXIMA-PROFUNDIDAD_MINIMA+1)+PROFUNDIDAD_MINIMA;
        int dia = 0;

        do{
            System.out.println("DIA:" + dia);
            System.out.println(POZO_TOPE);
            for(int i=0; i<=PROFUNDIDAD; i++){
                if (profundidadCaracol==i){
                    System.out.println(POZO_CARACOL + i);
                } else if(i>PROFUNDIDAD-profundidadAgua){
                    System.out.println(POZO_PARED + i);

                } else{
                    System.out.println(POZO_AGUA + i);
             }
            System.out.println(POZO_PARED + i);
        }
        System.out.println(POZO_BASE);
        profundidadCaracol--;
        dia++;
    } while(profundidadCaracol>0);
}
