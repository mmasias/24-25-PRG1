public class Practicando {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        double avg, sum = 0;
        int length = ages.length;
        for (int age : ages){
            sum += age;
        }
        avg = sum/length;
        System.out.println("The average age is: "+avg);
    }
}