import java.util.Scanner;
class montacargas{
    public static void main(String[] args) {
        final int NUMERODEPLANTAS=10;
        int destino=10;
        String dirreccion="^";
        String planta="|    |";
        String elevador="["+dirreccion+destino+dirreccion+"]";
        int abajo=0;
        int pisoActual=0;
        
        System.out.println("inicio");
        boolean seMueve=false;
            Scanner usuario=new Scanner(System.in);
            System.out.println("A donde quieres ir? [Elije entre 0 y "+NUMERODEPLANTAS+" ]");
            int nuevoDestino=usuario.nextInt();
            usuario.close();
            if (nuevoDestino>NUMERODEPLANTAS||nuevoDestino<0) {
                System.out.println("Esa planta no existe");
            }
            else{
                seMueve=true;
            }
            destino=nuevoDestino;
            System.out.println("destino: "+destino);

        while (seMueve) {
            abajo=calcAbajo(destino, NUMERODEPLANTAS);
            System.out.println("err: distancia de"+abajo+"plantas");
            for (int diferencia=10;diferencia>destino;){
                    System.out.println(planta+diferencia);
                    diferencia=diferencia-1;
                }
                System.out.println(elevador+destino);
            for (int diferencia=(destino-1);diferencia>0;){
                System.out.println(planta+diferencia);
                diferencia=diferencia-1;
                }
                seMueve=false;    
            }
        

    }
    static void enDestino(int destino, int NUMERODEPLANTAS,int nuevoDestino,boolean seMueve){
        //cuando llega a su destino aqui pide el proximo destino
    }

    public static int calcAbajo(int destino,int NUMERODEPLANTAS){
        int abajoDelElevador=NUMERODEPLANTAS-destino;
        return abajoDelElevador;
        //aqui resta e invierte los numeros para el print
    }
    
}