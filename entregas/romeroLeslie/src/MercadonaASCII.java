import java.util.Scanner;

public class MercadonaASCII {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int HORAS_ABIERTO = 12;
        final int MINUTOS_HORA = 60;
        final int TIEMPO_TOTAL = HORAS_ABIERTO * MINUTOS_HORA;
        final int MINIMO_PRODUCTOS = 5, MAXIMO_PRODUCTOS = 15;
        int unaFila = 0;
        int minutosFilaVacia = 0;
        int caja1 = 0, caja2 = 0, caja3 = 0, caja4 = 0;
        int horas=9, minutos=0;

        for (int tiempoActual = 1; tiempoActual <= TIEMPO_TOTAL; tiempoActual++) {
            
            }
            
            int llegaAlguien = calcularllegada();
            unaFila = unaFila + llegaAlguien;

            if (puedePasar(caja1, unaFila)) {
                unaFila = unaFila - 1;
                caja1 = generarProductos();
            }

            if (caja2 <= 0 && unaFila > 0) {
                unaFila = unaFila - 1;
                caja2 = generarProductos();
            }

            if (caja3 <= 0 && unaFila > 0) {
                unaFila = unaFila - 1;
                caja3 = generarProductos();
            }

            if (caja4 <= 0 && unaFila > 0) {
                unaFila = unaFila - 1;
                caja4 = generarProductos();
            }

            caja1= atender (caja1);
            caja2= atender (caja2);
            caja3= atender (caja3);
            caja4= atender (caja4);

            boolean haEstadoVacia = (unaFila == 0 && llegaAlguien == 0);
            minutosFilaVacia = minutosFilaVacia + (haEstadoVacia ? 1 : 0);

            darLaHora(tiempoActual);
            contarHistoria(unaFila, caja1, caja2, caja3, caja4);
            

        System.out.println("Al final de la jornada, la fila ha estado " + minutosFilaVacia + " minutos vacia");
        System.out.println("y quedan " + unaFila + " personas esperando");

static void contarHistoria(int unaFila,int caja1, int caja2, int caja3, int caja4){
        final String PERSONA = "_O_ ", PRODUCTO = "[]";

        System.out.println(PERSONA.repeat(unaFila));
        System.out.println("CAJA 1 " + PRODUCTO.repeat(caja1));
        System.out.println("CAJA 2 " + PRODUCTO.repeat(caja2));
        System.out.println("CAJA 3 " + PRODUCTO.repeat(caja3));
        System.out.println("CAJA 4 " + PRODUCTO.repeat(caja4));
        System.out.println("---------------------------------------------");
    }

static boolean puedePasar(int unaCaja, int laFila){
    return unaCaja <=0 && laFila>0;

 }
static int generarProductos(){
    final int MINIMO_PRODUCTOS=7, MAXIMO_PRODUCTOS=25;

    return (int) (Math.random() * (MAXIMO_PRODUCTOS - MINIMO_PRODUCTOS + 1) + MINIMO_PRODUCTOS);
}

static void darLaHora(int tiempoActual){
    int hora= (int)(tiempoActual/60)+9;
    int minutos= tiempoActual%60;
    System.out.println("["+hora+"]["+minutos+"]");
}
 
static int atender (int unaCaja){

      return unaCaja <= 0 ? 0 : unaCaja --;
}

static int calcularllegada(){
    final double PROBABILIDAD_LLEGADA = 0.4;
    return Math.random()<= PROBABILIDAD_LLEGADA ? 1:0;
}

}
