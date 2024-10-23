import java.util.Scanner;

class carreraCamello {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int posicionPrimero = 0;
        int posicionSegundo = 0;

        final String CAMELLO = ",--,^"; 
        final String PISTA = ".. ..";

        final int MAXIMO = 4;
        final int MINIMO = 1;
        final int FINAL = 20;

        boolean enCarrera = true; 
        int turno = 0;
        int avance = 0;

        while (enCarrera){
            turno++;

            avance = (int) (Math.random() * (MAXIMO - MINIMO + 1)) + MINIMO;
            posicionPrimero = posicionPrimero + avance;
            
            avance = (int) (Math.random() * (MAXIMO - MINIMO + 1)) + MINIMO;
            posicionSegundo = posicionSegundo + avance;

            System.out.println(repetirCadena("===", 20));  
            System.out.println("Turno: " + turno);
            System.out.println(repetirCadena(PISTA, posicionPrimero) + CAMELLO);  
            System.out.println(repetirCadena(PISTA, posicionSegundo) + CAMELLO); 
            
            enCarrera = posicionPrimero < FINAL && posicionSegundo < FINAL;
            entrada.nextLine(); 
        }

        System.out.println("Ha ganado el " + (posicionPrimero > posicionSegundo ? "primero" : "segundo" ));
        entrada.close();
    }

    public static String repetirCadena(String cadena, int veces) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            resultado.append(cadena);
        }
        return resultado.toString();
    }
}
