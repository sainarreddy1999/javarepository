class animal{
    public void eat(){
        System.out.println("animal eat");
    }
    
}
class cat  extends animal{
    public void bark(){
        System.out.println("bark as bow bow");
    }
}
public class single_inheritance{
    public static void main(String[] args)
    {
        cat c1=new cat();
        c1.eat();
        c1.bark();



    }
}