import java.util.Scanner;

class NotaFinal {
    public static void main(String[] args) {

        // Variable declaration
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number within the range [1,10]:");
        int userGuess = scanner.nextInt();

        int randomNumber;
        boolean guessed;
        String veredict;

        // Constants declaration

            // Randomness range

        final int MINIMUM = 1;
        final int MAXIMUM = 10;

        // Calculation

        randomNumber = (int)(Math.random()*(MAXIMUM-MINIMUM)+MINIMUM);
        guessed = randomNumber==userGuess;
        veredict = guessed ? "Adivino!" : "No lo adivino! :(";

        // Console output

        System.out.println(userGuess + " " + randomNumber + " " + guessed + " " + veredict);
    }
}