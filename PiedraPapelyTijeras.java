1
mport java.util.Scanner;

class PiedrasPapelyTijeras {
    public static void main(String[] args) {
        Sacnner scanner = new Scanner( System.in);

        final init MAXIMO =3;
        final init MINIMO =1;

        final init PAPEL = 1;
        final init TIJERA = 2;
        final init PIEDRA = 3;


        System.out.println("Debes de elegir: 1 para Papel, 2 para Tijera, 3 para Piedra");
        int elusuarioescogio = scanner.nextInt();

        int numeroAleatorio =(int) (Math.random() * (MAXIMO - MINIMO + 1)) + MINIMO;

        String resultado = (elusuarioescogio == numeroAleatorio) ? "¡Empate!" :
                           (elusuarioescogio ==  PAPEL && numeroAleatorio == PIEDRA)  ||
                           (elusuarioescogio ==  TIJERA && numeroAleatorio == PAPEL)  ||
                           (elusuarioescogio ==  PIEDRA && numeroAleatorio == TIJERA)  ? "¡Ganaste!" :
                           "¡Perdedor!";

        String elusuarioescogioEnString = elusuarioescogio == PIEDRA ? "Piedra" 
                            : elusuarioescogio == PAPEL ? "Papel" 
                            : "Tijera";
           
        String eleccionAleatoriaMaquinaEnString = (numeroAleatorio == PIEDRA) ? "Piedra" 
                            : (numeroAleatorio == PAPEL) ? "Papel" 
                            : "Tijera";




        System.out.println("Tu eleccion: " + elusuarioescogioEnString);
        System.out.println("Elección de la maquina:" + numeroAleatorioMaquinaEnString);
        System.out.println(resultado);

        entrada.close();

    }

}




                            
        
    


        

    






    
