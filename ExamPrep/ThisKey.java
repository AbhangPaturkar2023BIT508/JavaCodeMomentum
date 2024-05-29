class Parents {
    int i;
}

class Child extends Parents {
    int j;

    Child() {
        this(10);
        // super(10);
        this.j = j;
        System.out.println("Parent class constructor(): " + i);
    }

    Child(int j) {
        // this.j = j;
        this.i = j+10;
        System.out.println("Parent class constructor(1): " + i);
    }
}

public class ThisKey {
    public static void main(String[] args) {
        Child obj = new Child(10);
    }
}
