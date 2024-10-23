
class CammelRace {
    public static void main(String[] args) {

        final String CAMELLO = ",--,^";
        final String TRACK = ".";

        final int MAXIMUM = 4;
        final int MINIMUM = 1;
        final int FINAL = 30;
        
        int firstPosition = 0;
        int secondPosition = 0;

        boolean inRace = true;
        int round = 0;
        int advance;

        while (inRace) {
            round++;

            advance = (int) (Math.random() * MAXIMUM - MINIMUM + 1) + MINIMUM;
            firstPosition = firstPosition + advance;

            advance = (int) (Math.random() * MAXIMUM - MINIMUM + 1) + MINIMUM;
            secondPosition = secondPosition + advance;

            System.out.println("=".repeat(FINAL + 1));
            System.out.println("Round:" + round);
            System.out.println(TRACK.repeat(firstPosition) + CAMELLO);
            System.out.println(TRACK.repeat(secondPosition) + CAMELLO);
            inRace = firstPosition < FINAL;
        }

        System.out.println((firstPosition > secondPosition ? "THe winner is the first cammel" : (firstPosition == secondPosition ? "The game has ended in a tie!" : "The winner is the second cammel" )));
    }
}