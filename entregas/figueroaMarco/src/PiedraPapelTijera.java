import java.util.Scanner;
public class PiedraPapelTijera {
    public static void main(String[] args) {
        
        System.out.println("Juega piedra papel o tijera");
        System.out.println("Como jugar? Ingresa T para Tijera, P para Piedra y Pa para Papel");
        Scanner ScannerInput = new Scanner(System.in);
        
        final String Tijera = "T";
        final String Piedra = "P";
        final String Papel = "Pa";
        int numeroOrdernador;
        String comparador;
        String inputUsuario;
        String resultado;
        
        numeroOrdernador = (int) (Math.random() * (3) + 1);
        comparador = numeroOrdernador == 1 ? Tijera : numeroOrdernador == 2 ?  Piedra : numeroOrdernador == 3 
        ? Papel : "Numero no establecido";
        inputUsuario = ScannerInput.nextString();
        resultado = comparador == inputUsuario ? "Empataron" : (inputUsuario == "T" && comparador == "Pa") ? 
        "Ganaste" : (inputUsuario == "T" && comparador == "P") ? "Perdiste" : 
        (inputUsuario == "P" && comparador == "T") ? "Ganaste" : (inputUsuario == "P" && comparador == "Pa")
         ? "Perdiste" : (inputUsuario == "Pa" && comparador == "T") ? "Perdiste" : (inputUsuario == "Pa" && comparador == "P")
         ? "Ganaste" : "Secuencia no establecida";
         
         System.out.println(resultado);
    }
    
}