class distribution{ 
    public static void main(String[]args) {
        int[] dice={0,0,0,0};
        int d6=6;
        int min=d6;
        //int minimal=0;

        rollThem(d6,dice);

        getMin(dice,min);

                System.out.println("smallest is "+min);
           
            }
                 
                    static void getMin(int[] dice,int min) {
                        for(int i=0;i<dice.length;i=i+1){
                            if(dice[i]<min){
                                min=dice[i];
                            }
                        }
                    }
        
                    static void rollThem(int d6,int[] dice){
                for(int i=0;i<dice.length;i=i+1){
                    int roll=(int)(Math.random()*d6)+1;
                    System.out.print("["+roll+"] ");
                    dice[i]=roll;
                }
                System.out.println();
            }
}