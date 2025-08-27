package oops;

public class overRid {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}

class A {
    public void show() {
        System.out.println("in show of A");
    }

    public void config() {
        System.out.println("in config of A");
    }
}

class B extends A {
    public void show() {
        System.out.println("in show of B");
    }
}