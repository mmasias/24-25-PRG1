import java.util.Scanner;
class granadivinanza{

    
    public static void main(String[]args){
        final int intentos=10;
        int intento=0;
        boolean juega=true;
        int numeroGenerado=rng();
        int numeroUsuario;
        int pistasIntento1=3;
        int pistasIntento2=6;
        int rangoDePrueba=10;
        
        while(juega) {
            System.out.println("Adivina el numero! Tienes ["+(intentos-intento)+"] intentos restantes");
            intento=intento+1;
            numeroUsuario=escaneoUsuario();

            if (intento==pistasIntento1){
                System.out.println(pista1());
            }
            if (intento==pistasIntento2){
                System.out.println(pista2());
            }

            if(numeroUsuario==numeroGenerado){
                String singular="] Solo intento! Wao!";
                if (intentos<1){
                    singular="] intentos!";
                }
                System.out.println("HAS ADIVINADO \n \nTe has tardado ["+intento+singular);
                juega=false;            
            }
            if(intento>=intentos){
                juega=false;
            }
            
        }
        System.out.println("= = = Juego Terminado = = =");
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

    public static String pista1(){
        int resultadoPrueba=(numeroGenerado-rangoDePrueba);
        if (resultadoPrueba<0){
            return"Pista:Es un numero muy pequeno";
        }else{
            int rangoMenor=(int)Math.random()*rangoDePrueba;
            int numeroMenor=numeroGenerado-rangoMenor;
            return("Pista: el numero es mas grande que"+numeroMenor);
        }
    }

    public static String pista2(){
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
