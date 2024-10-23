import java.util.Scanner;
    public class RetoPiedraPapelTijera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int PIEDRA = 1;
        int PAPEL = 2;
        int TIJERA = 3;

        final String PIEDRA_DESCRIPTOR = "PIEDRA";
        final String PAPEL_DESCRIPTOR = "papel";
        final String TIJERA_DESCRIPTOR = "tijera";
        final String ERROR_DESCRIPCION = "invalido";

        int RESULTADO;
        System.out.println("Dime un numero para jugar !!");
        System.out.println("1-Piedra,2-Papel,3-Tijera ");
        RESULTADO = scanner.nextInt();

        String respuesta_Usuario;
        int ALEATORIO = (int)((Math.random()*3)+1);
        respuesta_Usuario = RESULTADO > 4 ? ERROR_DESCRIPCION
        : RESULTADO == PIEDRA ? PIEDRA_DESCRIPTOR
        : RESULTADO == PAPEL ? PAPEL_DESCRIPTOR
        : RESULTADO == TIJERA ? TIJERA_DESCRIPTOR ;

        System.out.println(respuesta_Usuario);

}
}