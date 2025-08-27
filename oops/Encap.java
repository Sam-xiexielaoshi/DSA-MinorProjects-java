package oops;

public class Encap {
    public static void main(String[] args) {
        new A().show();
        new A().show();
    }
}

class A {
    public A() {
        System.out.println("obnbject creared");
    }

    public void show() {
        System.out.println("in a show");
    }
}
