import java.util.Scanner;
public class RevScanner{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str , rev=" ";
        char ch;

        System.out.println("Enter the string value");
        str=sc.nextLine();
        int length=str.length();
        for(int i=0; i<length; i++){
            ch=str.charAt(i);
            rev=ch+rev;
            System.out.println(rev);
        }
    }
}
