import java.util.Scanner;
class CarreraCarros {
    public static void main(String[] args) {
        final int MAXIMO = 5;
        final int MINIMO = 1;
        final int FINAL = 30;
        final String PISTA = "_";
        final String CARRO = "o--o/";

        int posicionPrimero = 0, posicionSegundo = 0, posicionTercero = 0;
        int turno = 0;
        boolean enCarrera = true;



        Scanner entrada = new Scanner(System.in);

        while (enCarrera) {
            turno++;
            int[] posiciones = {posicionPrimero, posicionSegundo, posicionTercero};

        
            for (int i = 0; i < posiciones.length; i++) {
                int avance = (int) (Math.random() * (MAXIMO - MINIMO + 1)) + MINIMO;
                posiciones[i] += avance;
            }

     
            posicionPrimero = posiciones[0];
            posicionSegundo = posiciones[1];
            posicionTercero = posiciones[2];

        
            System.out.println(repetir("===", FINAL + 1));
            System.out.println("Turno: " + turno);
            System.out.println(repetir(PISTA, posicionPrimero) + CARRO);
            System.out.println(repetir(PISTA, posicionSegundo) + CARRO);
            System.out.println(repetir(PISTA, posicionTercero) + CARRO);


            enCarrera = posicionPrimero < FINAL && posicionSegundo < FINAL && posicionTercero < FINAL;

            
            entrada.nextLine();
        }

      
        String ganador = (posicionPrimero >= FINAL) ? "Primero" :
                         (posicionSegundo >= FINAL) ? "Segundo" : "Tercero";

        System.out.println("¡Ha ganado el " + ganador + " competidor!");
        entrada.close();
    }

  
    public static String repetir(String str, int veces) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            resultado.append(str);
        }
        return resultado.toString();
    }
}