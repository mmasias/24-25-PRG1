class Caracol{
    public static void main(String[]args){

        final int DEPTH = 20;
        final String BASE = "_______________________";
        final String TOP = "______           ______";
        final String WALL = "__:.:.:.:.:.:.:.:.:.__";
        final String WATER = "__###################__";
        final String SNAIL = "       _@)_/       ";

        int waterDepth = 5;
        int snailDepth = 13;


        System.out.println(TOP);

        for(int i=0; i<=DEPTH; i++){

            if(snailDepth==i){
                System.out.println(SNAIL + i);
                i=i+1;
            }

            if(i>DEPTH-waterDepth){
                System.out.println(WATER + i);
            } else {
                System.out.println(WALL + i);
            }     

        }

        System.out.println(BASE);

    }
}