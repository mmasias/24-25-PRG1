import java.util.Scanner;
import java.util.Random;
class rps{
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Rock Paper Sissors? \"R\" \"P\" \"S\"");
        String[] Inputs = {"R","r","P","p","S","s"};
        String answered = answer.nextLine();
//        if (Inputs.contains(answer))
//            System.out.println("is an answer");

            String[] results = {"Win!","Lose","Draw"};
            java.util.Random random = new java.util.Random();
             int choice = random.nextInt(results.length); 
              System.out.println(results[choice]);
//        else print "not a valid answer" exit()
    }
}