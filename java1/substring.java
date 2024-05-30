public class substring{
    public static void main(String[] args){
        String str="java is a programing language";

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}