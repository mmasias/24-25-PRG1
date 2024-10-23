mport java.util.Scanner;

 class caracolFinal {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         String inputUsuario;


         final int PROFUNDIDAD = 20;
         final String POZO_SUPERIOR = "[_]_______[_]";
         final String POZO_CON_COCHE = "[_]___ COCHE ___[_]";
         final String POZO_PARED = "[]:. :. :. :. :[]";
         final String POZO_INFERIOR = "[] [] [] [] []";
         final String POZO_AGUA = "[]~~~~~~~~~~~[]";
         final String POZO_CARACOL = " @)/ \\ ";

         final int PROFUNDIDAD_MAXIMA = 20;
         final int PROFUNDIDAD_MINIMA = 10;
         final double PROBABILIDAD_LLUVIA_FUERTE = 0.05;
         final double PROBABILIDAD_LLUVIA_MEDIA = 0.1;

         int profundidadAgua = 0;
         int profundidadCaracol = (int)(Math.random()*(PROFUNDIDAD_MAXIMA-PROFUNDIDAD_MINIMA+1)+PROFUNDIDAD_MINIMA);
         System.out.println("Al inicio el caracol cae a ["+profundidadCaracol+"]metros");
         int dia = 0;
         int caracolSube = 0;
         int caracolBaja = 0;

         do{
              dia++;

              double probabilidadLluvia = Math.random();
              int aporteAgua = probabilidadLluvia <= PROBABILIDAD_LLUVIA_FUERTE ? 5 :
                               probabilidadLluvia <= PROBABILIDAD_LLUVIA_MEDIA ? 2:0;
               profundidadAgua = profundidadAgua + aporteAgua;

              caracolSube = (int) (Math.random()*(4-1+1)+1);
              caracolBaja = (int)(Math.random()*(2-0+1)+0);


              boolean aparcaCoche = Math.random()<=0.35;

              profundidadCaracol = profundidadCaracol-caracolSube+caracolBaja+(aparcaCoche ? 2 : 0);

              System.out.println("Dia ["+dia+"] - subio["+caracolSube+"] - bajo["+caracolBaja+"] - posicion["+profundidadCaracol+"]");

              System.out.println(aparcaCoche ? POZO_CON_COCHE : POZO_SUPERIOR);
              for(int i=0; i<=PROFUNDIDAD; i++){

              if (profundidadCaracol==i) {
              System.out.println(POZO_CARACOL + i);
              } else if (i>PROFUNDIDAD-profundidadAgua){
              System.out.println(POZO_AGUA + i);
              } else {
              System.out.println(POZO_PARED + i);
              }
             }

             System.out.println(POZO_INFERIOR);
             inputUsuario = entrada.nextLine();

         } while(profundidadCaracol>0);



     }
 }