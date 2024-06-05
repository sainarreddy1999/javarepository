public class equallgnoreandequal{
    public static void main(String[] args){
        String str1= "programming";
        String str2= "PROGRAMMING";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}