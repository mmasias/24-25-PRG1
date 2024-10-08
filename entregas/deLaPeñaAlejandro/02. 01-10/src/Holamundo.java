class HolaMundo{

    public static void main(String[] args){
       
        System.out.println("Inicio");

        int edad;
        double dinero;
        String nombre;
        char unChar;

        edad = 12;
        dinero = 100;
        nombre = "Firibicundio";
        unChar = 'x';

        System.out.println("Me llamo " + nombre + ", tengo " + edad + ", tengo " + dinero + "hay" + unChar);

        dinero = dinero + 100;

        System.out.println("Ahora tengo " + dinero + "euros");

        dinero = dinero - 50;

        System.out.println("Ahora tengo " + dinero + "euros");
    }
}

