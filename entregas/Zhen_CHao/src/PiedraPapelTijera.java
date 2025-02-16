import java.util.Scanner;
public class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int piedra = 1;
        int papel = 2;
        int tijera = 3;

        int resultado;
        do{
            System.out.println("Dime un numero para jugar !!");
            System.out.println("1-piedra,2-papel,3-tijera ");
            resultado = scanner.nextInt();
        }(while)(!(resultado<4 ))

        int aleatorio = (int)((Math.random()*3)+1);

<<<<<<< HEAD
        String resultado = "PERDISTE";
        if (resultado == aleatorio){
           resultado1 = "Empate";
        } else if {       
        : (resultado == piedra && aleatorio == tijera) 
            || (resultado == papel && aleatorio == piedra) 
            || (resultado == tijera && aleatorio == papel)
            resultado = "GANASTE";
            }  

=======
-
+        String resultadoFinal;
+        resultadoFinal = (resultado == aleatorio) ? "Empate!" 
+            : (resultado == piedra && aleatorio == tijera) 
+                || (resultado == papel && aleatorio == piedra) 
+                || (resultado == tijera && aleatorio == papel) ? "Ganaste!" 
+            : "Perdiste";
>>>>>>> 90b2e22638028ae60a4bc6c88bf8737fc1e8768a

        System.out.println(resultadoFinal);

    }
}
