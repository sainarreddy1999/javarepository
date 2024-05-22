public class palindrom{
    public static void main(String[] args) {
        int num=1221 , rev=0, rem, backup=num;
        while(num>0){
            rem=num%10;
            num=num%10;
            rev=rev*10;
        }
        System.out.println(backup);
        System.out.println(rev);
        if(backup==rev)
        {
            System.out.println("its a palindrom number");
        }
        else{
            System.out.println("its not a palindrom number");
        }
        }
    }
