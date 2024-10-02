import java.util.Scanner;

class GuessNumber{

     public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int minimum, maximum;
        
        System.out.println("Difficulty level");

        System.out.println("Minimum number");
        minimum = scanner.nextInt();

        System.out.println("Maximum number");
        maximum = scanner.nextInt();

        int random =(int)(Math.random() * (maximum-minimum) + minimum);

        int userNumber;

        System.out.println("Tell me a number between " + minimum + " y " + maximum + " (included)");

        userNumber = scanner.nextInt();

        String result;

        result = userNumber != random ? "You did not guess the number!" : "You guessed it!";

        System.out.println(result);

     }    

}
