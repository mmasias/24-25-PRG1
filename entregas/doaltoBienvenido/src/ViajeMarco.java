import java.util.Scanner;

public class ViajeMarco 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        final double VELOCIDAD_MAXIMA_PROMEDIO_MARCO = 15; // km/h
        final double VELOCIDAD_MINIMA_PROMEDIO_MARCO = 10;
        final double TIEMPO_MAXIMO_POR_DIA = 10; // Horas
        final double TIEMPO_MINIMO_POR_DIA = 8;
        final double PROBABLIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABLIDAD_LLUVIA_NORMAL = 0.4;
        final double PROPABILIDAD_CANSANCIO_MONO = 0.25;
        final double PROPABILIDAD_ESCAPE_MONO = 0.15;
        final double AVANCE_MADRE_MARCO = 80;
        

        double velocidadMarco;
        double tiempoMarco;
        double avanceMarco;
        double probabilidadMonoEscape = Math.random();
        double probabilidadMonoCansancio = Math.random();
        double probabilidadLluvia = Math.random(); 
        double distanciaMadreMarco = 350; 
        int dia = 0;

        do{
            dia++;
            System.out.println("EL VIAJE DE MARCO");
            System.out.println("==================");
            System.out.println("Distacia de Marco con la Madre: " + distanciaMadreMarco);
            System.out.println("DIA: " + dia);

            velocidadMarco = (Math.random()* (VELOCIDAD_MAXIMA_PROMEDIO_MARCO-VELOCIDAD_MINIMA_PROMEDIO_MARCO+1)) + VELOCIDAD_MINIMA_PROMEDIO_MARCO;

           if (probabilidadLluvia <= PROBABLIDAD_LLUVIA_FUERTE) {
            System.out.println("¡¡Hoy ha llovido muchisimo!!");
            velocidadMarco = velocidadMarco*0.25; 
           }else if (probabilidadLluvia <= PROBABLIDAD_LLUVIA_NORMAL) {
            System.out.println("¡¡Hoy ha llovido poco!!");
            velocidadMarco = velocidadMarco*0.75;
           }else {
            System.out.println("¡¡Hoy ha hecho muy bueno!!");
           }

           if (probabilidadMonoCansancio <= PROPABILIDAD_CANSANCIO_MONO) {
            System.out.println("El mono se canso");
            velocidadMarco = velocidadMarco*0.9;
           }

           tiempoMarco =  (Math.random()* (TIEMPO_MAXIMO_POR_DIA-TIEMPO_MINIMO_POR_DIA + 1)) + TIEMPO_MINIMO_POR_DIA;

           if (probabilidadMonoEscape <= PROPABILIDAD_ESCAPE_MONO){
            System.out.println("El mono se escapo");
            tiempoMarco = tiempoMarco - 2;
           }

           avanceMarco =  velocidadMarco*tiempoMarco;

           System.out.println("Marco avanzo " + avanceMarco + "km en " + tiempoMarco + " horas");

           distanciaMadreMarco = distanciaMadreMarco - avanceMarco - AVANCE_MADRE_MARCO;
           String imput = scanner.nextLine();
        }while (distanciaMadreMarco >= 0);

        if (distanciaMadreMarco <= 0) {
            System.out.println("¡¡MARCO SE ENCONTRO CON SU MADRE!!");
        }
    }
}
