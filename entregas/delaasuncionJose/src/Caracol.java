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

        final String WELL_TOP_1 =  "⣴⠟⠒⠛⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠛⠒⠻⣦";
        final String WELL_TOP_2 =  "⠙⣿⠛⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⠛⣿⠋";
        final String WELL_WALL_1 = " ⣿⠛⣿⠛⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⠛⣿⠛⣿ __ ";
        final String WELL_WALL_2 = " ⣿⠛⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⢻⡟⠛⠛⠛⣿ __ ";
        final String WELL_SNAIL_1 =" ⣿⠛⣿⠛⠛⠛ __@/¨ ⠛⠛⠛⣿⠛⣿ __ ";
        final String WELL_SNAIL_2 =" ⣿⠛⠛⠛⢻⡟ __@/¨ ⢻⡟⠛⠛⠛⣿ __ ";
        final String WELL_WATER_1 =" ⣿~~~~~~~~~~~~~~~~~~~⣿ __ ";
        final String WELL_WATER_2 =" ⣿                   ⣿ __ ";
        final String WELL_BOTTON = "⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁    ";

        int snailHeight = (int)(Math.random()*(MAX_INITIAL_POSITION - MIN_INITIAL_POSITION + 1)+MIN_INITIAL_POSITION);
        snailHeight = 3;
        int waterHeight = 5;
        int days = 0;

        System.out.println(WELL_TOP_1);
        System.out.println(WELL_TOP_2);

        for(int i=0; i<=WELL_HEIGHT; i++) {
            if (snailHeight == i) {
                System.out.println(WELL_SNAIL_1 + i);
            } else if (i >= WELL_HEIGHT - waterHeight) {
                System.out.println((i == (WELL_HEIGHT-waterHeight) ? WELL_WATER_1 : WELL_WATER_2)+ i);
            } else {
                System.out.println((i % 2 == 5 ? WELL_WALL_1 : WELL_WALL_2) + i);
            }
        }

        System.out.println(WELL_BOTTON);
    }
}