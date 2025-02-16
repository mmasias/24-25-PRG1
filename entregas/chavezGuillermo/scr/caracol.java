class caracol {
    public static void main(String[] args) {
        int meters=30;
        String well=    "[].: :. :. .: :: .:.: :. :. .: :: .:[]";
        String top=     "[]                                  []";
        String floor=   "[]__________________________________[]";
        String surface= "[]~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[]";
        String water=   "[]°  ° °  ° °° ° ° °  ° °  ° °° ° ° []";
        String snail=   "[]                 7@               []";
        int snailheight=23;
        int waterlevel=26;
        int days=0;
    
    while(days<10){
        waterlevel=(int)(Math.random()*30+20);
        days=days+1;
    System.out.println("\n \n \n \n \n \nDAY ["+days+"]\n"+top);
        for (int i=0; i<=meters;i=i+1){
            if (snailheight==i){
                System.out.println(snail+i);
            }else{
                if (waterlevel<=i){
                    System.out.println(water+i);
                }else{
                    System.out.println(well+i);
                }
                    
            }
            }
            System.out.println(floor);
       }
}
}