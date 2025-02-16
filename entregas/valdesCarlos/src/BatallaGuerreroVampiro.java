import java.util.Scanner;

public class BatallaGuerreroVampiro {
    public static void main(String[] args) {
        // Inicialización de las variables de la batalla
        int poderGuerrero = 20;   // HP del guerrero
        int poderVampiro = 10;    // HP del vampiro
        int ataqueGuerrero = 2;   // Daño del guerrero
        int ataqueVampiro = 4;    // Daño del vampiro
        double probabilidadExito = 0.5; // Probabilidad de acierto para ambos

        // Variable para controlar el estado de la batalla
        boolean batallaEnCurso = true;
        int turno = 1; // Contador de turnos para mostrar el avance de la batalla

        System.out.println("¡Comienza la batalla entre el Guerrero y el Vampiro!");

        // Ciclo de la batalla mientras la batalla esté en curso
        while (batallaEnCurso) {
            System.out.println("Turno " + turno);

            // Turno del guerrero
            if (Math.random() < probabilidadExito) {
                poderVampiro -= ataqueGuerrero;
                System.out.println("El Guerrero ataca con su hacha y causa " + ataqueGuerrero + " puntos de daño al Vampiro.");
            } else {
                System.out.println("El Guerrero falla su ataque.");
            }

            // Verifica si el vampiro ha sido derrotado
            if (poderVampiro <= 0) {
                System.out.println("¡El Vampiro ha sido derrotado! El Guerrero gana la batalla.");
                batallaEnCurso = false; // Termina la batalla
            } else {
                // Turno del vampiro
                if (Math.random() < probabilidadExito) {
                    poderGuerrero -= ataqueVampiro;
                    System.out.println("El Vampiro muerde al Guerrero y causa " + ataqueVampiro + " puntos de daño.");
                } else {
                    System.out.println("El Vampiro falla su ataque.");
                }

                // Verifica si el guerrero ha sido derrotado
                if (poderGuerrero <= 0) {
                    System.out.println("¡El Guerrero ha sido derrotado! El Vampiro gana la batalla.");
                    batallaEnCurso = false; // Termina la batalla
                }
            }

            // Mostrar los puntos de vida restantes si la batalla continúa
            if (batallaEnCurso) {
                System.out.println("Vida restante - Guerrero: " + poderGuerrero + " HP, Vampiro: " + poderVampiro + " HP\n");
                turno++; // Avanzar al siguiente turno
            }
        }

        System.out.println("La batalla ha terminado.");
    }
}
