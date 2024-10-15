class Caracol {
    public static void main(String[] args) {
        
        
        final String POZO_PARED = "##:. :. :. :. :. :.## __";
        final String POZO_AGUA =  "##~~~~~~~~~~~~~~~~~## __";
        final String CARACOL =    "##     __@_/¨      ## __";
        final int PROFUNDIDAD_MAXIMA = 20;

        int profundidadAgua = 5;
        int profundidadCaracol = (int) (Math.random() * (20));
        int dia = 0;

        do{
        System.out.println(("Dia: "+dia));
        System.out.println("[__]               [__]");
        for(int i=0;i<=PROFUNDIDAD_MAXIMA;i++) {
            
            if (profundidadCaracol==i) {
            System.out.println(CARACOL+i);
            }
                
            else if (i >PROFUNDIDAD_MAXIMA-profundidadAgua)
            System.out.println(POZO_AGUA+i);
            
            else {
                System.out.println(POZO_PARED+i);
            }
        }
        profundidadCaracol--;
        dia++;
    } while (profundidadCaracol>-1);

    }  
}
