class Temporal {
    public static void main(String[] args) {

        final String SEPRATOR = "+---------------------------------------------------------------+";
        final String SPACER =   "|                                                               |";
        final String DAY_1 =    "|                             Day  ";
        final String DAY_2 =    "                           |";
        final String HEAVY_RAIN="|  > Today has rained a huge amount!                            |";
        final String RAIN =     "|  > Today has rained                                           |";
        final String CLEAR =    "|  > Today has not rained a drop!                               |";
        final String MONKEY_ESCAPED  = "|  > The monkey has escaped!                                    |";
        final String MONKEY_TIRED = "|  > The monkey is tired!                                       |";
        final String MONKEY_TIRED_ESCAPED = "|  > The monkey is tired and has escaped!                       |";
        final String MARCO_REACHED_MOTHER = "|  > Marco has finally reached her mother!                      |";
        final String MARCO_MOTHER_DISTANCE_1 = "|  > Marco is ";
        final String MARCO_MOTHER_DISTANCE_2 = " meters of her mother                                                 |";

        final double MAX_VELOCITY = 15;
        final double MIN_VELOCITY = 10;
        final double MAX_TIME = 10;
        final double MIN_TIME = 8;

        final double PROBABILITY_STRONG_RAIN = 0.1;
        final double PROBABILITY_RAIN = 0.3 + PROBABILITY_STRONG_RAIN;
        final double SPEED_DECREASE_STRONG_RAIN = 0.75;
        final double SPEED_DECREASE_RAIN = 0.25;

        final double PROBABILITY_MONKEY_ESCAPE = 0.15;
        final double PROBABILITY_MONKEY_TIRED = 0.25;
        final double SPEED_DECREASE_MONKEY_TIRED = 0.1;
        final double TIME_LOST_MONKEY_ESCAPE = 2;

        final double MOTHER_VELOCITY = 80;

        double marcoVelocity;
        double marcoTime;
        double marcoWalked;

        double rainProbabilty;
        double decreasedSpeed;
        double decreasedTime;

        double day;
        double distanceMarcoMother = 350;

        while (distanceMarcoMother >0) {

        rainProbabilty = Math.random();
        decreasedSpeed = rainProbabilty <= PROBABILITY_STRONG_RAIN ? SPEED_DECREASE_STRONG_RAIN : rainProbabilty<= PROBABILITY_RAIN ? SPEED_DECREASE_RAIN : 0;
        
        decreasedSpeed = decreasedSpeed + (Math.random() <= PROBABILITY_MONKEY_TIRED ? SPEED_DECREASE_MONKEY_TIRED : 0);
        decreasedTime = Math.random() <= PROBABILITY_MONKEY_ESCAPE ? TIME_LOST_MONKEY_ESCAPE : 0;

        marcoVelocity = (Math.random()*(MAX_VELOCITY-MIN_VELOCITY)+MIN_VELOCITY)*(1-rainDecreasedSpeed);
        marcoTime = Math.random()*(MAX_TIME-MIN_TIME)+MIN_TIME - decreasedTime;
        marcoWalked = marcoTime*marcoVelocity;

        System.out.println(SEPRATOR);
        System.out.println(SPACER);
        System.out.println(SPACER);
        System.out.println(rainProbabilty <= PROBABILITY_STRONG_RAIN ? HEAVY_RAIN : rainProbabilty<= PROBABILITY_RAIN ? RAIN : CLEAR);
        System.out.println()
        
        distanceMarcoMother = distanceMarcoMother - marcoWalked + MOTHER_VELOCITY;
        day++;
        }

        System.out.println(SEPRATOR);
        System.out.println(SPACER);
        System.out.println(MARCO_REACHED_MOTHER);
        System.out.println(SPACER);
        System.out.println(SEPRATOR);
    }
}
