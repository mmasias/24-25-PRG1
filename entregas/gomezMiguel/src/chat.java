public class chat {
    public static void main(String[] args) {
        int mayo= encontrarelmayor(20,35,77);
        System.out.println("El mayor es: "+mayo);
}
public static int encontrarelmayor(int a,int b, int c){
if( a >=  b &&  a >= c){
    return  a;

}else if (b >= a && b >= c){
    return  b;
    }else{
        return  c;
}
}
}
