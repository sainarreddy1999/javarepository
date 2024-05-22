import java.util.Scanner;
public class scanner{
    public static void main(String[] args) {
        scanner obj=new scanner(System.in);
        System.out.println("enter the first integer");
        int a = obj.nextInt();
        System.out.println("enter second intiger");
        int b = obj.nextInt();
        System.out.println("the addion of the number is:"+(a+b));
        System.out.println("the sub of the number is:"+(a-b));
        System.out.println("the mul of the number is:"+(a*b));
        System.out.println("the div of the number is:"+(a/b));

    }
}