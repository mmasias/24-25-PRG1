class HolaMundo {
    public static void main (String[] args) {
        int edad = 12;
        double dinero= 100;
        String nombre = "Firibicundio";
        char unChar = 'x';

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