import java.util.Scanner;
class ViajeMarco{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        final double max_speed=15;
        final double min_speed=10;
        final double max_time=10;
        final double min_time=8;
        final double normal_rain_chance=0.4;
        final double strong_rain_chance=0.1;
        final double monkey_escape=0.15;
        final double monkey_tired=0.25;

        double speed, time, advancement;
        double rain_chance;
        double scape_chance, tired_chance;
        
        rain_chance=Math.random();
        speed = Math.random()*(max_speed-min_speed)+min_speed;
       
        
        if (rain_chance<=strong_rain_chance){
            System.out.println("strong rain happened");
            speed=speed*0.25;
        }else if (rain_chance<=normal_rain_chance){
            System.out.println("average rain bruh");
        }else{
            System.out.println("No rain!!");
        }

        tired_chance=Math.random();
        if (tired_chance<monkey_tired){
            System.out.println("monkey is tired");
            speed=speed*0.9;
        }

        time=Math.random()*(max_time-min_time)+min_time;

        scape_chance=Math.random();
        if(scape_chance<=monkey_escape){
            System.out.println("monkey has escaped!!!!!!!");
            time=time-2;
        }
        advancement=speed*time;
        System.out.println("Advancement is ["+advancement+"]");
        scan.close();

    }
}