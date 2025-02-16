
import java.util.Scanner;
public class Nuevo {
    public static void main(String[] args) {
        int [][] mundo1 = {
            {0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,3,3},
            {5,5,4,5,5,4,5,5,0,3,3,3,3,3,3,3,3},
            {5,1,4,1,1,4,1,5,0,3,3,3,3,3,3,3,3},
            {5,1,2,2,2,2,1,5,0,3,3,3,3,3,3,3,3},
            {5,1,1,1,1,1,1,5,0,6,8,3,3,3,3,3,3},
            {5,5,5,5,5,5,5,5,0,6,8,3,3,3,3,3,3},
            {0,0,0,0,0,0,0,0,6,8,3,3,3,3,3,3,3},
            {0,0,0,0,0,0,0,6,8,3,3,3,3,3,3,3,3}
        };    
        int[] coordenadasPersonaje = {5,5};
        boolean isPlaying = true;
        do{
            imprimir(mundo1, coordenadasPersonaje);
            isPlaying = mover(coordenadasPersonaje); 
        }while(isPlaying);
    }
    static boolean  mover(int[] coordenadas){
        String movimiento = new Scanner(System.in).nextLine();
        if(movimiento.equalsIgnoreCase("a")) coordenadas[1]=coordenadas[1]-1;
        if(movimiento.equalsIgnoreCase("d")) coordenadas[1]=coordenadas[1]+1;
        if(movimiento.equalsIgnoreCase("w")) coordenadas[0]=coordenadas[0]-1;
        if(movimiento.equalsIgnoreCase("s")) coordenadas[0]=coordenadas[0]+1;
        if(movimiento.equalsIgnoreCase("f")) return false;
        return true;
    }
    static void imprimir(int[][] unMundo,int[] personaje ){
        int maximaLongitud = obtenerLongitudMaxima(unMundo);
        final String BORDE = parsear(99) ;
        final String PERSONAJE = parsear(100);
        System.out.println(BORDE.repeat(maximaLongitud));
        for(int row=0; row<unMundo.length; row++){
            for(int column=0; column < unMundo[row].length; column++){
                String queImprimir =parsear(unMundo[row][column]);
                if( personaje[0]== row && personaje[1]== column ){
                   queImprimir = PERSONAJE;
                }
                System.out.print(queImprimir);
            }
            System.out.println();
        }
        System.out.println(BORDE.repeat(maximaLongitud));
    }
    static int obtenerLongitudMaxima(int[][] unaMatriz){
        int longitud = 0;
        for (int row=0; row< unaMatriz.length; row++ ) {
            if (unaMatriz[row].length>longitud){
                longitud = unaMatriz[row].length;
            }
        }
        return longitud;
    }
    static String parsear(int unValor){
        String valorParseado = " ????";
        
        if(unValor==0) valorParseado = "   ";
        if(unValor==1) valorParseado = "[#]";
        if(unValor==2) valorParseado = " · ";
        if(unValor==3) valorParseado = "~ ~";
        if(unValor==4) valorParseado = "'''";
        if(unValor==5) valorParseado = ":::";
        if(unValor==6) valorParseado = ", '";
        if(unValor==7) valorParseado = "/^.";
        if(unValor==8) valorParseado =  "^Y^";
        if(unValor==9) valorParseado = ":|:";
        if(unValor==99) valorParseado = "===";
        if(unValor==100) valorParseado = "uwu";
        
        return valorParseado;
    } 
}
