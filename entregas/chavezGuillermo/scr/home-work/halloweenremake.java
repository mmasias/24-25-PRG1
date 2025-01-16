import java.util.Scanner;
public class halloweenremake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kidBagOne = 0;
        int kidBagTwo = 0;
        int kidBagThree = 0;

        final int MAX_CANDIES = 20;
        boolean fullBagOne = false;
        boolean fullBagTwo = false;
        boolean fullBagThree = false;
        final int FLOORS_PER_BUILDING = 5;
        final int APARTMENTS_PER_FLOOR = 4;

        final double OPEN_HOUSE_CHANCE = 0.7;
        final double GIVES_CANDY_CHANCE = 0.8;
        final int MAX_CANDY_PER_HOUSE = 3;
        final int MIN_CANDY_PER_HOUSE = 1;

        int actualFloor = 1;
        int actualHouse = 1;

        while (actualFloor <= FLOORS_PER_BUILDING) {
            System.out.println("== == Floor " + actualFloor + " == ==");

            while (actualHouse <= APARTMENTS_PER_FLOOR) {
                System.out.println("== == House Number " + actualHouse + " == ==");
                double calculateOpen = Math.random();
                if (calculateOpen >= OPEN_HOUSE_CHANCE) {
                    System.out.println("The house is closed");
                } else {
                    System.out.println("The house is open");
                    System.out.println("Trick or treat!");
                    double calculateGivesCandy = Math.random();
                    if (calculateGivesCandy >= GIVES_CANDY_CHANCE) {
                        System.out.println("No candy for you!");
                    } else {
                        if (fullBagOne) {
                            System.out.println("Kid One bag is full");
                        } else {
                            
                            kidBagOne = kidBagOne + candyCalculation(MAX_CANDY_PER_HOUSE,MIN_CANDY_PER_HOUSE);
                        }
                        if (fullBagTwo) {
                            System.out.println("Kid Two bag is full");
                        } else {
                            
                            kidBagTwo = kidBagTwo + candyCalculation(MAX_CANDY_PER_HOUSE,MIN_CANDY_PER_HOUSE);
                        }
                        if (fullBagThree) {
                            System.out.println("Kid Three bag is full");
                        } else {
                            
                            kidBagThree = kidBagThree + candyCalculation(MAX_CANDY_PER_HOUSE,MIN_CANDY_PER_HOUSE);
                        }
                    }
                    if (kidBagOne >= MAX_CANDIES) {
                        fullBagOne = true;
                        kidBagOne = MAX_CANDIES;
                        System.out.println("The bag of the first Child is full!");
                    }
                    if (kidBagTwo >= MAX_CANDIES) {
                        fullBagTwo = true;
                        kidBagTwo = MAX_CANDIES;
                        System.out.println("The bag of the second Child is full!");
                    }
                    if (kidBagThree >= MAX_CANDIES) {
                        fullBagThree = true;
                        kidBagThree = MAX_CANDIES;
                        System.out.println("The bag of the third Child is full!");
                    }
                }
                actualHouse = actualHouse + 1;
                scanner.nextLine();
            }
            actualFloor = actualFloor + 1;
            actualHouse = 1;
        }
        System.out.println("The amount of candies that each child got is");
        System.out.println("The amount of candies that child one got is: " + kidBagOne);
        System.out.println("The amount of candies that child two got is: " + kidBagTwo);
        System.out.println("The amount of candies that child three got is: " + kidBagThree);
        scanner.close();
    }

    static int candyCalculation(int max, int min) {
        int calculateCandy = (int) (Math.random() * (max-min+ 1) + min);
        System.out.println(calculateCandy);
        return (calculateCandy);
    }
}