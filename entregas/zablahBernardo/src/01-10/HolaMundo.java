class HolaMundo {
    public static void main(String[] args) {

        System.out.println("INICIO");

        int edad;
        double dinero;
        String nombre;
        char unChar;
        
        edad = 12 ;
        dinero = 100 ;
        nombre = "bernardo" ;
        unChar = 'x' ;

        System.out.println(edad);
        System.out.println(dinero);
        System.out.println(nombre);
        System.err.println("Me llamo " + nombre + ", tengo " + edad + " anos, y tengo " + dinero + " euros");
        System.err.println(unChar);

        dinero = dinero + 100 ;

        System.err.println("Ahora tengo " + dinero);
        dinero = dinero - 50 ;

        System.err.println("Ahora tengo " + dinero);

    }
}
