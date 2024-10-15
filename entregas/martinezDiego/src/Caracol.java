package entregas.martinezDiego.Reto3;


public class Caracol {
    public static void main(String[] args) {
        
        final int PROFUNDIDAD = 20;
        final String POZO_TOPE = "#                #";
        final String POZO_PARED = "#:.:.:.:.:.:.:.:#";
        final String POZO_BASE = "##################";
        final String CARACOL = "    @)_/'           ";

        int profundidadCaracol = 13;




        
        System.out.println(POZO_TOPE);
        for(int i=0; i<= PROFUNDIDAD; i++){
        System.out.println(POZO_PARED +  i);
        }
        System.out.println(POZO_BASE);
       
    }
}