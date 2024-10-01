class HolaMundo {
    public static void main(String[] args) {
        
        // Console output "Inicio"

        System.out.println("Inicio");

        // Creacion de variables

        int edad;
        double dinero;
        String nombre;
        char UnChar;

        // Asignacion de valores a las variables

        edad = 1;
        dinero = 100;
        nombre = "No tengo";
        UnChar = 'y';

        // Console output

        System.out.println("Me llamo " + nombre + ", tengo " + edad + " año " + UnChar + " y tengo " + dinero + " euros.");

        dinero = dinero + 100;
        System.out.println("Ahora tengo " + dinero);

        dinero = dinero - 100;
        System.out.println("Ahora tengo " + dinero);
    }
}
