import java.util.Scanner;
public class TestEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edadUsuario = scanner.nextInt();

        final int PRIMERA_INFANCIA = 0;
        final int INFANCIA = 6;
        final int ADOLESCENCIA= 12;
        final int JUVENTUD = 19;
        final int ADULTEZ= 26;
        final int VEJEZ = 60;

        if (edadUsuario < INFANCIA){
            System.out.println("primer infante");
        } else if (edadUsuario < ADOLESCENCIA) {
            System.out.println("niñ@");
        } else if (edadUsuario < JUVENTUD) {
            System.out.println("adolescente");
        } else if (edadUsuario < ADULTEZ){
            System.out.println("joven");
        } else if (edadUsuario < VEJEZ){
            System.out.println("adulto");
        } else {
            System.out.println("vejez");
        }
        
    }
}
