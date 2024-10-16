/*
⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀
⠀⣿⣉⣿⣀⣀⣀⣀⣀⣠⣄⣀⣀⣀⣀⣀⣿⣉⣿⠀
⠀⣿⣤⣤⣤⣤⣤⣤⣤⣼⣧⣤⣤⣤⣤⣤⣤⣤⣿⠀
⠀⣿⠀⣿⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⣿⠀⣿⠀
⠀⣿⠀⣿⠀⠀⠀⢠⡶⠛⠛⢶⡄⠀⠀⠀⣿⠀⣿⠀
⠀⣿⠀⣿⠀⠀⠀⢿⡷⠶⠶⢾⡿⠀⠀⠀⣿⠀⣿⠀
⠀⣿⠀⣿⠀⠀⠀⢸⣇⣀⣀⣸⡇⠀⠀⠀⣿⠀⣿⠀
⠀⣿⠀⣿⠀⠀⠀⠀⠉⠉⠉⠉⠀⠀⠀⠀⣿⠀⣿⠀
⠀⣿⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⣿⠀
⣴⠟⠒⠛⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠛⠒⠻⣦
⠙⣿⠛⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⠛⣿⠋
⠀⣿⠛⣿⠛⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⠛⣿⠛⣿⠀
⠀⣿⠛⠛⠛⣻⡟⠛⠛⢻⡟⠛⠛⢻⣟⠛⠛⠛⣿⠀
⠀⣿⣉⣿⣋⣉⣉⣻⣏⣉⣉⣹⣟⣉⣉⣙⣿⣉⣿⠀
⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁⠀

__@/¨

 */

 class Caracol {
    public static void main(String[] args) {

        final int WELL_HEIGHT = 20;

        final int MIN_INITIAL_POSITION = 10;
        final int MAX_INITIAL_POSITION = 20;

        final String WELL_TOP_1 =  "⣴⠟⠒⠒⠒⠒ Day x ⠒⠒⠒⠒⠻⣦";
        final String WELL_TOP_2 =  "⠙⣿⠛⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⠛⣿⠋";
        final String WELL_TOP_2_CAR =  "⠙⣿⠛⠛⠛⢻⡟⠛ CAR ⢻⡟⠛⠛⠛⣿⠋";
        final String WELL_WALL_1 = " ⣿⠛⣿⠛⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⠛⣿⠛⣿ __ ";
        final String WELL_WALL_2 = " ⣿⠛⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⠛⣿ __ ";
        final String WELL_SNAIL_1 =" ⣿⠛⣿⠛⠛ __@/¨ ⠛⠛⠛⣿⠛⣿ __ ";
        final String WELL_SNAIL_2 =" ⣿⠛⠛⠛⢻ __@/¨ ⢻⡟⠛⠛⠛⣿ __ ";
        final String WELL_WATER_1 =" ⣿~~~~~~~~~~~~~~~~⣿ __ ";
        final String WELL_WATER_2 =" ⣿                ⣿ __ ";
        final String WELL_BOTTON = "⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁";

        int snailHeight = (int)(Math.random()*(MAX_INITIAL_POSITION - MIN_INITIAL_POSITION + 1)+MIN_INITIAL_POSITION);
        int waterHeight = 0;
        int days = 0;
        int snailUp = 0;
        int snailDown = 0;
        int rainQuantity;

        double probabilityRain;

        boolean car;
        boolean rain;

        do {
            probabilityRain = Math.random();
            rainQuantity = (probabilityRain <= 0.05) ? 5: (probabilityRain <= 0.15) ? 2 : 0;
            waterHeight = waterHeight + rainQuantity;
            rain = rainQuantity>0;

            car = Math.random() <= 0.35;

            snailUp = (int)(Math.random()*(4-1+1)+1);

            snailHeight = snailHeight + snailDown - snailUp;
            snailHeight = (snailHeight>=(WELL_HEIGHT - waterHeight)) ? WELL_HEIGHT - waterHeight + 1 : snailHeight;
            
            System.out.println("Todays update, the snail has moved up " + snailUp + " but last night has moved down " + snailDown + ", " + (rain ? ("today has rained " + rainQuantity) : "today has not rained") + " and finally the snail is at " + snailHeight + ".");

            System.out.println(WELL_TOP_1.replace("x",(days < 10 ? "0" : "") + Integer.toString(days)));
            System.out.println(car ? WELL_TOP_2_CAR : WELL_TOP_2);

            for(int i=0; i<=WELL_HEIGHT; i++) {
                if (snailHeight == i) {
                    System.out.println((i % 2 == 0 ? WELL_SNAIL_1 : WELL_SNAIL_2) + i);
                } else if (i >= WELL_HEIGHT - waterHeight && waterHeight!=0) {
                    System.out.println((i == (WELL_HEIGHT-waterHeight) ? WELL_WATER_1 : WELL_WATER_2)+ i);
                } else {
                    System.out.println((i % 2 == 0 ? WELL_WALL_1 : WELL_WALL_2) + i);
                }
            }

            System.out.println(WELL_BOTTON);
            //wait .5 secs
            System.out.flush();
            days++;

            snailDown = (int)(Math.random()*(2-0+1)+0) + (car ? 2 : 0);
        } while(snailHeight > 0);
        System.out.println("The snail has gotten out!")
    }
}