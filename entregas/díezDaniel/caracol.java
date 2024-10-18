import java.util.Scanner;

public class caracol {
public static void main (String[] args){

Scanner entrada = new Scanner(System.in);

final String POZO_SUPERIOR = "[__]          [__]";
final String POZO_PARED = "[][][][][][][]";
final String POZO_INFERIOR = ":.:.:.:.:.:.:.";
final String POZO_AGUA = "~~~~~~~~~~~~~~~~";
final String POZO_CARACOL = "_@)_/’";

final int PROFUNDIDAD_MAX = 20;
final int PROFUNDIDAD_MIN = 10;


int dia=0;
int caracolSube=0;
int caracolBaja=0;
int PROFUNDIDAD=20;
int profundidadAgua = 0;
int profundidadCaracol = (int)(Math.random()*PROFUNDIDAD_MAX-PROFUNDIDAD_MIN + 1) + PROFUNDIDAD_MAX;
System.out.print("Al incio el caracol cae a ["+profundidadCaracol+"] metros");

do {
dia++; 

caracolSube = (int)(Math.random()*(4-1+1)+1);
caracolBaja = (int)(Math.random()*(2-0+1)+0);

profundidadCaracol= profundidadCaracol - caracolSube + caracolBaja;

System.out.println("Dia|"+dia+"| - Subio|"+caracolSube+"| - Bajo|"+caracolBaja+"| - Posicion|"+profundidadCaracol+"")

System.out.print(POZO_SUPERIOR);
for(int i=0;i<=PROFUNDIDAD;i++)
if (i== profundidadCaracol){
System.out.print(POZO_CARACOL + i);}
else if (i>PROFUNDIDAD-profundidadAgua) {
System.out.print(POZO_AGUA + i);}
else {
    System.out.print(POZO_PARED + i);
} System.out.println(POZO_INFERIOR);
}  while (profundidadCaracol>0);
}
} 