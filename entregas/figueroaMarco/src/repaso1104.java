class repaso1104 {
    public static void main(String[] args) {
        
        final int PISOS_HABITACIONES = 7;
        final int ventanasPorPiso = 6;
        final double PROBABILIDAD_ABIERTA = 0.7;
        final double PROBABILIDAD_LUZ_ENCENDIDA = 0.6;
        
        double probabilidadVentana = 0.00;
        double probabilidadLuz = 0.00;

        for(int i=0;i<PISOS_HABITACIONES;i++){
            int ventanasAbiertas = 0;
            int ventanasCerradas = 0;
            int lucesEncendidas = 0;
            int lucesApagadas = 0;
            int ventanasProcesadas = 0;
         System.out.println("En el piso " + i + " hay:");
         do{
            ventanasProcesadas = ventanasProcesadas + 1;
            probabilidadVentana = Math.random();
            ventanasAbiertas = probabilidadVentana < PROBABILIDAD_ABIERTA ? ventanasAbiertas + 1 :ventanasAbiertas + 0;
            ventanasCerradas = probabilidadVentana < PROBABILIDAD_ABIERTA ? ventanasCerradas + 0 : ventanasCerradas + 1;
            probabilidadLuz = Math.random();
            lucesEncendidas = probabilidadLuz < PROBABILIDAD_LUZ_ENCENDIDA ? lucesEncendidas + 1 :lucesEncendidas + 0;
            lucesApagadas = probabilidadLuz < PROBABILIDAD_LUZ_ENCENDIDA ? lucesApagadas + 0 : lucesApagadas + 1; 
        } while (ventanasProcesadas < ventanasPorPiso);
        
        System.out.println("Hay " + ventanasAbiertas + " ventanas abiertas en el piso");
        System.out.println("Hay " + ventanasCerradas + " ventanas cerradas en el piso");
        System.out.println("Hay " + lucesEncendidas + " luces encendidas en el piso" );
        System.out.println("Hay " + lucesApagadas + " luces apagadas en el piso" );
        System.out.println("----------------------------------------");
        }
        
        

    }
}