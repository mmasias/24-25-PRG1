public class ViajeMarco {
    public static void main(String[] args) {
        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 11;
        final double TIEMPO_MAXIMO = 15;
        final double TIEMPO_MINIMO = 15;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;
        final double PROBABILIDAD_MONO_CANSA = 0.25;
        double probabilidadSeCansa;
        double probabilidadSeEscapa;

        double velocidadMarco,tiempoMarco,avanceMarco;
        double probabilidadLluvia;
        boolean se_Han_Encontrado = false ;
        double avanceMadre = 80;
        int dias = 0;
        double distanciaMarcoMadre = 350;

        while(!se_Han_Encontrado){
            dias ++;
            System.out.println("La distancia con la madre es"+distanciaMarcoMadre);
            probabilidadLluvia = Math.random();
            velocidadMarco = Math.random()*(VELOCIDAD_MAXIMA-VELOCIDAD_MINIMA+1)+VELOCIDAD_MINIMA;
            if (probabilidadLluvia<= PROBABILIDAD_LLUVIA_FUERTE){
                System.out.println("(LLUVIA DUERTE)");
                velocidadMarco = velocidadMarco*0.25;
            }else if (probabilidadLluvia<=PROBABILIDAD_LLUVIA_NORMAL) {
                System.out.println("LLUVIA FINA");
                velocidadMarco = velocidadMarco*0.75;
            }else{
                System.out.println("Buen tiempo");
            }

            probabilidadSeCansa = Math.random();
            if (probabilidadSeCansa<=PROBABILIDAD_MONO_CANSA){
                System.out.println("EL MONO SE CANSA")  ;
                velocidadMarco = velocidadMarco *0.9;
            }

            tiempoMarco = Math.random()*(VELOCIDAD_MAXIMA-VELOCIDAD_MINIMA+1)+VELOCIDAD_MINIMA;
            probabilidadSeEscapa = Math.random();
            if (probabilidadSeEscapa <= PROBABILIDAD_MONO_ESCAPA) {
                System.out.println("El mono se escapa!");
                tiempoMarco = tiempoMarco - 2;
            }
            
            avanceMarco = velocidadMarco*tiempoMarco;
            System.out.println("Avanza "+avanceMarco);
            se_Han_Encontrado = !(distanciaMarcoMadre>0);
               
            double distancia =  avanceMarco-avanceMadre;
            System.out.println(distancia);
        }

    }
}
