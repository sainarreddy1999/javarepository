public class constructor{

    String carname,carcolor,carmodel;
    double carprice;
    int carcapacity;
    public car1(String name, String color){
        carname=name;
        carcolor=color;
    }
    public car1(String name, String color, double price){
        carname=name;
        carcolor=color;
        carprice=price;
    }
    public car1(String name, String color, double price, int carcapacity,String model){
        carname=name;
        carcolor=color;
        carprice=price;
        carcapacity=carcapacity;
        carmodel=model;
    }
    public static void main (String[] args){
        car1 c1=new car1("audi" , "blue");
        System.out.println(c1.carname+" "+c1.carcolor);
        car1 c2=new car1("benz","black" , "390000.0");
        System.out.println(c2.carname+" "+c2.carcolor+" "+c2.carprice);
        car1 c3=new car1("nano","yellow" , "500000.0", "nanomini");
        System.out.println(c2.carname+" "+c2.carcolor+" "+c2.carprice+" "+carmodel);
        


    }

}