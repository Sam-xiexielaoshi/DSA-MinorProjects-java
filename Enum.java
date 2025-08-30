enum Electronic {
    laptop(2000), desktop(1000), phones(5000), telephones(4000);

    private int price;

    private Electronic(int p){
        this.price= p;
    }

    private int getPrice() {
        return price;
    }
}

public class Enum {
    public static void main(String[] args) {
        for (Electronic item : Electronic.values()) {
            System.out.println(item + " at price " + item.getPrice());
        }
    }
}
