public class caracol {
    
    public static void main(String[] args) {
        final String POZO_PARED = " ##:. :. :. :. :. :. ##";
        final String POZO_AGUA = " ##------------------##";
        final String POZO_CARACOL = " ##      _@_/'       ##";
        final String POZO_BASE = " ##__________________##";
        final int PROFUNDIDAD_POZO = 20;
        final int PROFUNDIDAD_MAX = 20;
        final int PROFUNDIDAD_MIN = 10;
        
        int nivelAgua = 5;
        int posicionCaracol = (int) (Math.random() * (PROFUNDIDAD_MAX - PROFUNDIDAD_MIN) + PROFUNDIDAD_MIN);
        double probabilidad;
        probabilidad = (double) (Math.random() * (0.98)) +0.01;    
        int dia = 0;

        do { 
         for (int i=0;i<PROFUNDIDAD_POZO;i++) {
            if(i == posicionCaracol){
                System.out.println(POZO_CARACOL);
            } else if (i > (PROFUNDIDAD_POZO - nivelAgua)) {
                System.out.println(POZO_AGUA);
            } else {
                System.out.println(POZO_PARED);
            }   
            posicionCaracol--;
            dia++;
        }
        System.out.println(POZO_BASE);
        } while (posicionCaracol >0);
    }
}
