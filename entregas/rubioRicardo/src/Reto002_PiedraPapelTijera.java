import java.util.Scanner;

class PiedraPapelTijera {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       final int MINIMO = 1;
       final int MAXIMO = 3; 
       
       final int PIEDRA = 1;
       final int PAPEL = 2;
       final int TIJERA = 3;
       
        
        System.out.println("Elige: 1= Piedra, 2= Papel, 3= Tijera:");
        int eleccionDelUsuario = scanner.nextInt();
        
        
        int aleatorio = (int) (Math.random() *  (MAXIMO - MINIMO ) + MINIMO);
        
        
        String resultado = (eleccionDelUsuario == aleatorio) ? "Empate!" :
                           (eleccionDelUsuario == PIEDRA && aleatorio == TIJERA) ? "Ganaste!" :
                           (eleccionDelUsuario == PAPEL && aleatorio == PIEDRA) ? "Ganaste!" :
                           (eleccionDelUsuario == TIJERA && aleatorio == PAPEL) ? "Ganaste!" :
                           "Perdiste!";

        
        String eleccionUsuarioEnString = eleccionDelUsuario == PIEDRA ? "Piedra"
                           : eleccionDelUsuario == PAPEL ? "Papel"
                           : "Tijeras";
           
        String eleccionAleatoriaMaquinaEnString = (aleatorio == PIEDRA) ? "Piedra"
                           : (aleatorio == PAPEL) ? "Papel"
                           : "Tijeras";
           
        System.out.println("Tu eleccion es: " + eleccionUsuarioEnString);
        System.out.println("La eleccion de la maquina es: " + eleccionAleatoriaMaquinaEnString);
        System.out.println(resultado);
           
        scanner.close();
    }
}