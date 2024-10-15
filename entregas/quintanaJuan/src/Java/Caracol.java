package Java;

class Caracol {
    public static void main(String []args){

        final int PROFUNDIDAD = 20;

        final String POZO_TOPE = "##              ##";
        final String POZO_PARED = "[]:. :. :. :. :.[]";
        final String POZO_BASE = "##################";

        System.out.println(POZO_TOPE);

        for(int i=1;i<=PROFUNDIDAD; i++){
            System.out.println( POZO_PARED + i); 
        }

        System.out.println(POZO_BASE);




    }
}