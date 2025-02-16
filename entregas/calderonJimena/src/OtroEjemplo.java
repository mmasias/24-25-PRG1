import java.util.Scanner;

public class OtroEjemplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String mensaje = "No le dio!!!";
        final String TOPO = "[T]";
        final String MARTILLO = "[=]";
        final String VACIO = "[ ]";
        final String GOLPEADO = "[*]";

        for (int turno = 1; turno <= 5; turno++) {
            System.out.println("TURNO " + turno);

            int salePor = (int) (Math.random() * 16 + 1);
            int dondeDoy = entrada.nextInt();
        }

        entrada.close();
    }
}
