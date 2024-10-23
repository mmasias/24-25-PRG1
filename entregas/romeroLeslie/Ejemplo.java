
import java.until.scanner


class Ejemplo  {

    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);

         int minimo, maximo;
         System.out.printIn ("Nivel de dificuldad");
         System.out.printIn ("Nivel minimo");
         minimo = scanner.nextInt ();
         System.out.printIn ("Nivel maximo");
         maximo = scanner.nextInt ();

         int aleatorio= (int)(Math.random()*(maximo-minimo)+minimo);

         int numeroDelUsuario;


         System.out.printIn ("Dime un numero entre " +minimo+ " y "+maximo+" (inclusive") ;
         numeroDelUsuario = scanner.next();
         
         System.out.printIn ("Nivel maximo");

         String.veredicto;

         veredicto = numeroUsuario == aleatorio ? "Adivino!" : " No divino!";

         System.out.printIn ("veredicto");
  
         /*
         boolean loAdivino;
         
        lo Adivino = numeroDeUsuario == aleatorio;

         System.out.println(loAdivino);
         */
         scanner.close();
