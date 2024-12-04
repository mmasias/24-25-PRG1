import java.util.Scanner;
class funciones{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("cateto 1:");
        double scan1 = scanner1.nextDouble();
        
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("cateto 2:"); 
        double scan2 = scanner2.nextDouble();
        
        System.out.println("hipotenusa"+pythagoras(scan1,scan2));
        scanner1.close();
        scanner2.close();
    }
public static double pythagoras(double cat1, double cat2){
        double hypothenus=Math.sqrt((cat1*cat1)+(cat2*cat2));
        return hypothenus;
    }
}