import java.util.Scanner;
    public class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int piedra = 1;
        int papel = 2;
        int tijera = 3;

        int resultado;
        System.out.println("Dime un numero para jugar !!");
        System.out.println("1-piedra,2-papel,3-tijera ");
        resultado = scanner.nextInt();

        int aleatorio = (int)((Math.random()*3)+1);

        String resultadoFinal;
        resultadoFinal = (resultado == aleatorio) ? "Empate!" : (resultado == piedra && aleatorio == tijera) || (resultado == papel && aleatorio == piedra) || (resultado == tijera && aleatorio == papel) ? "Ganaste!" : "Perdiste";


        System.out.println(resultadoFinal);

}
}
