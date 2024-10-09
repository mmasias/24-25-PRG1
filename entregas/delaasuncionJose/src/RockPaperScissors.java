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
        System.out.println("|                                      *                             |");
        System.out.println("+--------------------------------------------------------------------+");

        
        Scanner scanner = new Scanner(System.in);
        
        boolean error;
        int userGuess;
        int machineGuess;
        int result;
        int userWins=0;
        int userLost=0;

        String userWord;
        String machineWord;
        String veredict;
        String score;


        final String ERROR_VEREDICT = "|  > Please input a number within the range of 1 to 3                |";
        final String SPACER = "|                                                                    |";
        final String USER_WIN_VEREDICT = "|  > The user has won                                                |";
        final String MACHINE_WIN_VEREDICT = "|  > The machine has won                                             |";
        final String DRAW_VEREDICT = "|  > The game is tied                                                |";

        final int ROCK = 1;
        final int PAPER = 2;
        final int MINIMUM = 1;
        final int MAXIMUM = 3;

        for (int turn = 1; turn <= 3; turn++) {
            System.out.println(SPACER);
            System.out.println("|  > Game " + turn + " has begun                                                |");
            
            do {
                System.out.print("|  > ");
                userGuess = scanner.nextInt();
                error = userGuess > MAXIMUM || userGuess < MINIMUM;
                System.out.println( error ? ERROR_VEREDICT : SPACER);
            } while (error == true);

            machineGuess = (int)(Math.random()*(MAXIMUM - MINIMUM + 1) + MINIMUM);

            userWord = userGuess == ROCK ? "|  > The user has chosen ROCK                                        |"
            : userGuess == PAPER ? "|  > The user has chosen PAPER                                       |"
            : "|  > The user has chosen SCISSORS                                    |";

            machineWord = machineGuess == ROCK ? "|  > Machine has chosen ROCK                                         |"
            : machineGuess == PAPER ? "|  > Machine has chosen PAPER                                        |"
            : "|  > Machine has chosen SCISSORS                                     |";

            result = (userGuess-machineGuess+3)%3;

            veredict = DRAW_VEREDICT;

            if (result == 2) {
                veredict = MACHINE_WIN_VEREDICT;
                userLost++;
            } else if (result == 1) {
                veredict = USER_WIN_VEREDICT;
                userWins++;
            }

            score = "|  > The score is:     Wins - " + userWins + "       Loses - " + userLost + "       Draws - " + (turn - userLost - userWins) + "      |";

            System.out.println(SPACER);
            System.out.println(userWord);
            System.out.println(machineWord);
            System.out.println(SPACER);
            System.out.println(veredict);
            System.out.println(SPACER);
            System.out.println(score);
            System.out.println(SPACER);
            System.out.println("+--------------------------------------------------------------------+");
        }

        scanner.close();
    }
}