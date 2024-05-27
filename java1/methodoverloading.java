public class methodoverloading{
    public static int car(int a,int b){
        return a+b;
    
    }
    public static int car(int a, int b, int c){
        return a+b+c;
    }
    public static double car(double x, double y){
        return x+y;
    }
    public static void main(String[] args){
        System.out.println(car(12,15));
        System.out.println(car(20,30,12));
        System.out.println(car(12.5,20.20));
    }
}
