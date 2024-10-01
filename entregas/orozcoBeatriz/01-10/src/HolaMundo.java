class HolaMundo {
    public static void main (String[] args) {
        int edad;
        double dinero;
        String nombre;
        char unChar;

        edad = 12;
        dinero = 100;
        nombre = "Firibicundio";
        unChar = 'x';

        System.out.println("Inicio: ");
        System.out.println(edad);
        System.out.println(dinero);
        System.out.println(nombre);

        System.out.println("Me llamo " + nombre + ", tengo " + edad + " años y " + dinero + " euros");
        
        dinero = 120;
        System.out.println("Ahora tengo " + dinero + " euros");

        dinero = 50;
        System.out.println("Ahora tengo " + dinero + " euros");
    }   
}