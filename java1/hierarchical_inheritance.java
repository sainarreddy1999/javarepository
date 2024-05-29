class animal1{
    public void eat(){
        System.out.println("animal eats");
    }
}
class dog extends animal1{
    public void bow_bow(){
        System.out.println("dog bark as bow bow");
    }
}
class cat1 extends animal1{
    public void makesound(){
        System.out.println("cat makes sound as meow meow");
    }
}
public class hierarchical_inheritance{
    public static void main(String[] args){

        cat1 c1=new cat1();
        dog d1=new dog();
        c1.makesound();
        c1.eat();
        c1.eat();
    }
}