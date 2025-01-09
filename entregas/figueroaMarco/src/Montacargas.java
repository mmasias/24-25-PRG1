import java.util.Scanner;

class Montacargas {
    public static void main(String[] args) {
        final int PLANTA_FINAL = 0;
        int plantaActual = 9;
        boolean montacargaDetenido = true;
        int pisoActualMontacargas = 0;
        int plantaIngresada = 0;
        printBuilding(plantaActual, PLANTA_FINAL, montacargaDetenido, pisoActualMontacargas);
        plantaIngresada = askForInput();
        for(int plantaActualViaje = 0;)

    }

    public static void printBuilding (int plantaActual, int plantaDestino, boolean montacargaDetenido, int pisoActualMontacargas) {
        final String PLANTA_VACIA = "|        |";
        for(plantaActual=9;plantaActual >= plantaDestino;plantaActual--){
            if(pisoActualMontacargas != plantaActual){
                System.out.println(plantaActual + "  " + PLANTA_VACIA + " ");
            } else {
                String aImprimir = printMontacargas(plantaActual, montacargaDetenido);
                System.out.println(plantaActual + "  " + aImprimir + " ");
            }
    }
    }

    public static String printMontacargas(int planta, boolean montacargaDetenido) {
        
        final String MONTACARGA_DETENIDO = " [ --- ] ";
        String montacargaEnPiso = "[^ " + planta + "^]";
        String aImprimir = "";
        if(montacargaDetenido == true){
            aImprimir = MONTACARGA_DETENIDO;
        } else {
            aImprimir = montacargaEnPiso;
        }
        return(aImprimir);
    }

    public static int askForInput(){
        Scanner inputInt = new Scanner(System.in);
        System.out.println("Ingresa la planta a la que te quieres trasladar");
        int savingInput = 0;
        savingInput = inputInt.nextInt();
        inputInt.close();
        return savingInput;
    }
}

