public class enumExample1{
    public enum operators{
        add,
        sub,
        mul,
        div
    }
    public static void main(String[] args){
        operators myval=operators.add;
        switch(myval){
            case add:
            int a=20;
            int b=30;
            System.out.println(a+b);
            break;
            case sub:
            int x=30;
            int y=10;
        System.out.println(x-y);
        break;
    default:
        System.out.println("It is Some other operator");
        }
    }
}

