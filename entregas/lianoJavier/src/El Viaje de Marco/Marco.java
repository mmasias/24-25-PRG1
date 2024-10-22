class Marco {
    public static void main(String[] args) {

        final int VELOCIDAD_PROMEDIA_DIARIO_MINIMO = 10;
        final int VELOCIDAD_PROMEDIA_DIARIO_MAXIMO = 15;

        final int TIEMPO_PROMEDIO_DIARIO_MINIMO = 8;
        final int TIEMPO_PROMEDIO_DIARIO_MAXIMO = 10;

        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.3;

        final double REDUCCION_VELOCIDAD_LLUVIA_FUERTE = 0.25;
        final double REDUCCION_VELOCIDAD_LLUVIA_NORMAL = 0.25;

        final double PROBABILIDAD_MONO_EN_BRAZOS = 0.25;
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;

        final double REDUCCION_VELOCIDAD_MONO_EN_BRAZOS = 0.1;
        final int REDUCCION_TIEMPO_HORAS_MONO_ASCAPA = 2;

        final int VELOCIDAD_MADRE = 80;

        final int DECIMALES_A_REDODNDEAR = 2;

        final String TEXTO_LLUEVE_FUERTE = "¡Ha llovido muchísimo!";
        final String TEXTO_LLUEVE_NORMAL = "Ha llovido un poco hoy. :s";
        final String TEXTO_DIA_CLARO = "¡Hoy ha hecho buenisimo!";

        double distancia = 466;
        int dia = 1;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        do {

            boolean isLloviendoFuerte = Math.random() >= PROBABILIDAD_LLUVIA_FUERTE;
            boolean isLloviendoNormal = Math.random() >= PROBABILIDAD_LLUVIA_NORMAL;
            boolean isMonoEnBrazos = Math.random() >= PROBABILIDAD_MONO_EN_BRAZOS;
            boolean isMonoEscapa = Math.random() >= PROBABILIDAD_MONO_ESCAPA;

            double velocidadMarco = ((Math.random()
                    * (VELOCIDAD_PROMEDIA_DIARIO_MAXIMO - VELOCIDAD_PROMEDIA_DIARIO_MINIMO + 1))
                    + VELOCIDAD_PROMEDIA_DIARIO_MINIMO)
                    * (isLloviendoFuerte ? REDUCCION_VELOCIDAD_LLUVIA_FUERTE : 1)
                    - (isLloviendoNormal ? REDUCCION_VELOCIDAD_LLUVIA_NORMAL : 0)
                    - (isMonoEnBrazos ? REDUCCION_VELOCIDAD_MONO_EN_BRAZOS : 0);

            double tiempoCaminado = ((Math.random()
                    * (TIEMPO_PROMEDIO_DIARIO_MAXIMO - TIEMPO_PROMEDIO_DIARIO_MINIMO + 1))
                    + TIEMPO_PROMEDIO_DIARIO_MINIMO)
                    - (isMonoEscapa ? REDUCCION_TIEMPO_HORAS_MONO_ASCAPA : 0);

            double distanciaRecorridaMarco = velocidadMarco * tiempoCaminado;
            int distanciaRecorridaMadre = VELOCIDAD_MADRE;

            distancia = distancia
                    - distanciaRecorridaMarco
                    - distanciaRecorridaMadre;

            System.out.println("DÍA " + dia);

            if (isLloviendoFuerte) {
                System.out.println(TEXTO_LLUEVE_FUERTE);
            } else if (isLloviendoNormal) {
                System.out.println(TEXTO_LLUEVE_NORMAL);
            } else {
                System.out.println(TEXTO_DIA_CLARO);
            }

            System.out.println("Avancé "
                    + Math.round(tiempoCaminado * Math.pow(10, DECIMALES_A_REDODNDEAR))
                            / Math.pow(10, DECIMALES_A_REDODNDEAR)
                    + " horas a "
                    + Math.round(velocidadMarco * Math.pow(10, DECIMALES_A_REDODNDEAR))
                            / Math.pow(10, DECIMALES_A_REDODNDEAR)
                    + " km/h recorriendo "
                    + Math.round(distanciaRecorridaMarco * Math.pow(10, DECIMALES_A_REDODNDEAR))
                            / Math.pow(10, DECIMALES_A_REDODNDEAR)
                    + "km.");

            if (distancia >= 0) {
                System.out
                        .println("Ahora mi madre esta a " + Math.round(distancia * Math.pow(10, DECIMALES_A_REDODNDEAR))
                                / Math.pow(10, DECIMALES_A_REDODNDEAR) + "km.");
            } else {
                System.out.println("¡ESTOY CON MI MADRE!");
            }

            System.out.println("------------------------");

            dia++;

        } while (distancia >= 0);

    }
}
