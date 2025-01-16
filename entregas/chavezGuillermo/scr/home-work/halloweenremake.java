public class halloweenremake {
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
            actualFloor = actualFloor + 1;
        }
    }
}
