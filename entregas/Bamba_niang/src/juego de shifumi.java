import java.util.Scanner;

class Juego{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String piedra = "piedra";
        String tijera = "tijera";
        String papel = "papel";

        System.out.println("Bienvenido al juego de piedra papel o tijera ");
        System.out.println("elige entre piedra, papel y tijeras");

        String userValue = scanner.nextLine().toLowerCase();

        String validOption = (userValue.equals(piedra) || userValue.equals(papel) || userValue.equals(tijera)) 

        ? userValue
        : "invalido";

        System.out.println(validOption.equals("invalido") ? "Reintalo untroduciendo un valor valido" : "");

        int maximo = 3;
        int minimo = 1;

        int compValue = (int) (Math.random() * (maximo-minimo) + minimo);

        String compChoice = (compValue == 1) ? "piedra"
        :(compValue == 2) ? "papel"
        :(compValue == 3) ? "tijera" : "";


        String result =
        (validOption.equals(piedra) && compChoice.equals(3)) ||
        (validOption.equals(tijera) && compChoice.equals(2)) ||
        (validOption.equals(papel) && compChoice.equals(1)) ? "Gananste" : 
        (validOption.equals(compChoice)) ? "Empate" :
        "Perdiste...";

        System.out.println("El ordenador escogio "+compChoice+".");
        System.out.println(result);

        scanner.close();



    



        
    
    }
}



    

