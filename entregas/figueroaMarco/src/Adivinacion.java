import java.util.Scanner;

class Adivinacion {
    public static void main(String[] args) {
        
        final int OPORTUNIDADES_ADIVINAR = 10;
        int cantidadTurnos = 0;
        String resultado = "";
        boolean vamoAJugar = true;
        int numeroAlmacenado = generarNumero();
        int cantidadDeCalientes = 0;
        do {
            cantidadTurnos++;
            
            int numeroUsuario = pedirNumero();
            resultado = numeroAlmacenado == numeroUsuario ? "Has adivinado" : "No has advinado";
            vamoAJugar = ((cantidadTurnos <= OPORTUNIDADES_ADIVINAR) && (numeroAlmacenado != numeroUsuario));
            System.out.println(resultado);
            if(vamoAJugar == true){
                String pista = "";
                pista = darPista(numeroAlmacenado, numeroUsuario);
                if(pista == "Estas caliente"){
                    cantidadDeCalientes++;
                }
                System.out.println(pista);
                if(cantidadDeCalientes >= 2){
                    numeroAlmacenado = hacerTrampa();
                }
            }

        } while (vamoAJugar);

    }

    private static int generarNumero() {
        final int NUMERO_MAXIMO = 100;
        final int NUMERO_MINIMO = 1;
        int numeroGenerado;
        numeroGenerado = (int) (Math.random() * (NUMERO_MAXIMO - NUMERO_MINIMO) - NUMERO_MINIMO);
        return numeroGenerado;
    }

    private static int pedirNumero() {
        System.out.println("Dime un numero entre 1 y 100");
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }

    private static String darPista(int numeroAlmacenado, int numeroUsuario) {
        final int PISTA_CALIENTE = 5;
        final int PISTA_TIBIA = 10;
        int diferencia = Math.abs(numeroAlmacenado - numeroUsuario);
        String textoPista = "";

        textoPista = diferencia <= PISTA_CALIENTE ? "Estas caliente" : diferencia <= PISTA_TIBIA ? "Estas tibio" : "Estas frio";

        return textoPista;

    }

    private static int hacerTrampa() {
        return generarNumero();
    }


    
}