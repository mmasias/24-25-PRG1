
public class Halloween {

    public static void main(String[] args) {
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
                        int calculateCandyChildOne = (int) (Math.random() * (MAX_CANDY_PER_HOUSE - MIN_CANDY_PER_HOUSE + 1) + MIN_CANDY_PER_HOUSE);
                        System.out.println(calculateCandyChildOne);
                        kidBagOne = kidBagOne + calculateCandyChildOne;

                    }
                }
                actualHouse = actualHouse + 1;
            }
            actualFloor = actualFloor + 1;
            actualHouse = 1;
        }
    System.out.println("Candies per child: " +kidBagOne)

    }
}
