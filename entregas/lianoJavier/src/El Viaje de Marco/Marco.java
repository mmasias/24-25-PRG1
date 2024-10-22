
class Marco {

    public static void main(String[] args) {

        final double VELOCIDAD_PROMEDIA_DIARIO_MINIMO = 10;
        final double VELOCIDAD_PROMEDIA_DIARIO_MAXIMO = 15;

        final double TIEMPO_PROMEDIO_DIARIO_MINIMO = 8;
        final double TIEMPO_PROMEDIO_DIARIO_MAXIMO = 10;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;

        final double REDUCCION_VELOCIDAD_LLUVIA_FUERTE = 0.25;
        final double REDUCCION_VELOCIDAD_LLUVIA_NORMAL = 0.75;

        final double PROBABILIDAD_MONO_EN_BRAZOS = 0.25;
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;

        final double REDUCCION_VELOCIDAD_MONO_EN_BRAZOS = 0.9;
        final double REDUCCION_TIEMPO_HORAS_MONO_ESCAPA = 2;

        final double VELOCIDAD_MADRE = 80;

        final String TEXTO_LLUEVE_FUERTE = "¡Ha llovido muchísimo!";
        final String TEXTO_LLUEVE_NORMAL = "Ha llovido un poco hoy. :s";
        final String TEXTO_DIA_CLARO = "¡Hoy ha hecho buenisimo!";

        double distancia = 466;
        int dia = 1;

        System.out.println("------------------------");
        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        do {
            double velocidadBase = Math.random() * (VELOCIDAD_PROMEDIA_DIARIO_MAXIMO - VELOCIDAD_PROMEDIA_DIARIO_MINIMO + 1) + VELOCIDAD_PROMEDIA_DIARIO_MINIMO;

            double probabilidadDeLaLluvia = Math.random();
            boolean LluveFuerte = probabilidadDeLaLluvia >= PROBABILIDAD_LLUVIA_FUERTE;
            boolean LluveNormal = probabilidadDeLaLluvia >= PROBABILIDAD_LLUVIA_NORMAL;

            boolean MonoEnBrazos = Math.random() >= PROBABILIDAD_MONO_EN_BRAZOS;

            double velocidadMarco
                    = velocidadBase
                    * (LluveFuerte ? REDUCCION_VELOCIDAD_LLUVIA_FUERTE : 1)
                    * (LluveNormal ? REDUCCION_VELOCIDAD_LLUVIA_NORMAL : 1)
                    * (MonoEnBrazos ? REDUCCION_VELOCIDAD_MONO_EN_BRAZOS : 1);

            double tiempoCaminadoBase = Math.random() * (TIEMPO_PROMEDIO_DIARIO_MAXIMO - TIEMPO_PROMEDIO_DIARIO_MINIMO + 1) + TIEMPO_PROMEDIO_DIARIO_MINIMO;

            boolean MonoEscapa = Math.random() >= PROBABILIDAD_MONO_ESCAPA;

            double tiempoCaminado
                    = tiempoCaminadoBase
                    - (MonoEscapa ? REDUCCION_TIEMPO_HORAS_MONO_ESCAPA : 0);

            double distanciaRecorridaMarco = velocidadMarco * tiempoCaminado;
            double distanciaRecorridaMadre = VELOCIDAD_MADRE;

            distancia = distancia
                    - distanciaRecorridaMarco
                    - distanciaRecorridaMadre;

            System.out.println("DÍA " + dia);

            System.out.println(
                    LluveFuerte ? TEXTO_LLUEVE_FUERTE
                            : LluveNormal ? TEXTO_LLUEVE_NORMAL
                                    : TEXTO_DIA_CLARO
            );

            System.out.println("Avancé " + ((double) (int) (tiempoCaminado * 100)) / 100 + " horas "
                    + "a " + (((double) (int) velocidadMarco * 100) / 100) + " km/h "
                    + "recorriendo " + ((double) (int) distanciaRecorridaMarco * 100 / 100) + "km.");

            if (distancia >= 0) {
                System.out.println("Ahora mi madre esta a " + (((double) (int) (distancia * 100)) / 100) + "km.");
            } else {
                System.out.println("¡ESTOY CON MI MADRE!");
            }

            dia++;

        } while (distancia >= 0);

    }
}
