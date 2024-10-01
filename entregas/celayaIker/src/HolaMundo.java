class HolaMundo {
    public static void main(String[] args) {

        System.out.println("Inicio");

        int edad;
        double dinero;
        String nombre;
        char unChar;

        edad = 22;
        dinero = 300;
        nombre = "Patricio";
        unChar = 'x';

        System.out.println("Me llamo "+ nombre + ", tengo " + edad + " años y " + dinero + " euros");

        dinero = dinero + 100;

        System.out.println("Ahora tengo " + dinero + " euros");

        dinero = dinero - 50;

        System.out.println("Y ahora tengo " + dinero + " euros");
    }
}