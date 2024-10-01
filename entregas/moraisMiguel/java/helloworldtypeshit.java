class HolaMundo{

    public static void main(String[]args){
        System.out.println("==========================");
        System.out.println("|Hola Mundo              |");
        System.out.println("|Hoy comere macarrones :D|");
        System.out.println("|Adios Mundo!            |");
        System.out.println("==========================");

        int edad;
        double dinero;
        String nombre;
        char unChar;

        edad = 12;
        dinero = 100;
        nombre = "Federico";
        unChar = 'x';
        System.out.println(edad);
        System.out.println(dinero);
        System.out.println(nombre);

        System.out.println("Me llamo " + nombre + ", tengo " + edad + " años y " + dinero + " euros");

        System.out.println(unChar);

        System.out.println("Pero por culpa de la inflación...");

        double dineroNuevo;

        dineroNuevo = dinero - dinero*0.4;

        System.out.println("Ahora solo tengo " + dineroNuevo + " euros.");

        double dineroTrasBitcoin;

        dineroTrasBitcoin = dineroNuevo + 100000000;

        /** Intente hacer exponente pero dado que es un double y no un int me dio error */

        System.out.println("Milagrosamente, ya que inverti en bitcoin hace 15 años, ahora tengo la gran suma de " + dineroTrasBitcoin + " euros.");
    }

}
