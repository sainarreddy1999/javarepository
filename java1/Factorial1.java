public class Factorial1{
    public static void main(String[] args){
        int fact = 1;
        for(int i=5; i>1; i--)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}