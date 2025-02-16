// Escalas y acordes mayores.

import java.util.Scanner;

class RepasoExamenFinal {
    static String[] construirEscalaMayor(String[] notas, int indiceBase) {
        int[] patron = {2, 2, 1, 2, 2, 2, 1}; // TTSTTTS en semitonos
        String[] escala = new String[8];
        int indiceActual = indiceBase;

        for (int i = 0; i < escala.length; i++) {
            escala[i] = notas[indiceActual];
            if (i < patron.length) {
                indiceActual = (indiceActual + patron[i]) % notas.length;
            }
        }

        return escala;
    }

    // Método para construir el acorde mayor a partir de una escala mayor
    public static String[] construirAcordeMayor(String[] escala) {
        return new String[]{escala[0], escala[2], escala[4]};
    }    

    static void main(String[] args) {
        // Definir las notas de la escala cromática
        String[] notas = {"Do", "Do#", "Re", "Re#", "Mi", "Fa", "Fa#", "Sol", "Sol#", "La", "La#", "Si"};

        // Solicitar al usuario una nota base
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una la nota a trabajar: 1: Do, 2: Do#, 3: Re, 4: Re#, 5: Mi, ...");
        int eleccion = scanner.nextInt();

        // Validar la elección del usuario
        if (eleccion < 1 || eleccion > 12) {
            System.out.println("Elección inválida. Por favor, elija un número entre 1 y 12.");
            return;
        }

        int indiceBase = eleccion - 1;
        String notaBase = notas[indiceBase];
        System.out.println("Ha elegido la nota " + notaBase);

        // Construir escala mayor y acorde mayor
        String[] escalaMayor = construirEscalaMayor(notas, indiceBase);
        String[] acordeMayor = construirAcordeMayor(escalaMayor);

        // Mostrar resultados
        System.out.print("La escala de " + notaBase + " Mayor es: ");
        for (int i = 0; i < escalaMayor.length; i++) {
            System.out.print(escalaMayor[i]);
            if (i < escalaMayor.length - 1) {
                System.out.print(" / ");
            }
        }
        System.out.println();

        System.out.print("El acorde de " + notaBase + " Mayor está conformado por: ");
        for (int i = 0; i < acordeMayor.length; i++) {
            System.out.print(acordeMayor[i]);
            if (i < acordeMayor.length - 1) {
                System.out.print(" / ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
