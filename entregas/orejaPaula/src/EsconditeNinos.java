import java.util.Scanner;

class EsconditeNinos {

    public static void main(String[] args) {
        String mensaje = "";

        int posicionNino1 = 0;
        int posicionNino2 = 0;
        int posicionNino3 = 0;

        final double PROBABILIDAD_DE_QUE_SE_ESCONDA = 0.1;
        final int NUMERO_ESCONDITES = 6;
        boolean esconditeValido;
        posicionNino1 = esconderse(NUMERO_ESCONDITES);
        do {
            posicionNino2 = esconderse(NUMERO_ESCONDITES);
            esconditeValido = posicionNino1 != posicionNino2;
        } while (!esconditeValido);
        do {
            posicionNino3 = esconderse(NUMERO_ESCONDITES);
            esconditeValido = posicionNino1 != posicionNino3 && posicionNino2 != posicionNino3;
        } while (!esconditeValido);

        boolean encuentraATodos;
        boolean nino1Encontrado = false;
        boolean nino2Encontrado = false;
        boolean nino3Encontrado = false;

        int intento = 0;
        int MAXIMO_DE_INTENTOS = 12;
        boolean pierdePorIntentos;
        imprimirPreJuego();
        do {
            if (sePoneAlgunoNervioso()) {
                imprimePosicionNino(posicionNino1, posicionNino2, posicionNino3);
            }
            int buscaEn;
            buscaEn = buscar(NUMERO_ESCONDITES);
            imprimirDondeHaBuscado(buscaEn);
            intento++;
            if (buscaEn == posicionNino1 && !nino1Encontrado) {
                if (!ocultarse(PROBABILIDAD_DE_QUE_SE_ESCONDA)) { // Cambio aquí
                    nino1Encontrado = true;
                    mensaje += "Nino 1 encontrado";
                }
            }
            if (buscaEn == posicionNino2 && !nino2Encontrado) {
                if (!ocultarse(PROBABILIDAD_DE_QUE_SE_ESCONDA)) { // Cambio aquí
                    nino2Encontrado = true;
                    mensaje += "Nino 2 encontrado";
                }
            }
            if (buscaEn == posicionNino3 && !nino3Encontrado) { // Cambio aquí (se quitó el operador || para que sea correcto)
                if (!ocultarse(PROBABILIDAD_DE_QUE_SE_ESCONDA)) { // Cambio aquí
                    nino3Encontrado = true;
                    mensaje += "Nino 3 encontrado";
                }
            }
            System.out.println(mensaje);
            encuentraATodos
                    = nino1Encontrado
                    && nino2Encontrado
                    && nino3Encontrado;
            pierdePorIntentos = intento >= MAXIMO_DE_INTENTOS;

            if (intento == 7) {
               if (quierenMoverse() && !nino1Encontrado) posicionNino1 = cambiaSitio(posicionNino1);
               if (quierenMoverse() && !nino2Encontrado) posicionNino2 = cambiaSitio(posicionNino2);
               if (quierenMoverse() && !nino3Encontrado) posicionNino3 = cambiaSitio(posicionNino3);
            }
        } while (!encuentraATodos && !pierdePorIntentos);
        mensaje = "Ganaste";
        if (pierdePorIntentos) {
            mensaje = "Muchos intentos fallidos :c";
        }
        System.out.println(mensaje);

    }

    private static int esconderse(int numeroEscondites) {
        final int NUMERO_MINIMO = 1;
        return (int) ((Math.random() * numeroEscondites - NUMERO_MINIMO + 1) + NUMERO_MINIMO);
    }

    private static int buscar(int numeroEscondites) {
        int respuestaUsuario;
        final int VALOR_MAXIMO = numeroEscondites;
        final int VALOR_MINIMO = 1;

        do {
            respuestaUsuario = preguntarUsuario();
        } while (respuestaUsuario < VALOR_MINIMO || respuestaUsuario > VALOR_MAXIMO);

        return respuestaUsuario;
    }

    private static int preguntarUsuario() {
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.print("¿Dónde quieres buscar? ");
        return entradaUsuario.nextInt();
    }

    private static boolean ocultarse(double probabilidadDeQueSeOculte) {
        return Math.random() <= probabilidadDeQueSeOculte;
    }

    private static void imprimirPreJuego() {
        System.out.println("¡Los ninos se han escondido!");
        System.out.println("1-Arbol 2-Banco 3-Arbusto 4-Columpio 5-Caseta 6-Tobogan");
    }

    private static void imprimirDondeHaBuscado(int buscaEn) {
        String mensaje = "";
        if (buscaEn == 1) {
            mensaje = "Arbol";
        } else if (buscaEn == 2) {
            mensaje = "Banco";
        } else if (buscaEn == 3) {
            mensaje = "Arbusto";
        } else if (buscaEn == 4) {
            mensaje = "Columpio";
        } else if (buscaEn == 5) {
            mensaje = "Caseta";
        } else if (buscaEn == 6) {
            mensaje = "Tobogan";
        }
        System.out.println("Has mirado en " + mensaje);
    }

    private static boolean sePoneAlgunoNervioso() {
        double PROBABILIDAD_SE_PONE_NERVIOSO = 0.05;
        return Math.random() <= PROBABILIDAD_SE_PONE_NERVIOSO;
    }

    private static void imprimePosicionNino(
            int posicionNino1,
            int posicionNino2,
            int posicionNino3) {
        String mensaje = "";
        int ninoElegido = elegirNino();
        if (ninoElegido == 1) {
            mensaje = "" + posicionNino1;
        }
        if (ninoElegido == 2) {
            mensaje = "" + posicionNino2;
        }
        if (ninoElegido == 3) {
            mensaje = "" + posicionNino3;
        }
        System.out.println("Silencio! El nino " + ninoElegido + " esta en el escondite " + mensaje);
    }

    private static int elegirNino() {
        int NINOS_MAXIMOS = 3;
        int NINOS_MINIMOS = 1;
        return (int) ((Math.random() * NINOS_MAXIMOS - NINOS_MINIMOS + 1) + NINOS_MINIMOS);
    }

    private static int cambiaSitio(int posicionNino) {
        return esconderse(posicionNino);
    }

    private static boolean quierenMoverse() {
        double probabilidadDeQueQuieranMoverse = 0.3;
        return Math.random() <= probabilidadDeQueQuieranMoverse;
    }
}

