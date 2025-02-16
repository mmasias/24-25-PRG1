
class Marco {

        public static void main(String[] args) {

                final double VELOCIDAD_MEDIA_MINIMA_DIARIA_DE_MARCO = 10,
                                VELOCIDAD_MEDIA__MAXIMA_DIARIO_DE_MARCO = 15;

                final double TIEMPO_PROMEDIO_DIARIO_MINIMO_DE_MARCO = 8,
                                TIEMPO_PROMEDIO_DIARIO_MAXIMO_DE_MARCO = 10;

                final double PROBABILIDAD_LLUVIA_FUERTE_A_MARCO = 0.1,
                                PROBABILIDAD_LLUVIA_NORMAL_A_MARCO = 0.4;

                final double REDUCCION_DE_VELOCIDAD_POR_LLUVIA_FUERTE_A_MARCO = 0.25,
                                REDUCCION_DE_VELOCIDAD_POR_LLUVIA_NORMAL_A_MARCO = 0.75;

                final double PROBABILIDAD_MONO_SE_CANSA = 0.25,
                                PROBABILIDAD_MONO_ESCAPA = 0.15;

                final double REDUCCION_DE_VELOCIDAD_MONO_SE_CANSA = 0.9,
                                REDUCCION_DE_TIEMPO_HORAS_MONO_ESCAPA = 2;

                final double VELOCIDAD_MEDIA_MINIMA_DIARIA_DE_MADRE = 6,
                                VELOCIDAD_MEDIA__MAXIMA_DIARIO_DE_MADRE = 9;

                final double TIEMPO_PROMEDIO_DIARIO_MINIMO_DE_MADRE = 6,
                                TIEMPO_PROMEDIO_DIARIO_MAXIMO_DE_MADRE = 9;

                final double PROBABILIDAD_LLUVIA_FUERTE_A_MADRE = 0.1,
                                PROBABILIDAD_LLUVIA_NORMAL_A_MADRE = 0.4;

                final double REDUCCION_DE_VELOCIDAD_POR_LLUVIA_FUERTE_A_MADRE = 0.75,
                                REDUCCION_DE_VELOCIDAD_POR_LLUVIA_NORMAL_A_MADRE = 0.5;

                final String TEXTO_LLUEVE_FUERTE_MARCO = "¡Ha llovido muchísimo!",
                                TEXTO_LLUEVE_NORMAL_MARCO = "Ha llovido un poco hoy. :s",
                                TEXTO_DIA_CLARO_MARCO = "¡Hoy ha hecho buenisimo!";

                final String TEXTO_LLUEVE_FUERTE_MADRE = "¡Le ha llovido muchísimo a mi madre!",
                                TEXTO_LLUEVE_NORMAL_MADRE = "Le ha llovido un poco a mi madre.",
                                TEXTO_DIA_CLARO_MADRE = "¡Le ha hecho bueno a mi madre!";

                double distancia = 350;
                int dia = 1;

                System.out.println("DIARIO DEL VIAJE DE MARCO");
                System.out.println("=========================");

                boolean seEncuentran = distancia >= 0;

                do {

                        double probabilidadDeLaLluviaAMarco = Math.random();
                        boolean LluveFuerteMarco = probabilidadDeLaLluviaAMarco >= PROBABILIDAD_LLUVIA_FUERTE_A_MARCO,
                                        LluveNormalMarco = probabilidadDeLaLluviaAMarco >= PROBABILIDAD_LLUVIA_NORMAL_A_MARCO;

                        boolean MonoEnBrazos = Math.random() >= PROBABILIDAD_MONO_SE_CANSA;

                        double velocidadMarco = Math.random()
                                        * (VELOCIDAD_MEDIA__MAXIMA_DIARIO_DE_MARCO
                                                        - VELOCIDAD_MEDIA_MINIMA_DIARIA_DE_MARCO)
                                        + VELOCIDAD_MEDIA_MINIMA_DIARIA_DE_MARCO
                                                        * (LluveFuerteMarco
                                                                        ? REDUCCION_DE_VELOCIDAD_POR_LLUVIA_FUERTE_A_MARCO
                                                                        : 1)
                                                        * (LluveNormalMarco
                                                                        ? REDUCCION_DE_VELOCIDAD_POR_LLUVIA_NORMAL_A_MARCO
                                                                        : 1)
                                                        * (MonoEnBrazos ? REDUCCION_DE_VELOCIDAD_MONO_SE_CANSA : 1);

                        double tiempoCaminadoBaseDeMarco = Math.random()
                                        * (TIEMPO_PROMEDIO_DIARIO_MAXIMO_DE_MARCO
                                                        - TIEMPO_PROMEDIO_DIARIO_MINIMO_DE_MARCO)
                                        + TIEMPO_PROMEDIO_DIARIO_MINIMO_DE_MARCO;

                        boolean MonoEscapa = Math.random() >= PROBABILIDAD_MONO_ESCAPA;

                        double tiempoCaminado = tiempoCaminadoBaseDeMarco
                                        - (MonoEscapa ? REDUCCION_DE_TIEMPO_HORAS_MONO_ESCAPA : 0);

                        double distanciaRecorridaMarco = velocidadMarco * tiempoCaminado;

                        double probabilidadDeLaLluviaAMadre = Math.random();
                        boolean LluveFuerteMadre = probabilidadDeLaLluviaAMadre >= PROBABILIDAD_LLUVIA_FUERTE_A_MADRE,
                                        LluveNormalMadre = probabilidadDeLaLluviaAMadre >= PROBABILIDAD_LLUVIA_NORMAL_A_MADRE;

                        double velocidadMadre = Math.random()
                                        * (VELOCIDAD_MEDIA__MAXIMA_DIARIO_DE_MADRE
                                                        - VELOCIDAD_MEDIA_MINIMA_DIARIA_DE_MADRE)
                                        + VELOCIDAD_MEDIA_MINIMA_DIARIA_DE_MADRE
                                                        * (LluveFuerteMadre
                                                                        ? REDUCCION_DE_VELOCIDAD_POR_LLUVIA_FUERTE_A_MADRE
                                                                        : 1)
                                                        * (LluveNormalMadre
                                                                        ? REDUCCION_DE_VELOCIDAD_POR_LLUVIA_NORMAL_A_MADRE
                                                                        : 1);

                        double tiempoCaminadoBaseDeMadre = Math.random()
                                        * (TIEMPO_PROMEDIO_DIARIO_MAXIMO_DE_MADRE
                                                        - TIEMPO_PROMEDIO_DIARIO_MINIMO_DE_MADRE)
                                        + TIEMPO_PROMEDIO_DIARIO_MINIMO_DE_MADRE;

                        double distanciaRecorridaMadre = velocidadMadre * tiempoCaminadoBaseDeMadre;

                        distancia -= distanciaRecorridaMarco + distanciaRecorridaMadre;

                        if (distancia < 50) {
                                final double PROBABILIDAD_ENCONTRAR_ALGUIEN_VIO_MADRE = 0.5;

                                boolean marcoEncontroAAlguienQueVioASuMadre = Math.random() >= PROBABILIDAD_ENCONTRAR_ALGUIEN_VIO_MADRE;

                                if (marcoEncontroAAlguienQueVioASuMadre) {
                                        distancia -= 25;
                                }
                        }

                        System.out.println("DÍA " + dia);

                        System.out.println(
                                        LluveFuerteMarco
                                                        ? TEXTO_LLUEVE_FUERTE_MARCO
                                                        : LluveNormalMarco
                                                                        ? TEXTO_LLUEVE_NORMAL_MARCO
                                                                        : TEXTO_DIA_CLARO_MARCO);

                        System.out.println(
                                        LluveFuerteMadre
                                                        ? TEXTO_LLUEVE_FUERTE_MADRE
                                                        : LluveNormalMadre
                                                                        ? TEXTO_LLUEVE_NORMAL_MADRE
                                                                        : TEXTO_DIA_CLARO_MADRE);

                        System.out.println("Avancé " + ((double) (int) (tiempoCaminado * 100)) / 100 + " horas "
                                        + "a " + (((double) (int) velocidadMarco * 100) / 100) + " km/h "
                                        + "recorriendo " + ((double) (int) distanciaRecorridaMarco * 100 / 100)
                                        + "km.");

                        if (!seEncuentran) {
                                System.out.println("Ahora mi madre esta a " + (((double) (int) (distancia * 100)) / 100)
                                                + "km.");
                        } else {
                                System.out.println("¡ESTOY CON MI MADRE!");
                        }

                        System.out.println("------------------------");

                        dia++;

                } while (!seEncuentran);

        }
}
