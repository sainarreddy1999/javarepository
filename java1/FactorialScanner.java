import java.util.Scanner;

public class FactorialScanner{
    public static void main(String[] args){
        int number;
        System.out.println("enter the number : ");
        Scanner sc=new Scanner(System.in);
        number = sc.nextInt();
        int fact=factorail(number);
        System.out.println("factorail of " + number + "is "+fact);
    }
    static int factorail(int n){
        if(n==1)
            return 1;
        return n * factorail(n-1);    
    }
}
