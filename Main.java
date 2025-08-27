public class Main {
    public static void main(String[] agrs) {
        A obj1 = new B();// upcasting
        obj1.show1();

        B obj2 = (B) obj1;// downcasting
        obj2.show2();
    }
}

class A {
    public void show1() {
        System.out.println("show in A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("show in B");
    }
}