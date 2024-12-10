import java.util.Scanner;

class Escondite {
    public static void main(String[] args) {

        final int TOTAL_PLACES = 6;
        final int VISIBLE = 0;
        int firstPlayerPosition = VISIBLE, secondPlayerPosition = VISIBLE, thirdPlayerPosition = VISIBLE;

        firstPlayerPosition = definePlace(TOTAL_PLACES, secondPlayerPosition, thirdPlayerPosition);
        secondPlayerPosition = definePlace(TOTAL_PLACES, firstPlayerPosition, thirdPlayerPosition);
        thirdPlayerPosition = definePlace(TOTAL_PLACES, secondPlayerPosition, secondPlayerPosition);
        boolean gameInProgress = true;
        boolean allPlayersFound = false;
        int currentTurn = 0;

        while (gameInProgress) {
            currentTurn++;
            System.out.print("TURNO ["+currentTurn+"] Dónde mirar? [" + firstPlayerPosition + ":" + secondPlayerPosition + ":" + thirdPlayerPosition + "] ");
            updateNervousness(firstPlayerPosition, secondPlayerPosition, thirdPlayerPosition, currentTurn);            
            int playerGuess = new Scanner(System.in).nextInt();

            firstPlayerPosition = lookAt(firstPlayerPosition, playerGuess);
            secondPlayerPosition = lookAt(secondPlayerPosition, playerGuess);
            thirdPlayerPosition = lookAt(thirdPlayerPosition, playerGuess);

            allPlayersFound = firstPlayerPosition == VISIBLE && secondPlayerPosition == VISIBLE && thirdPlayerPosition == VISIBLE;
            gameInProgress = currentTurn < 12 && !allPlayersFound;
            tellTale(currentTurn, firstPlayerPosition, secondPlayerPosition, thirdPlayerPosition);
        }
    }

    static void updateNervousness(int boyOne, int boyTwo, int boyThree, int turn) {
        if (turn%2==0) {
            final int VISIBLE = 0;
            String sound = "Aguzando el oido...";
            sound = sound + (boyOne != VISIBLE && Math.random() < 0.7 ? boyOne + ", " : "");
            sound = sound + (boyTwo != VISIBLE && Math.random() < 0.7 ? boyTwo + ", " : "");
            sound = sound + (boyThree != VISIBLE && Math.random() < 0.7 ? boyThree : "");
            System.out.println(sound);
        }
    }

    static int definePlace(int numberOfPlaces, int forbiddenPlaceOne, int forbiddenPlaceTwo) {
        int place;
        do {
            place = (int) (Math.random() * numberOfPlaces + 1);
        } while (place == forbiddenPlaceOne || place == forbiddenPlaceTwo);
        return place;
    }

    static int lookAt(int boy, int guess) {
        return boy == guess && Math.random() > 0.1 ? 0 : boy;
    }

    static void tellTale(int turn, int boyOne, int boyTwo, int boyThree) {
        final int VISIBLE = 0;
        System.out.println("Turno " + turn);
        System.out.println("Niño 1 " + (boyOne == VISIBLE ? "ENCONTRADO!" : "escondido"));
        System.out.println("Niño 2 " + (boyTwo == VISIBLE ? "ENCONTRADO!" : "escondido"));
        System.out.println("Niño 3 " + (boyThree == VISIBLE ? "ENCONTRADO!" : "escondido"));
    }
}