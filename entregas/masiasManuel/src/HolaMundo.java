class HolaMundo {
    public static void main(String[] args){

        int edad ;
        String nombre ;
        double dinero;
        char unChar;
    

        edad = 17;
        nombre = "Sara";
        dinero = 20;
        unChar = '.';

        System.out.println("Me llamo " + nombre + " tengo " + edad + " años y " + dinero + " euros" + unChar);
        
        dinero = dinero + 10;

        System.out.println("Ahora tengo " + dinero + " euros.");

        dinero = dinero - 5;

        System.out.println("Ahora tengo " + dinero + " euros.");
    }

}
