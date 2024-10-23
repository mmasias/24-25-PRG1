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
        final String MONKEY_NORMAL =        "|  > The monkey has not escaped nor is tired                    |";
        final String MARCO_REACHED_MOTHER = "|  > Marco has finally reached her mother!                      |";
        final String MARCO_MOTHER_DISTANCE_1 = "|  > Marco is ";
        final String MARCO_MOTHER_DISTANCE_2 = " meters of her mother             |";
        final String MARCO_STATUS_1 = "|  > Marco has walked with an average velocity of ";
        final String MARCO_STATUS_2 = " for ";
        final String MARCO_STATUS_3 = " hours, walking a total of ";
        final String MARCO_STATUS_4 = " kilometers.  |";

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
        double escapePropability;
        double tiredProbability;
        double decreasedSpeed;
        double decreasedTime;

        int day = 0;
        double distanceMarcoMother = 350;

        while (distanceMarcoMother >0) {

        rainProbabilty = Math.random();
        escapePropability = Math.random();
        tiredProbability = Math.random();

        decreasedSpeed = rainProbabilty <= PROBABILITY_STRONG_RAIN ? SPEED_DECREASE_STRONG_RAIN : rainProbabilty<= PROBABILITY_RAIN ? SPEED_DECREASE_RAIN : 0;
        
        decreasedSpeed = decreasedSpeed + (tiredProbability <= PROBABILITY_MONKEY_TIRED ? SPEED_DECREASE_MONKEY_TIRED : 0);
        decreasedTime = escapePropability <= PROBABILITY_MONKEY_ESCAPE ? TIME_LOST_MONKEY_ESCAPE : 0;

        marcoVelocity = (Math.random()*(MAX_VELOCITY-MIN_VELOCITY)+MIN_VELOCITY)*(1-decreasedSpeed);
        marcoTime = Math.random()*(MAX_TIME-MIN_TIME)+MIN_TIME - decreasedTime;
        marcoWalked = marcoTime*marcoVelocity;

        distanceMarcoMother = distanceMarcoMother - marcoWalked + MOTHER_VELOCITY;

        System.out.println(SEPRATOR);
        System.out.println(SPACER);
        System.out.println(DAY_1 + (day < 10 ? "0" : "")+ day + DAY_2);
        System.out.println(SPACER);
        System.out.println(rainProbabilty <= PROBABILITY_STRONG_RAIN ? HEAVY_RAIN : rainProbabilty<= PROBABILITY_RAIN ? RAIN : CLEAR);
        System.out.println((tiredProbability <= PROBABILITY_MONKEY_TIRED && escapePropability <= PROBABILITY_MONKEY_ESCAPE) ? MONKEY_TIRED_ESCAPED : tiredProbability <= PROBABILITY_MONKEY_TIRED ? MONKEY_TIRED : escapePropability <= PROBABILITY_MONKEY_ESCAPE ? MONKEY_TIRED : MONKEY_NORMAL);
        System.out.println(MARCO_STATUS_1 + marcoVelocity + MARCO_STATUS_2 + marcoTime + MARCO_STATUS_3 + marcoWalked + MARCO_STATUS_4);
        System.out.println(SPACER);
        System.out.println(MARCO_MOTHER_DISTANCE_1 + (distanceMarcoMother <= 0 ? "0" : distanceMarcoMother) + MARCO_MOTHER_DISTANCE_2);

        day++;
        }

        System.out.println(SEPRATOR);
        System.out.println(SPACER);
        System.out.println(MARCO_REACHED_MOTHER);
        System.out.println(SPACER);
        System.out.println(SEPRATOR);
    }
}
