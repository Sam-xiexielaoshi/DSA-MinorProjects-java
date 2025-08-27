package Strings;

class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class staticClass {
    public static void main(String[]args){
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 30000;
        Mobile.name = "Smartphone";
        

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 80000;
        Mobile.name = "iPhone";

        Mobile.name = "Mobile Device";
        m1.show();
        m2.show();
    }
}
