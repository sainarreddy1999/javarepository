public class method2{
    public static int calculatediv(int num1,int num2){
        int div=num1/num2;
        return div;
    }
    public static void main(String[] args) {
        int a=20;
        int b=8;
        int result=calculatediv(a, b);
        System.out.println("The div of" +a+ "and" +b+ "is" +result);
    }
}
