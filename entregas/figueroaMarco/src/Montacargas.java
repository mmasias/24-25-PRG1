class Montacargas {
    public static void main(String[] args) {
        situarMontacargas();
    }

    public static void situarMontacargas(){
        final int PLANTA_MAXIMA = 9;
        int plantaMontacargas = 0;
        int pisoActual = 9;
        final int PLANTA_INICIAL_MONTACARGAS = 0;
       
       
        int plantaAImprimir = 9;
        String stringAImprimir = "";
        
        for (pisoActual = PLANTA_INICIAL_MONTACARGAS; pisoActual < PLANTA_MAXIMA; pisoActual++ ) {
            stringAImprimir = imprimirPlanta(plantaAImprimir, plantaMontacargas, pisoActual, PLANTA_INICIAL_MONTACARGAS);
            System.out.println(stringAImprimir);
        }
    }
    public static String imprimirPlanta(int plantaAImprimir, int plantaMontacargas,int pisoActual, int PLANTA_INICIAL_MONTACARGAS){
        String stringAImprimir = "";
        String pisoVacio = " |   |";
        String montacargaDetenido = "[ --- ]";
        String montacargaEnPiso = "[" + pisoActual + "]";
        String piso = "";
        if(plantaAImprimir != plantaMontacargas){
            piso = pisoVacio;
            stringAImprimir = pisoActual + " " + piso + " ";
        } else if (plantaAImprimir == plantaMontacargas && plantaAImprimir == PLANTA_INICIAL_MONTACARGAS) {
            piso = montacargaDetenido;
            stringAImprimir = pisoActual + " " + piso + " ";
        } else if (plantaAImprimir == plantaMontacargas) {
            piso = montacargaEnPiso;
            stringAImprimir = pisoActual + " " + piso + " ";
        }
        return stringAImprimir;
    }
    
}


