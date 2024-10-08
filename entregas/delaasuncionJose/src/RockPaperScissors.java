import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {

        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|      *                         *                                *  |");
        System.out.println("|            *      Welcome to Rock-Paper-Scissors!     *            |");
        System.out.println("|   *                                                                |");
        System.out.println("|                  Get ready for a fun competition!             *    |");
        System.out.println("|          Choose your weapon wisely from the options below:         |");
        System.out.println("|     *                                                              |");
        System.out.println("|       1.  Rock       *     - Crush those scissors!      *          |");
        System.out.println("|       2.  Paper            - Wrap up that rock!                    |");
        System.out.println("|   *   3.  Scissors         - Snip away that paper!            *    |");
        System.out.println("|                                                                    |");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.print("|  > ");

        
        Scanner scanner = new Scanner(System.in);
        
        boolean error;
        int userGuess = scanner.nextInt();
        int machineGuess;
        int result;

        String userWord;
        String machineWord;
        String veredict;


        final String ERROR_VEREDICT = "|  > Please input a number within the range of 1 to 3                |";

        final int MINIMUM = 1;
        final int MAXIMUM = 3;


        error = userGuess > MAXIMUM || userGuess < MINIMUM;
        machineGuess = (int)(Math.random()*(MAXIMUM - MINIMUM + 1) + MINIMUM);

        userWord = error ? ERROR_VEREDICT
        : userGuess == 1 ? "|  > The user has chosen ROCK                                        |"
        : userGuess == 2 ? "|  > The user has chosen PAPER                                       |"
        : "|  > The user has chosen SCISSORS                                    |";

        machineWord = machineGuess == 1 ? "|  > Machine has chosen ROCK                                         |"
        : machineGuess == 2 ? "|  > Machine has chosen PAPER                                        |"
        : "|  > Machine has chosen SCISSORS                                     |";

        result = (userGuess-machineGuess+3)%3;

        veredict = error ? "|  > The game has concluded with no winner due to user failure       |"
        : result == 0 ? "|  > El juego queda en empate                                        |"
        :result == 1 ? "|  > The user has won                                                |" 
        : "|  > The machine has won                                             |";


        System.out.println("|                                                                    |");
        System.out.println(userWord);
        System.out.println(machineWord);
        System.out.println("|                                                                    |");
        System.out.println(veredict);
        System.out.println("|                                                                    |");
        System.out.println("+--------------------------------------------------------------------+");


        scanner.close();
    }
}