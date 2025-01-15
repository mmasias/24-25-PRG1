public class Prueba {
    public static void main(String[] args) {
        /*int time = 20;
        if (time < 18){
            System.out.print("Good day!");
            } else {
            System.our.print("Good evening!");
            }
        ambos son lo mismo*/
        int time = 20;
        String result = (time<=18) ? "Good day!" : "Good evening!";
        System.out.println(result);
        }
    }