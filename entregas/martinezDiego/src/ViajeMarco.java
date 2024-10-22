
public class ViajeMarco {
    public static void main(String[] args) {
        
        
        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;
        final double LLUVIA_FUERTE = 0.1;
        final double  LLUVIA_NORMAL = 0.4;
        final double MONO_SE_CANSA = 0.25;
        final double MONO_SE_ESCAPA = 0.15;
        


        double velocidadMarco, tiempoMarco, avanceMarco;
        double probabilidadLluvia = Math.random();
        double  probabilidadCansancio = Math.random();
        double  probabilidadEscape = Math.random();

        

        velocidadMarco = Math.random()*(VELOCIDAD_MAXIMA-VELOCIDAD_MINIMA+1)+(VELOCIDAD_MINIMA);

        if (probabilidadLluvia <= LLUVIA_FUERTE){
                System.out.println("Lluvia fuerte");
                velocidadMarco = velocidadMarco*0.25;
            } else if(probabilidadLluvia <= LLUVIA_NORMAL){
                System.out.println("Lluvia normal");
                velocidadMarco = velocidadMarco*0.75;
            } else {
                System.out.println("buen tiempo");
            }

        if (probabilidadCansancio <= MONO_SE_CANSA){
            System.out.println("se cansa");
            velocidadMarco = velocidadMarco*0.9;
        }  
        
        if (probabilidadEscape <= MONO_SE_ESCAPA){
            System.out.println("se escapa");
            velocidadMarco = velocidadMarco -2;
        }

            

        

     tiempoMarco =  Math.random()*(TIEMPO_MAXIMO-TIEMPO_MINIMO+1)+(TIEMPO_MINIMO);


        





        avanceMarco =  velocidadMarco * tiempoMarco;








        
    }

}