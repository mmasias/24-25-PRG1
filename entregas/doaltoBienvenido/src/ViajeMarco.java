import java.util.scanner;

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
        

        double velocidadMarco = (Math.random()* (VELOCIDAD_MAXIMA_PROMEDIO_MARCO-VELOCIDAD_MINIMA_PROMEDIO_MARCO+1)) + VELOCIDAD_MINIMA_PROMEDIO_MARCO;
        double tiempoMarco =  (Math.random()* (TIEMPO_MAXIMO_POR_DIA-TIEMPO_MINIMO_POR_DIA + 1)) + TIEMPO_MINIMO_POR_DIA;
        double avanceMarco =  velocidadMarco*tiempoMarco;
        double probabilidadMonoEscape = Math.random();
        double probabilidadMonoCansancio = Math.random();
        double probabilidadLluvia = Math.random(); 
        int dia = 0;

        
            dia++;
            System.out.println("DIA: " + dia);
            System.out.println();

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

           if (probabilidadMonoEscape <= PROPABILIDAD_ESCAPE_MONO){
            System.out.println("El mono se escapo");
            tiempoMarco = tiempoMarco - 2;
           }

        


    }
}
