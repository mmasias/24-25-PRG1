class caracol{
    public static void main(String[] args) {
        final int PROFUNDIDAD = 20;
        final String POZO_BASE = " #########";
        final String POZO_TOPE = " ####        ####";
        final String POZO_PARED = "####:. :. :. :. :.#### _ __";
        final String POZO_AGUA = "##~~~~~~~~~~~~~~~~~~~~~~## _ __";
        final String POZO_CARACOL = " ##    _@)_/`   #### _ __";

        

    
        int profundidadagua = 5;
        int profundidadcaracol = (int)(Math.random()*20-10+1)+10;
        
        int dia=0;
        int cracolbaja = 0;
        int caracolsube = 0;
        System.out.println("Al inicio el caracol cae a ["+profundidadcaracol+"] metros");

        do {
            dia++;

            double propabilidaddelluvia = Math.random();
            int aporteagua = propabilidaddelluvia <= 0.05 ? 5:
                             propabilidaddelluvia <= 0.1 ? 2 : 0;


            profundidadagua = profundidadagua + aporteagua;
            caracolsube = (int)(Math.random()*(4-1)+1);
            cracolbaja = (int)(Math.random()*(2-0)+0);

            boolean aparcacoche = Math.random()<=0.35;


            profundidadcaracol = profundidadcaracol
                                 -caracolsube
                                 +cracolbaja
                                 +(aparcacoche ? 2 : 0);

            System.out.println("Dia["+dia+"] - Subido["+caracolsube+"] -Bajo["+cracolbaja+"] - Position["+profundidadcaracol+"]" );

             
            
            
            System.out.println("DIA" + dia);
        System.out.println(POZO_TOPE);

        for(int i=0; i<=PROFUNDIDAD; i++) {

            if (profundidadcaracol==i) {
                System.out.println(POZO_CARACOL + i);

            } else if (i>PROFUNDIDAD-profundidadagua) {
                System.out.println(POZO_AGUA + i);

            } else {
                System.out.println(POZO_PARED + i);
            }
        } System.out.println(POZO_BASE);
        profundidadcaracol = profundidadcaracol - 2;
        dia++;
        
    } while (profundidadcaracol>0);
             
        } 

          
    }
         
