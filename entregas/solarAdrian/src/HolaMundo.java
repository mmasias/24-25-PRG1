class HolaMundo {
    public static void main(String[] args){

        System.out.println("Inicio");

        int edad;
        double dinero;
        String nombre;
        char unChar;

        edad = 12;
        dinero = 100;
        nombre = "Firbicundio";
        unChar = 'X' ;

        System.out.println(edad);
        System.out.println(dinero);
        System.out.println(nombre);

        System.out.println("Me llamo" + nombre + ", tengo" + edad + " años y " + dinero + "euros");

        dinero = dinero + 100;

        System.out.println("Y ahora tengo " + dinero + "euros");

    }
}