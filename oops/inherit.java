package oops;

public class inherit {
    public static void main(String[] args){
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(10,5);
        int r2 = obj.sub(20,5);
        int r3 = obj.multi(20,5);
        int r4 = obj.div(20,5);
        System.out.println("Addition Results: " + r1 + ", " + r2 + ", Multiplication Result: " + r3 + ", Division Result: " + r4);
    }
}

