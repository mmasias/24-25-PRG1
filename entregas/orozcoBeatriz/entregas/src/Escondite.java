import java.util.Scanner;

public class Escondite {
    public static void main(String[] args) {
        final int NUMERO_DE_ESCONDITES = 6;
        final int NUMERO_MINIMO_ID_ESCONDITE = 1;
        final int OPORTUNIDADES_MAXIMAS_PARA_ENCONTRAR_A_LOS_ESCONDIDOS = 12;
        final double PROBABILIDAD_DE_CAMBIARSE_DE_SITIO = 0.3;
        final String ESCONDITE_ARBOL = "Árbol";
        final String ESCONDITE_BANCO = "Banco";
        final String ESCONDITE_ARBUSTO = "Arbusto";
        final String ESCONDITE_COLUMPIO = "Columpio";
        final String ESCONDITE_CASETA = "Caseta";
        final String ESCONDITE_TOBOGAN = "Tobogán";

        boolean todosLosNiñosEncontrados = false;
        int esconditeNiño1, esconditeNiño2, esconditeNiño3;
        int nuevoEscondite1, nuevoEscondite2, nuevoEscondite3;
        int numeroEsconditeUsuario;
        int oportunidades = 0, niñosEncontrados = 0;
        double probabilidadIntercambiar;
        boolean ocultarse;

        System.out.println("¡Bienvenido al juego del Escondite!");
        System.out.println("¡Los niños se han escondido!");

        esconditeNiño1 = (int) (Math.random() * (NUMERO_DE_ESCONDITES - NUMERO_MINIMO_ID_ESCONDITE + 1))
                + NUMERO_MINIMO_ID_ESCONDITE;
        do {
            esconditeNiño2 = (int) (Math.random() * NUMERO_DE_ESCONDITES) + NUMERO_MINIMO_ID_ESCONDITE;
        } while (esconditeNiño2 == esconditeNiño1);
        do {
            esconditeNiño3 = (int) (Math.random() * NUMERO_DE_ESCONDITES) + NUMERO_MINIMO_ID_ESCONDITE;
        } while (esconditeNiño3 == esconditeNiño1 || esconditeNiño3 == esconditeNiño2);

        do {
            oportunidades++;
            verificarRuido(oportunidades, niñosEncontrados, esconditeNiño1, esconditeNiño2, esconditeNiño3);
            ocultarse = ocultarse();
            if (oportunidades == 7) {
                probabilidadIntercambiar = Math.random();
                if (probabilidadIntercambiar < PROBABILIDAD_DE_CAMBIARSE_DE_SITIO) {
                    do {
                        nuevoEscondite1 = (int) (Math.random() * NUMERO_DE_ESCONDITES) + NUMERO_MINIMO_ID_ESCONDITE;
                        nuevoEscondite2 = (int) (Math.random() * NUMERO_DE_ESCONDITES) + NUMERO_MINIMO_ID_ESCONDITE;
                        nuevoEscondite3 = (int) (Math.random() * NUMERO_DE_ESCONDITES) + NUMERO_MINIMO_ID_ESCONDITE;
                    } while (nuevoEscondite1 == nuevoEscondite2 || nuevoEscondite1 == nuevoEscondite3 || nuevoEscondite2 == nuevoEscondite3);
                    esconditeNiño1 = nuevoEscondite1;
                    esconditeNiño2 = nuevoEscondite2;
                    esconditeNiño3 = nuevoEscondite3;
                }
            }
            System.out.println("1-" + ESCONDITE_ARBOL + " 2-" + ESCONDITE_BANCO + " 3-" + ESCONDITE_ARBUSTO + " 4-"
                    + ESCONDITE_COLUMPIO + " 5-" + ESCONDITE_CASETA + " 6-" + ESCONDITE_TOBOGAN);
            System.out.print("¿Dónde quieres buscar? (escribe el número asignado al escondite deseado): ");
            numeroEsconditeUsuario = pedirEscondite();
            if (numeroEsconditeUsuario > NUMERO_DE_ESCONDITES || numeroEsconditeUsuario < NUMERO_MINIMO_ID_ESCONDITE) {
                System.out.println(
                        "No es posible buscar en ese lugar. Ha introducido una id de escondite fuera del rango permitido. Inténtelo de nuevo");
            } else {
                esconditeRevisado(numeroEsconditeUsuario);
                if (ocultarse) {
                    System.out.println("No has encontrado a ninguno de los niños.");
                } else if (niñoEncontrado(esconditeNiño1, numeroEsconditeUsuario)) {
                    System.out.println("¡Has encontrado al niño 1!");
                    niñosEncontrados++;
                } else if (niñoEncontrado(esconditeNiño2, numeroEsconditeUsuario)) {
                    System.out.println("¡Has encontrado al niño 2!");
                    niñosEncontrados++;
                } else if (niñoEncontrado(esconditeNiño3, numeroEsconditeUsuario)) {
                    System.out.println("¡Has encontrado al niño 3!");
                    niñosEncontrados++;
                } else {
                    System.out.println("No has encontrado a ninguno de los niños");
                }
                intentosYNiñosEncontrados(oportunidades, niñosEncontrados);
            }

            if (niñosEncontrados == 3) {
                todosLosNiñosEncontrados = true;
            }

        } while (!todosLosNiñosEncontrados && oportunidades <= OPORTUNIDADES_MAXIMAS_PARA_ENCONTRAR_A_LOS_ESCONDIDOS);

    }

