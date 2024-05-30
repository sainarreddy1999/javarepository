public class enumExample1{
    public enum operators{
        add,
        sub,
        mul,
        div
    }
    public static void main(String[] args){
        operators myval=operators.sub;
        int a=20;
        int b=30;
        switch(myval){
        case add:
           
            System.out.println(a+b);
            break;
            case sub:
            
        System.out.println(a-b);
        break;
    default:
        System.out.println("It is Some other operator");
        }
    }
}

