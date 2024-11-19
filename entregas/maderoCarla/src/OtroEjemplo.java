import java.until.Scanner;

public class OtroEjemplo{
    public Static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int salePor = (int)(Math.random()*16+1);
        int dondeDoy = entrada.nextInt();
        String mensaje = "No le dio!!";
        mensaje = mensaje + salePor;
        
        if(salePor==dondeDoy){
            mensaje = "Le dio!";
        }
        System.out.println(mensaje);

        for(int i=1; i<= 16; i++){
            String queImprimir=VACIO;
            if(salePor==dondeDoy){
                queImprimir = GOLPEADO;
            } else if(salePor==i){
                queImprimir = TOPO;
            }   else if(dondeDoy==i){
                queImprimir = MARTILLO;
            }
            System.out.print(queImprimir);




            if(i%4==0) System.out.println();
        }







        entrada.close();
    }
}