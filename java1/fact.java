public class fact{
    public static void main(String[] args) {
        int i=5;
         int fact=1;
        for(i=5; i>=1; i--){//this is decrement operator  5!=(5*4*3*2*1)//
          fact=fact*i;
        }
          System.out.println("factorial of a number" +fact);
        
    }
}