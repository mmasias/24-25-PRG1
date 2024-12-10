import java.util.Scanner;
class EsconditeNiños{
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int niño1 = (int) (Math.random() * 6) + 1; 
        int niño2 = (int) (Math.random() * 6) + 1;
        int niño3 = (int) (Math.random() * 6) + 1;

        while (niño1 == niño2 || niño1 == niño3 || niño2 == niño3) {
            niño1 = (int) (Math.random() * 6) + 1;
            niño2 = (int) (Math.random() * 6) + 1;
            niño3 = (int) (Math.random() * 6) + 1;
        }

        int niñoBuscador = 0;

        int intentos = 0;
        int encontrados = 0;

        encontrados = jugarJuego(niño1, niño2, niño3, niñoBuscador, intentos, encontrados);

    }

    static int jugarJuego(int niño1, int niño2, int niño3, int niñoBuscador, int intentos, int encontrados){
        while (encontrados < 3) { 
            System.out.println("¿Dónde quieres buscar?");
            System.out.println("1-Árbol 2-Banco 3-Arbusto 4-Columpio 5-Caseta 6-Tobogan");

            int eleccion = (int) (Math.random() * 6) + 1;
            if (eleccion >= 1 && eleccion <= 6) {
                intentos++;
                if (eleccion == niño1 || eleccion == niño2 || eleccion == niño3) {
                    System.out.println("Has mirado en el lugar " + obtenerLugar(eleccion) + "... ¡Has encontrado un niño!");
                    encontrados++; 
                    if (eleccion == niño1) niño1 = 0; 
                    if (eleccion == niño2) niño2 = 0; 
                    if (eleccion == niño3) niño3 = 0; 
                } else {
                    System.out.println("Has mirado en el lugar " + obtenerLugar(eleccion) + "... ¡No hay nadie!");
                }

                System.out.println("Llevas " + intentos + " intentos y has encontrado " + encontrados + " niños.");
            }

        }
        return encontrados;
    }

    static String obtenerLugar(int eleccion){
        if (eleccion == 1) return "Árbol";
        if (eleccion == 2) return "Banco";
        if (eleccion == 3) return "Arbusto";
        if (eleccion == 4) return "Columpio";
        if (eleccion == 5) return "Caseta";
        return "Tobogan";
    }
    
    public static void mostrarResultado(int intentos, int encontrados) {
        System.out.println("¡Felicidades! Has encontrado a todos los niños en " + intentos + " intentos.");

    }    
}