    private static int pedirEscondite() {
        Scanner scanner = new Scanner(System.in);
        int numeroEsconditeElegido = scanner.nextInt();
        return numeroEsconditeElegido;
    }

    private static void esconditeRevisado(int numeroEsconditeElegido) {
        if (numeroEsconditeElegido == 1) {
            System.out.print("Has mirado en el Árbol... ");
        } else if (numeroEsconditeElegido == 2) {
            System.out.print("Has mirado en el Banco... ");
        } else if (numeroEsconditeElegido == 3) {
            System.out.print("Has mirado en el Arbusto... ");
        } else if (numeroEsconditeElegido == 4) {
            System.out.print("Has mirado en el Columpio... ");
        } else if (numeroEsconditeElegido == 5) {
            System.out.print("Has mirado en la Caseta... ");
        } else if (numeroEsconditeElegido == 6) {
            System.out.print("Has mirado en el Tobogán... ");
        }
    }

    private static boolean niñoEncontrado(int esconditeNiño, int numeroEsconditeElegido) {
        boolean niñoEncontrado = false;
        if (esconditeNiño == numeroEsconditeElegido) {
            niñoEncontrado = true;
        }
        return niñoEncontrado;
    }

    private static boolean ocultarse() {
        final double PROBABILIDAD_ESCONDIDOS_DE_OCULTARSE = 0.1;
        boolean ocultarse;
        double probabilidadDeOcultarse = Math.random();
        if (probabilidadDeOcultarse < PROBABILIDAD_ESCONDIDOS_DE_OCULTARSE) {
            ocultarse = true;
        } else {
            ocultarse = false;
        }
        return ocultarse;
    }

    private static void intentosYNiñosEncontrados(int oportunidades, int niñosEncontrados) {
        String intentos = oportunidades == 1 ? "intento" : "intentos";
        String niños = niñosEncontrados == 1 ? "niño" : "niños";
        System.out.println("Llevas " + oportunidades + " " + intentos + " y has encontrado a " + niñosEncontrados + " "
                + niños + ".");
    }

    private static void verificarRuido(int oportunidades, int niñosEncontrados, int esconditeNiño1, int esconditeNiño2, int esconditeNiño3) {
        final double PROBABILIDAD_DE_RUIDO = 0.05;
        if (oportunidades % 2 == 0) {
            double probabilidadRuido = Math.random();
            if (probabilidadRuido < PROBABILIDAD_DE_RUIDO) {
                if (niñosEncontrados == 0) {
                    System.out.println("¡El niño 1 hizo ruido! Está escondido en el escondite número " + esconditeNiño1);
                } else if (niñosEncontrados == 1) {
                    System.out.println("¡El niño 2 hizo ruido! Está escondido en el escondite número " + esconditeNiño2);
                } else if (niñosEncontrados == 2) {
                    System.out.println("¡El niño 3 hizo ruido! Está escondido en el escondite número " + esconditeNiño3);
                }
            }
        }

    }
}