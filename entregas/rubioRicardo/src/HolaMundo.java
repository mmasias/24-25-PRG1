 class HolaMundo {
    public static void main(String[]args){

        System.out.println("inicio");
        int edad = 12;
        double dinero;
        String nombre;
        char unChar;
        
        
        dinero = 100;
        nombre = "Ricardo";
        unChar = 'x';

        System.out.println(edad);
        System.out.println(dinero);
        System.out.println(nombre);
        System.out.println("me llamo " + nombre +  ", tengo " + edad + " años, y tengo " + dinero + " euros");           
        System.out.println(unChar);
        dinero = dinero + 100;
        System.out.println("ahora tengo " + dinero);
        dinero = dinero - 50;
        System.out.println("ahora tengo " + dinero);   
        
       
    }
 }