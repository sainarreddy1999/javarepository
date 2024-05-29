class red_flowers{
    public void red(){
        System.out.println("red flowers");
    }
}
class pink_flowers extends red_flowers{
    public void pink(){
        System.out.println("pink flowers");
    }
}
class yellow_flowers extends pink_flowers{
    public void yellow(){
        System.out.println("yellow flowers");
    }
}
public class multilevel_inheritance{
    public static void main(String[] args) {
        yellow_flowers f1=new yellow_flowers();
        f1.yellow();
        f1.pink();
        f1.red();
    }
}