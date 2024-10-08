import java.util.Scanner;
public class PiedraPapelTijera {
    public static void main(String[] args) {
        
        System.out.println("Juega piedra papel o tijera");
        System.out.println("Como jugar? Ingresa T para Tijera, P para Piedra y Pa para Papel");
        Scanner InputUsuario = new Scanner(System.in);
        
        final String Tijera = "T";
        final String Piedra = "P";
        final String Papel = "Pa";
        int numeroOrdernador;
        String comparador;

        numeroOrdernador = (int) (Math.random() * (3) + 1);
        System.out.println(numeroOrdernador);
        comparador = numeroOrdernador == 1 ? Tijera : numeroOrdernador == 2 ?  Piedra : numeroOrdernador == 3 ? Papel : "Numero no establecido";
        System.out.println(comparador);
    }
    
}