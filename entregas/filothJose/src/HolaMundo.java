class HolaMundo {
    public static void main(String[] args) {

        System.out.println("Inicio");

        int edad;
        double dinero;
        String nombre;
        char unChar;

        edad =12;
        dinero = 100;
        nombre = "Firibricundio";
        unChar = 'x';

        System.out.println("Me llamo" + nombre + ", tengo" + edad + " años y " + dinero + " euros " + unChar);
        
        dinero = dinero + 100;

        System.out.println("Ahora tengo " + dinero + "euros");

        dinero = dinero - 30;

        System.out.println(" Y ahora tengo" + dinero + "euros");


    }

    
}