public class leapYear{
    
    public static void main(String args[]){
        int a=2023;
        if(a%4==0){
            if(a%100==0){
            System.out.println(a +"is a leapyear");
            }
        }
        else{
            System.out.println(a +"is not a leap year");
        }

    }
}