import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            boolean jugando = true;
            final int MAXIMO_X_TABLERO = 5;

            int xEnElTablero = 0;

            System.out.println("Bienvenido al juego del tres en raya!");
            System.out.println("");

            String [][] tablero ={
                {"[ ]","[ ]","[ ]"},
                {"[ ]","[ ]","[ ]"},
                {"[ ]","[ ]","[ ]"},
            };

            imprime(tablero);
            
            while (jugando) {
                int filaX;
                int columnaX;

                int filaO;
                int columnaO;

                System.out.println("Turno de las X:");
                System.out.println("Elija la fila:");
                filaX = entrada.nextInt();
                filaX = filaX - 1;

                System.out.println("Elija la columna:");
                columnaX = entrada.nextInt();
                columnaX = columnaX - 1;

                if( tablero[filaX][columnaX] != "[ ]"){
                    System.out.println("Error.Ya hay una pieza.Pierde turno.");
                    xEnElTablero --;
                }else{
                    tablero[filaX][columnaX] = "[X]";
                }
                

                imprime(tablero);
                if (tablero[0][0] == "[X]" && tablero[1][0] == "[X]"&& tablero[2][0] == "[X]" ) {
                    System.out.println("X Ganan!");
                    jugando =false;
                }else if (tablero[0][0] == "[X]" && tablero[0][1] == "[X]"&& tablero[0][2] == "[X]") {
                    System.out.println("X Ganan!");
                    jugando =false;
                }else if (tablero[0][0] == "[X]" && tablero[1][1] == "[X]"&& tablero[2][2] == "[X]") {
                    System.out.println("X Ganan!");
                    jugando =false;
                }else if (tablero[0][2] == "[X]" && tablero[1][2] == "[X]"&& tablero[2][2] == "[X]") {
                    System.out.println("X Ganan!");
                    jugando =false;
                }else if (tablero[2][0] == "[X]" && tablero[2][1] == "[X]"&& tablero[2][2] == "[X]") {
                    System.out.println("X Ganan!");
                    jugando =false;
                }else if (tablero[0][2] == "[X]" && tablero[1][1] == "[X]"&& tablero[2][0] == "[X]") {
                    System.out.println("X Ganan!");
                    jugando =false;
                }

                if (tablero[0][0] == "[O]" && tablero[1][0] == "[O]"&& tablero[2][0] == "[O]" ) {
                    System.out.println("O Ganan!");
                    jugando =false;
                }else if (tablero[0][0] == "[O]" && tablero[0][1] == "[O]"&& tablero[0][2] == "[O]") {
                    System.out.println("O Ganan!");
                    jugando =false;
                }else if (tablero[0][0] == "[O]" && tablero[1][1] == "[O]"&& tablero[2][2] == "[O]") {
                    System.out.println("O Ganan!");
                    jugando =false;
                }else if (tablero[0][2] == "[O]" && tablero[1][2] == "[O]"&& tablero[2][2] == "[O]") {
                    System.out.println("O Ganan!");
                    jugando =false;
                }else if (tablero[2][0] == "[O]" && tablero[2][1] == "[O]"&& tablero[2][2] == "[O]") {
                    System.out.println("O Ganan!");
                    jugando =false;
                }else if (tablero[0][2] == "[O]" && tablero[1][1] == "[O]"&& tablero[2][0] == "[O]") {
                    System.out.println("O Ganan!");
                    jugando =false;
                }
                xEnElTablero ++;
                if (xEnElTablero == MAXIMO_X_TABLERO) {
                    jugando = false ;
                }
                if (jugando) {
                    System.out.println("Turno de las O:");
                    System.out.println("Elija la fila:");
                    filaO = entrada.nextInt();
                    filaO = filaO - 1;
    
                    System.out.println("Elija la columna:");
                    columnaO = entrada.nextInt();
                    columnaO = columnaO - 1;
    
                    if( tablero[filaO][columnaO] != "[ ]"){
                        System.out.println("Error.Ya hay una pieza.Pierde turno.");
                        
                    }else{
                        tablero[filaO][columnaO] = "[O]";
                    }
    
                    imprime(tablero);
    
                    if (tablero[0][0] == "[X]" && tablero[1][0] == "[X]"&& tablero[2][0] == "[X]" ) {
                        System.out.println("X Ganan!");
                        jugando =false;
                    }else if (tablero[0][0] == "[X]" && tablero[0][1] == "[X]"&& tablero[0][2] == "[X]") {
                        System.out.println("X Ganan!");
                        jugando =false;
                    }else if (tablero[0][0] == "[X]" && tablero[1][1] == "[X]"&& tablero[2][2] == "[X]") {
                        System.out.println("X Ganan!");
                        jugando =false;
                    }else if (tablero[0][2] == "[X]" && tablero[1][2] == "[X]"&& tablero[2][2] == "[X]") {
                        System.out.println("X Ganan!");
                        jugando =false;
                    }else if (tablero[2][0] == "[X]" && tablero[2][1] == "[X]"&& tablero[2][2] == "[X]") {
                        System.out.println("X Ganan!");
                        jugando =false;
                    }else if (tablero[0][2] == "[X]" && tablero[1][1] == "[X]"&& tablero[2][0] == "[X]") {
                        System.out.println("X Ganan!");
                        jugando =false;
                    }
    
                    if (tablero[0][0] == "[O]" && tablero[1][0] == "[O]"&& tablero[2][0] == "[O]" ) {
                        System.out.println("O Ganan!");
                        jugando =false;
                    }else if (tablero[0][0] == "[O]" && tablero[0][1] == "[O]"&& tablero[0][2] == "[O]") {
                        System.out.println("O Ganan!");
                        jugando =false;
                    }else if (tablero[0][0] == "[O]" && tablero[1][1] == "[O]"&& tablero[2][2] == "[O]") {
                        System.out.println("O Ganan!");
                        jugando =false;
                    }else if (tablero[0][2] == "[O]" && tablero[1][2] == "[O]"&& tablero[2][2] == "[O]") {
                        System.out.println("O Ganan!");
                        jugando =false;
                    }else if (tablero[2][0] == "[O]" && tablero[2][1] == "[O]"&& tablero[2][2] == "[O]") {
                        System.out.println("O Ganan!");
                        jugando =false;
                    }else if (tablero[0][2] == "[O]" && tablero[1][1] == "[O]"&& tablero[2][0] == "[O]") {
                        System.out.println("O Ganan!");
                        jugando =false;
                    } 
                }
                

                
            }  
        
    }

    static void imprime(String[][] tablero){
        for(int filaTablero=0; filaTablero<tablero.length; filaTablero++){
            for(int columnaTablero=0; columnaTablero < tablero[filaTablero].length; columnaTablero++){
                System.out.print((tablero[filaTablero][columnaTablero]));
            }
            System.out.println();
        }
        System.out.println();

    }
}