import java.util.Scanner;
 class  Viajemarco{
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

           final double VELOCIDAD_MAXIMA = 15;
           final double VELOCIDAD_MINIMA = 10;
           final double TIEMPO_MAXIMO = 10;
           final double TIEMPO_MINIMO = 8;
           
           
           final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
           final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
           final double PROBABILIDAD_MONO_ESCAPA = 0.15;
           final double PROBABILIDAD_MONO_CANSA = 0.25;

           boolean seHanEncontrado  = false;
           int dias = 0;
        
           double avanceMadre = 80;
           double distanciaMadremarco = 350;
           double velocidadMarco, tiempoMarco, avanceMarco;
           double probabilidadlluvia;
           double probabilidadseCansa, probabilidadseEscapa;

           while(!seHanEncontrado){
            dias++;
            System.out.println("La distancia con la Madre es : " +distanciaMadremarco);
            System.out.println("DIA"+dias);
           }

           
           probabilidadlluvia = Math.random();

           velocidadMarco = Math.random()*(VELOCIDAD_MAXIMA-VELOCIDAD_MINIMA)+VELOCIDAD_MINIMA;
             if(probabilidadlluvia<=PROBABILIDAD_LLUVIA_FUERTE){
                System.out.println("lluvia fuerte");
                velocidadMarco = velocidadMarco*0.25;
             }else if(probabilidadlluvia<=PROBABILIDAD_LLUVIA_NORMAL){
                System.out.println("lluvia fina");
                velocidadMarco = velocidadMarco*0.75;
             }else {
                System.out.println("Buen Tiempo");
             }


           tiempoMarco = Math.random()*(TIEMPO_MAXIMO-TIEMPO_MINIMO)+TIEMPO_MINIMO;

           probabilidadseCansa = Math.random();
           if(probabilidadseCansa<= PROBABILIDAD_MONO_CANSA){
            System.out.println("El monon se cansa");
            velocidadMarco = velocidadMarco*0.9;
           }
            probabilidadseEscapa = Math.random();
            if(probabilidadseEscapa<= PROBABILIDAD_MONO_ESCAPA){
                System.out.println("monose escapa");
                 tiempoMarco = tiempoMarco-2;
            }

           avanceMarco = velocidadMarco*tiempoMarco;


           System.out.println("Avanza: " + avanceMarco);


           seHanEncontrado = !(distanciaMadremarco>0);

           entrada.close(); 

        

     }
}

    

