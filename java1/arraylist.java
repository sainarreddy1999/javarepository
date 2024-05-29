import java.util.ArrayList;

public class arraylist{
    public static void main(String[] args){

        

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("graphes");
        fruits.add("banana");
        fruits.add("apple");
        System.out.println(fruits);

        fruits.remove("banana");
        fruits.clear();
        System.out.println(fruits.contains("mango"));
        System.out.println(fruits);



        
    }
}