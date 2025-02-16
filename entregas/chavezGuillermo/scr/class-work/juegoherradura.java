class juegoherradura{
    public static void main(String[]args){
        int pointsNene=0;
        int pointsArnol=0;
        final int MAXPOINTS=50;
        boolean playing=true;

        while(playing){
            int gameNene=game();
            int gameArnol=game();
            if(gameArnol==gameNene){
                pointsArnol=pointsArnol+1;
                pointsNene=pointsNene+1;
            }   else{
                if (gameArnol==1){
                    pointsArnol=pointsArnol+5;
                }else if (gameNene==1){
                    pointsNene=pointsNene+5;
                }else if(gameArnol<gameNene){
                    pointsArnol=pointsArnol+3;
                } else{
                    pointsNene=pointsNene+3;
                }
            }
        }
        playing=pointsArnol<MAXPOINTS && pointsNene<MAXPOINTS;
        System.out.println("Nene: "+pointsNene+" Arnol: "+pointsArnol);

        static int game(){
            double rng=Math.random();
            return rng<;
        }


    }
}