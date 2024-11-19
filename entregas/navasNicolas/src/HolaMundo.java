
public class HolaMundo {
    public static void main(String[] args) {

        int edad;
        double dinero;
        String nombre;
        char unChar;

        edad = 16;
        dinero = 100;
        nombre = "Junpepe";
        unChar = 'x';

        System.out.println("Me llamo " + nombre + ", tengo " + edad + " años y " + dinero + " yenes.");

        dinero = dinero + 100;

        System.out.println("Ahora tengo " + dinero + " yenes.");

        dinero = dinero - 50;

        System.out.println("Ahora tengo " + dinero + " yenes.");
        
    }
    
}