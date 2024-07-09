import java.util.*;

public class PrimeScanner{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();

        boolean isPrime=true;
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("This is prime Number"+num);
        }
        else{
            System.out.println("This is Not prime Number"+num);

        }
    }
}