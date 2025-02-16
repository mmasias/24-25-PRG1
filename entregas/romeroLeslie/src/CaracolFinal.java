import java.util.Scanner;

class temporal {
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner (System.in);
        String inputUsuario;
        
        final String POZO_SUPERIOR = "[ ]              [ ]";
        final String POZO_CON_COCHE = "[ ]    COCHE      [ ]";
        final String POZO_PARED= " [].: .: .: .: .:[] ";
        final String POZO_INFERIOR = " [][][][][][][][][] ";
        final String POZO_AGUA = " []~ ~ ~ ~ ~ ~ ~ [] ";
        final String Caracol = " [].: .:\\_(@)^ .:[]_ __ ";

        final int PROFUNDIDAD = 20;
        final int MAXIMA =20;
        final int MINIMA = 10;
        
        final double PROBABILIDAD_LLUVIA_FUERTE= 0.05;
        final double PROBABILIDAD_LLUVIA_MEDIA= 0.15;

        int dia =0;
        int caracolSube = 0;
        int caracolBaja = 0;

        int profundidadAgua=0;

        int profundidadCaracol = (int)(Math.random()*MAXIMA-MINIMA+1)+ MINIMA;
        boolean haSalido = profundidadCaracol<=0;
        boolean estaVivo = true;
        System.out.println("Al inicio el caracol cae a ["+ profundidadCaracol +"] metros" );


        do {

            dia++;

            double probabilidadLluvia = Math.random();
            int aporteAgua = probabilidadLluvia <= PRO ? 5:
                                probabilidadLluvia<= 0.1 ? 2:0;
            profundidadAgua = profundidadAgua + aporteAgua;


            caracolSube =(int)(Math.random ()* (4-1+1)+1);
            caracolBaja = (int)(Math.random ()* (2-0+1)+0);
            profundidadCaracol = profundidadCaracol-caracolSube+caracolBaja;
            boolean aparcacoche= Math.random()<=0.35;

            profundidadCaracol = profundidadCaracol
                                  - caracolSube 
                                  + caracolBaja 
                                  + (aparcacoche ? 2: 0);

            System.out.println("Dia ["+dia+"]-Subio["+caracolSube+"] - Bajo [ "+caracolBaja+"] - Posicion ["+profundidadCaracol+"]");
            System.out.println(POZO_SUPERIOR);
    
            System.out.println(aparcacoche? POZO_CON_COCHE:POZO_SUPERIOR);

            for (int i=0; i<=PROFUNDIDAD; I++){

                if(i==profundidadCaracol){
                         System.out.println(Caracol + i);
                }else if (i>PROFUNDIDAD-profundidadAgua) {
                    System.out.println(POZO_AGUA + i);
                }else{ 
                    System.out.println(POZO_PARED + i);
                }
            }
                System.out.println(POZO_INFERIOR);
                inputUsuario= entrada.nextline();
                
                haSalido = profuncidadCaracol<=0;

            }while (!haSalido && esteVivo);

       
    }
}