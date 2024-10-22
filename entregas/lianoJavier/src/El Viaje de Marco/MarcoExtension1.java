
class MarcoExtension1 {

    public static void main(String[] args) {

        final int VELOCIDAD_PROMEDIA_DIARIO_MARCO_MINIMO = 10;
        final int VELOCIDAD_PROMEDIA_DIARIO_MARCO_MAXIMO = 15;

        final int TIEMPO_PROMEDIO_DIARIO_MARCO_MINIMO = 8;
        final int TIEMPO_PROMEDIO_DIARIO_MARCO_MAXIMO = 10;

        final double PROBABILIDAD_LLUVIA_FUERTE_MARCO = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL_MARCO = 0.3;

        final double REDUCCION_VELOCIDAD_LLUVIA_FUERTE_MARCO = 0.25;
        final double REDUCCION_VELOCIDAD_LLUVIA_NORMAL_MARCO = 0.25;

        final double PROBABILIDAD_MONO_EN_BRAZOS = 0.25;
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;

        final double REDUCCION_VELOCIDAD_MONO_EN_BRAZOS = 0.1;
        final int REDUCCION_TIEMPO_HORAS_MONO_ASCAPA = 2;

        final int VELOCIDAD_PROMEDIA_DIARIO_MAMA_MINIMO = 6;
        final int VELOCIDAD_PROMEDIA_DIARIO_MAMA_MAXIMO = 9;

        final int TIEMPO_PROMEDIO_DIARIO_MAMA_MINIMO = 6;
        final int TIEMPO_PROMEDIO_DIARIO_MAMA_MAXIMO = 9;

        final double PROBABILIDAD_LLUVIA_FUERTE_MAMA = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL_MAMA = 0.3;

        final double REDUCCION_VELOCIDAD_LLUVIA_FUERTE_MAMA = 0.5;
        final double REDUCCION_VELOCIDAD_LLUVIA_NORMAL_MAMA = 0.25;

        final int DECIMALES_A_REDODNDEAR = 2;

        final String TEXTO_LLUEVE_FUERTE = "¡Ha llovido muchísimo!";
        final String TEXTO_LLUEVE_NORMAL = "Ha llovido un poco hoy. :s";
        final String TEXTO_DIA_CLARO = "¡Hoy ha hecho buenisimo!";

        double distancia = 466;
        int dia = 1;

        System.out.println("DIARIO DEL VIAJE DE MARCO");
        System.out.println("=========================");

        do {

            boolean isLloviendoFuerteMarco = Math.random() >= PROBABILIDAD_LLUVIA_FUERTE_MARCO;
            boolean isLloviendoNormalMarco = Math.random() >= PROBABILIDAD_LLUVIA_NORMAL_MARCO;
            boolean isMonoEnBrazos = Math.random() >= PROBABILIDAD_MONO_EN_BRAZOS;
            boolean isMonoEscapa = Math.random() >= PROBABILIDAD_MONO_ESCAPA;

            double velocidadMarco = ((Math.random()
                    * (VELOCIDAD_PROMEDIA_DIARIO_MARCO_MAXIMO - VELOCIDAD_PROMEDIA_DIARIO_MARCO_MINIMO + 1))
                    + VELOCIDAD_PROMEDIA_DIARIO_MARCO_MINIMO)
                    * (isLloviendoFuerteMarco ? REDUCCION_VELOCIDAD_LLUVIA_FUERTE_MARCO : 1)
                    - (isLloviendoNormalMarco ? REDUCCION_VELOCIDAD_LLUVIA_NORMAL_MARCO : 0)
                    - (isMonoEnBrazos ? REDUCCION_VELOCIDAD_MONO_EN_BRAZOS : 0);

            double tiempoCaminadoMarco = ((Math.random()
                    * (TIEMPO_PROMEDIO_DIARIO_MARCO_MAXIMO - TIEMPO_PROMEDIO_DIARIO_MARCO_MINIMO + 1))
                    + TIEMPO_PROMEDIO_DIARIO_MARCO_MINIMO)
                    - (isMonoEscapa ? REDUCCION_TIEMPO_HORAS_MONO_ASCAPA : 0);

            double distanciaRecorridaMarco = velocidadMarco * tiempoCaminadoMarco;

            boolean isLloviendoFuerteMama = Math.random() >= PROBABILIDAD_LLUVIA_FUERTE_MAMA;
            boolean isLloviendoNormalMama = Math.random() >= PROBABILIDAD_LLUVIA_NORMAL_MAMA;

            double velocidadMama = ((Math.random()
                    * (VELOCIDAD_PROMEDIA_DIARIO_MAMA_MAXIMO - VELOCIDAD_PROMEDIA_DIARIO_MAMA_MINIMO + 1))
                    + VELOCIDAD_PROMEDIA_DIARIO_MAMA_MINIMO)
                    * (isLloviendoFuerteMama ? REDUCCION_VELOCIDAD_LLUVIA_FUERTE_MAMA : 1)
                    - (isLloviendoNormalMama ? REDUCCION_VELOCIDAD_LLUVIA_NORMAL_MAMA : 0);

            double tiempoCaminadoMama = ((Math.random()
                    * (TIEMPO_PROMEDIO_DIARIO_MAMA_MAXIMO - TIEMPO_PROMEDIO_DIARIO_MAMA_MINIMO + 1))
                    + TIEMPO_PROMEDIO_DIARIO_MAMA_MINIMO);

            double distanciaRecorridaMama = velocidadMama * tiempoCaminadoMama;

            distancia = distancia
                    - distanciaRecorridaMarco
                    - distanciaRecorridaMama;

            System.out.println("DÍA " + dia);

            if (isLloviendoFuerteMarco) {
                System.out.println(TEXTO_LLUEVE_FUERTE);
            } else if (isLloviendoNormalMarco) {
                System.out.println(TEXTO_LLUEVE_NORMAL);
            } else {
                System.out.println(TEXTO_DIA_CLARO);
            }

            System.out.println("Avancé "
                    + Math.round(tiempoCaminadoMarco * Math.pow(10, DECIMALES_A_REDODNDEAR))
                    / Math.pow(10, DECIMALES_A_REDODNDEAR)
                    + " horas a "
                    + Math.round(velocidadMarco * Math.pow(10, DECIMALES_A_REDODNDEAR))
                    / Math.pow(10, DECIMALES_A_REDODNDEAR)
                    + " km/h recorriendo "
                    + Math.round(distanciaRecorridaMarco * Math.pow(10, DECIMALES_A_REDODNDEAR))
                    / Math.pow(10, DECIMALES_A_REDODNDEAR)
                    + "km.");

            System.out.println("Mi madre avanzó "
                    + Math.round(tiempoCaminadoMama * Math.pow(10, DECIMALES_A_REDODNDEAR))
                    / Math.pow(10, DECIMALES_A_REDODNDEAR)
                    + " horas a "
                    + Math.round(velocidadMama * Math.pow(10, DECIMALES_A_REDODNDEAR))
                    / Math.pow(10, DECIMALES_A_REDODNDEAR)
                    + " km/h recorriendo "
                    + Math.round(distanciaRecorridaMama * Math.pow(10, DECIMALES_A_REDODNDEAR))
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
