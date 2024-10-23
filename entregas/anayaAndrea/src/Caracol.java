

class Caracol {
    public static void main(String[] args) {
        Scanner entrada=newScanner(System.in);
        System.out.println("El caracol");
        string inputUsuario; 
        final int PROFUNDIDAD = 20;


        final String POZO_TOPE = "[__]             [__]";
        final String POZO_CON_COCHE= "[__]    COCHE    [__]";
        final String POZO_BASE = "  [][][][][][][][][]";
        final String POZO_PARED = "  []:. :. :. :. :.[] _ __";
        final String POZO_AGUA = "  []~~~~~~~~~~~~~~[] _ __";
        final String CARACOL = "  []    _@)_/´    [] _ __";

        final int PROFUNDIDAD=20;
        final int PROFUNDIDAD_MAXIMA=20;
        final int PROFUNDIDAD_MINIMA=10;
         
        final double PROFUNDIDAD_LLUVIA_FUERTE=0.05;
        final double PROBABILIDAD_LLUVIA_FUERTE=0.1;

        int profundidadAgua = 0;
        int profundidadCaracol = (int)(Math.random()*PROFUNDIDAD_MAXIMA-PROFUNDIDAD_MINIMA+1)+PROFUNDIDAD_MINIMA;

        int dia=0;  
        int caracolSube=0;
        int CaracolBaja=0;

        do {     

            System.out.println("DIA"+dia);
            System.out.println(POZO_TOPE);
            for(int i=0; i<=PROFUNDIDAD ;i++){
                if (profundidadCaracol == i) {
                System.out.println(POZO_CARACOL + i);
                } else if (i>PROFUNDIDAD-profundidadAgua){
                 System.out.println(POZO_AGUA + i);
                } else{
                System.out.println(POZO_PARED+i);
            }

        }
        System.out.println(POZO_INFERIOR);
        InputUsuario=entrada.nextLine();
        System.out.println(POZO_BASE);
        profundidadCaracol--;
           dia++;
        
        double probabilidadlluvia=Math.random();

        int aporteAgua = probabilidadLluvia <=0.05?5:
                         probabilidadLluvia<=0.1?2:0;
        profundidadAgua=profundidadAgua+aporteAgua;
        
        caracolSube=(int)(Math.random()*(4-1+1)+1);
        caracolBaja=(int)(Math.random()*(2-0+1)+0);

        boolean aparcaCoche=Math.random()<=0.35;

        profundidadCaracol=profundidadCaracol
                               -caracolSube
                               +CaracolBaja
                               +(aparcaCoche ? 2:0);
        System.out.println("Dia["+dia+"]-Subio["+caracolSube+"]-Bajo["+CaracolBaja+"]-Posicion["+profundidadCaracol+"]");
        System.out.println(aparcaCoche?POZO_CON_COCHE:POZO_SUPERIOR);
        
       //haSalido=profundidadCaracol<=0;
        profundidadCaracol=profundidadCaracol-caracolSube+CaracolBaja;
    }   while (profundidadCaracol>0);//!aSalido && esteVivo);
    
        scanner.close();

    
    }
    

    }   while (!haSalido && esteVivo);


