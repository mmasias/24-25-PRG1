class HolaMundo {
    public static void main(String[] args) {

        System.out.println("Inicio");

        int edad;
        double dinero;
        String nombre;
        char unChar;

        edad = 20;
        dinero = 100;
        nombre = "Lucia";
        unChar = 'x';
        
        System.out.println(edad);
        System.out.println(dinero);
        System.out.println(nombre);

        System.out.println("Me llamo " + nombre + ", tengo " + edad + " años y " + dinero + " euros");
 
        dinero = dinero + 100;

        System.out.println("Ahora tengo " + dinero + " euros");

        dinero = dinero - 50;
        System.out.println("Y Ahora tengo " + dinero + " euros");

    }
}