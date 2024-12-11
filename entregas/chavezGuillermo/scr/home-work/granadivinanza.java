import java.util.Scanner;
class granadivinanza{

    
    public static void main(String[]args){
        final int INTENTOS=10;
        int intentoActual=0;
        boolean juega=true;
        int numeroGenerado=rng();
        int numeroUsuario;
        int pistasIntento1=3;
        int pistasIntento2=6;

        
        while(juega) {
            System.out.println("Adivina el numero! Tienes ["+(INTENTOS-intentoActual)+"] intentos restantes");
            intentoActual=intentoActual+1;
            numeroUsuario=escaneoUsuario();
            System.out.println("Dijiste "+numeroUsuario);

            if (intentoActual==pistasIntento1){
                System.out.println(pista1(numeroGenerado));
            }
            if (intentoActual==pistasIntento2){
                System.out.println(pista2(numeroGenerado));
            }

            if(numeroUsuario==numeroGenerado){
                String singular="] Solo intento! Wao!";
                if (INTENTOS>1){
                    singular="] intentos!";
                }
                System.out.println("HAS ADIVINADO \n \nTe has tardado ["+intentoActual+singular);
                juega=false;            
            }
            if(intentoActual>=INTENTOS){
                juega=false;
            }
            
        }
        System.out.println("= = = Juego Terminado, el numero era "+numeroGenerado+"= = =");
    }


    public static int rng(){
        int minimo=1;
        int maximo=100;
        return (int)Math.random()*maximo-minimo;
    }

    public static int escaneoUsuario(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Adivina el numero:");
        int scan1 = scanner1.nextInt();
        return scan1;
    }

    public static String pista1(int numeroGenerado){
        int rangoDePrueba=10;
        int resultadoPrueba=(numeroGenerado-rangoDePrueba);
        if (resultadoPrueba<0){
            return"Pista:Es un numero muy pequeno";
        }else{
            int rangoMenor=(int)Math.random()*rangoDePrueba;
            int numeroMenor=numeroGenerado-rangoMenor;
            return("Pista: el numero es mas grande que"+numeroMenor);
        }
    }

    public static String pista2(int numeroGenerado){
        int rangoDePrueba=10;
        int resultadoPrueba=(numeroGenerado+rangoDePrueba);
        if (resultadoPrueba>100){
            return"Pista:Es un numero muy grande";
        }else{
            int rangoMenor=(int)Math.random()*rangoDePrueba;
            int numeroMenor=numeroGenerado-rangoMenor;
            return("Pista: el numero es mas grande que"+numeroMenor);
        }
    }
}
