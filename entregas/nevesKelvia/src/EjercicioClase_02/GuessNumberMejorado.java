package EjercicioClase_02;

import java.util.Scanner;

class GuessNumberMejorado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minimum, maximum;

        System.out.println("Difficulty level");

        System.out.println("Minimum number:");

        minimum = scanner.nextInt();

        do {
            System.out.println("Maximum number (must be greater than " + minimum + "):");

            maximum = scanner.nextInt();

            if (maximum <= minimum) {
                System.out.println("The maximum number must be greater than the minimum. Try again.");
            }
        } while (maximum <= minimum);

        int randomNumber = (int) (Math.random() * (maximum - minimum + 1) + minimum);

        int guessedNumber;

        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {

            System.out.println("Guess a number between " + minimum + " and " + maximum + " (inclusive):");

            guessedNumber = scanner.nextInt();

            if (guessedNumber < minimum || guessedNumber > maximum) {

                System.out.println("The number is out of range, please try again.");

            } else {

                if (guessedNumber == randomNumber) {

                    System.out.println("You guessed it!");

                    guessedCorrectly = true;

                } else {

                    System.out.println("Wrong guess. Try again.");
                }
            }
        }
        scanner.close();
    }
}
