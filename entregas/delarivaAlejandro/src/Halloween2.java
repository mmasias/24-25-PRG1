public class Halloween2 {
    public static void main(String args[]) {
        int caramelos_ana = 0;
        int caramelos_bruno = 0;
        int caramelos_carmen = 0;

        boolean bolsa_ana = false;
        boolean bolsa_bruno = false;
        boolean bolsa_carmen = false;

        int edificio = 1;
        int casasVisitadas = 0;
        int totalCaramelosEdificios = 0;
        int totalCasasConCaramelos = 0;
        int totalCaramelosGenerosos = 0;
        int pisoConMasCaramelos = 0;
        int maxCaramelosEnPiso = 0;
        double promedioPorEdificio;

        int maximoCaramelosAna = 15;
        int maximoCaramelosBruno = 25;
        int maximoCaramelosCarmen = 20;

        while (edificio <= 10) {
            System.out.println("\n=== Edificio " + edificio + " ===");
            int piso = 1;
            int totalCaramelosEnEdificio = 0;
            int casasGenerosas = 0;

            while (piso <= 5) {
                System.out.println("\n=== Piso " + piso + " ===");
                int casa = 1;
                while (casa <= 4) {
                    casasVisitadas++;
                    System.out.println("\nVisito la casa " + casa + " del piso " + piso);

                    double suerte = Math.random() * 100 + 1;
                    if ((int) suerte <= 70) {
                        System.out.println("¡La casa está abierta!");
                        totalCaramelosEnEdificio++;

                        if (!bolsa_ana) {
                            if (Math.random() * 100 < 60) {
                                int caramelos = (int) (Math.random() * 2 + 1);
                                caramelos_ana += caramelos;
                                System.out.println("Ana recibió " + caramelos + " caramelos");

                                if (caramelos_ana >= maximoCaramelosAna) {
                                    bolsa_ana = true;
                                    caramelos_ana = maximoCaramelosAna;
                                    System.out.println("La bolsa de Ana está llena.");
                                }
                            }
                        }

                        if (!bolsa_bruno) {
                            if (Math.random() * 100 < 90) {
                                int caramelos = (int) (Math.random() * 3 + 2);
                                caramelos_bruno += caramelos;
                                System.out.println("Bruno recibió " + caramelos + " caramelos");

                                if (caramelos_bruno >= maximoCaramelosBruno) {
                                    bolsa_bruno = true;
                                    caramelos_bruno = maximoCaramelosBruno;
                                    System.out.println("La bolsa de Bruno está llena.");
                                }
                            }
                        }

                        if (!bolsa_carmen) {
                            if (Math.random() * 100 < 80) {
                                int caramelos = (int) (Math.random() * 2 + 1);
                                caramelos_carmen += caramelos;
                                System.out.println("Carmen recibió " + caramelos + " caramelos");

                                if (piso == 4 || piso == 5) {
                                    caramelos_carmen++;
                                    System.out.println("Carmen recibió un caramelo extra por el piso " + piso);
                                }

                                if (caramelos_carmen >= maximoCaramelosCarmen) {
                                    bolsa_carmen = true;
                                    caramelos_carmen = maximoCaramelosCarmen;
                                    System.out.println("La bolsa de Carmen está llena.");
                                }
                            }
                        }
                        
                    } else {
                        System.out.println("Casa cerrada, seguimos adelante.");
                    }

                    casa++;
                }

                if (totalCaramelosEnEdificio > maxCaramelosEnPiso) {
                    maxCaramelosEnPiso = totalCaramelosEnEdificio;
                    pisoConMasCaramelos = piso;
                }

                piso++;
            }

            totalCaramelosEdificios += caramelos_ana + caramelos_bruno + caramelos_carmen;

            if (totalCaramelosEnEdificio > 0) {
                casasGenerosas++;
            }

            promedioPorEdificio = (double) totalCaramelosEdificios / edificio;

            System.out.println("\n=== Resultados del Edificio " + edificio + " ===");
            System.out.println("Casas visitadas: " + casasVisitadas);
            System.out.println("Ana: " + caramelos_ana + " caramelos" + (bolsa_ana ? " (Bolsa llena)" : ""));
            System.out.println("Bruno: " + caramelos_bruno + " caramelos" + (bolsa_bruno ? " (Bolsa llena)" : ""));
            System.out.println("Carmen: " + caramelos_carmen + " caramelos" + (bolsa_carmen ? " (Bolsa llena)" : ""));
            System.out.println("Promedio de caramelos por edificio: " + promedioPorEdificio);
            System.out.println("Edificio más generoso: " + totalCaramelosEnEdificio);
            System.out.println("Piso que más caramelos dio: " + pisoConMasCaramelos);
            System.out.println("Porcentaje de casas que dieron caramelos: " + ((double) casasGenerosas / 4 * 100) + "%");

            edificio++;
        }

        System.out.println("\n=== Resultados Finales ===");
        System.out.println("Total de caramelos de Ana: " + caramelos_ana);
        System.out.println("Total de caramelos de Bruno: " + caramelos_bruno);
        System.out.println("Total de caramelos de Carmen: " + caramelos_carmen);
    }
}
