import java.util.Scanner;
public class CalculoDeIntegral {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      System.out.println(" Escriba numero numero limite inferior");
      double inputLimiteInferior = scanner.nextDouble();
      System.out.println(" Escriba numero numero limite superior");
      double inputLimiteSuperior = scanner.nextDouble();
      final double RESULTADO = Math.sin(5) * (Math.sin(inputUsuario / 1.59) + 0.2 * Math.sin(5 * inputUsuario / 1.59));
      System.out.println(RESULTADO);

     scanner.close();
    }
}
