import java.util.Scanner;

public class Wacamole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int agujeros = 16; 
        int aciertos = 0;  
        int turnos = 15;   

        System.out.println("¡Bienvenido al juego Whac-A-Mole!");
        System.out.println("Tienes " + turnos + " turnos para acertar.\n");

       
        for (int turno = 1; turno <= turnos; turno++) {
            
            int posicionMonigote = (int)(Math.random() * agujeros);

           
            System.out.println("Turno " + turno + ":");
            for (int i = 0; i < agujeros; i++) {
                if (i == posicionMonigote) {
                    System.out.print("('') ");
                } else {
                    System.out.print("(  ) ");
                }
                if ((i + 1) % 4 == 0) { 
                    System.out.println();
                }
            }

            
            int posicionGolpe = -1;
            do {
                System.out.print("\nElige el número de agujero para golpear (0 a 15): ");
                posicionGolpe = scanner.nextInt();
            } while (posicionGolpe < 0 || posicionGolpe >= agujeros);  

            
            if (posicionGolpe == posicionMonigote) {
                System.out.println("¡Acierto! Has golpeado al monigote.");
                aciertos++;
            } else {
                System.out.println("Fallaste. El monigote estaba en otro agujero.");
            }

            
            for (int i = 0; i < agujeros; i++) {
                if (i == posicionGolpe && i == posicionMonigote) {
                    System.out.print("[**] ");  
                } else if (i == posicionGolpe) {
                    System.out.print("[[]] ");  
                } else if (i == posicionMonigote) {
                    System.out.print("('') "); 
                } else {
                    System.out.print("(  ) ");  
                }

                if ((i + 1) % 4 == 0) { 
                    System.out.println();
                }
            }
            System.out.println();
        }

        System.out.println("\nEl juego ha terminado.");
        System.out.println("Aciertos totales: " + aciertos + " de " + turnos + " turnos.");
        scanner.close();
    }
}
