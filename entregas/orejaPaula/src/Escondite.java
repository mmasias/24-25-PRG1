import java.util.Scanner;
import java.util.Random;

class Escondite {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int LUGARES_ESCONDITES = 6;
        final int INTENTOS_MAXIMOS = 12;
        final int NUMERO_NINOS_ESCONDIDOS = 3;

        final int ARBOL = 1;
        final int BANCO = 2;
        final int ARBUSTO = 3;
        final int COLUMPIO = 4;
        final int CASETA = 5;
        final int TOBOGAN = 6;

        Random random = new Random();
        int[] ninosEscondidos = new int[NUMERO_NINOS_ESCONDIDOS];
        for (int i = 0; i < NUMERO_NINOS_ESCONDIDOS; i++) {
            int nuevoLugar;
            do {
                nuevoLugar = random.nextInt(LUGARES_ESCONDITES) + 1;
            } while (contiene(ninosEscondidos, nuevoLugar));
            ninosEscondidos[i] = nuevoLugar;
        }

        int intentos = 0;
        int encontrados = 0;

        System.out.println("¡Comienza el juego del escondite!");
        System.out.println("Hay tres ninos escondidos en el parque.");
        System.out.println("Tienes un maximo de " + INTENTOS_MAXIMOS + " intentos para encontrarlos.");

        while (intentos < INTENTOS_MAXIMOS && encontrados < NUMERO_NINOS_ESCONDIDOS) {
           
            if (intentos % 2 == 0 && random.nextDouble() < 0.05) {
               
                int indiceRuido = random.nextInt(NUMERO_NINOS_ESCONDIDOS);
                System.out.println("\n¡Escuchas un ruido cerca del lugar " + ninosEscondidos[indiceRuido] + "!");
            }

            if (intentos == 6) { 
                System.out.println("\nEs el turno 7, los niños podrían cambiar de ubicacion...");
                if (random.nextDouble() < 0.3) { 
                    System.out.println("¡Los ninos han cambiado de lugar sigilosamente!");
                    for (int i = 0; i < NUMERO_NINOS_ESCONDIDOS; i++) {
                        int nuevoLugar;
                        do {
                            nuevoLugar = random.nextInt(LUGARES_ESCONDITES) + 1;
                        } while (contiene(ninosEscondidos, nuevoLugar));
                        ninosEscondidos[i] = nuevoLugar;
                    }
                } else {
                    System.out.println("Los ninos decidieron quedarse en sus lugares.");
                }
            }

            System.out.println("\n¿Donde quieres buscar?");
            System.out.println("1. Arbol");
            System.out.println("2. Banco");
            System.out.println("3. Arbusto");
            System.out.println("4. Columpio");
            System.out.println("5. Caseta");
            System.out.println("6. Tobogan");

            System.out.print("Elige un lugar (1-6): ");
            int eleccion = entrada.nextInt();

            if (eleccion < 1 || eleccion > LUGARES_ESCONDITES) {
                System.out.println("Opcion no valida. Por favor, elige un numero entre 1 y 6.");
                continue;
            }

            intentos++;

            if (contiene(ninosEscondidos, eleccion)) {
                if (random.nextDouble() > 0.1) {
                    System.out.println("¡Has encontrado a un nino!");
                    encontrados++;
                    ninosEscondidos = eliminarSinBreak(ninosEscondidos, eleccion);
                } else {
                    System.out.println("¡Oh no! Parece que el nino se ha escondido mejor.");
                }
            } else {
                System.out.println("No hay nadie aqui.");
            }

            System.out.println("Llevas " + intentos + " intentos y has encontrado " + encontrados + " ninos.");
        }

        if (encontrados == NUMERO_NINOS_ESCONDIDOS) {
            System.out.println("\n¡Felicidades! Has encontrado a los tres ninos.");
        } else {
            System.out.println("\nSe han acabado los intentos. ¡Mejor suerte la proxima vez!");
        }

        entrada.close();
    }

    public static boolean contiene(int[] arreglo, int valor) {
        for (int elemento : arreglo) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }

    public static int[] eliminarSinBreak(int[] arreglo, int valor) {
        int[] nuevoArreglo = new int[arreglo.length];
        int index = 0;
        for (int elemento : arreglo) {
            if (elemento != valor) {
                nuevoArreglo[index++] = elemento;
            }
        }
        return nuevoArreglo;
    }
}
